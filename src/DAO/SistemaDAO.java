package DAO;

import Modelo.BDados;
import Modelo.BeanSistema;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SistemaDAO {
    BDados banco = new BDados();
    
    public String nomeSistema(){
        String nomeSQL = "SELECT nome FROM sistema WHERE id_sistema=1";
                
        banco.ligar();
        try{
        banco.st = banco.con.createStatement();
        banco.rs = banco.st.executeQuery(nomeSQL);
        if(banco.rs.next()){
            return banco.rs.getString("nome");
        }
            System.out.println("Peguei o nome: " + banco.rs.getString("nome") );
        }catch(Exception e){
            System.out.println("Erro de verificação: " + e);
        }
        return "Nova Nação";
    }
    
    public Color corSistema(){
        String nomeSQL = "SELECT cor FROM sistema WHERE id_sistema=1";
        String cor;
        
        banco.ligar();
        try{
        banco.st = banco.con.createStatement();
        banco.rs = banco.st.executeQuery(nomeSQL);
        if(banco.rs.next()){
            cor = banco.rs.getString("cor");
            
            if(cor.equals("padrao")){
                return new Color(0, 51, 51);
            }
            else if(cor.equals("preto")){
                return Color.BLACK;
            }
            else if(cor.equals("azul")){
                return Color.blue;
            }
        }
            System.out.println("Peguei a cor: " + banco.rs.getString("cor") );
        }catch(Exception e){
            System.out.println("Erro de verificação: " + e);
        }
        return new Color(0, 51, 51);
    }
    
    public void alterarNome(BeanSistema sistema){
        String alterarSQL = "update sistema set nome = ? where id_sistema = 1";
        banco.ligar();
        try{
            banco.ps = banco.con.prepareStatement(alterarSQL);
            banco.ps.setString(1, sistema.getNomeEscola());
            banco.ps.execute();
            banco.ps.close();
            banco.desligar();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro" + ex);
        }
    }
    
    public void alterarCor(BeanSistema sistema){
        String alterarSQL = "update sistema set cor = ? where id_sistema = 1";
        banco.ligar();
        try{
            banco.ps = banco.con.prepareStatement(alterarSQL);
            banco.ps.setString(1, sistema.getCor());
            banco.ps.execute();
            banco.ps.close();
            banco.desligar();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro" + ex);
        }
    }
}
