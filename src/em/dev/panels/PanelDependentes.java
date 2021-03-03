package em.dev.panels;

import em.dev.domain.Dependente;
import java.text.SimpleDateFormat;

public class PanelDependentes extends javax.swing.JPanel {

    public PanelDependentes(Dependente dependente) {
        initComponents();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        label_nome.setText(dependente.getNome());
        label_dataNascimento.setText(sdf.format(dependente.getDataNascimento()));
        label_sexo.setText(dependente.getSexo());
        label_parentesco.setText(dependente.getGrauDeParentesco());
        label_deficiente.setText(dependente.getPossuiDeficiencia() ? "Sim" : "Não");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        label_nome = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        label_dataNascimento = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        label_parentesco = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        label_sexo = new javax.swing.JLabel();
        label_deficiente = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel1.setText("Nome:");

        label_nome.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        label_nome.setText("text");

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel7.setText("Data de Nascimento:");

        label_dataNascimento.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        label_dataNascimento.setText("text");

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel9.setText("Grau de Parentesco:");

        label_parentesco.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        label_parentesco.setText("text");

        jLabel11.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel11.setText("Sexo:");

        jLabel12.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel12.setText("Deficiente:");

        label_sexo.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        label_sexo.setText("text");

        label_deficiente.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        label_deficiente.setText("text");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_parentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_deficiente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(140, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(label_nome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(label_dataNascimento)
                    .addComponent(jLabel11)
                    .addComponent(label_sexo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(label_parentesco)
                    .addComponent(jLabel12)
                    .addComponent(label_deficiente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_dataNascimento;
    private javax.swing.JLabel label_deficiente;
    private javax.swing.JLabel label_nome;
    private javax.swing.JLabel label_parentesco;
    private javax.swing.JLabel label_sexo;
    // End of variables declaration//GEN-END:variables
}