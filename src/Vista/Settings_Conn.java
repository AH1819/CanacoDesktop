package Vista;

import Controlador.Conexion;
import Modelo.ErrorsAndSuccesses;
import Modelo.Logeo;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Hitler
 */
public class Settings_Conn extends javax.swing.JPanel {

    Logeo p1 = new Logeo();
    Conexion p0 = new Conexion();
    ErrorsAndSuccesses er = new ErrorsAndSuccesses();

    public Settings_Conn() {
        initComponents();
        Error.setVisible(false);
        Loading.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Error = new javax.swing.JLabel();
        Error_con = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Hostl = new javax.swing.JLabel();
        Host = new javax.swing.JTextField();
        Bdl = new javax.swing.JLabel();
        Bd = new javax.swing.JTextField();
        Port = new javax.swing.JTextField();
        Portl = new javax.swing.JLabel();
        Save = new javax.swing.JButton();
        Conectar = new javax.swing.JButton();
        Loading = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 550));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos de conexion");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel2.setLayout(new java.awt.BorderLayout());

        Error.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Error.setForeground(new java.awt.Color(255, 0, 0));
        Error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Error.setText("Error en la conexion:");
        jPanel2.add(Error, java.awt.BorderLayout.LINE_START);

        Error_con.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Error_con.setForeground(new java.awt.Color(255, 0, 0));
        Error_con.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(Error_con, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Hostl.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        Hostl.setForeground(new java.awt.Color(0, 0, 0));
        Hostl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hostl.setText("Host del servidor:");
        jPanel4.add(Hostl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, 40));

        Host.setBackground(new java.awt.Color(255, 255, 255));
        Host.setForeground(new java.awt.Color(0, 0, 0));
        Host.setText(" Ingrese la direccion host del servidor");
        Host.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                HostFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                HostFocusLost(evt);
            }
        });
        Host.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HostMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                HostMouseReleased(evt);
            }
        });
        Host.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                HostKeyReleased(evt);
            }
        });
        jPanel4.add(Host, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 420, 40));

        Bdl.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        Bdl.setForeground(new java.awt.Color(0, 0, 0));
        Bdl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bdl.setText("Base de datos:");
        jPanel4.add(Bdl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 110, 40));

        Bd.setBackground(new java.awt.Color(255, 255, 255));
        Bd.setForeground(new java.awt.Color(0, 0, 0));
        Bd.setText(" Ingrese el nombre de la base de datos");
        Bd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BdFocusLost(evt);
            }
        });
        Bd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BdMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BdMouseReleased(evt);
            }
        });
        Bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdActionPerformed(evt);
            }
        });
        Bd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BdKeyReleased(evt);
            }
        });
        jPanel4.add(Bd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 290, 40));

        Port.setBackground(new java.awt.Color(255, 255, 255));
        Port.setForeground(new java.awt.Color(0, 0, 0));
        Port.setText(" Ingrese el puerto de conexion");
        Port.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PortFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PortFocusLost(evt);
            }
        });
        Port.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PortMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PortMouseReleased(evt);
            }
        });
        Port.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PortKeyReleased(evt);
            }
        });
        jPanel4.add(Port, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 180, 40));

        Portl.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        Portl.setForeground(new java.awt.Color(0, 0, 0));
        Portl.setText("Puerto:");
        jPanel4.add(Portl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 60, 40));

        Save.setBackground(new java.awt.Color(18, 90, 173));
        Save.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Save.setForeground(new java.awt.Color(255, 255, 255));
        Save.setText("Guardar Configuracion");
        Save.setBorder(null);
        Save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel4.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 240, 40));

        Conectar.setBackground(new java.awt.Color(18, 90, 173));
        Conectar.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Conectar.setForeground(new java.awt.Color(255, 255, 255));
        Conectar.setText("Probar Conexion");
        Conectar.setBorder(null);
        Conectar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConectarActionPerformed(evt);
            }
        });
        jPanel4.add(Conectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 170, 40));

        Loading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cargando (1).gif"))); // NOI18N
        jPanel4.add(Loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 50, 80));

        jPanel3.add(jPanel4);

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void HostFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HostFocusGained
        if (Host.getText().equals(" Ingrese la direccion host del servidor")) {
            Host.setText("");
        }
    }//GEN-LAST:event_HostFocusGained

    private void HostFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HostFocusLost
        if (Host.getText().isEmpty()) {
            Host.setText(" Ingrese la direccion host del servidor");
        }
    }//GEN-LAST:event_HostFocusLost

    private void HostMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HostMousePressed

    }//GEN-LAST:event_HostMousePressed

    private void HostMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HostMouseReleased

    }//GEN-LAST:event_HostMouseReleased

    private void HostKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HostKeyReleased
        if (evt.getKeyCode() == 10) {
            Bd.requestFocus();
        }
    }//GEN-LAST:event_HostKeyReleased

    private void BdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BdFocusGained
        if (Bd.getText().equals(" Ingrese el nombre de la base de datos")) {
            Bd.setText("");
        }
    }//GEN-LAST:event_BdFocusGained

    private void BdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BdFocusLost
        if (Bd.getText().isEmpty()) {
            Bd.setText(" Ingrese el nombre de la base de datos");
        }
    }//GEN-LAST:event_BdFocusLost

    private void BdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BdMousePressed

    }//GEN-LAST:event_BdMousePressed

    private void BdMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BdMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_BdMouseReleased

    private void BdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdActionPerformed

    }//GEN-LAST:event_BdActionPerformed

    private void BdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BdKeyReleased
        if (evt.getKeyCode() == 10) {
            Port.requestFocus();
        }
    }//GEN-LAST:event_BdKeyReleased

    private void PortMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PortMousePressed

    }//GEN-LAST:event_PortMousePressed

    private void PortMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PortMouseReleased

    }//GEN-LAST:event_PortMouseReleased

    private void PortKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PortKeyReleased
        if (evt.getKeyCode() == 10) {
            Save.requestFocus();
        }
    }//GEN-LAST:event_PortKeyReleased

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed

    }//GEN-LAST:event_SaveActionPerformed

    private void ConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConectarActionPerformed
        if (Host.getText().equals(" Ingrese la direccion host del servidor")
                || Bd.getText().equals(" Ingrese el nombre de la base de datos")
                || Port.getText().equals(" Ingrese el puerto de conexion")
                || Host.getText().isEmpty()
                || Bd.getText().isEmpty()
                || Port.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Los campos no estan llenos", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Logeo l = new Logeo(Port.getText(), Host.getText(), Bd.getText());
            new conectar().show();
        }
    }//GEN-LAST:event_ConectarActionPerformed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged

    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed

    }//GEN-LAST:event_jLabel1MousePressed

    private void PortFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PortFocusGained
        if (Port.getText().equals(" Ingrese el puerto de conexion")) {
            Port.setText("");
        }
    }//GEN-LAST:event_PortFocusGained

    private void PortFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PortFocusLost
        if (Port.getText().isEmpty()) {
            Port.setText(" Ingrese el puerto de conexion");
        }
    }//GEN-LAST:event_PortFocusLost
    public class conectar implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {
            Loading.setVisible(true);
            conexion();
            Loading.setVisible(false);
        }
    }

    private void conexion() {
        if (Host.getText().equals(" Ingrese la direccion host del servidor")
                || Bd.getText().equals(" Ingrese el nombre de la base de datos")
                || Port.getText().equals(" Ingrese el puerto de conexion")) {
            JOptionPane.showMessageDialog(null, "Los campos no estan llenos", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            p1.setIp(Host.getText());
            p1.setBase(Bd.getText());
            p1.setPuerto(Port.getText());
            p0.conectar();
        }
        if (er.isExitoConexion() == true) {
            Error_con.setVisible(true);
            Error_con.setForeground(Color.GREEN);
            Error_con.setText("La conexion se realizo con exito");
            Error.setVisible(true);
            Error.setText("Conexion exitosa-> ");
            Error.setForeground(Color.GREEN);
        } else {
            Error_con.setVisible(true);
            Error_con.setForeground(Color.red);
            System.out.println(er.getErrorconexion());
            Error_con.setText(er.getErrorconexion().substring(0, 40).toLowerCase());
            Error.setVisible(true);
            Error.setForeground(Color.red);
            Error.setText("Error en la conexion-> ");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bd;
    private javax.swing.JLabel Bdl;
    private javax.swing.JButton Conectar;
    private javax.swing.JLabel Error;
    public static javax.swing.JLabel Error_con;
    private javax.swing.JTextField Host;
    private javax.swing.JLabel Hostl;
    private javax.swing.JLabel Loading;
    private javax.swing.JTextField Port;
    private javax.swing.JLabel Portl;
    private javax.swing.JButton Save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
