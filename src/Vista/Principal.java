package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.time.LocalDate;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Hitler
 */
public class Principal extends javax.swing.JFrame {

    int Xmouse, Ymouse;

    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/Recursos/Logo.png"));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(110, 110, Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);

        Logo.setIcon(iconoEscalado);

        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
            "Octubre", "Noviembre", "Diciembre"};
        fecha.setText(dia + " de " + meses[month - 1] + " de " + year);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Socio_icon = new javax.swing.JLabel();
        Socios = new javax.swing.JLabel();
        Siem_icon = new javax.swing.JLabel();
        Siem = new javax.swing.JLabel();
        Pagos_icon = new javax.swing.JLabel();
        Pagados = new javax.swing.JLabel();
        Inicio = new javax.swing.JLabel();
        Home_icon = new javax.swing.JLabel();
        Admin_icon = new javax.swing.JLabel();
        Administrador = new javax.swing.JLabel();
        Promotor_icon = new javax.swing.JLabel();
        Promotor = new javax.swing.JLabel();
        Servicios_icon = new javax.swing.JLabel();
        Servicios = new javax.swing.JLabel();
        About_icon = new javax.swing.JLabel();
        About = new javax.swing.JLabel();
        Exit_session = new javax.swing.JLabel();
        Exit_icon = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        mover = new javax.swing.JPanel();
        Minimizar = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        fecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(51, 204, 255));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setBackground(new java.awt.Color(255, 255, 255));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setOpaque(true);
        Menu.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 140));

        Socio_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Socio_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/socios.png"))); // NOI18N
        Menu.add(Socio_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 80, 50));

        Socios.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Socios.setForeground(new java.awt.Color(0, 0, 0));
        Socios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Socios.setText("Socios");
        Menu.add(Socios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 50));

        Siem_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Siem_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/siem.png"))); // NOI18N
        Menu.add(Siem_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 80, 50));

        Siem.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Siem.setForeground(new java.awt.Color(0, 0, 0));
        Siem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Siem.setText("SIEM");
        Menu.add(Siem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 260, 50));

        Pagos_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pagos_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/pagos.png"))); // NOI18N
        Menu.add(Pagos_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 80, 50));

        Pagados.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Pagados.setForeground(new java.awt.Color(0, 0, 0));
        Pagados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pagados.setText("Pagados");
        Menu.add(Pagados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 260, 50));

        Inicio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Inicio.setForeground(new java.awt.Color(0, 0, 0));
        Inicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Inicio.setText("Inicio");
        Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InicioMouseEntered(evt);
            }
        });
        Menu.add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 260, 50));

        Home_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Home_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/home-b.png"))); // NOI18N
        Menu.add(Home_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 80, 50));

        Admin_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Admin_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/admi.png"))); // NOI18N
        Menu.add(Admin_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 80, 50));

        Administrador.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Administrador.setForeground(new java.awt.Color(0, 0, 0));
        Administrador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Administrador.setText("Administrador");
        Administrador.setMaximumSize(new java.awt.Dimension(54, 19));
        Administrador.setMinimumSize(new java.awt.Dimension(54, 19));
        Administrador.setPreferredSize(new java.awt.Dimension(54, 19));
        Menu.add(Administrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 260, 50));

        Promotor_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Promotor_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/promotor.png"))); // NOI18N
        Menu.add(Promotor_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 80, 50));

        Promotor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Promotor.setForeground(new java.awt.Color(0, 0, 0));
        Promotor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Promotor.setText("Promotor");
        Promotor.setMaximumSize(new java.awt.Dimension(54, 19));
        Promotor.setMinimumSize(new java.awt.Dimension(54, 19));
        Promotor.setPreferredSize(new java.awt.Dimension(54, 19));
        Menu.add(Promotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 260, 50));

        Servicios_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Servicios_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/serv.png"))); // NOI18N
        Menu.add(Servicios_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 80, 50));

        Servicios.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Servicios.setForeground(new java.awt.Color(0, 0, 0));
        Servicios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Servicios.setText("Servicios");
        Servicios.setMaximumSize(new java.awt.Dimension(54, 19));
        Servicios.setMinimumSize(new java.awt.Dimension(54, 19));
        Servicios.setPreferredSize(new java.awt.Dimension(54, 19));
        Menu.add(Servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 260, 50));

        About_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        About_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/about.png"))); // NOI18N
        Menu.add(About_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 80, 50));

        About.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        About.setForeground(new java.awt.Color(0, 0, 0));
        About.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        About.setText("About us");
        Menu.add(About, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 260, 50));

        Exit_session.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Exit_session.setForeground(new java.awt.Color(0, 0, 0));
        Exit_session.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit_session.setText("Cerrar Sesion");
        Exit_session.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Exit_sessionKeyPressed(evt);
            }
        });
        Menu.add(Exit_session, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 260, 50));

        Exit_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/exit_session.png"))); // NOI18N
        Menu.add(Exit_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 80, 50));

        jButton1.setBackground(new java.awt.Color(51, 204, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Cerrar Sesion");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Menu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 260, 40));

        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, -1, 770));

        mover.setBackground(new java.awt.Color(255, 255, 255));
        mover.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moverMouseDragged(evt);
            }
        });
        mover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                moverMousePressed(evt);
            }
        });
        mover.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Minimizar.setBackground(new java.awt.Color(255, 255, 255));
        Minimizar.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Minimizar.setForeground(new java.awt.Color(0, 0, 0));
        Minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/menos.png"))); // NOI18N
        Minimizar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimizar.setOpaque(true);
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinimizarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MinimizarMousePressed(evt);
            }
        });
        mover.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, 50, 30));

        Exit.setBackground(new java.awt.Color(255, 255, 255));
        Exit.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Exit.setForeground(new java.awt.Color(0, 0, 0));
        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setText("X");
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.setOpaque(true);
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitMousePressed(evt);
            }
        });
        mover.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 0, 50, 30));

        getContentPane().add(mover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fecha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fecha.setForeground(new java.awt.Color(51, 51, 51));
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fecha.setText("24 de Marzo de 2022");
        Header.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1030, 40));

        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 1110, 108));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMousePressed
        System.exit(0);
    }//GEN-LAST:event_ExitMousePressed

    private void ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseEntered
        Exit.setBackground(Color.red);
        Exit.setForeground(Color.WHITE);
    }//GEN-LAST:event_ExitMouseEntered

    private void ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseExited
        Exit.setBackground(new Color(255, 255, 255));
        Exit.setForeground(Color.BLACK);
    }//GEN-LAST:event_ExitMouseExited

    private void MinimizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMousePressed
        Dimension dim = getToolkit().getScreenSize();
        int largo = dim.width / 2;
        int ancho = dim.height / 2;
        this.setExtendedState(Principal.CROSSHAIR_CURSOR);
    }//GEN-LAST:event_MinimizarMousePressed

    private void MinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseEntered
        Minimizar.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_MinimizarMouseEntered

    private void MinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseExited
        Minimizar.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_MinimizarMouseExited

    private void moverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMousePressed
        Xmouse = evt.getX();
        Ymouse = evt.getY();
    }//GEN-LAST:event_moverMousePressed

    private void moverMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - Xmouse, y - Ymouse);
    }//GEN-LAST:event_moverMouseDragged

    private void InicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMouseEntered
        Inicio.setBackground(Color.red);
    }//GEN-LAST:event_InicioMouseEntered

    private void Exit_sessionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Exit_sessionKeyPressed
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Exit_sessionKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel About;
    private javax.swing.JLabel About_icon;
    private javax.swing.JLabel Admin_icon;
    private javax.swing.JLabel Administrador;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel Exit_icon;
    private javax.swing.JLabel Exit_session;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel Home_icon;
    private javax.swing.JLabel Inicio;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel Pagados;
    private javax.swing.JLabel Pagos_icon;
    private javax.swing.JLabel Promotor;
    private javax.swing.JLabel Promotor_icon;
    private javax.swing.JLabel Servicios;
    private javax.swing.JLabel Servicios_icon;
    private javax.swing.JLabel Siem;
    private javax.swing.JLabel Siem_icon;
    private javax.swing.JLabel Socio_icon;
    private javax.swing.JLabel Socios;
    private javax.swing.JLabel fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel mover;
    // End of variables declaration//GEN-END:variables
}
