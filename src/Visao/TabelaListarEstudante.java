package Visao;

import DAO.EstudanteDAO;
import Modelo.BDados;
import Modelo.BeanEstudante;
import Modelo.ModeloTabela;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class TabelaListarEstudante extends javax.swing.JFrame {

    BDados banco = new BDados();
    BeanEstudante estudante = new BeanEstudante();
    EstudanteDAO estudanteDao = new EstudanteDAO();
    
    private int classeAuxiliar;
    
    public TabelaListarEstudante() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txt_codEditarEstudante = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_editarEstudante = new javax.swing.JButton();
        txt_editarNomeEstudante = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_editarClasseEstudante = new javax.swing.JTextField();
        btn_guardarEstudante = new javax.swing.JButton();
        btn_atulizarEstudante = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_editarEstudanteCurso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_editarEstudanteTurma = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_editarEstudanteSexo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_editarEstudanteAno = new javax.swing.JTextField();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Cod");

        btn_editarEstudante.setText("Editar");
        btn_editarEstudante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarEstudanteActionPerformed(evt);
            }
        });

        txt_editarNomeEstudante.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Classe");

        txt_editarClasseEstudante.setEnabled(false);
        txt_editarClasseEstudante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_editarClasseEstudanteActionPerformed(evt);
            }
        });

        btn_guardarEstudante.setText("Guardar");
        btn_guardarEstudante.setEnabled(false);
        btn_guardarEstudante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarEstudanteActionPerformed(evt);
            }
        });

        btn_atulizarEstudante.setBackground(new java.awt.Color(51, 51, 51));
        btn_atulizarEstudante.setForeground(new java.awt.Color(255, 255, 255));
        btn_atulizarEstudante.setText("Atualizar");
        btn_atulizarEstudante.setEnabled(false);
        btn_atulizarEstudante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atulizarEstudanteActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Curso");

        txt_editarEstudanteCurso.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Turma");

        txt_editarEstudanteTurma.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Sexo");

        txt_editarEstudanteSexo.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Ano de Nasc");

        txt_editarEstudanteAno.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_codEditarEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(btn_guardarEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(txt_editarEstudanteAno, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btn_editarEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)))
                        .addGap(22, 22, 22)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_atulizarEstudante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_editarEstudanteTurma, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_editarClasseEstudante, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_editarEstudanteSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txt_editarEstudanteCurso)))
                    .addComponent(txt_editarNomeEstudante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_editarEstudanteSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_editarClasseEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_editarEstudanteTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_codEditarEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(btn_editarEstudante))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_guardarEstudante)
                            .addComponent(jButton2))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_editarEstudanteCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_editarNomeEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_atulizarEstudante))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_editarEstudanteAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void btn_editarEstudanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarEstudanteActionPerformed

        try{
            estudante.setBI(Integer.parseInt(txt_codEditarEstudante.getText()));
            ArrayList pesquisaEstudante = estudanteDao.pesquisar(estudante);
            
            if(txt_codEditarEstudante.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Inserir código do estudante!");
            }
            else if(!txt_codEditarEstudante.getText().isEmpty() && pesquisaEstudante.size() != 0){
                /* Activando os campos desativados */
                btn_guardarEstudante.setEnabled(true);
                txt_editarClasseEstudante.setEnabled(true);
                txt_editarNomeEstudante.setEnabled(true);
                txt_editarEstudanteSexo.setEnabled(true);
                txt_editarEstudanteTurma.setEnabled(true);
                txt_editarEstudanteCurso.setEnabled(true);
                txt_editarEstudanteAno.setEnabled(true);
                txt_editarNomeEstudante.setText(String.valueOf(pesquisaEstudante.get(1)));
                txt_editarEstudanteAno.setText(String.valueOf(pesquisaEstudante.get(2)));
                txt_editarClasseEstudante.setText( String.valueOf(pesquisaEstudante.get(4)));
                txt_editarEstudanteCurso.setText(String.valueOf(pesquisaEstudante.get(3)));
                txt_editarEstudanteTurma.setText(String.valueOf(pesquisaEstudante.get(6)));
                txt_editarEstudanteSexo.setText(String.valueOf(pesquisaEstudante.get(5)));
                btn_guardarEstudante.setEnabled(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Estudante não Encontrado!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Código do estudante!", "Erro", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btn_editarEstudanteActionPerformed

    private void btn_guardarEstudanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarEstudanteActionPerformed
        
        estudante.setNome(txt_editarNomeEstudante.getText());
        estudante.setClasse(Integer.parseInt(txt_editarClasseEstudante.getText()));
        estudante.setBI(Integer.parseInt(txt_codEditarEstudante.getText()));
        estudante.setTurma(txt_editarEstudanteTurma.getText());
        estudante.setDataNascimento(Integer.parseInt(txt_editarEstudanteAno.getText()));
        estudante.setSexo(txt_editarEstudanteSexo.getText());
        estudante.setCurso(txt_editarEstudanteCurso.getText());
        estudanteDao.editarEstudante(estudante);
        btn_atulizarEstudante.setEnabled(true);
        
    }//GEN-LAST:event_btn_guardarEstudanteActionPerformed

    private void btn_atulizarEstudanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atulizarEstudanteActionPerformed
        // TODO add your handling code here:
        
        if(estudante.getClasse() == 0){
            carregaTabela(classeAuxiliar);
        }
        else{
            estudante.setClasse(Integer.parseInt(txt_editarClasseEstudante.getText()));
            carregaTabela(estudante.getClasse());
        }
    }//GEN-LAST:event_btn_atulizarEstudanteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            if(!txt_codEditarEstudante.getText().isEmpty()){
                btn_atulizarEstudante.setEnabled(true);
                estudante.setBI(Integer.parseInt(txt_codEditarEstudante.getText()));
                ArrayList pesquisaEstudante = estudanteDao.pesquisar(estudante);
                classeAuxiliar = (int)pesquisaEstudante.get(4);
                estudanteDao.eliminar(estudante);
            }
            else{
                JOptionPane.showMessageDialog(null, "Entre com o código do estudante!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao eliminar!" + e);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_editarClasseEstudanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_editarClasseEstudanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_editarClasseEstudanteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TabelaListarEstudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelaListarEstudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelaListarEstudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelaListarEstudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaListarEstudante().setVisible(true);
            }
        });
    }
    public void carregaTabela(int cod) {
        
        String colunas[] = {"Num", "Nome", "Classe"};
        ArrayList dados = new ArrayList();
        banco.ligar();
        
       String addSQL = "SELECT id_estudante, nome, classe FROM estudante WHERE classe=?";
        try{
            banco.ps = banco.con.prepareStatement(addSQL);
            banco.ps.setInt(1, cod);
            banco.rs = banco.ps.executeQuery();
            while(banco.rs.next()){
                dados.add(new Object[]{banco.rs.getInt(1), banco.rs.getString(2), banco.rs.getString(3)});
            }
        }catch(SQLException e){
            System.out.println("Erro ao adicionar no banco");
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTable1.setModel(modelo);
        
        
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(260);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(75);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atulizarEstudante;
    private javax.swing.JButton btn_editarEstudante;
    private javax.swing.JButton btn_guardarEstudante;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_codEditarEstudante;
    private javax.swing.JTextField txt_editarClasseEstudante;
    private javax.swing.JTextField txt_editarEstudanteAno;
    private javax.swing.JTextField txt_editarEstudanteCurso;
    private javax.swing.JTextField txt_editarEstudanteSexo;
    private javax.swing.JTextField txt_editarEstudanteTurma;
    private javax.swing.JTextField txt_editarNomeEstudante;
    // End of variables declaration//GEN-END:variables
}
