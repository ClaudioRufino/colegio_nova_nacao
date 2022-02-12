package DAO;

import Modelo.BDados;
import Modelo.BeanEstudante;
import Modelo.ModeloTabela;
import static Visao.Pauta.getAno_letivo;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class Tabela {
    BDados banco = new BDados();
    private String disciplina;
    
    public Tabela(){
        setDisciplina("Matemática");
    }
    
    public void carrega(BeanEstudante estudante, JTable jTable1){
       
        String colunas[] = {"Posição", "Nome","Classe","Média"};
        ArrayList dados = new ArrayList();
        banco.ligar();
        
       String addSQL = "SELECT nome, classe, avg(valor) FROM nota INNER JOIN estudante \n" +
                "ON(estudante.id_estudante = nota.id_estudante)GROUP BY nome ORDER BY avg(valor) desc";
        try{
            banco.ps = banco.con.prepareStatement(addSQL);
            //banco.ps.setString(1, getDisciplina());
            banco.rs = banco.ps.executeQuery();
            int pos = 1;
            while(banco.rs.next()){
                dados.add(new Object[]{pos, banco.rs.getString(1), banco.rs.getInt(2), Math.round(banco.rs.getDouble(3))});
                pos++;
            }
            banco.desligar();
        }catch(SQLException e){
            System.out.println("Erro no banco!" + e);
        }finally{
            banco.desligar();
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTable1.setModel(modelo);
        
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(90);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(260);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(90);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        
         jTable1.getColumnModel().getColumn(3).setPreferredWidth(90);
        jTable1.getColumnModel().getColumn(3).setResizable(false);
        
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    
}
