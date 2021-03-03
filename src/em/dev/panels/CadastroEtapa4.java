package em.dev.panels;

import em.dev.domain.DadosFuncionais;
import em.dev.domain.Funcionario;
import em.dev.domain.exceptions.EmptyFieldException;
import em.dev.views.Home;
import javax.swing.JOptionPane;

public class CadastroEtapa4 extends javax.swing.JPanel {
    
    private Home home = null;
    private Funcionario funcionario = null;

    public CadastroEtapa4(Home home, Funcionario funcionario) {
        this.home = home;
        this.funcionario = funcionario;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_acumulacaoDeCargos = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        button_continuar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_localDeTrabalho = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tf_cargoProvimento = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        cb_regime = new javax.swing.JComboBox<>();
        cb_lotacao = new javax.swing.JComboBox<>();
        tf_cargoOcupado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_dataAdmissao = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        rb_acumulacaoSIM = new javax.swing.JRadioButton();
        rb_acumulacaoNAO = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_acumulacaoCargo = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(750, 430));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Regime*:");

        button_continuar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_continuar.setText("Continuar");
        button_continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_continuarActionPerformed(evt);
            }
        });

        buttonCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("DADOS FUNCIONAIS");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Lotação*:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Local de Trabalho*:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setText("Cargo Provimento em Concurso:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Cargo Ocupado Atual*:");

        cb_regime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Efetivo", "Eletivo", "Comissionado", "Contratado" }));

        cb_lotacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Sec. Agricultura", "Sec. Educação", "Sec. Transportes", "Sec. Cultura", "Sec. Administração", "Sec. Finanças", "Sec. Infraestrutura", "Sec. Saúde", "Sec. Ação Social" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Data de Admissão*:");

        try {
            tf_dataAdmissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Possui outro vínculo público*:");

        bg_acumulacaoDeCargos.add(rb_acumulacaoSIM);
        rb_acumulacaoSIM.setText("Sim");
        rb_acumulacaoSIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_acumulacaoSIMActionPerformed(evt);
            }
        });

        bg_acumulacaoDeCargos.add(rb_acumulacaoNAO);
        rb_acumulacaoNAO.setSelected(true);
        rb_acumulacaoNAO.setText("Não");
        rb_acumulacaoNAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_acumulacaoNAOActionPerformed(evt);
            }
        });

        ta_acumulacaoCargo.setColumns(20);
        ta_acumulacaoCargo.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        ta_acumulacaoCargo.setRows(5);
        ta_acumulacaoCargo.setText("NÃO POSSUI OUTRO VÍNCULO PÚBLICO");
        ta_acumulacaoCargo.setEnabled(false);
        jScrollPane1.setViewportView(ta_acumulacaoCargo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(button_continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cb_regime, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cb_lotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel10)
                            .addComponent(jLabel14)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_localDeTrabalho)
                            .addComponent(tf_cargoProvimento)
                            .addComponent(tf_cargoOcupado)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rb_acumulacaoSIM)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rb_acumulacaoNAO))
                                    .addComponent(tf_dataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))))
                .addContainerGap(157, Short.MAX_VALUE))
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
                    .addComponent(jLabel6)
                    .addComponent(cb_regime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_lotacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_localDeTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(tf_cargoProvimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tf_cargoOcupado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_dataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(rb_acumulacaoSIM))
                    .addComponent(rb_acumulacaoNAO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_continuar)
                    .addComponent(buttonCancelar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button_continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_continuarActionPerformed
        
        DadosFuncionais df = new DadosFuncionais();
        
        try{
            df.setRegime(String.valueOf(cb_regime.getSelectedItem()));
            df.setLotacao(String.valueOf(cb_lotacao.getSelectedItem()));
            df.setLocalDeTrabalho(tf_localDeTrabalho.getText());
            df.setCargoProvimento(tf_cargoProvimento.getText());
            df.setCargoOcupado(tf_cargoOcupado.getText());
            df.setDataAdmissao(tf_dataAdmissao.getText());
            df.setAcumulacaoDeCargos(ta_acumulacaoCargo.getText());
            df.setFuncionario(funcionario);
            funcionario.setDadosFuncionais(df);
            home.addPanel(new CadastroEtapa5(home, funcionario));
        }catch(EmptyFieldException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_button_continuarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        home.closePanel();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void rb_acumulacaoSIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_acumulacaoSIMActionPerformed
        ta_acumulacaoCargo.setEnabled(true);
        ta_acumulacaoCargo.setText("");
    }//GEN-LAST:event_rb_acumulacaoSIMActionPerformed

    private void rb_acumulacaoNAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_acumulacaoNAOActionPerformed
        ta_acumulacaoCargo.setEnabled(false);
        ta_acumulacaoCargo.setText("NÃO POSSUI OUTRO VÍNCULO PÚBLICO");
    }//GEN-LAST:event_rb_acumulacaoNAOActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_acumulacaoDeCargos;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton button_continuar;
    private javax.swing.JComboBox<String> cb_lotacao;
    private javax.swing.JComboBox<String> cb_regime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton rb_acumulacaoNAO;
    private javax.swing.JRadioButton rb_acumulacaoSIM;
    private javax.swing.JTextArea ta_acumulacaoCargo;
    private javax.swing.JTextField tf_cargoOcupado;
    private javax.swing.JTextField tf_cargoProvimento;
    private javax.swing.JFormattedTextField tf_dataAdmissao;
    private javax.swing.JTextField tf_localDeTrabalho;
    // End of variables declaration//GEN-END:variables
}
