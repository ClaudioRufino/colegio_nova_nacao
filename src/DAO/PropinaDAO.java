package DAO;

import Modelo.BDados;
import Modelo.BeanPropina;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class PropinaDAO {
    
    BDados banco = new BDados();
    
    public void adiciona(BeanPropina propina){
        if(verificaPagamento(propina) == true){
           String adicionaSQL = "INSERT INTO propina(ano, mes, valor, id_estudante) \n" +
            "VALUES (?, ?, ?, ?)";
            banco.ligar();
            try{
            banco.ps = banco.con.prepareStatement(adicionaSQL);
            banco.ps.setInt(1, propina.getAno());
            banco.ps.setInt(2, propina.getMes());
            banco.ps.setInt(3, propina.getValor());
            banco.ps.setInt(4, propina.getIdEstudante());
            banco.ps.execute();
            banco.ps.close();
            banco.desligar();
                JOptionPane.showMessageDialog(null, "Pagamento realizado com sucesso!"); 
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Erro no banco" + e);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Mês já pago. Selecione outro mês!");
        }
        
    }
    
    private boolean verificaPagamento(BeanPropina propina){
        boolean verifica = true;
        String codVerificacao = "SELECT ano, mes FROM propina WHERE ano=? and mes=? and id_estudante =?";
        banco.ligar();
        try{
        banco.ps = banco.con.prepareStatement(codVerificacao);
        banco.ps.setInt(1, propina.getAno());
        banco.ps.setInt(2, propina.getMes());
        banco.ps.setInt(3, propina.getIdEstudante());
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
