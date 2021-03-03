package em.dev.panels;

import em.dev.domain.Dependente;
import em.dev.domain.Funcionario;
import em.dev.domain.exceptions.EmptyFieldException;
import em.dev.views.Home;
import em.dev.views.dialog.Dialog;
import javax.swing.JOptionPane;

public class CadastroEtapa5 extends javax.swing.JPanel {
    
    private Home home = null;
    private Funcionario funcionario = null;

    public CadastroEtapa5(Home home, Funcionario funcionario) {
        this.home = home;
        this.funcionario = funcionario;
        initComponents();
        habilitarComponentes(Boolean.FALSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_possuiDependentes = new javax.swing.ButtonGroup();
        bg_possuiDeficiencia = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        button_cadastrar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        rb_possuiDependentesSIM = new javax.swing.JRadioButton();
        rb_possuiDependentesNAO = new javax.swing.JRadioButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        tf_dataNascimento = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        cb_sexo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cb_parentesco = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        rb_possuiDeficienciaSIM = new javax.swing.JRadioButton();
        rb_possuiDeficienciaNAO = new javax.swing.JRadioButton();
        button_adicionar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(750, 430));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Possui dependentes*:");

        button_cadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_cadastrar.setText("Cadastrar");
        button_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cadastrarActionPerformed(evt);
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
        jLabel15.setText("RELAÇÃO DE DEPENDENTES");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setText("Nome Completo*:");

        bg_possuiDependentes.add(rb_possuiDependentesSIM);
        rb_possuiDependentesSIM.setText("Sim");
        rb_possuiDependentesSIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_possuiDependentesSIMActionPerformed(evt);
            }
        });

        bg_possuiDependentes.add(rb_possuiDependentesNAO);
        rb_possuiDependentesNAO.setSelected(true);
        rb_possuiDependentesNAO.setText("Não");
        rb_possuiDependentesNAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_possuiDependentesNAOActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Data de Nascimento*:");

        try {
            tf_dataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Sexo*:");

        cb_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Feminino", "Masculino" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Grau de Parentesco*:");

        cb_parentesco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Filho(a)", "Irmão(ã)", "Pai", "Mãe", "Sobrinho(a)", "Outro" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Possui Deficiência*:");

        bg_possuiDeficiencia.add(rb_possuiDeficienciaSIM);
        rb_possuiDeficienciaSIM.setText("Sim");

        bg_possuiDeficiencia.add(rb_possuiDeficienciaNAO);
        rb_possuiDeficienciaNAO.setSelected(true);
        rb_possuiDeficienciaNAO.setText("Não");

        button_adicionar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_adicionar.setText("Adicionar Dependente");
        button_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_adicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(button_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(rb_possuiDeficienciaSIM)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rb_possuiDeficienciaNAO))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(cb_parentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(tf_dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(14, 14, 14)
                                .addComponent(rb_possuiDependentesSIM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rb_possuiDependentesNAO))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(42, 42, 42)
                                .addComponent(tf_nome)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(button_adicionar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(rb_possuiDependentesSIM)
                    .addComponent(rb_possuiDependentesNAO))
                .addGap(26, 26, 26)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_parentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rb_possuiDeficienciaSIM)
                    .addComponent(rb_possuiDeficienciaNAO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(button_adicionar)
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_cadastrar)
                    .addComponent(buttonCancelar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cadastrarActionPerformed
        if(rb_possuiDependentesNAO.isSelected()){
            cadastrarFuncionario();
        }else{
            if(funcionario.getDependentes().isEmpty()){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
            }else{
                cadastrarFuncionario();
            }
        }
    }//GEN-LAST:event_button_cadastrarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        home.closePanel();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void rb_possuiDependentesSIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_possuiDependentesSIMActionPerformed
        habilitarComponentes(Boolean.TRUE);
    }//GEN-LAST:event_rb_possuiDependentesSIMActionPerformed

    private void rb_possuiDependentesNAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_possuiDependentesNAOActionPerformed
        limparComponents();
        habilitarComponentes(Boolean.FALSE);
    }//GEN-LAST:event_rb_possuiDependentesNAOActionPerformed

    private void button_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_adicionarActionPerformed
        Dependente dep = new Dependente();
        Dialog dialog = new Dialog(home, true);
        
        try{
            dep.setNome(tf_nome.getText());
            dep.setDataNascimento(tf_dataNascimento.getText());
            dep.setSexo(String.valueOf(cb_sexo.getSelectedItem()));
            dep.setGrauDeParentesco(String.valueOf(cb_parentesco.getSelectedItem()));
            dep.setPossuiDeficiencia(rb_possuiDeficienciaSIM.isSelected());
            dep.setFuncionario(funcionario);
            funcionario.addDependente(dep);
            rb_possuiDependentesNAO.setEnabled(false);
            rb_possuiDependentesSIM.setEnabled(false);
            limparComponents();
            dialog.setLabelTitle("DEPENDENTE CADASTRADO!");
            dialog.setLabelMessage(getLabelMessage());
            dialog.setVisible(true);
        }catch(EmptyFieldException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_button_adicionarActionPerformed

    private String getLabelMessage(){
        String list = "<html><div align=\"center\"><br>Dependentes Cadastrados:<br><br>";
        for(Dependente dep : funcionario.getDependentes()){
            list = list.concat(dep.getNome()+"<br>");
        }
        
        list = list.concat("</div></html>");
        return list;
    }
    
    private void cadastrarFuncionario(){
        home.salvarFuncionario(funcionario);
        JOptionPane.showMessageDialog(null, "REGISTRO SALVO COM SUCESSO!");
        home.closePanel();
    }
    
    private void limparComponents(){
        tf_nome.setText("");
        tf_dataNascimento.setText("");
        cb_sexo.setSelectedIndex(0);
        cb_parentesco.setSelectedIndex(0);
        rb_possuiDeficienciaNAO.setSelected(true);
    }
    
    private void habilitarComponentes(Boolean habilitar){
        tf_nome.setEnabled(habilitar);
        tf_dataNascimento.setEnabled(habilitar);
        cb_sexo.setEnabled(habilitar);
        cb_parentesco.setEnabled(habilitar);
        rb_possuiDeficienciaSIM.setEnabled(habilitar);
        rb_possuiDeficienciaNAO.setEnabled(habilitar);
        button_adicionar.setEnabled(habilitar);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_possuiDeficiencia;
    private javax.swing.ButtonGroup bg_possuiDependentes;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton button_adicionar;
    private javax.swing.JButton button_cadastrar;
    private javax.swing.JComboBox<String> cb_parentesco;
    private javax.swing.JComboBox<String> cb_sexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JRadioButton rb_possuiDeficienciaNAO;
    private javax.swing.JRadioButton rb_possuiDeficienciaSIM;
    private javax.swing.JRadioButton rb_possuiDependentesNAO;
    private javax.swing.JRadioButton rb_possuiDependentesSIM;
    private javax.swing.JFormattedTextField tf_dataNascimento;
    private javax.swing.JTextField tf_nome;
    // End of variables declaration//GEN-END:variables
}