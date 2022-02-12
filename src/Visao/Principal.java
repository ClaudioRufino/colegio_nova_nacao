package Visao;

import DAO.EstudanteDAO;
import DAO.ProfessorDAO;
import DAO.SistemaDAO;
import DAO.Tabela;
import Modelo.BeanEstudante;
import Modelo.BeanProfessor;
import Modelo.BeanSistema;
import java.awt.CardLayout;
import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.html.HTML;
public class Principal extends javax.swing.JFrame {

 public int ano_letivo;
 
 BeanSistema sistema = new BeanSistema();
 SistemaDAO sistemaDao = new SistemaDAO();
    
 BeanEstudante estudante = new BeanEstudante();
 EstudanteDAO estudanteDao = new EstudanteDAO();
 
 BeanProfessor professor = new BeanProfessor();
 ProfessorDAO professorDao = new ProfessorDAO();
 
 Tabela tabela = new Tabela();
 
 TabelaListarEstudante listarEstudante = new TabelaListarEstudante();

    public Principal() {
        initComponents();
        setAno_letivo(2022);
        nome_escola.setText(sistemaDao.nomeSistema());
        painel_frontal_cima.setBackground(sistemaDao.corSistema());
        painel_frontal_baixo.setBackground(sistemaDao.corSistema());
        menu.setBackground(sistemaDao.corSistema());
    }
    
    /* Metódos complementares */
    private void ativarCamposEstudante(){
        if(radio_cadastramentoON.isSelected()){
            txt_nomeEstudante.setEnabled(true);
            spn_dataNascimentoEstudante.setEnabled(true);
            combo_cursoEstudante.setEnabled(true);
            combo_classeEstudante.setEnabled(true);
            btn_guardarEstudante.setEnabled(true);
            btn_limparEstudante.setEnabled(true);
            radio_masculinoEstudante.setEnabled(true);
            radio_femininoEstudante.setEnabled(true);
            combo_turmaEstudante.setEnabled(true);
        }
    }
    private void desativarCamposEstudante(){
        if(radio_cadastramentoOFF.isSelected()){
            txt_nomeEstudante.setEnabled(false);
            spn_dataNascimentoEstudante.setEnabled(false);
            combo_cursoEstudante.setEnabled(false);
            combo_classeEstudante.setEnabled(false);
            btn_guardarEstudante.setEnabled(false);
            btn_limparEstudante.setEnabled(false);
            radio_masculinoEstudante.setEnabled(false);
            radio_femininoEstudante.setEnabled(false);
            combo_turmaEstudante.setEnabled(false);
        }
    }
    
    private void ativarCamposProfessor(){
        txt_nomeProfessor.setEnabled(true);
        //txt_pesquisarProfessor.setEnabled(true);
        radio_femininoProfessor.setEnabled(true);
        radio_masculinoProfessor.setEnabled(true);
        spn_salarioProfessor.setEnabled(true);
        btn_guardarProfessor.setEnabled(true);
        btn_limparProfessor.setEnabled(true);
        combo_disciplinaProfessor.setEnabled(true);
        combo_classeProfessor.setEnabled(true);
        //btn_listarProfessor.setEnabled(true);
        //btn_pesquisarProfessor.setEnabled(true);
    }
    
