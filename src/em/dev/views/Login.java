package em.dev.views;

import em.dev.repository.UsuarioRepository;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Login");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        separator = new javax.swing.JSeparator();
        label_user = new javax.swing.JLabel();
        label_password = new javax.swing.JLabel();
        label_title = new javax.swing.JLabel();
        tf_user = new javax.swing.JTextField();
        pf_password = new javax.swing.JPasswordField();
        button_entrar = new javax.swing.JButton();
        button_sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_user.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_user.setText("Usuário:");

        label_password.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_password.setText("Senha:");

        label_title.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        label_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_title.setText("Gerenciador de Funcionários");

        button_entrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_entrar.setText("Entrar");
        button_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_entrarActionPerformed(evt);
            }
        });

        button_sair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_sair.setText("Sair");
        button_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separator, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_user)
                                    .addComponent(label_password))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_user)
                                    .addComponent(pf_password, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(button_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(button_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_title, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_title, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_user)
                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_password)
                    .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_sair)
                    .addComponent(button_entrar))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_entrarActionPerformed

        String username = tf_user.getText();
        String password = String.valueOf(pf_password.getPassword());
        
        if(UsuarioRepository.getInstance(EMF).autenticar(username, password)){
            new Home(EMF).setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Login e/ou senha inválidos!", "Verifique seus dados", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_button_entrarActionPerformed

    private void button_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_button_sairActionPerformed

    private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("myUP");
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_entrar;
    private javax.swing.JButton button_sair;
    private javax.swing.JLabel label_password;
    private javax.swing.JLabel label_title;
    private javax.swing.JLabel label_user;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JSeparator separator;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables
}