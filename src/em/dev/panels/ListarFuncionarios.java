package em.dev.panels;

import em.dev.components.TableModel;
import em.dev.repository.FuncionarioRepository;
import em.dev.views.Home;
import javax.swing.JOptionPane;

public class ListarFuncionarios extends javax.swing.JPanel {
    
    private Home home = null;
    private FuncionarioRepository repo = null;
    
    public ListarFuncionarios(Home home, FuncionarioRepository repo) {
        this.home = home;
        this.repo = repo;
        initComponents();
        cb_secretarias.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_listagem = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_list = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        button_fechar = new javax.swing.JButton();
        button_detalhes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        rb_todos = new javax.swing.JRadioButton();
        rb_secretaria = new javax.swing.JRadioButton();
        cb_secretarias = new javax.swing.JComboBox<>();
        button_buscar = new javax.swing.JButton();

        table_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table_list);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTA DE SERVIDORES CADASTRADOS");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        button_fechar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_fechar.setText("Fechar");
        button_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_fecharActionPerformed(evt);
            }
        });

        button_detalhes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_detalhes.setText("Detalhes");
        button_detalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_detalhesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel2.setText("Listar:");

        bg_listagem.add(rb_todos);
        rb_todos.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        rb_todos.setSelected(true);
        rb_todos.setText("Todos");
        rb_todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_todosActionPerformed(evt);
            }
        });

        bg_listagem.add(rb_secretaria);
        rb_secretaria.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        rb_secretaria.setText("Por Secretaria:");
        rb_secretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_secretariaActionPerformed(evt);
            }
        });

        cb_secretarias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Sec. Agricultura", "Sec. Educação", "Sec. Transportes", "Sec. Cultura", "Sec. Administração", "Sec. Finanças", "Sec. Infraestrutura", "Sec. Saúde", "Sec. Ação Social" }));

        button_buscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_buscar.setText("Buscar");
        button_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(button_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button_detalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_todos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_secretaria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_secretarias, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rb_todos)
                    .addComponent(rb_secretaria)
                    .addComponent(cb_secretarias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_detalhes)
                    .addComponent(button_fechar)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button_detalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_detalhesActionPerformed
        Integer row = table_list.getSelectedRow();
        if(row >= 0){
            String matricula = (String) table_list.getValueAt(row, 0);
            home.detalharFuncionario(matricula);
        }else{
            JOptionPane.showMessageDialog(null, "SELECIONE UM SERVIDOR", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_button_detalhesActionPerformed

    private void button_fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_fecharActionPerformed
       home.closePanel();
    }//GEN-LAST:event_button_fecharActionPerformed

    private void rb_todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_todosActionPerformed
        cb_secretarias.setEnabled(false);
    }//GEN-LAST:event_rb_todosActionPerformed

    private void rb_secretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_secretariaActionPerformed
        cb_secretarias.setEnabled(true);
    }//GEN-LAST:event_rb_secretariaActionPerformed

    private void button_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_buscarActionPerformed
        buscar();
    }//GEN-LAST:event_button_buscarActionPerformed

    private void buscar(){
        if(rb_todos.isSelected()){
            TableModel.load(table_list, repo.getAllFuncionarios());
        }else if(rb_secretaria.isSelected()){
            if(cb_secretarias.getSelectedIndex() == 0){
                JOptionPane.showMessageDialog(null, "SELECIONE UMA SECRETARIA", "", JOptionPane.INFORMATION_MESSAGE);
            }else{
                TableModel.load(table_list, repo.getAllFuncionarios(String.valueOf(cb_secretarias.getSelectedItem())));
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_listagem;
    private javax.swing.JButton button_buscar;
    private javax.swing.JButton button_detalhes;
    private javax.swing.JButton button_fechar;
    private javax.swing.JComboBox<String> cb_secretarias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rb_secretaria;
    private javax.swing.JRadioButton rb_todos;
    private javax.swing.JTable table_list;
    // End of variables declaration//GEN-END:variables
}