    private void desativarCamposProfessor(){
        txt_nomeProfessor.setEnabled(false);
        txt_BiProfessor.setEnabled(false);
        radio_femininoProfessor.setEnabled(false);
        radio_masculinoProfessor.setEnabled(false);
        spn_salarioProfessor.setEnabled(false);
        btn_guardarProfessor.setEnabled(false);
        btn_limparProfessor.setEnabled(false);
        combo_disciplinaProfessor.setEnabled(false);
        combo_classeProfessor.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        corpo = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        painel_frontal_cima = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nome_escola = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        combo_anoLetivo = new javax.swing.JComboBox<>();
        jButton29 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        painel_frontal_baixo = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        estudante_painel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        combo_classeEstudante = new javax.swing.JComboBox<>();
        radio_masculinoEstudante = new javax.swing.JRadioButton();
        radio_femininoEstudante = new javax.swing.JRadioButton();
        txt_nomeEstudante = new javax.swing.JTextField();
        txt_BiEstudante = new javax.swing.JTextField();
        btn_guardarEstudante = new javax.swing.JButton();
        btn_limparEstudante = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        combo_cursoEstudante = new javax.swing.JComboBox<>();
        spn_dataNascimentoEstudante = new javax.swing.JSpinner();
        radio_cadastramentoOFF = new javax.swing.JRadioButton();
        radio_cadastramentoON = new javax.swing.JRadioButton();
        jLabel73 = new javax.swing.JLabel();
        combo_turmaEstudante = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_BIEstudantePesquisar = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        professor_painel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        radio_professorOFF = new javax.swing.JRadioButton();
        radio_professorON = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txt_nomeProfessor = new javax.swing.JTextField();
        txt_BiProfessor = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        spn_salarioProfessor = new javax.swing.JSpinner();
        jLabel29 = new javax.swing.JLabel();
        combo_disciplinaProfessor = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        combo_classeProfessor = new javax.swing.JComboBox<>();
        radio_masculinoProfessor = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        radio_femininoProfessor = new javax.swing.JRadioButton();
        btn_guardarProfessor = new javax.swing.JButton();
        btn_limparProfessor = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        txt_pesquisarProfessor = new javax.swing.JTextField();
        btn_pesquisarProfessor = new javax.swing.JButton();
        btn_listarProfessor = new javax.swing.JButton();
        premiacao = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        painel_ranking = new javax.swing.JPanel();
        painel_rankGeral = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_RankingGeral = new javax.swing.JTable();
        painel_rankTurma = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela_RankingTurma = new javax.swing.JTable();
        painel_rankIdade = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela_rankIdade = new javax.swing.JTable();
        painel_rankClasse = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabela_rankClasse = new javax.swing.JTable();
        painel_rankInstrucoes = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        relatorio = new javax.swing.JPanel();
        relatorio_painel_salario = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        relatorio_painel_professor = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        relatorio_painel_estudante = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        relatorio_painel_historia = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        relatorio_painel_propinas = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        relatorio_painel_indisponivel = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        definicoes = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jLabel72 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        menu.setBackground(new java.awt.Color(0, 51, 51));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/Imagens/home.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        menu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 150, 100));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/Imagens/estudante.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        menu.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 150, 90));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/Imagens/professor.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        menu.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 150, 90));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/Imagens/premiacao.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        menu.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 150, 90));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/Imagens/definicao.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        menu.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 150, 90));

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/Imagens/relatorio.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        menu.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 150, 90));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ESTUDANTE");
        menu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PROFESSOR");
        menu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("PREMIAÇÃO");
        menu.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 80, 20));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("RELATÓRIO");
        menu.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 80, 20));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Definições");
        menu.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 70, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("HOME");
        menu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 20));

        corpo.setLayout(new java.awt.CardLayout());

        home.setBackground(new java.awt.Color(204, 204, 204));

        painel_frontal_cima.setBackground(new java.awt.Color(0, 51, 51));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Escola - ");

        nome_escola.setFont(new java.awt.Font("Yu Gothic UI", 3, 18)); // NOI18N
        nome_escola.setForeground(new java.awt.Color(255, 255, 255));
        nome_escola.setText("Maria de Fátima");

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("ANO LECTIVO");

        combo_anoLetivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2025", "2026", "2027", "2028", "2029", "2030" }));
        combo_anoLetivo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_anoLetivoItemStateChanged(evt);
            }
        });
        combo_anoLetivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combo_anoLetivoMouseClicked(evt);
            }
        });
        combo_anoLetivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_anoLetivoActionPerformed(evt);
            }
        });

        jButton29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton29.setForeground(new java.awt.Color(12, 90, 242));
        jButton29.setText("Personalizar");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_frontal_cimaLayout = new javax.swing.GroupLayout(painel_frontal_cima);
        painel_frontal_cima.setLayout(painel_frontal_cimaLayout);
        painel_frontal_cimaLayout.setHorizontalGroup(
            painel_frontal_cimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_frontal_cimaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome_escola)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painel_frontal_cimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_frontal_cimaLayout.createSequentialGroup()
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_anoLetivo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton29, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(63, 63, 63))
        );
        painel_frontal_cimaLayout.setVerticalGroup(
            painel_frontal_cimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_frontal_cimaLayout.createSequentialGroup()
                .addGroup(painel_frontal_cimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_frontal_cimaLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(painel_frontal_cimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nome_escola)))
                    .addGroup(painel_frontal_cimaLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(painel_frontal_cimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel74)
                            .addComponent(combo_anoLetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton29)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/Imagens/sala-de-aula4.jpg"))); // NOI18N

        painel_frontal_baixo.setBackground(new java.awt.Color(0, 51, 51));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("©Todos os direitos reservados");

        javax.swing.GroupLayout painel_frontal_baixoLayout = new javax.swing.GroupLayout(painel_frontal_baixo);
        painel_frontal_baixo.setLayout(painel_frontal_baixoLayout);
        painel_frontal_baixoLayout.setHorizontalGroup(
            painel_frontal_baixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_frontal_baixoLayout.createSequentialGroup()
                .addGap(438, 438, 438)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_frontal_baixoLayout.setVerticalGroup(
            painel_frontal_baixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_frontal_baixoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel23)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_frontal_cima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(0, 176, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(172, 172, 172))
            .addComponent(painel_frontal_baixo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addComponent(painel_frontal_cima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painel_frontal_baixo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        corpo.add(home, "cartao_home");

        estudante_painel.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/Imagens/estudante.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(248, 3, 3));
        jLabel6.setText("Matrícula");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Nome:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("№ Est:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Data de nascimento:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Classe:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Sexo:");

        combo_classeEstudante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1ª", "2ª", "3ª", "4ª", "5ª", "6ª", "7ª", "8ª", "9ª", "10ª", "11ª", "12ª" }));
        combo_classeEstudante.setEnabled(false);

        radio_masculinoEstudante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radio_masculinoEstudante.setSelected(true);
        radio_masculinoEstudante.setText("Masculino");
        radio_masculinoEstudante.setEnabled(false);
        radio_masculinoEstudante.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radio_masculinoEstudanteItemStateChanged(evt);
            }
        });

        radio_femininoEstudante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radio_femininoEstudante.setText("Feminino");
        radio_femininoEstudante.setEnabled(false);
        radio_femininoEstudante.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radio_femininoEstudanteItemStateChanged(evt);
            }
        });

        txt_nomeEstudante.setEnabled(false);
        txt_nomeEstudante.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_nomeEstudanteFocusGained(evt);
            }
        });

        txt_BiEstudante.setEnabled(false);

        btn_guardarEstudante.setText("Guardar");
        btn_guardarEstudante.setEnabled(false);
        btn_guardarEstudante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarEstudanteActionPerformed(evt);
            }
        });

        btn_limparEstudante.setText("Limpar");
        btn_limparEstudante.setEnabled(false);
        btn_limparEstudante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparEstudanteActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Curso:");

        combo_cursoEstudante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Informática", "Eletricidade", "C.F.B", "C.E.J", "Análises Clinática", "Mecânica", "Máquinas e Motores", "Farmácia", "Contabilidade Financeira", "Gestão Empresarial" }));
        combo_cursoEstudante.setEnabled(false);

        spn_dataNascimentoEstudante.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spn_dataNascimentoEstudante.setEnabled(false);

        radio_cadastramentoOFF.setSelected(true);
        radio_cadastramentoOFF.setText("OFF");
        radio_cadastramentoOFF.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radio_cadastramentoOFFItemStateChanged(evt);
            }
        });

        radio_cadastramentoON.setText("ON");
        radio_cadastramentoON.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radio_cadastramentoONItemStateChanged(evt);
            }
        });

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel73.setText("Turma:");

        combo_turmaEstudante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));
        combo_turmaEstudante.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radio_cadastramentoOFF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio_cadastramentoON))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(spn_dataNascimentoEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(102, 102, 102)
                                    .addComponent(jLabel12))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btn_guardarEstudante)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_limparEstudante))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(combo_classeEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radio_masculinoEstudante)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radio_femininoEstudante)
                                        .addGap(18, 18, 18))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(0, 53, Short.MAX_VALUE)
                                    .addComponent(jLabel73)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(combo_turmaEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(combo_cursoEstudante, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_BiEstudante)
                                .addComponent(txt_nomeEstudante)))))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radio_cadastramentoOFF)
                        .addComponent(radio_cadastramentoON))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_nomeEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_BiEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(combo_cursoEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spn_dataNascimentoEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(combo_classeEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(radio_masculinoEstudante)
                    .addComponent(radio_femininoEstudante)
                    .addComponent(jLabel73)
                    .addComponent(combo_turmaEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardarEstudante)
                    .addComponent(btn_limparEstudante))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        txt_BiEstudante.getAccessibleContext().setAccessibleName("meuCampo");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(251, 7, 7));
        jLabel17.setText("Buscar ");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("№ Est:");

        jButton5.setText("Pesquisar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Listar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton16.setText("Enviar notas");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("Propina");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(51, 51, 255));
        jLabel54.setText("Enviar Notas");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 255));
        jLabel13.setText("Pagar Propinas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton16)
                            .addComponent(jLabel54))
                        .addGap(220, 220, 220)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5))
                            .addComponent(txt_BIEstudantePesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txt_BIEstudantePesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton16)
                .addGap(23, 23, 23)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton17)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout estudante_painelLayout = new javax.swing.GroupLayout(estudante_painel);
        estudante_painel.setLayout(estudante_painelLayout);
        estudante_painelLayout.setHorizontalGroup(
            estudante_painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, estudante_painelLayout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(estudante_painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(estudante_painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(125, 125, 125))
        );
        estudante_painelLayout.setVerticalGroup(
            estudante_painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(estudante_painelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 99, Short.MAX_VALUE))
        );

        corpo.add(estudante_painel, "cartao_estudante");

        professor_painel.setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(249, 6, 6));
        jLabel25.setText("Cadastramento do professor");

        radio_professorOFF.setSelected(true);
        radio_professorOFF.setText("OFF");
        radio_professorOFF.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radio_professorOFFItemStateChanged(evt);
            }
        });

        radio_professorON.setText("ON");
        radio_professorON.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radio_professorONItemStateChanged(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("Nome:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("№ B.I:");

        txt_nomeProfessor.setEnabled(false);

        txt_BiProfessor.setEnabled(false);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setText("Salário:");

        spn_salarioProfessor.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));
        spn_salarioProfessor.setEnabled(false);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setText("Disciplina:");

        combo_disciplinaProfessor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matemática", "Física", "Química", "História", "Geografia", "E.M.C", "E.V.P" }));
        combo_disciplinaProfessor.setEnabled(false);

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setText("Classe:");

        combo_classeProfessor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1ª", "2ª", "3", "4ª", "5ª", "6ª", "7ª", "8ª", "9ª", "10ª", "11ª", "12ª" }));
        combo_classeProfessor.setEnabled(false);

        radio_masculinoProfessor.setSelected(true);
        radio_masculinoProfessor.setText("Masculino");
        radio_masculinoProfessor.setEnabled(false);
        radio_masculinoProfessor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radio_masculinoProfessorItemStateChanged(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel33.setText("Sexo:");

        radio_femininoProfessor.setText("Feminino");
        radio_femininoProfessor.setEnabled(false);
        radio_femininoProfessor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radio_femininoProfessorItemStateChanged(evt);
            }
        });
        radio_femininoProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_femininoProfessorActionPerformed(evt);
            }
        });

        btn_guardarProfessor.setText("Guardar");
        btn_guardarProfessor.setEnabled(false);
        btn_guardarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarProfessorActionPerformed(evt);
            }
        });

        btn_limparProfessor.setText("Limpar");
        btn_limparProfessor.setEnabled(false);
        btn_limparProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel25)
                        .addGap(2, 2, 2)
                        .addComponent(radio_professorOFF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radio_professorON)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel28)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel26)
                                .addComponent(jLabel27)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_BiProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(spn_salarioProfessor, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combo_classeProfessor, javax.swing.GroupLayout.Alignment.LEADING, 0, 73, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(combo_disciplinaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radio_masculinoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radio_femininoProfessor)
                                        .addGap(9, 9, 9))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_guardarProfessor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_limparProfessor))
                            .addComponent(txt_nomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(radio_professorOFF)
                    .addComponent(radio_professorON))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txt_nomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_BiProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spn_salarioProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(combo_disciplinaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_classeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(radio_masculinoProfessor)
                    .addComponent(jLabel33)
                    .addComponent(radio_femininoProfessor))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardarProfessor)
                    .addComponent(btn_limparProfessor))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/Imagens/professor.png"))); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel34.setText("№ Professor:");

        btn_pesquisarProfessor.setText("Pesquisar");
        btn_pesquisarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarProfessorActionPerformed(evt);
            }
        });

        btn_listarProfessor.setText("Listar");
        btn_listarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listarProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btn_listarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_pesquisarProfessor))
                    .addComponent(txt_pesquisarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(txt_pesquisarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_listarProfessor)
                    .addComponent(btn_pesquisarProfessor))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout professor_painelLayout = new javax.swing.GroupLayout(professor_painel);
        professor_painel.setLayout(professor_painelLayout);
        professor_painelLayout.setHorizontalGroup(
            professor_painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(professor_painelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(professor_painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel31)
                    .addGroup(professor_painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        professor_painelLayout.setVerticalGroup(
            professor_painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(professor_painelLayout.createSequentialGroup()
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        corpo.add(professor_painel, "cartao_contacto");

        premiacao.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/Imagens/ranking-geral.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(243, 104, 52));
        jLabel32.setText("RANK-GERAL");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel35.setText("Melhores");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel36.setText("Estudantes");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36))
                .addGap(0, 106, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/Imagens/raking-turma.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(82, 193, 129));
        jLabel37.setText("Curso");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel38.setText("Por");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel39.setText("Curso");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addComponent(jLabel38)
                    .addComponent(jLabel37))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addGap(1, 1, 1)
                .addComponent(jLabel39)
                .addContainerGap())
            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/Imagens/rank_idade.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(58, 103, 242));
        jLabel40.setText("Disciplina");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel41.setText("Por");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel42.setText("Disciplina");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel40))
                .addGap(6, 132, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addGap(1, 1, 1)
                .addComponent(jLabel42)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(102, 0, 0));
        jLabel43.setText("SELECIONE UM RANKINK ABAIXO");

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/Imagens/ranking-classe.png"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(204, 51, 255));
        jLabel44.setText("CLASSE");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel45.setText("Por");

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel46.setText("Classes");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46))
                .addGap(0, 136, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/Imagens/instrucoes.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 204, 102));
        jLabel48.setText("INSTRUÇÕES");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel48)
                .addGap(0, 91, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel48)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/Imagens/Prêmio.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel47)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );

        painel_ranking.setLayout(new java.awt.CardLayout());

        painel_rankGeral.setBackground(new java.awt.Color(51, 51, 51));
        painel_rankGeral.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                painel_rankGeralFocusGained(evt);
            }
        });
        painel_rankGeral.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                painel_rankGeralComponentShown(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Rank-Geral");

        tabela_RankingGeral.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tabela_RankingGeral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabela_RankingGeral);

        javax.swing.GroupLayout painel_rankGeralLayout = new javax.swing.GroupLayout(painel_rankGeral);
        painel_rankGeral.setLayout(painel_rankGeralLayout);
        painel_rankGeralLayout.setHorizontalGroup(
            painel_rankGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_rankGeralLayout.createSequentialGroup()
                .addGroup(painel_rankGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_rankGeralLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel_rankGeralLayout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(jLabel49)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        painel_rankGeralLayout.setVerticalGroup(
            painel_rankGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_rankGeralLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        painel_ranking.add(painel_rankGeral, "cartao_rankGeral");

        painel_rankTurma.setBackground(new java.awt.Color(125, 186, 105));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Rank-Turma");

        tabela_RankingTurma.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tabela_RankingTurma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabela_RankingTurma);

        javax.swing.GroupLayout painel_rankTurmaLayout = new javax.swing.GroupLayout(painel_rankTurma);
        painel_rankTurma.setLayout(painel_rankTurmaLayout);
        painel_rankTurmaLayout.setHorizontalGroup(
            painel_rankTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_rankTurmaLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_rankTurmaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel50)
                .addGap(345, 345, 345))
        );
        painel_rankTurmaLayout.setVerticalGroup(
            painel_rankTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_rankTurmaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        painel_ranking.add(painel_rankTurma, "cartao_rankTurma");

        painel_rankIdade.setBackground(new java.awt.Color(92, 143, 198));
        painel_rankIdade.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                painel_rankIdadeComponentShown(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Rank-Idade");

        tabela_rankIdade.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tabela_rankIdade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tabela_rankIdade);

        javax.swing.GroupLayout painel_rankIdadeLayout = new javax.swing.GroupLayout(painel_rankIdade);
        painel_rankIdade.setLayout(painel_rankIdadeLayout);
        painel_rankIdadeLayout.setHorizontalGroup(
            painel_rankIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_rankIdadeLayout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(jLabel51)
                .addContainerGap(317, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_rankIdadeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        painel_rankIdadeLayout.setVerticalGroup(
            painel_rankIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_rankIdadeLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painel_ranking.add(painel_rankIdade, "cartao_rankIdade");

        painel_rankClasse.setBackground(new java.awt.Color(143, 88, 155));

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Rank-Classe");

        tabela_rankClasse.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tabela_rankClasse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tabela_rankClasse);

        javax.swing.GroupLayout painel_rankClasseLayout = new javax.swing.GroupLayout(painel_rankClasse);
        painel_rankClasse.setLayout(painel_rankClasseLayout);
        painel_rankClasseLayout.setHorizontalGroup(
            painel_rankClasseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_rankClasseLayout.createSequentialGroup()
                .addGroup(painel_rankClasseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_rankClasseLayout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(jLabel52))
                    .addGroup(painel_rankClasseLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        painel_rankClasseLayout.setVerticalGroup(
            painel_rankClasseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_rankClasseLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painel_ranking.add(painel_rankClasse, "cartao_rankClasse");

        jLabel53.setText("Como funciona esse ranking");

        javax.swing.GroupLayout painel_rankInstrucoesLayout = new javax.swing.GroupLayout(painel_rankInstrucoes);
        painel_rankInstrucoes.setLayout(painel_rankInstrucoesLayout);
        painel_rankInstrucoesLayout.setHorizontalGroup(
            painel_rankInstrucoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_rankInstrucoesLayout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(jLabel53)
                .addContainerGap(317, Short.MAX_VALUE))
        );
        painel_rankInstrucoesLayout.setVerticalGroup(
            painel_rankInstrucoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_rankInstrucoesLayout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(jLabel53)
                .addContainerGap(384, Short.MAX_VALUE))
        );

        painel_ranking.add(painel_rankInstrucoes, "cartao_rankInstrucoes");

        javax.swing.GroupLayout premiacaoLayout = new javax.swing.GroupLayout(premiacao);
        premiacao.setLayout(premiacaoLayout);
        premiacaoLayout.setHorizontalGroup(
            premiacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(premiacaoLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painel_ranking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        premiacaoLayout.setVerticalGroup(
            premiacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painel_ranking, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        corpo.add(premiacao, "cartao_premiacao");

        relatorio.setBackground(new java.awt.Color(153, 153, 153));

        relatorio_painel_salario.setBackground(new java.awt.Color(255, 255, 255));
        relatorio_painel_salario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        relatorio_painel_salario.setPreferredSize(new java.awt.Dimension(368, 100));
        relatorio_painel_salario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                relatorio_painel_salarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                relatorio_painel_salarioMouseExited(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(249, 5, 5));
        jLabel15.setText("Salários");

        jButton7.setText("Ver");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Ver salário dos professores");

        javax.swing.GroupLayout relatorio_painel_salarioLayout = new javax.swing.GroupLayout(relatorio_painel_salario);
        relatorio_painel_salario.setLayout(relatorio_painel_salarioLayout);
        relatorio_painel_salarioLayout.setHorizontalGroup(
            relatorio_painel_salarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(relatorio_painel_salarioLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(relatorio_painel_salarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        relatorio_painel_salarioLayout.setVerticalGroup(
            relatorio_painel_salarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(relatorio_painel_salarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addGap(33, 33, 33))
        );

        relatorio_painel_professor.setBackground(new java.awt.Color(255, 255, 255));
        relatorio_painel_professor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        relatorio_painel_professor.setPreferredSize(new java.awt.Dimension(368, 100));
        relatorio_painel_professor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                relatorio_painel_professorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                relatorio_painel_professorMouseExited(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(249, 5, 5));
        jLabel55.setText("Professores");

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel56.setText("Ver lista dos professores");

        jButton15.setText("Ver");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout relatorio_painel_professorLayout = new javax.swing.GroupLayout(relatorio_painel_professor);
        relatorio_painel_professor.setLayout(relatorio_painel_professorLayout);
        relatorio_painel_professorLayout.setHorizontalGroup(
            relatorio_painel_professorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(relatorio_painel_professorLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(relatorio_painel_professorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel55)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        relatorio_painel_professorLayout.setVerticalGroup(
            relatorio_painel_professorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(relatorio_painel_professorLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel56)
                .addGap(18, 18, 18)
                .addComponent(jButton15)
                .addGap(33, 33, 33))
        );

        relatorio_painel_estudante.setBackground(new java.awt.Color(255, 255, 255));
        relatorio_painel_estudante.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        relatorio_painel_estudante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                relatorio_painel_estudanteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                relatorio_painel_estudanteMouseExited(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(249, 5, 5));
        jLabel57.setText("Estudantes");

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel58.setText("Ver lista dos estudantes");

        jButton18.setText("Ver");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout relatorio_painel_estudanteLayout = new javax.swing.GroupLayout(relatorio_painel_estudante);
        relatorio_painel_estudante.setLayout(relatorio_painel_estudanteLayout);
        relatorio_painel_estudanteLayout.setHorizontalGroup(
            relatorio_painel_estudanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(relatorio_painel_estudanteLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(relatorio_painel_estudanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel57)
                    .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        relatorio_painel_estudanteLayout.setVerticalGroup(
            relatorio_painel_estudanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(relatorio_painel_estudanteLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58)
                .addGap(18, 18, 18)
                .addComponent(jButton18)
                .addGap(33, 33, 33))
        );

        relatorio_painel_historia.setBackground(new java.awt.Color(255, 255, 255));
        relatorio_painel_historia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        relatorio_painel_historia.setPreferredSize(new java.awt.Dimension(368, 100));
        relatorio_painel_historia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                relatorio_painel_historiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                relatorio_painel_historiaMouseExited(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(249, 5, 5));
        jLabel59.setText("Pagamento");

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel60.setText("Ver histórico de pagamento");

        jButton19.setText("Ver");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout relatorio_painel_historiaLayout = new javax.swing.GroupLayout(relatorio_painel_historia);
        relatorio_painel_historia.setLayout(relatorio_painel_historiaLayout);
        relatorio_painel_historiaLayout.setHorizontalGroup(
            relatorio_painel_historiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(relatorio_painel_historiaLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(relatorio_painel_historiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel59)
                    .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        relatorio_painel_historiaLayout.setVerticalGroup(
            relatorio_painel_historiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(relatorio_painel_historiaLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel60)
                .addGap(18, 18, 18)
                .addComponent(jButton19)
                .addGap(33, 33, 33))
        );

        relatorio_painel_propinas.setBackground(new java.awt.Color(255, 255, 255));
        relatorio_painel_propinas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        relatorio_painel_propinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                relatorio_painel_propinasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                relatorio_painel_propinasMouseExited(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(249, 5, 5));
        jLabel61.setText("Hostórico do Estudante");

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel62.setText("Ver informação reverente a nota do estudante");

        jButton20.setText("Ver");

        javax.swing.GroupLayout relatorio_painel_propinasLayout = new javax.swing.GroupLayout(relatorio_painel_propinas);
        relatorio_painel_propinas.setLayout(relatorio_painel_propinasLayout);
        relatorio_painel_propinasLayout.setHorizontalGroup(
            relatorio_painel_propinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(relatorio_painel_propinasLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(relatorio_painel_propinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62)
                    .addComponent(jLabel61)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        relatorio_painel_propinasLayout.setVerticalGroup(
            relatorio_painel_propinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(relatorio_painel_propinasLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel62)
                .addGap(18, 18, 18)
                .addComponent(jButton20)
                .addGap(33, 33, 33))
        );

        relatorio_painel_indisponivel.setBackground(new java.awt.Color(255, 255, 255));
        relatorio_painel_indisponivel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(249, 5, 5));
        jLabel63.setText("Cartão");

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel64.setText("Gerar cartão do estudante");

        jButton21.setText("Ver");

        javax.swing.GroupLayout relatorio_painel_indisponivelLayout = new javax.swing.GroupLayout(relatorio_painel_indisponivel);
        relatorio_painel_indisponivel.setLayout(relatorio_painel_indisponivelLayout);
        relatorio_painel_indisponivelLayout.setHorizontalGroup(
            relatorio_painel_indisponivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(relatorio_painel_indisponivelLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(relatorio_painel_indisponivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel63)
                    .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        relatorio_painel_indisponivelLayout.setVerticalGroup(
            relatorio_painel_indisponivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(relatorio_painel_indisponivelLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel64)
                .addGap(18, 18, 18)
                .addComponent(jButton21)
                .addGap(33, 33, 33))
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(249, 5, 5));
        jLabel65.setText("Pauta");

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel66.setText("Ver pauta dos estudantes");

        jButton22.setText("Ver");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel65)
                    .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel66)
                .addGap(18, 18, 18)
                .addComponent(jButton22)
                .addGap(33, 33, 33))
        );

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(249, 5, 5));
        jLabel67.setText("Indisponível");

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel68.setText("Informação indisponível de momento");

        jButton23.setText("Ver");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel68)
                    .addComponent(jLabel67)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel68)
                .addGap(18, 18, 18)
                .addComponent(jButton23)
                .addGap(33, 33, 33))
        );

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(249, 5, 5));
        jLabel69.setText("Dados Gerais");

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel70.setText("Ver toda informação resumida");

        jButton24.setText("Ver");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel70)
                    .addComponent(jLabel69)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel70)
                .addGap(18, 18, 18)
                .addComponent(jButton24)
                .addGap(33, 33, 33))
        );

        jPanel22.setBackground(new java.awt.Color(0, 51, 51));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Angola, Luanda, Cacuaco");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(178, 178, 178))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout relatorioLayout = new javax.swing.GroupLayout(relatorio);
        relatorio.setLayout(relatorioLayout);
        relatorioLayout.setHorizontalGroup(
            relatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(relatorioLayout.createSequentialGroup()
                .addGroup(relatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(relatorio_painel_historia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(relatorio_painel_salario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(relatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(relatorioLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(relatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(relatorio_painel_propinas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(relatorioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(relatorio_painel_professor, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(relatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(relatorioLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(relatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(relatorio_painel_indisponivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(relatorioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(relatorio_painel_estudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        relatorioLayout.setVerticalGroup(
            relatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(relatorioLayout.createSequentialGroup()
                .addGroup(relatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(relatorio_painel_salario, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(relatorio_painel_professor, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(relatorio_painel_estudante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(relatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(relatorio_painel_historia, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(relatorio_painel_propinas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(relatorio_painel_indisponivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(relatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        corpo.add(relatorio, "cartao_relatorio");

        definicoes.setBackground(new java.awt.Color(51, 51, 51));

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/Imagens/definicoes_painel.png"))); // NOI18N

        jButton25.setBackground(new java.awt.Color(102, 102, 102));
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("Contacto");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setBackground(new java.awt.Color(102, 102, 102));
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("Atualização");

        jButton27.setBackground(new java.awt.Color(102, 102, 102));
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setText("Sobre");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setBackground(new java.awt.Color(102, 102, 102));
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("Ajuda");

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("©Todos os direitos reservados");

        javax.swing.GroupLayout definicoesLayout = new javax.swing.GroupLayout(definicoes);
        definicoes.setLayout(definicoesLayout);
        definicoesLayout.setHorizontalGroup(
            definicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, definicoesLayout.createSequentialGroup()
                .addComponent(jLabel71)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, definicoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(definicoesLayout.createSequentialGroup()
                .addGap(431, 431, 431)
                .addComponent(jLabel72)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        definicoesLayout.setVerticalGroup(
            definicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, definicoesLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(definicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton25)
                    .addComponent(jButton26)
                    .addComponent(jButton27)
                    .addComponent(jButton28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        corpo.add(definicoes, "cartao_definicao");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(corpo, javax.swing.GroupLayout.PREFERRED_SIZE, 1079, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(corpo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /* Chama o painel estudante  */
        CardLayout c = (CardLayout)corpo.getLayout();
        c.show(corpo, "cartao_estudante");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Chame o painel contacto
        CardLayout c = (CardLayout) corpo.getLayout();
        c.show(corpo, "cartao_contacto");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /* Chame o painel home  */
        CardLayout c = (CardLayout) corpo.getLayout();
        c.show(corpo, "cartao_home");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        /* Chamar o painel arquivo */
        CardLayout c = (CardLayout) corpo.getLayout();
        tabela.carrega(estudante, tabela_RankingGeral);
        c.show(corpo, "cartao_premiacao");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void radio_cadastramentoOFFItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radio_cadastramentoOFFItemStateChanged
        // Configuração do Radio OFF
        if(radio_cadastramentoOFF.isSelected()){
            radio_cadastramentoON.setSelected(false);
            desativarCamposEstudante();
        }
        else if(!radio_cadastramentoOFF.isSelected() && !radio_cadastramentoON.isSelected()){
            radio_cadastramentoOFF.setSelected(true);
        }
        
    }//GEN-LAST:event_radio_cadastramentoOFFItemStateChanged

    private void radio_cadastramentoONItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radio_cadastramentoONItemStateChanged
        // Configurando o Radio ON
        if(radio_cadastramentoON.isSelected()){
            radio_cadastramentoOFF.setSelected(false);
            ativarCamposEstudante();
        }
        else if(!radio_cadastramentoOFF.isSelected() && !radio_cadastramentoON.isSelected()){
            radio_cadastramentoON.setSelected(true);
        }
        
    }//GEN-LAST:event_radio_cadastramentoONItemStateChanged

    private void radio_masculinoEstudanteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radio_masculinoEstudanteItemStateChanged
        // Configurando o Radio Masculino
        if(radio_masculinoEstudante.isSelected()){
            radio_femininoEstudante.setSelected(false);
        }
        else if(!radio_masculinoEstudante.isSelected() && !radio_femininoEstudante.isSelected()){
            radio_masculinoEstudante.setSelected(true);
        }
    }//GEN-LAST:event_radio_masculinoEstudanteItemStateChanged

    private void radio_femininoEstudanteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radio_femininoEstudanteItemStateChanged
        // Configurando o Radio Feminino
        if(radio_femininoEstudante.isSelected()){
            radio_masculinoEstudante.setSelected(false);
        }
        else if(!radio_masculinoEstudante.isSelected() && !radio_femininoEstudante.isSelected()){
            radio_femininoEstudante.setSelected(true);
        }
    }//GEN-LAST:event_radio_femininoEstudanteItemStateChanged

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        CardLayout c = (CardLayout) corpo.getLayout();
        c.show(corpo, "cartao_relatorio");
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        CardLayout c = (CardLayout) corpo.getLayout();
        c.show(corpo, "cartao_definicao");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void radio_femininoProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_femininoProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_femininoProfessorActionPerformed

    private void radio_professorOFFItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radio_professorOFFItemStateChanged
        //Configuração do radio professor OFF
        if(radio_professorOFF.isSelected()){
            radio_professorON.setSelected(false);
            desativarCamposProfessor();
        }
        else if(!radio_professorOFF.isSelected() && !radio_professorON.isSelected()){
            radio_professorOFF.setSelected(true);
        }
    }//GEN-LAST:event_radio_professorOFFItemStateChanged

    private void radio_professorONItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radio_professorONItemStateChanged
        // TODO add your handling code here:
        if(radio_professorON.isSelected()){
            radio_professorOFF.setSelected(false);
            ativarCamposProfessor();
        }
        else if(!radio_professorON.isSelected() && !radio_professorOFF.isSelected()){
            radio_professorON.setSelected(true);
        }
    }//GEN-LAST:event_radio_professorONItemStateChanged

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        CardLayout c = (CardLayout) painel_ranking.getLayout();
        tabela.carrega(estudante, tabela_RankingTurma);
        c.show(painel_ranking, "cartao_rankTurma");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        CardLayout c = (CardLayout) painel_ranking.getLayout();
        c.show(painel_ranking, "cartao_rankGeral");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        CardLayout c = (CardLayout) painel_ranking.getLayout();
        tabela.carrega(estudante, tabela_rankIdade);
        c.show(painel_ranking, "cartao_rankIdade");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        CardLayout c = (CardLayout) painel_ranking.getLayout();
        tabela.carrega(estudante, tabela_rankClasse);
        c.show(painel_ranking, "cartao_rankClasse");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        CardLayout c = (CardLayout) painel_ranking.getLayout();
        c.show(painel_ranking, "cartao_rankInstrucoes");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        Notas notas = new Notas(this, true);
        notas.setLocation(550,250); 
        try{
            notas.setId_estudante(Integer.parseInt(txt_BiEstudante.getText()));
            notas.setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Primeiro pesquisa o estudante!", "Aviso", 
                    JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        Propinas propinas = new Propinas(this, true);
        propinas.setLocation(550,250); 
        try{
            propinas.setIdEstudante(Integer.parseInt(txt_BiEstudante.getText()));
            propinas.setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Primeiro pesquisa o estudante!", "Aviso", 
                    JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton17ActionPerformed

    private void radio_masculinoProfessorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radio_masculinoProfessorItemStateChanged
        // TODO add your handling code here:
        if(radio_masculinoProfessor.isSelected()){
            radio_femininoProfessor.setSelected(false);
        }
        else if(!radio_masculinoProfessor.isSelected() && !radio_femininoProfessor.isSelected()){
            radio_masculinoProfessor.setSelected(true);
        }
    }//GEN-LAST:event_radio_masculinoProfessorItemStateChanged

    private void radio_femininoProfessorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radio_femininoProfessorItemStateChanged
        // TODO add your handling code here:
        if(radio_femininoProfessor.isSelected()){
            radio_masculinoProfessor.setSelected(false);
        }
        else if(!radio_masculinoProfessor.isSelected() && !radio_femininoProfessor.isSelected()){
            radio_femininoProfessor.setSelected(true);
        }
    }//GEN-LAST:event_radio_femininoProfessorItemStateChanged

    private void relatorio_painel_salarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relatorio_painel_salarioMouseEntered
        // TODO add your handling code here:
        Color cor = new Color(239, 242, 245);
        relatorio_painel_salario.setBackground(cor);
        
    }//GEN-LAST:event_relatorio_painel_salarioMouseEntered

    private void relatorio_painel_salarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relatorio_painel_salarioMouseExited
        // TODO add your handling code here:
        relatorio_painel_salario.setBackground(Color.white);
    }//GEN-LAST:event_relatorio_painel_salarioMouseExited

    private void relatorio_painel_professorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relatorio_painel_professorMouseEntered
        // TODO add your handling code here:
        Color cor = new Color(239, 242, 245);
        relatorio_painel_professor.setBackground(cor);
    }//GEN-LAST:event_relatorio_painel_professorMouseEntered

    private void relatorio_painel_professorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relatorio_painel_professorMouseExited
        // TODO add your handling code here:
        relatorio_painel_professor.setBackground(Color.white);
    }//GEN-LAST:event_relatorio_painel_professorMouseExited

    private void relatorio_painel_estudanteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relatorio_painel_estudanteMouseEntered
        // TODO add your handling code here:
        Color cor = new Color(239, 242, 245);
        relatorio_painel_estudante.setBackground(cor);
    }//GEN-LAST:event_relatorio_painel_estudanteMouseEntered

    private void relatorio_painel_estudanteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relatorio_painel_estudanteMouseExited
        // TODO add your handling code here:
        relatorio_painel_estudante.setBackground(Color.white);
    }//GEN-LAST:event_relatorio_painel_estudanteMouseExited

    private void relatorio_painel_historiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relatorio_painel_historiaMouseEntered
        // TODO add your handling code here:
        Color cor = new Color(239, 242, 245);
        relatorio_painel_historia.setBackground(cor);
    }//GEN-LAST:event_relatorio_painel_historiaMouseEntered

    private void relatorio_painel_historiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relatorio_painel_historiaMouseExited
        relatorio_painel_historia.setBackground(Color.white);
    }//GEN-LAST:event_relatorio_painel_historiaMouseExited

    private void relatorio_painel_propinasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relatorio_painel_propinasMouseEntered
        Color cor = new Color(239, 242, 245);
        relatorio_painel_propinas.setBackground(cor);
    }//GEN-LAST:event_relatorio_painel_propinasMouseEntered

    private void relatorio_painel_propinasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relatorio_painel_propinasMouseExited
        relatorio_painel_propinas.setBackground(Color.white);
    }//GEN-LAST:event_relatorio_painel_propinasMouseExited

    private void btn_guardarEstudanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarEstudanteActionPerformed
        // Cadastramento de estudante
        if(txt_nomeEstudante.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preecha o campo de nome!");
        }
        else if((int)spn_dataNascimentoEstudante.getValue() == 0){
            JOptionPane.showMessageDialog(null, "Preecha o ano de nascimento!");
        }
        else{
            estudante.setNome(txt_nomeEstudante.getText());
            estudante.setDataNascimento((int)spn_dataNascimentoEstudante.getValue());
            switch(combo_cursoEstudante.getSelectedIndex()){
                case 0:estudante.setCurso("Nenhum"); break;
                case 1:estudante.setCurso("Informática");break;
                case 2:estudante.setCurso("Eletricidade");break;
                case 3:estudante.setCurso("Gestão Empresarial");break;
                case 4:estudante.setCurso("Mecânica");break;
                case 5:estudante.setCurso("Física");break;
            }
            estudante.setClasse(combo_classeEstudante.getSelectedIndex() + 1);
            if(radio_masculinoEstudante.isSelected()){
                estudante.setSexo("M");
            }else{
                estudante.setSexo("F");
            }
            estudante.setTurma(String.valueOf(combo_turmaEstudante.getSelectedItem()));
            estudante.setAno_matricula(getAno_letivo());
            estudanteDao.addMatricula(estudante);
        }
        
    }//GEN-LAST:event_btn_guardarEstudanteActionPerformed

    private void btn_limparEstudanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparEstudanteActionPerformed
        // Botão que limpa os dados dos campos
        txt_nomeEstudante.setText("");
        txt_BiEstudante.setText("");
        combo_classeEstudante.setSelectedIndex(0);
        combo_cursoEstudante.setSelectedIndex(0);
        combo_turmaEstudante.setSelectedIndex(0);
        spn_dataNascimentoEstudante.setValue(0);
        
    }//GEN-LAST:event_btn_limparEstudanteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Pesquisa os dados por id, e coloca as informações nos campos acima.
         try{
            if(txt_BIEstudantePesquisar.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Entre com código!");
            }
            else{
                  estudante.setBI(Integer.parseInt(txt_BIEstudantePesquisar.getText()));
                  ArrayList pesquisaEstudante = estudanteDao.pesquisar(estudante);
                  if(pesquisaEstudante.size() != 0){
                        txt_BiEstudante.setText(String.valueOf(pesquisaEstudante.get(0)));
                        txt_nomeEstudante.setText(String.valueOf(pesquisaEstudante.get(1)));
                        spn_dataNascimentoEstudante.setValue(pesquisaEstudante.get(2));
                        combo_cursoEstudante.setSelectedIndex(ajustaTurma(String.valueOf(pesquisaEstudante.get(3))));
                        combo_classeEstudante.setSelectedIndex((int)pesquisaEstudante.get(4)-1);
                        if(pesquisaEstudante.get(5).equals("M")){
                            radio_masculinoEstudante.setSelected(true);
                        }else{
                           radio_femininoEstudante.setSelected(true);
                        }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Estudante inexistente!");
                }
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro. Pesquisa por número existente!");
        } 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_guardarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarProfessorActionPerformed
        // TODO add your handling code here:
        professor.setNome(txt_nomeProfessor.getText());
        //professor.setBI(Integer.parseInt(txt_BiProfessor.getText()));
        professor.setSalario(Double.parseDouble(String.valueOf(spn_salarioProfessor.getValue())));
        professor.setDisciplina(String.valueOf(combo_disciplinaProfessor.getSelectedItem()));
        professor.setClasse(combo_classeProfessor.getSelectedIndex() + 1);
        if(radio_masculinoProfessor.isSelected()){
            professor.setSexo("M");
        }else{
            professor.setSexo("F");
        }
        if(txt_nomeProfessor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo de nome!");
        }
        else if(spn_salarioProfessor.getValue().equals(new Integer("0"))){
            JOptionPane.showMessageDialog(null, "Preencha o campo de salario!");
        }
        else{
            professorDao.adicionar(professor);
        }
        
    }//GEN-LAST:event_btn_guardarProfessorActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Listar Estudante chamando a classe TabelaListarEstudante
        if(!txt_nomeEstudante.getText().isEmpty() && !txt_BiEstudante.getText().isEmpty()){
            TabelaListarEstudante listarEstudante = new TabelaListarEstudante();
            listarEstudante.carregaTabela((combo_classeEstudante.getSelectedIndex() + 1));
            listarEstudante.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Pesquise pelo estudante!");
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btn_limparProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparProfessorActionPerformed
        // TODO add your handling code here:
        txt_nomeProfessor.setText("");
        txt_BiProfessor.setText("");
        combo_classeProfessor.setSelectedIndex(0);
        radio_masculinoProfessor.setSelected(true);
        spn_salarioProfessor.setValue(0);
        
    }//GEN-LAST:event_btn_limparProfessorActionPerformed

    private void btn_pesquisarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarProfessorActionPerformed
         // Pesquisa os dados por Numéro do prof, e coloca as informações nos campos acima.
         try{
             if(txt_pesquisarProfessor.getText().isEmpty()){
                 JOptionPane.showMessageDialog(null, "Inserir código do professor!");
             }
             else{
                 professor.setBI(Integer.parseInt(txt_pesquisarProfessor.getText()));
                 ArrayList pesquisaProfessor = professorDao.pesquisar(professor);
                 
                if(!txt_pesquisarProfessor.getText().isEmpty() && pesquisaProfessor.size() != 0){
                    txt_BiProfessor.setText(String.valueOf(pesquisaProfessor.get(0)));
                    txt_nomeProfessor.setText(String.valueOf(pesquisaProfessor.get(1)));
                    spn_salarioProfessor.setValue(pesquisaProfessor.get(2));
                    combo_classeProfessor.setSelectedIndex((int)pesquisaProfessor.get(4) - 1);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Professor não Encontrado!");
                }
             }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Erro. Digite um número existente!");
        } 
    }//GEN-LAST:event_btn_pesquisarProfessorActionPerformed

    private void btn_listarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listarProfessorActionPerformed
        // TODO add your handling code here:
        if(!txt_nomeProfessor.getText().isEmpty() && !txt_BiProfessor.getText().isEmpty()){
            TabelaListarProfessor listarProfessor = new TabelaListarProfessor();
            listarProfessor.carregaTabela((combo_classeProfessor.getSelectedIndex() + 1));
            listarProfessor.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Pesquise pelo Professor!");
        }
    }//GEN-LAST:event_btn_listarProfessorActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        SalarioProfessores salarioProfessores = new SalarioProfessores();
        salarioProfessores.carregaTabela();
        salarioProfessores.setVisible(true);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        ListaDosProfessor listaprofessores = new ListaDosProfessor();
        listaprofessores.carregaTabela();
        listaprofessores.setVisible(true);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        ListaEstudantes listaEstudante = new ListaEstudantes();
        listaEstudante.carregaTabela();
        listaEstudante.setVisible(true);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        HistoricoPagamento historiaPagamento = new HistoricoPagamento();
        historiaPagamento.setVisible(true);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        Pauta pauta = new Pauta(getAno_letivo());
        pauta.setVisible(true);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void combo_anoLetivoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_anoLetivoItemStateChanged
        // TODO add your handling code here:
        setAno_letivo(Integer.parseInt(String.valueOf(combo_anoLetivo.getSelectedItem())));
    }//GEN-LAST:event_combo_anoLetivoItemStateChanged

    private void combo_anoLetivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_anoLetivoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_anoLetivoMouseClicked

    private void painel_rankGeralComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_painel_rankGeralComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_painel_rankGeralComponentShown

    private void painel_rankGeralFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_painel_rankGeralFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_painel_rankGeralFocusGained

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        Contacto contacto = new Contacto(this, true);
        contacto.setVisible(true);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void painel_rankIdadeComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_painel_rankIdadeComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_painel_rankIdadeComponentShown

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        System.out.println("Sobre...");
    }//GEN-LAST:event_jButton27ActionPerformed

    private void txt_nomeEstudanteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nomeEstudanteFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomeEstudanteFocusGained

    private void combo_anoLetivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_anoLetivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_anoLetivoActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        Personaliza personalizar = new Personaliza(this, true);
        personalizar.setVisible(true);
    }//GEN-LAST:event_jButton29ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardarEstudante;
    private javax.swing.JButton btn_guardarProfessor;
    private javax.swing.JButton btn_limparEstudante;
    private javax.swing.JButton btn_limparProfessor;
    private javax.swing.JButton btn_listarProfessor;
    private javax.swing.JButton btn_pesquisarProfessor;
    private javax.swing.JComboBox<String> combo_anoLetivo;
    private javax.swing.JComboBox<String> combo_classeEstudante;
    private javax.swing.JComboBox<String> combo_classeProfessor;
    private javax.swing.JComboBox<String> combo_cursoEstudante;
    private javax.swing.JComboBox<String> combo_disciplinaProfessor;
    private javax.swing.JComboBox<String> combo_turmaEstudante;
    private javax.swing.JPanel corpo;
    private javax.swing.JPanel definicoes;
    private javax.swing.JPanel estudante_painel;
    private javax.swing.JPanel home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JPanel menu;
    public javax.swing.JLabel nome_escola;
    public javax.swing.JPanel painel_frontal_baixo;
    public javax.swing.JPanel painel_frontal_cima;
    private javax.swing.JPanel painel_rankClasse;
    private javax.swing.JPanel painel_rankGeral;
    private javax.swing.JPanel painel_rankIdade;
    private javax.swing.JPanel painel_rankInstrucoes;
    private javax.swing.JPanel painel_rankTurma;
    private javax.swing.JPanel painel_ranking;
    private javax.swing.JPanel premiacao;
    private javax.swing.JPanel professor_painel;
    private javax.swing.JRadioButton radio_cadastramentoOFF;
    private javax.swing.JRadioButton radio_cadastramentoON;
    private javax.swing.JRadioButton radio_femininoEstudante;
    private javax.swing.JRadioButton radio_femininoProfessor;
    private javax.swing.JRadioButton radio_masculinoEstudante;
    private javax.swing.JRadioButton radio_masculinoProfessor;
    private javax.swing.JRadioButton radio_professorOFF;
    private javax.swing.JRadioButton radio_professorON;
    private javax.swing.JPanel relatorio;
    private javax.swing.JPanel relatorio_painel_estudante;
    private javax.swing.JPanel relatorio_painel_historia;
    private javax.swing.JPanel relatorio_painel_indisponivel;
    private javax.swing.JPanel relatorio_painel_professor;
    private javax.swing.JPanel relatorio_painel_propinas;
    private javax.swing.JPanel relatorio_painel_salario;
    private javax.swing.JSpinner spn_dataNascimentoEstudante;
    private javax.swing.JSpinner spn_salarioProfessor;
    private javax.swing.JTable tabela_RankingGeral;
    private javax.swing.JTable tabela_RankingTurma;
    private javax.swing.JTable tabela_rankClasse;
    private javax.swing.JTable tabela_rankIdade;
    private javax.swing.JTextField txt_BIEstudantePesquisar;
    private javax.swing.JTextField txt_BiEstudante;
    private javax.swing.JTextField txt_BiProfessor;
    private javax.swing.JTextField txt_nomeEstudante;
    private javax.swing.JTextField txt_nomeProfessor;
    private javax.swing.JTextField txt_pesquisarProfessor;
    // End of variables declaration//GEN-END:variables

    private int ajustaTurma(String a) {
        int n;
        switch(a){
                    case "Nenhum":
                        n = 0;
                        break;
                    case "Informática":
                        n = 1;
                        break;
                    case "Eletricidade":
                        n = 2;
                        break;
                    case "C.F.B":
                        n = 3;
                        break;
                    case "C.E.J":
                        n = 4;
                        break;
                    case "Análises Clinática":
                        n = 5;
                        break;
                    case "Mecânica":
                        n = 6;
                        break;
                    case "Máquinas e Motores":
                        n = 7;
                        break;
                    case "Farmácia":
                        n = 8;
                        break;
                    case "Contabilidade Financeira":
                        n = 9;
                        break;
                    case "Gestão Empresarial":
                        n = 10;
                        break;
                    default:
                        n = 0;
                }
        return n;
    }

    public int getAno_letivo() {
        return ano_letivo;
    }

    public void setAno_letivo(int ano_letivo) {
        this.ano_letivo = ano_letivo;
    }
    
    public void atualizar(){
        this.dispose();
        this.setVisible(true);
    }
    
}


