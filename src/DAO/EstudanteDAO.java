package DAO;

import Modelo.BDados;
import Modelo.BeanEstudante;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Promessa Rufino
 */
public class EstudanteDAO {
    BDados banco = new BDados();
    
    public void addMatricula(BeanEstudante estudante){
        String adicionarSQL = "insert into estudante(nome, data_nascimento, curso, \n" + 
         "classe, sexo, turma, ano_matricula) values (?, ?, ?, ?, ?, ?, ?)";
        banco.ligar();
        try{
            banco.ps = banco.con.prepareStatement(adicionarSQL);
            banco.ps.setString(1, estudante.getNome());
            banco.ps.setInt(2, estudante.getDataNascimento());
            banco.ps.setString(3, estudante.getCurso());
            banco.ps.setInt(4, estudante.getClasse());
            banco.ps.setString(5, estudante.getSexo());
            banco.ps.setString(6, estudante.getTurma());
            banco.ps.setInt(7, estudante.getAno_matricula());
            banco.ps.execute();
            banco.ps.close();
            banco.desligar();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao adicionar" + ex);
        }
        
    }
    public ArrayList pesquisar(BeanEstudante estudante){
        ArrayList listaPesquisa = new ArrayList();
        String pesquisarSQL = "SELECT id_estudante, nome, data_nascimento, curso,\n"+
               "classe, sexo, turma FROM estudante WHERE id_estudante = ?";
        banco.ligar();
        try{
            banco.ps = banco.con.prepareStatement(pesquisarSQL);
            banco.ps.setInt(1, estudante.getBI());
            banco.rs = banco.ps.executeQuery();
            while(banco.rs.next()){
                listaPesquisa.add(banco.rs.getInt(1));
                listaPesquisa.add(banco.rs.getString(2));
                listaPesquisa.add(banco.rs.getInt(3));
                listaPesquisa.add(banco.rs.getString(4));
                listaPesquisa.add(banco.rs.getInt(5));
                listaPesquisa.add(banco.rs.getString(6));
                listaPesquisa.add(banco.rs.getString(7));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar!" + e);
        }
        return listaPesquisa;
    }
   
    public void editarEstudante(BeanEstudante estudante){
        String updateSQL = "UPDATE estudante SET nome=?,data_nascimento=?,\n"+
                "classe=?,curso=?,sexo=?,turma=? WHERE id_estudante=?";
        banco.ligar();
        try{
        banco.ps = banco.con.prepareStatement(updateSQL);
        banco.ps.setString(1, estudante.getNome());
        banco.ps.setInt(2, estudante.getDataNascimento());
        banco.ps.setInt(3, estudante.getClasse());
        banco.ps.setString(4, estudante.getCurso());
        banco.ps.setString(5, estudante.getSexo());
        banco.ps.setString(6, estudante.getTurma());
        banco.ps.setInt(7, estudante.getBI());
        banco.ps.execute();
        banco.ps.close();
        banco.desligar();
        JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        }catch(SQLException e){
            System.out.println("Erro ao editar!" + e);
        }
    }
    
    public void eliminar(BeanEstudante estudante){
        String deleteSQL = "DELETE FROM estudante where id_estudante = ?";
        banco.ligar();
        try{
            banco.ps = banco.con.prepareStatement(deleteSQL);
            banco.ps.setInt(1, estudante.getBI());
            banco.ps.execute();
            banco.ps.close();
            banco.desligar();
            JOptionPane.showMessageDialog(null, "Eliminado com sucesso!");
        }catch(SQLException e){
            System.out.println("Erro de eliminação no banco " + e);
        }
    }
}
