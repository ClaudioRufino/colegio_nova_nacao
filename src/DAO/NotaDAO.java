package DAO;

import Modelo.BDados;
import Modelo.BeanNotas;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Promessa Rufino
 */
public class NotaDAO {
    BDados banco = new BDados();
    
    public void adicionar(BeanNotas nota){
        if(verificaNota(nota) == true){
            String addSQL = "INSERT INTO nota(disciplina, num_semestre, valor, id_estudante)\n"+
                    "VALUES(?, ?, ?, ?)";
            banco.ligar();
            try{
                banco.ps = banco.con.prepareStatement(addSQL);
                banco.ps.setString(1, nota.getDisciplina());
                banco.ps.setInt(2, nota.getNumSemestre());
                banco.ps.setDouble(3, nota.getValor());
                banco.ps.setInt(4, nota.getIdEstudante());
                banco.ps.execute();
                banco.ps.close();
                banco.desligar();
                JOptionPane.showMessageDialog(null, "Enviado com sucesso!");
            }catch(SQLException e){
                System.out.println("Erro no banco: " + e);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Nota já existe!");
        }
    }
    
    public boolean verificaNota(BeanNotas nota){
        boolean verifica = true;
        String codVerificacao = "SELECT num_semestre, disciplina FROM nota WHERE \n"+
                "num_semestre=? and disciplina=? AND id_estudante=?";
                
        banco.ligar();
        try{
        banco.ps = banco.con.prepareStatement(codVerificacao);
        banco.ps.setInt(1, nota.getNumSemestre());
        banco.ps.setString(2, nota.getDisciplina());
        banco.ps.setInt(3, nota.getIdEstudante());
        banco.rs = banco.ps.executeQuery();
        if(banco.rs.next()){
            verifica = false;
        }
        
        }catch(Exception e){
            System.out.println("Erro de verificação: " + e);
        }
        return verifica;
    }
}
