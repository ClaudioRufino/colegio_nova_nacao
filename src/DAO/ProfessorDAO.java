package DAO;

import Modelo.BDados;
import Modelo.BeanProfessor;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProfessorDAO {
    BDados banco = new BDados();
    
    public ArrayList pesquisar(BeanProfessor professor){
        ArrayList listaPesquisa = new ArrayList();
        String pesquisarSQL = "select id_professor, nome, salario, sexo, classe \n"+
               "from professor where id_professor = ?";
        banco.ligar();
        try{
            banco.ps = banco.con.prepareStatement(pesquisarSQL);
            banco.ps.setInt(1, professor.getBI());
            banco.rs = banco.ps.executeQuery();
            while(banco.rs.next()){
                listaPesquisa.add(banco.rs.getInt(1));
                listaPesquisa.add(banco.rs.getString(2));
                listaPesquisa.add(banco.rs.getDouble(3));
                listaPesquisa.add(banco.rs.getString(4));
                listaPesquisa.add(banco.rs.getInt(5));
            }
            banco.ps.close();
            banco.desligar();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar!" + e);
        }
        return listaPesquisa;
    }
    
    public void adicionar(BeanProfessor professor){
        String adicionarSQL = "insert into professor(nome, salario, classe, sexo \n" + 
         ") values (?, ?, ?, ?)";
        banco.ligar();
        try{
            banco.ps = banco.con.prepareStatement(adicionarSQL);
            banco.ps.setString(1, professor.getNome());
            banco.ps.setDouble(2, professor.getSalario());
            banco.ps.setInt(3, professor.getClasse());
            banco.ps.setString(4, professor.getSexo());
            banco.ps.execute();
            banco.ps.close();
            banco.desligar();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao adicionar" + ex);
        }
    }
    
    public void editarProfessor(BeanProfessor professor){
        String updateSQL = "UPDATE professor SET nome=?, classe=?, salario=? WHERE id_professor=?";
        banco.ligar();
        try{
        banco.ps = banco.con.prepareStatement(updateSQL);
        banco.ps.setString(1, professor.getNome());
        banco.ps.setInt(2, professor.getClasse());
        banco.ps.setDouble(3, professor.getSalario());
        banco.ps.setInt(4, professor.getBI());
        banco.ps.execute();
        banco.ps.close();
        banco.desligar();
        JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        }catch(SQLException e){
            System.out.println("Erro ao editar!" +e);
        }
    }
    
    public void eliminar(BeanProfessor professor){
        String deleteSQL = "DELETE FROM professor where id_professor = ?";
        banco.ligar();
        try{
            banco.ps = banco.con.prepareStatement(deleteSQL);
            banco.ps.setInt(1, professor.getBI());
            banco.ps.execute();
            banco.ps.close();
            banco.desligar();
            JOptionPane.showMessageDialog(null, "Eliminado com sucesso!");
        }catch(SQLException e){
            System.out.println("Erro de eliminação no banco " + e);
        }
    }
    
}
