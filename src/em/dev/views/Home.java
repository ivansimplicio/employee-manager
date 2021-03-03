package em.dev.views;

import em.dev.domain.Funcionario;
import em.dev.panels.CadastroEtapa1;
import em.dev.panels.ListarFuncionarios;
import em.dev.repository.FuncionarioRepository;
import java.awt.GridLayout;
import javax.persistence.EntityManagerFactory;
import javax.swing.JPanel;

public class Home extends javax.swing.JFrame {
    
    private final EntityManagerFactory EMF;
    
    private FuncionarioRepository funcRepo;
    
    public Home(EntityManagerFactory EMF) {
        this.EMF = EMF;
        funcRepo = FuncionarioRepository.getInstance(EMF);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public Home(){
        this.EMF = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        cadastrar_servidor = new javax.swing.JMenu();
        listar_servidores = new javax.swing.JMenu();
        logout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema para Gerencimento de Servidores");
        setMaximumSize(new java.awt.Dimension(1280, 720));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        cadastrar_servidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/em/dev/icons/add.png"))); // NOI18N
        cadastrar_servidor.setText("Cadastrar Servidor");
        cadastrar_servidor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cadastrar_servidor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cadastrar_servidor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cadastrar_servidor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrar_servidorMouseClicked(evt);
            }
        });
        jMenuBar1.add(cadastrar_servidor);

        listar_servidores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/em/dev/icons/list.png"))); // NOI18N
        listar_servidores.setText("Listar Servidores");
        listar_servidores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listar_servidores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        listar_servidores.setPreferredSize(new java.awt.Dimension(105, 68));
        listar_servidores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        listar_servidores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listar_servidoresMouseClicked(evt);
            }
        });
        jMenuBar1.add(listar_servidores);

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/em/dev/icons/logout.png"))); // NOI18N
        logout.setText("Logout");
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logout.setPreferredSize(new java.awt.Dimension(105, 68));
        logout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jMenuBar1.add(logout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrar_servidorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrar_servidorMouseClicked
        addPanel(new CadastroEtapa1(this));
    }//GEN-LAST:event_cadastrar_servidorMouseClicked

    private void listar_servidoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listar_servidoresMouseClicked
        addPanel(new ListarFuncionarios(this, funcRepo));
    }//GEN-LAST:event_listar_servidoresMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        new Login();
        dispose();
    }//GEN-LAST:event_logoutMouseClicked

    public void salvarFuncionario(Funcionario f){
        funcRepo.salvarFuncionario(f);
    }
    
    public void detalharFuncionario(String matricula){
        Funcionario funcionario = funcRepo.getFuncionario(matricula);
        new Detalhes(funcionario, funcRepo).setVisible(true);
    }
    
    public void addPanel(JPanel panel){
        panelPrincipal.removeAll();
        panelPrincipal.repaint();
        panelPrincipal.setLayout(new GridLayout());
        panelPrincipal.add(panel);
        panelPrincipal.validate();
    }
    
    public void closePanel(){
        panelPrincipal.removeAll();
        panelPrincipal.repaint();
        panelPrincipal.setLayout(new GridLayout());
        panelPrincipal.validate();
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu cadastrar_servidor;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu listar_servidores;
    private javax.swing.JMenu logout;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}