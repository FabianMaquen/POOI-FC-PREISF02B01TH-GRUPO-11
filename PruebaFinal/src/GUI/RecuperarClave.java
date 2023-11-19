package GUI;

import MyContainers.TextPrompt;
import Funcionamiento.ListaUsuarios;
import Funcionamiento.Usuario;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JFrame;

public class RecuperarClave extends JFrame {
    
    private Timer timer;

    public RecuperarClave() {
        initComponents();
        this.setLocationRelativeTo(null);
        setBackground(new Color(0, 0,0, 0));
        this.CorreoValido.setVisible(false);
        this.CorreoNoValido.setVisible(false);
        
        TextPrompt txtCorreo = new TextPrompt("Email ID", txtUsuario);
       
        timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CorreoValido.setVisible(false);
                CorreoNoValido.setVisible(false);
                timer.stop();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jb_retroceder = new javax.swing.JButton();
        logoUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        botonCustomLogin1 = new MyContainers.BotonCustomLogin();
        CorreoNoValido = new javax.swing.JLabel();
        CorreoValido = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        recordar = new javax.swing.JLabel();
        logoUsil = new javax.swing.JLabel();
        FondoLogin = new javax.swing.JLabel();
        fondoCurveadoDegradado1 = new MyContainers.FondoCurveadoDegradado();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setMinimumSize(new java.awt.Dimension(440, 580));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_retroceder.setBackground(new java.awt.Color(38, 65, 115));
        jb_retroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackIcon.png"))); // NOI18N
        jb_retroceder.setBorder(null);
        jb_retroceder.setContentAreaFilled(false);
        jb_retroceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_retroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_retrocederActionPerformed(evt);
            }
        });
        jPanel1.add(jb_retroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 20, -1, -1));

        logoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoMuñueco.png"))); // NOI18N
        jPanel1.add(logoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(63, 108, 165));
        txtUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(null);
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 180, 50));

        botonCustomLogin1.setText("RECORDAR");
        botonCustomLogin1.setFocusPainted(false);
        botonCustomLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCustomLogin1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonCustomLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 250, 50));

        CorreoNoValido.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        CorreoNoValido.setForeground(new java.awt.Color(255, 255, 255));
        CorreoNoValido.setText("Correo no válido");
        jPanel1.add(CorreoNoValido, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 450, 180, -1));

        CorreoValido.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        CorreoValido.setForeground(new java.awt.Color(255, 255, 255));
        CorreoValido.setText("Se enviaron las instrucciones al correo");
        jPanel1.add(CorreoValido, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 430, 240, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("las instrucciones. ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese su correo electrónico y le enviaremos ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 270, -1));

        recordar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        recordar.setForeground(new java.awt.Color(255, 255, 255));
        recordar.setText("Recordar Clave");
        jPanel1.add(recordar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 150, -1));

        logoUsil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usilLogo150x150.png"))); // NOI18N
        logoUsil.setText("jLabel1");
        jPanel1.add(logoUsil, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 85, 140, 130));

        FondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoLogin.png"))); // NOI18N
        jPanel1.add(FondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 150, -1, 360));

        fondoCurveadoDegradado1.setRoundBottomLeft(50);
        fondoCurveadoDegradado1.setRoundBottomRight(50);
        fondoCurveadoDegradado1.setRoundTopLeft(50);
        fondoCurveadoDegradado1.setRoundTopRight(50);

        javax.swing.GroupLayout fondoCurveadoDegradado1Layout = new javax.swing.GroupLayout(fondoCurveadoDegradado1);
        fondoCurveadoDegradado1.setLayout(fondoCurveadoDegradado1Layout);
        fondoCurveadoDegradado1Layout.setHorizontalGroup(
            fondoCurveadoDegradado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        fondoCurveadoDegradado1Layout.setVerticalGroup(
            fondoCurveadoDegradado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        jPanel1.add(fondoCurveadoDegradado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_retrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_retrocederActionPerformed
        // TODO add your handling code here:
        Login ventanaLogin = new Login();
        ventanaLogin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_retrocederActionPerformed

    private void botonCustomLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCustomLogin1ActionPerformed
        // TODO add your handling code here:
        String correo = txtUsuario.getText();
        ListaUsuarios l_us = new ListaUsuarios();

        for (Usuario us : l_us.getUsuarios()) {
            this.CorreoValido.setVisible(false);
            this.CorreoNoValido.setVisible(false);
            
            if (us.getCorreoUsuario().equals(correo)) {
                this.CorreoValido.setVisible(true);
                break;
            } else{
                this.CorreoNoValido.setVisible(true);
            }
        }
    }//GEN-LAST:event_botonCustomLogin1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CorreoNoValido;
    private javax.swing.JLabel CorreoValido;
    private javax.swing.JLabel FondoLogin;
    private MyContainers.BotonCustomLogin botonCustomLogin1;
    private MyContainers.FondoCurveadoDegradado fondoCurveadoDegradado1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb_retroceder;
    private javax.swing.JLabel logoUsil;
    private javax.swing.JLabel logoUsuario;
    private javax.swing.JLabel recordar;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
