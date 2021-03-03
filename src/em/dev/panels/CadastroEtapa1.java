package em.dev.panels;

import em.dev.domain.exceptions.EmptyFieldException;
import em.dev.domain.Funcionario;
import em.dev.views.Home;
import javax.swing.JOptionPane;

public class CadastroEtapa1 extends javax.swing.JPanel {

    private Home home = null;
    
    public CadastroEtapa1(Home home) {
        this.home = home;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupDeficiencia = new javax.swing.ButtonGroup();
        buttonGroupAposentado = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_matricula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_telefone = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        button_continuar = new javax.swing.JButton();
        cb_sexo = new javax.swing.JComboBox<>();
        cb_estadoCivil = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        tf_dataDeNascimento = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_nomePai = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_nomeMae = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_nacionalidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_naturalidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cb_raca = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cb_escolaridade = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        rb_possuiDeficienciaSIM = new javax.swing.JRadioButton();
        rb_possuiDeficienciaNAO = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        rb_aposentadoSIM = new javax.swing.JRadioButton();
        rb_aposentadoNAO = new javax.swing.JRadioButton();
        button_cancelar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(750, 430));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nome Completo*:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Matrícula*:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Email:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Telefone:");

        try {
            tf_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Estado Civil*:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Sexo*:");

        button_continuar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_continuar.setText("Continuar");
        button_continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_continuarActionPerformed(evt);
            }
        });

        cb_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Feminino", "Masculino" }));

        cb_estadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Solteiro(a)", "Casado(a)", "Divorciado(a)", "Viúvo(a)", "União Estável", "Outro" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Data de Nascimento*:");

        try {
            tf_dataDeNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Nome do Pai:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Nome da Mãe:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Nacionalidade*:");

        tf_nacionalidade.setText("Brasileiro");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Naturalidade*:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Raça/Cor*:");

        cb_raca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Branca", "Preta", "Parda", "Indígena", "Amarela", "Não declarada" }));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Escolaridade*:");

        cb_escolaridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Ensino Fundamental Incompleto", "Ensino Fundamental Completo", "Ensino Médio Incompleto", "Ensino Médio Completo", "Ensino Superior Incompleto", "Ensino Superior Completo", "Nível Técnico", "Outro" }));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Possui Deficiência*:");

        jLabel15.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("INFORME OS DADOS PESSOAIS");

        buttonGroupDeficiencia.add(rb_possuiDeficienciaSIM);
        rb_possuiDeficienciaSIM.setText("Sim");

        buttonGroupDeficiencia.add(rb_possuiDeficienciaNAO);
        rb_possuiDeficienciaNAO.setSelected(true);
        rb_possuiDeficienciaNAO.setText("Não");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Aposentado*:");

        buttonGroupAposentado.add(rb_aposentadoSIM);
        rb_aposentadoSIM.setText("Sim");

        buttonGroupAposentado.add(rb_aposentadoNAO);
        rb_aposentadoNAO.setSelected(true);
        rb_aposentadoNAO.setText("Não");

        button_cancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_cancelar.setText("Cancelar");
        button_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(button_continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tf_nomeMae, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                                .addComponent(tf_nomePai, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rb_possuiDeficienciaSIM)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rb_possuiDeficienciaNAO)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel16))
                                    .addComponent(tf_nacionalidade, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_raca, javax.swing.GroupLayout.Alignment.LEADING, 0, 177, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addGap(18, 18, 18)
                                                .addComponent(cb_escolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(18, 18, 18)
                                                .addComponent(tf_naturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rb_aposentadoSIM)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rb_aposentadoNAO))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel4))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cb_estadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel7)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tf_telefone, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(tf_dataDeNascimento)))))
                        .addGap(0, 8, Short.MAX_VALUE))))
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tf_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tf_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_estadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tf_dataDeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_nomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_nomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_nacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(tf_naturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cb_raca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(cb_escolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(rb_possuiDeficienciaSIM)
                            .addComponent(rb_possuiDeficienciaNAO)
                            .addComponent(jLabel16)
                            .addComponent(rb_aposentadoSIM)
                            .addComponent(rb_aposentadoNAO))
                        .addGap(23, 23, 23)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button_continuar)
                            .addComponent(button_cancelar))
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button_continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_continuarActionPerformed
        
        Funcionario f = new Funcionario();
        
        try{
            f.setNome(tf_nome.getText());
            f.setMatricula(tf_matricula.getText());
            f.setEmail(tf_email.getText());
            f.setTelefone(tf_telefone.getText());
            f.setEstadoCivil(String.valueOf(cb_estadoCivil.getSelectedItem()));
            f.setSexo(String.valueOf(cb_sexo.getSelectedItem()));
            f.setDataDeNascimento(tf_dataDeNascimento.getText());
            f.setNomeDoPai(tf_nomePai.getText());
            f.setNomeDaMae(tf_nomeMae.getText());
            f.setNacionalidade(tf_nacionalidade.getText());
            f.setNaturalidade(tf_naturalidade.getText());
            f.setRaca(String.valueOf(cb_raca.getSelectedItem()));
            f.setEscolaridade(String.valueOf(cb_escolaridade.getSelectedItem()));
            f.setPossuiDeficiencia(rb_possuiDeficienciaSIM.isSelected());
            f.setAposentado(rb_aposentadoSIM.isSelected());
            
            home.addPanel(new CadastroEtapa2(home, f));
        }catch(EmptyFieldException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_button_continuarActionPerformed

    private void button_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cancelarActionPerformed
        home.closePanel();
    }//GEN-LAST:event_button_cancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupAposentado;
    private javax.swing.ButtonGroup buttonGroupDeficiencia;
    private javax.swing.JButton button_cancelar;
    private javax.swing.JButton button_continuar;
    private javax.swing.JComboBox<String> cb_escolaridade;
    private javax.swing.JComboBox<String> cb_estadoCivil;
    private javax.swing.JComboBox<String> cb_raca;
    private javax.swing.JComboBox<String> cb_sexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JRadioButton rb_aposentadoNAO;
    private javax.swing.JRadioButton rb_aposentadoSIM;
    private javax.swing.JRadioButton rb_possuiDeficienciaNAO;
    private javax.swing.JRadioButton rb_possuiDeficienciaSIM;
    private javax.swing.JFormattedTextField tf_dataDeNascimento;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_matricula;
    private javax.swing.JTextField tf_nacionalidade;
    private javax.swing.JTextField tf_naturalidade;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_nomeMae;
    private javax.swing.JTextField tf_nomePai;
    private javax.swing.JFormattedTextField tf_telefone;
    // End of variables declaration//GEN-END:variables
}
