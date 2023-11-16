package GUI;

import MyContainers.TextPrompt;
import javax.swing.ImageIcon;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        TextPrompt txtCorreo = new TextPrompt("Username", txtEmail);
        TextPrompt txtContra = new TextPrompt("Password", jp_password_recovery);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ultimaCapa = new javax.swing.JPanel();
        botonVerContraseña = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        botonLogin = new MyContainers.BotonCustomLogin();
        personaGUI = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        candadoGUI = new javax.swing.JLabel();
        jp_password_recovery = new javax.swing.JPasswordField();
        botonRecordar = new javax.swing.JCheckBox();
        botonOlvidaContra = new javax.swing.JButton();
        logoUsil = new javax.swing.JLabel();
        fondoLogin = new javax.swing.JLabel();
        background1 = new MyContainers.Background();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        ultimaCapa.setBackground(new java.awt.Color(102, 102, 102));
        ultimaCapa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonVerContraseña.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        botonVerContraseña.setForeground(new java.awt.Color(255, 255, 255));
        botonVerContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ojoblancoraya25x18.png"))); // NOI18N
        botonVerContraseña.setBorder(null);
        botonVerContraseña.setBorderPainted(false);
        botonVerContraseña.setContentAreaFilled(false);
        botonVerContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVerContraseña.setFocusPainted(false);
        botonVerContraseña.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botonVerContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerContraseñaActionPerformed(evt);
            }
        });
        ultimaCapa.add(botonVerContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 307, -1, -1));

        botonSalir.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoSalir35x35.png"))); // NOI18N
        botonSalir.setBorder(null);
        botonSalir.setBorderPainted(false);
        botonSalir.setContentAreaFilled(false);
        botonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSalir.setFocusPainted(false);
        botonSalir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        ultimaCapa.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 20, 30, -1));

        botonLogin.setText("LOG IN");
        botonLogin.setBorderPainted(false);
        botonLogin.setFocusPainted(false);
        botonLogin.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        botonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLoginActionPerformed(evt);
            }
        });
        ultimaCapa.add(botonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 410, 250, 50));

        personaGUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoMuñueco.png"))); // NOI18N
        ultimaCapa.add(personaGUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 240, -1, -1));

        txtEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setToolTipText("");
        txtEmail.setBorder(null);
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmail.setOpaque(false);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        ultimaCapa.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 230, 160, 50));
        txtEmail.getAccessibleContext().setAccessibleName("");

        candadoGUI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        candadoGUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoCandado.png"))); // NOI18N
        candadoGUI.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ultimaCapa.add(candadoGUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 300, -1, -1));

        jp_password_recovery.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jp_password_recovery.setForeground(new java.awt.Color(255, 255, 255));
        jp_password_recovery.setBorder(null);
        jp_password_recovery.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jp_password_recovery.setOpaque(false);
        jp_password_recovery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jp_password_recoveryActionPerformed(evt);
            }
        });
        ultimaCapa.add(jp_password_recovery, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 290, 160, 50));

        botonRecordar.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        botonRecordar.setForeground(new java.awt.Color(255, 255, 255));
        botonRecordar.setText("Remember me");
        botonRecordar.setFocusPainted(false);
        botonRecordar.setOpaque(false);
        botonRecordar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRecordarActionPerformed(evt);
            }
        });
        ultimaCapa.add(botonRecordar, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 360, -1, -1));

        botonOlvidaContra.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        botonOlvidaContra.setForeground(new java.awt.Color(255, 255, 255));
        botonOlvidaContra.setText("Forgot ¿Password?");
        botonOlvidaContra.setBorder(null);
        botonOlvidaContra.setBorderPainted(false);
        botonOlvidaContra.setContentAreaFilled(false);
        botonOlvidaContra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonOlvidaContra.setFocusPainted(false);
        botonOlvidaContra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botonOlvidaContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOlvidaContraActionPerformed(evt);
            }
        });
        ultimaCapa.add(botonOlvidaContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 365, 100, -1));

        logoUsil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usilLogo150x150.png"))); // NOI18N
        ultimaCapa.add(logoUsil, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 85, 140, 130));

        fondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoLogin.png"))); // NOI18N
        ultimaCapa.add(fondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 150, -1, 360));

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        ultimaCapa.add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ultimaCapa, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ultimaCapa, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jp_password_recoveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jp_password_recoveryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jp_password_recoveryActionPerformed
   
    private void botonOlvidaContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOlvidaContraActionPerformed
        Prueba ventanaPrueba = new Prueba();
        ventanaPrueba.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonOlvidaContraActionPerformed

    private void botonRecordarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRecordarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRecordarActionPerformed

    private void botonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonLoginActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonVerContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerContraseñaActionPerformed
        ImageIcon nuevaImagen;
        if (jp_password_recovery.getEchoChar() == '\u2022') {
            jp_password_recovery.setEchoChar((char) 0);
            nuevaImagen = new ImageIcon(getClass().getResource("/images/ojoblanco25x14.png"));
        } else {
            jp_password_recovery.setEchoChar('\u2022');
            nuevaImagen = new ImageIcon(getClass().getResource("/images/ojoblancoraya25x18.png"));
        }

        botonVerContraseña.setIcon(nuevaImagen);
    }//GEN-LAST:event_botonVerContraseñaActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private MyContainers.Background background1;
    private MyContainers.BotonCustomLogin botonLogin;
    private javax.swing.JButton botonOlvidaContra;
    private javax.swing.JCheckBox botonRecordar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonVerContraseña;
    private javax.swing.JLabel candadoGUI;
    private javax.swing.JLabel fondoLogin;
    private javax.swing.JPasswordField jp_password_recovery;
    private javax.swing.JLabel logoUsil;
    private javax.swing.JLabel personaGUI;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPanel ultimaCapa;
    // End of variables declaration//GEN-END:variables
}
