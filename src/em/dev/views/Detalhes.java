package em.dev.views;

import em.dev.domain.Funcionario;
import em.dev.panels.PanelDependentes;
import em.dev.panels.PanelDependentesHeader;
import em.dev.panels.PanelDetalhes;
import em.dev.repository.FuncionarioRepository;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Detalhes extends javax.swing.JFrame{
    
    private Funcionario funcionario = null;
    private JPanel panel = null;
    private FuncionarioRepository funcRepo;

    public Detalhes(Funcionario funcionario, FuncionarioRepository funcRepo) {
        this.funcionario = funcionario;
        this.funcRepo = funcRepo;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        setTitle(String.format("Detalhes do Servidor: %s", funcionario.getNome()));
        preenchePanelPrincipal(funcionario);
    }
    
    public Detalhes(){     
    }
    
    private void preenchePanelPrincipal(Funcionario funcionario){
        
        Integer qntDep = funcionario.getDependentes().size();
        Boolean possuiDep = (qntDep != 0);
        String messageOne = "O servidor não possui dependentes";
        String messageTwo = String.format("O servidor possui %d dependente(s)", qntDep);
        
        panelPrincipal.removeAll();
        panelPrincipal.repaint();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.PAGE_AXIS));
        panel = new PanelDetalhes(funcionario);
        panelPrincipal.add(panel);
        panelPrincipal.add(new PanelDependentesHeader(possuiDep ? messageTwo : messageOne));
        if(possuiDep){
            funcionario.getDependentes().forEach((d) -> {
                panelPrincipal.add(new PanelDependentes(d));
            });
        }
        panelPrincipal.validate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button_fechar = new javax.swing.JButton();
        button_editar = new javax.swing.JButton();
        button_imprimir = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        panelPrincipal = new javax.swing.JPanel();
        button_excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        button_fechar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_fechar.setText("Fechar");
        button_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_fecharActionPerformed(evt);
            }
        });

        button_editar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_editar.setText("Editar");
        button_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_editarActionPerformed(evt);
            }
        });

        button_imprimir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_imprimir.setText("Imprimir");
        button_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_imprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
        );

        scrollPane.setViewportView(panelPrincipal);

        button_excluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_excluir.setText("Excuir");
        button_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(scrollPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrollPane)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_fechar)
                    .addComponent(button_editar)
                    .addComponent(button_imprimir)
                    .addComponent(button_excluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_imprimirActionPerformed
        try{
            PrinterJob job = PrinterJob.getPrinterJob();
            job.setPrintable((Printable) panel);
            job.printDialog();
            job.print();
        }catch(PrinterException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_button_imprimirActionPerformed

    private void button_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_editarActionPerformed
        
    }//GEN-LAST:event_button_editarActionPerformed

    private void button_fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_fecharActionPerformed
        dispose();
    }//GEN-LAST:event_button_fecharActionPerformed

    private void button_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_excluirActionPerformed
        Object[] options = {"Confirmar", "Cancelar"};
        
        Integer option = JOptionPane.showOptionDialog(null, "Deseja realmente excluir o registro?",
                                     "AVISO", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                                     null, options, options[0]);
        
        if(option.equals(0)){
            funcRepo.excluirFuncionario(funcionario);
            JOptionPane.showMessageDialog(null, "REGISTRO EXCLUÍDO COM SUCESSO!");
            dispose();
        }
    }//GEN-LAST:event_button_excluirActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Detalhes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Detalhes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_editar;
    private javax.swing.JButton button_excluir;
    private javax.swing.JButton button_fechar;
    private javax.swing.JButton button_imprimir;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}