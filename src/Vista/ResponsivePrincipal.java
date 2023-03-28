package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.time.LocalDate;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Hitler
 */
public class ResponsivePrincipal extends javax.swing.JFrame {

    boolean a = true;
    int Xmouse, Ymouse;
    PaginaPrincipal PP = new PaginaPrincipal();

    public ResponsivePrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImagenEscalada();
        Paneles(PP);
        fecha();
    }

    public void fecha() {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
            "Octubre", "Noviembre", "Diciembre"};
        Movimiento.setText(dia + " de " + meses[month - 1] + " de " + year);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        Menuop = new javax.swing.JPanel();
        Salir = new javax.swing.JPanel();
        Exit = new javax.swing.JLabel();
        Fullsize = new javax.swing.JPanel();
        Maximizar = new javax.swing.JLabel();
        Movimiento = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        MenuIcon = new javax.swing.JPanel();
        Settings = new javax.swing.JPanel();
        AjustesIcon = new javax.swing.JLabel();
        linemenu = new javax.swing.JPanel();
        MenuV = new javax.swing.JPanel();
        Menu_label = new javax.swing.JLabel();
        linesettings = new javax.swing.JPanel();
        MenuHide = new javax.swing.JPanel();
        Logo_panel = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Opcion6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Opcion1 = new javax.swing.JPanel();
        jlabel1 = new javax.swing.JLabel();
        Opcion4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Opcion5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Opcion7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Opcion2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Opcion3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Opcion8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Opcion9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Dashboard = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Header.setBackground(new java.awt.Color(0, 0, 51));
        Header.setPreferredSize(new java.awt.Dimension(1370, 50));
        Header.setLayout(new java.awt.BorderLayout());

        Menuop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setBackground(new java.awt.Color(0, 0, 51));
        Salir.setLayout(new java.awt.BorderLayout());

        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/delete_32px.png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitMouseExited(evt);
            }
        });
        Salir.add(Exit, java.awt.BorderLayout.CENTER);

        Menuop.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 50));

        Fullsize.setBackground(new java.awt.Color(0, 0, 51));
        Fullsize.setLayout(new java.awt.BorderLayout());

        Maximizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Maximizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/full_screen_32px.png"))); // NOI18N
        Maximizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MaximizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MaximizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MaximizarMouseExited(evt);
            }
        });
        Fullsize.add(Maximizar, java.awt.BorderLayout.CENTER);

        Menuop.add(Fullsize, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        Header.add(Menuop, java.awt.BorderLayout.LINE_END);

        Movimiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Movimiento.setForeground(new java.awt.Color(255, 255, 255));
        Movimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Movimiento.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MovimientoMouseDragged(evt);
            }
        });
        Movimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MovimientoMousePressed(evt);
            }
        });
        Header.add(Movimiento, java.awt.BorderLayout.CENTER);

        getContentPane().add(Header, java.awt.BorderLayout.PAGE_START);

        Menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Menu.setPreferredSize(new java.awt.Dimension(250, 610));
        Menu.setLayout(new java.awt.BorderLayout());

        MenuIcon.setBackground(new java.awt.Color(0, 0, 51));
        MenuIcon.setPreferredSize(new java.awt.Dimension(50, 720));
        MenuIcon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Settings.setBackground(new java.awt.Color(0, 0, 51));
        Settings.setLayout(new java.awt.BorderLayout());

        AjustesIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AjustesIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/settings_32px.png"))); // NOI18N
        AjustesIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AjustesIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AjustesIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AjustesIconMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AjustesIconMousePressed(evt);
            }
        });
        Settings.add(AjustesIcon, java.awt.BorderLayout.CENTER);

        MenuIcon.add(Settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 50, 50));

        linemenu.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout linemenuLayout = new javax.swing.GroupLayout(linemenu);
        linemenu.setLayout(linemenuLayout);
        linemenuLayout.setHorizontalGroup(
            linemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        linemenuLayout.setVerticalGroup(
            linemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        MenuIcon.add(linemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 10));

        MenuV.setBackground(new java.awt.Color(0, 0, 51));
        MenuV.setLayout(new java.awt.BorderLayout());

        Menu_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Menu_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/menu_32px.png"))); // NOI18N
        Menu_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Menu_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Menu_labelMouseExited(evt);
            }
        });
        MenuV.add(Menu_label, java.awt.BorderLayout.CENTER);

        MenuIcon.add(MenuV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 50));

        linesettings.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout linesettingsLayout = new javax.swing.GroupLayout(linesettings);
        linesettings.setLayout(linesettingsLayout);
        linesettingsLayout.setHorizontalGroup(
            linesettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        linesettingsLayout.setVerticalGroup(
            linesettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        MenuIcon.add(linesettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 50, -1));

        Menu.add(MenuIcon, java.awt.BorderLayout.LINE_START);

        MenuHide.setBackground(new java.awt.Color(255, 255, 255));
        MenuHide.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo_panel.setBackground(new java.awt.Color(255, 255, 255));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout Logo_panelLayout = new javax.swing.GroupLayout(Logo_panel);
        Logo_panel.setLayout(Logo_panelLayout);
        Logo_panelLayout.setHorizontalGroup(
            Logo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        Logo_panelLayout.setVerticalGroup(
            Logo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        MenuHide.add(Logo_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 110));

        Opcion6.setBackground(new java.awt.Color(255, 255, 255));
        Opcion6.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SIEM");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        Opcion6.add(jLabel5, java.awt.BorderLayout.CENTER);

        MenuHide.add(Opcion6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 200, 50));

        Opcion1.setBackground(new java.awt.Color(255, 255, 255));
        Opcion1.setLayout(new java.awt.BorderLayout());

        jlabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlabel1.setForeground(new java.awt.Color(0, 0, 0));
        jlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel1.setText("Inicio");
        jlabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlabel1MousePressed(evt);
            }
        });
        Opcion1.add(jlabel1, java.awt.BorderLayout.CENTER);

        MenuHide.add(Opcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 200, 50));

        Opcion4.setBackground(new java.awt.Color(255, 255, 255));
        Opcion4.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pagados");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        Opcion4.add(jLabel3, java.awt.BorderLayout.CENTER);

        MenuHide.add(Opcion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 200, 50));

        Opcion5.setBackground(new java.awt.Color(255, 255, 255));
        Opcion5.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Promotor");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        Opcion5.add(jLabel4, java.awt.BorderLayout.CENTER);

        MenuHide.add(Opcion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 200, 50));

        Opcion7.setBackground(new java.awt.Color(255, 255, 255));
        Opcion7.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Administrador");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        Opcion7.add(jLabel6, java.awt.BorderLayout.CENTER);

        MenuHide.add(Opcion7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 200, 50));

        Opcion2.setBackground(new java.awt.Color(255, 255, 255));
        Opcion2.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Socios");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        Opcion2.add(jLabel1, java.awt.BorderLayout.CENTER);

        MenuHide.add(Opcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 200, 50));

        Opcion3.setBackground(new java.awt.Color(255, 255, 255));
        Opcion3.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Servicios");
        jLabel2.setPreferredSize(new java.awt.Dimension(41, 50));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        Opcion3.add(jLabel2, java.awt.BorderLayout.CENTER);

        MenuHide.add(Opcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 200, -1));

        Opcion8.setBackground(new java.awt.Color(255, 255, 255));
        Opcion8.setLayout(new java.awt.BorderLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("About us");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        Opcion8.add(jLabel7, java.awt.BorderLayout.CENTER);

        MenuHide.add(Opcion8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 200, 50));

        Opcion9.setBackground(new java.awt.Color(255, 255, 255));
        Opcion9.setPreferredSize(new java.awt.Dimension(200, 50));
        Opcion9.setLayout(new java.awt.BorderLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cerrar sesion");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        Opcion9.add(jLabel8, java.awt.BorderLayout.CENTER);

        MenuHide.add(Opcion9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 200, -1));

        Menu.add(MenuHide, java.awt.BorderLayout.CENTER);

        getContentPane().add(Menu, java.awt.BorderLayout.LINE_START);

        Dashboard.setBackground(new java.awt.Color(153, 153, 153));
        Dashboard.setLayout(new java.awt.BorderLayout());
        getContentPane().add(Dashboard, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 1200, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_labelMouseEntered
        changecolor(linemenu, new Color(247, 78, 105));
    }//GEN-LAST:event_Menu_labelMouseEntered

    private void Menu_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_labelMouseExited
        changecolor(linemenu, new Color(0, 0, 51));
    }//GEN-LAST:event_Menu_labelMouseExited

    private void AjustesIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjustesIconMouseEntered
        changecolor(linesettings, new Color(8, 177, 150));
    }//GEN-LAST:event_AjustesIconMouseEntered

    private void AjustesIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjustesIconMouseExited
        changecolor(linesettings, new Color(0, 0, 51));
    }//GEN-LAST:event_AjustesIconMouseExited

    private void MaximizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaximizarMouseClicked
        if (this.getExtendedState() != ResponsivePrincipal.MAXIMIZED_BOTH) {
            changeimage(Maximizar, "/Recursos/minimizar.png");
            this.setExtendedState(ResponsivePrincipal.MAXIMIZED_BOTH);
        } else {
            changeimage(Maximizar, "/Recursos/full_screen_32px.png");
            this.setExtendedState(ResponsivePrincipal.NORMAL);
        }
    }//GEN-LAST:event_MaximizarMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void Menu_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_labelMouseClicked
        clickmenu(MenuV, Settings, 1);

        if (a == true) {
            hideshow(Menu, a, Menu_label);
            SwingUtilities.updateComponentTreeUI(this);
            //create methode change image
            a = false;
        } else {
            hideshow(Menu, a, Menu_label);
            SwingUtilities.updateComponentTreeUI(this);
            a = true;
        }
    }//GEN-LAST:event_Menu_labelMouseClicked

    private void AjustesIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjustesIconMouseClicked
        clickmenu(Settings, MenuV, 1);
    }//GEN-LAST:event_AjustesIconMouseClicked

    private void MovimientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovimientoMousePressed
        Xmouse = evt.getX();
        Ymouse = evt.getY();
    }//GEN-LAST:event_MovimientoMousePressed

    private void MovimientoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovimientoMouseDragged
        if (this.getExtendedState() != ResponsivePrincipal.MAXIMIZED_BOTH) {
            int x = evt.getXOnScreen();
            int y = evt.getYOnScreen();
            this.setLocation(x - Xmouse, y - Ymouse);
        }
    }//GEN-LAST:event_MovimientoMouseDragged

    private void ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseEntered
        changecolor(Salir, Color.red);
    }//GEN-LAST:event_ExitMouseEntered

    private void ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseExited
        changecolor(Salir, new Color(0, 0, 51));
    }//GEN-LAST:event_ExitMouseExited

    private void MaximizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaximizarMouseEntered
        changecolor(Fullsize, new Color(0, 153, 255));
    }//GEN-LAST:event_MaximizarMouseEntered

    private void MaximizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaximizarMouseExited
        changecolor(Fullsize, new Color(0, 0, 51));
    }//GEN-LAST:event_MaximizarMouseExited

    private void jlabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabel1MouseClicked
        ClickOpcion(Opcion1, Opcion2, Opcion3, Opcion4, Opcion5, Opcion6, Opcion7, Opcion8, Opcion9, 1);
    }//GEN-LAST:event_jlabel1MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        ClickOpcion(Opcion2, Opcion1, Opcion3, Opcion4, Opcion5, Opcion6, Opcion7, Opcion8, Opcion9, 1);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        ClickOpcion(Opcion3, Opcion1, Opcion2, Opcion4, Opcion5, Opcion6, Opcion7, Opcion8, Opcion9, 1);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        ClickOpcion(Opcion4, Opcion1, Opcion2, Opcion3, Opcion5, Opcion6, Opcion7, Opcion8, Opcion9, 1);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        ClickOpcion(Opcion5, Opcion1, Opcion2, Opcion3, Opcion4, Opcion6, Opcion7, Opcion8, Opcion9, 1);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        ClickOpcion(Opcion6, Opcion1, Opcion2, Opcion3, Opcion4, Opcion5, Opcion7, Opcion8, Opcion9, 1);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        ClickOpcion(Opcion7, Opcion1, Opcion2, Opcion3, Opcion4, Opcion5, Opcion6, Opcion8, Opcion9, 1);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        ClickOpcion(Opcion8, Opcion1, Opcion2, Opcion3, Opcion4, Opcion5, Opcion6, Opcion7, Opcion9, 1);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        ClickOpcion(Opcion9, Opcion1, Opcion2, Opcion3, Opcion4, Opcion5, Opcion6, Opcion7, Opcion8, 1);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jlabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabel1MousePressed
        Paneles(PP);
    }//GEN-LAST:event_jlabel1MousePressed

    private void AjustesIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjustesIconMousePressed
        Settings_panel SP = new Settings_panel();
        Paneles(SP);
    }//GEN-LAST:event_AjustesIconMousePressed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        Socios_Vista SV = new Socios_Vista();
        Paneles(SV);
    }//GEN-LAST:event_jLabel1MousePressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ResponsivePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResponsivePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResponsivePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResponsivePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResponsivePrincipal().setVisible(true);
            }
        });
    }

    public void Paneles(Component h) {
        h.setLocation(0, 0);
        h.setSize(600,550);
        Dashboard.removeAll();
        Dashboard.add(h, BorderLayout.CENTER);
        Dashboard.revalidate();
        Dashboard.repaint();
    }

    public void hideshow(JPanel menushowhide, boolean dashboard, JLabel button) {
        if (dashboard == true) {
            menushowhide.setPreferredSize(new Dimension(50, menushowhide.getHeight()));
            changeimage(button, "/Recursos/menu_32px.png");
        } else {
            menushowhide.setPreferredSize(new Dimension(250, menushowhide.getHeight()));
            changeimage(button, "/Recursos/back_32px.png");
        }

    }

    public void clickmenu(JPanel h1, JPanel h2, int numberbool) {
        if (numberbool == 1) {
            h1.setBackground(new Color(25, 29, 74));
            h2.setBackground(new Color(5, 10, 46));
        } else {
            h1.setBackground(new Color(5, 10, 46));
            h2.setBackground(new Color(25, 29, 74));
        }
    }

    public void ClickOpcion(JPanel h1, JPanel h2, JPanel h3, JPanel h4, JPanel h5, JPanel h6,
            JPanel h7, JPanel h8, JPanel h9, int numberbool) {
        if (numberbool == 1) {
            h1.setBackground(new Color(153, 153, 153));
            h2.setBackground(new Color(255, 255, 255));
            h3.setBackground(new Color(255, 255, 255));
            h4.setBackground(new Color(255, 255, 255));
            h5.setBackground(new Color(255, 255, 255));
            h6.setBackground(new Color(255, 255, 255));
            h7.setBackground(new Color(255, 255, 255));
            h8.setBackground(new Color(255, 255, 255));
            h9.setBackground(new Color(255, 255, 255));
        } else {
            h1.setBackground(new Color(255, 255, 255));
            h2.setBackground(new Color(153, 153, 153));
            h3.setBackground(new Color(153, 153, 153));
            h4.setBackground(new Color(153, 153, 153));
            h5.setBackground(new Color(153, 153, 153));
            h6.setBackground(new Color(153, 153, 153));
            h7.setBackground(new Color(153, 153, 153));
            h8.setBackground(new Color(153, 153, 153));
            h9.setBackground(new Color(153, 153, 153));
        }
    }

    public void changeimage(JLabel button, String resourcheimg) {
        ImageIcon aimg = new ImageIcon(getClass().getResource(resourcheimg));
        button.setIcon(aimg);
    }

    public void changecolor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }

    public void ImagenEscalada() {
        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/Recursos/Logo.png"));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);

        Logo.setIcon(iconoEscalado);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AjustesIcon;
    private javax.swing.JPanel Dashboard;
    private javax.swing.JLabel Exit;
    private javax.swing.JPanel Fullsize;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Logo_panel;
    private javax.swing.JLabel Maximizar;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel MenuHide;
    private javax.swing.JPanel MenuIcon;
    private javax.swing.JPanel MenuV;
    private javax.swing.JLabel Menu_label;
    private javax.swing.JPanel Menuop;
    private javax.swing.JLabel Movimiento;
    private javax.swing.JPanel Opcion1;
    private javax.swing.JPanel Opcion2;
    private javax.swing.JPanel Opcion3;
    private javax.swing.JPanel Opcion4;
    private javax.swing.JPanel Opcion5;
    private javax.swing.JPanel Opcion6;
    private javax.swing.JPanel Opcion7;
    private javax.swing.JPanel Opcion8;
    private javax.swing.JPanel Opcion9;
    private javax.swing.JPanel Salir;
    private javax.swing.JPanel Settings;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JPanel linemenu;
    private javax.swing.JPanel linesettings;
    // End of variables declaration//GEN-END:variables
}
