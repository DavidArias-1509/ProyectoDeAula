/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class JFPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFPrincipal
     */
    private JFRVenta venta;
    private JFRPlato plato; 
    private JFLPlato lPlato;
    private JFLVenta lVenta;
    private JFBVenta bVenta;
    public JFPrincipal() {
        initComponents();
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lbNombre = new javax.swing.JLabel();
        lbImg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pListaPlatos = new javax.swing.JPanel();
        lbListaPlatos = new javax.swing.JLabel();
        pRegistrarVenta = new javax.swing.JPanel();
        lbRegistrarVenta = new javax.swing.JLabel();
        pRegistrarPlato = new javax.swing.JPanel();
        lbRegistrarPlato = new javax.swing.JLabel();
        pListaVentas = new javax.swing.JPanel();
        lbListaVentas = new javax.swing.JLabel();
        pBuscarVenta = new javax.swing.JPanel();
        lbBuscarVenta = new javax.swing.JLabel();
        lbtt1 = new javax.swing.JLabel();
        lbtt2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(232, 112, 36));

        jPanel5.setBackground(new java.awt.Color(232, 112, 36));
        jPanel5.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), javax.swing.BorderFactory.createCompoundBorder()));

        lbNombre.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        lbNombre.setForeground(new java.awt.Color(0, 0, 0));
        lbNombre.setText("La Góndola");

        lbImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lbImg, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbImg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 112, 36)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 112, 36))));

        pListaPlatos.setBackground(new java.awt.Color(255, 255, 255));
        pListaPlatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pListaPlatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pListaPlatosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pListaPlatosMouseExited(evt);
            }
        });

        lbListaPlatos.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        lbListaPlatos.setForeground(java.awt.Color.black);
        lbListaPlatos.setText("Ver Lista de Platos");
        lbListaPlatos.setPreferredSize(new java.awt.Dimension(119, 38));
        lbListaPlatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbListaPlatosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pListaPlatosLayout = new javax.swing.GroupLayout(pListaPlatos);
        pListaPlatos.setLayout(pListaPlatosLayout);
        pListaPlatosLayout.setHorizontalGroup(
            pListaPlatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pListaPlatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbListaPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(332, Short.MAX_VALUE))
        );
        pListaPlatosLayout.setVerticalGroup(
            pListaPlatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pListaPlatosLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(lbListaPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pRegistrarVenta.setBackground(new java.awt.Color(255, 255, 255));
        pRegistrarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pRegistrarVenta.setMaximumSize(new java.awt.Dimension(181, 19));
        pRegistrarVenta.setPreferredSize(new java.awt.Dimension(119, 38));
        pRegistrarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pRegistrarVentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pRegistrarVentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pRegistrarVentaMouseExited(evt);
            }
        });

        lbRegistrarVenta.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        lbRegistrarVenta.setForeground(new java.awt.Color(0, 0, 0));
        lbRegistrarVenta.setText("Registrar Venta");

        javax.swing.GroupLayout pRegistrarVentaLayout = new javax.swing.GroupLayout(pRegistrarVenta);
        pRegistrarVenta.setLayout(pRegistrarVentaLayout);
        pRegistrarVentaLayout.setHorizontalGroup(
            pRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRegistrarVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbRegistrarVenta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pRegistrarVentaLayout.setVerticalGroup(
            pRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRegistrarVentaLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(lbRegistrarVenta)
                .addContainerGap())
        );

        pRegistrarPlato.setBackground(new java.awt.Color(255, 255, 255));
        pRegistrarPlato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pRegistrarPlato.setPreferredSize(new java.awt.Dimension(119, 38));
        pRegistrarPlato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pRegistrarPlatoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pRegistrarPlatoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pRegistrarPlatoMouseExited(evt);
            }
        });

        lbRegistrarPlato.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        lbRegistrarPlato.setForeground(new java.awt.Color(0, 0, 0));
        lbRegistrarPlato.setText("Registrar Plato");

        javax.swing.GroupLayout pRegistrarPlatoLayout = new javax.swing.GroupLayout(pRegistrarPlato);
        pRegistrarPlato.setLayout(pRegistrarPlatoLayout);
        pRegistrarPlatoLayout.setHorizontalGroup(
            pRegistrarPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRegistrarPlatoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbRegistrarPlato)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pRegistrarPlatoLayout.setVerticalGroup(
            pRegistrarPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRegistrarPlatoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbRegistrarPlato)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pListaVentas.setBackground(new java.awt.Color(255, 255, 255));
        pListaVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pListaVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pListaVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pListaVentasMouseExited(evt);
            }
        });

        lbListaVentas.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        lbListaVentas.setForeground(java.awt.Color.black);
        lbListaVentas.setText("Ver Lista de Ventas");
        lbListaVentas.setPreferredSize(new java.awt.Dimension(119, 38));
        lbListaVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbListaVentasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pListaVentasLayout = new javax.swing.GroupLayout(pListaVentas);
        pListaVentas.setLayout(pListaVentasLayout);
        pListaVentasLayout.setHorizontalGroup(
            pListaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pListaVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbListaVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pListaVentasLayout.setVerticalGroup(
            pListaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pListaVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbListaVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pBuscarVenta.setBackground(new java.awt.Color(255, 255, 255));
        pBuscarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pBuscarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pBuscarVentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pBuscarVentaMouseExited(evt);
            }
        });

        lbBuscarVenta.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        lbBuscarVenta.setForeground(java.awt.Color.black);
        lbBuscarVenta.setText("Buscar Venta");
        lbBuscarVenta.setPreferredSize(new java.awt.Dimension(119, 38));
        lbBuscarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBuscarVentaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pBuscarVentaLayout = new javax.swing.GroupLayout(pBuscarVenta);
        pBuscarVenta.setLayout(pBuscarVentaLayout);
        pBuscarVentaLayout.setHorizontalGroup(
            pBuscarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pBuscarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pBuscarVentaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbBuscarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(409, Short.MAX_VALUE)))
        );
        pBuscarVentaLayout.setVerticalGroup(
            pBuscarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(pBuscarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pBuscarVentaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbBuscarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pRegistrarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
            .addComponent(pRegistrarPlato, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
            .addComponent(pListaPlatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pBuscarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pListaVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pRegistrarPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pListaPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pListaVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pBuscarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(434, Short.MAX_VALUE))
        );

        lbtt1.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        lbtt1.setForeground(new java.awt.Color(0, 0, 0));
        lbtt1.setText("Restaurante : La góndola ");

        lbtt2.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        lbtt2.setForeground(new java.awt.Color(0, 0, 0));
        lbtt2.setText("Sistema de Contabilidad");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbtt1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbtt2)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbtt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbtt2)
                        .addGap(13, 13, 13)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public Font font = new Font("Lucida Console", Font.BOLD, 18);
    public Font font2 = new Font("Lucida Console", Font.PLAIN, 18);
    
    private void pListaPlatosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pListaPlatosMouseEntered
        this.pListaPlatos.setBackground(new Color(232,112,36));
        this.lbListaPlatos.setForeground(Color.white);
        this.lbListaPlatos.setFont(font);
    }//GEN-LAST:event_pListaPlatosMouseEntered

    private void pListaPlatosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pListaPlatosMouseExited
        this.pListaPlatos.setBackground(Color.white);
        this.lbListaPlatos.setForeground(Color.black);
        this.lbListaPlatos.setFont(font2);
    }//GEN-LAST:event_pListaPlatosMouseExited

    private void pRegistrarVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pRegistrarVentaMouseEntered
        this.pRegistrarVenta.setBackground(new Color(232,112,36));
        this.lbRegistrarVenta.setForeground(Color.white);
        this.lbRegistrarVenta.setFont(font);
    }//GEN-LAST:event_pRegistrarVentaMouseEntered

    private void pRegistrarVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pRegistrarVentaMouseExited
        this.pRegistrarVenta.setBackground(Color.white);
         this.lbRegistrarVenta.setForeground(Color.black);
        this.lbRegistrarVenta.setFont(font2);
    }//GEN-LAST:event_pRegistrarVentaMouseExited

    private void pRegistrarPlatoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pRegistrarPlatoMouseEntered
        this.pRegistrarPlato.setBackground(new Color(232,112,36));
        this.lbRegistrarPlato.setForeground(Color.white);
        this.lbRegistrarPlato.setFont(font);
    }//GEN-LAST:event_pRegistrarPlatoMouseEntered

    private void pRegistrarPlatoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pRegistrarPlatoMouseExited
        this.pRegistrarPlato.setBackground(Color.white);
        this.lbRegistrarPlato.setForeground(Color.black);
        this.lbRegistrarPlato.setFont(font2);
    }//GEN-LAST:event_pRegistrarPlatoMouseExited

    private void pListaVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pListaVentasMouseEntered
        this.pListaVentas.setBackground(new Color(232,112,36));
        this.lbListaVentas.setForeground(Color.white);
        this.lbListaVentas.setFont(font);
    }//GEN-LAST:event_pListaVentasMouseEntered

    private void pListaVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pListaVentasMouseExited
        this.pListaVentas.setBackground(Color.WHITE);
        this.lbListaVentas.setForeground(Color.black);
        this.lbListaVentas.setFont(font2);
    }//GEN-LAST:event_pListaVentasMouseExited

    private void pBuscarVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pBuscarVentaMouseEntered
        this.pBuscarVenta.setBackground(new Color(232,112,36));
        this.lbBuscarVenta.setForeground(Color.white);
        this.lbBuscarVenta.setFont(font);
    }//GEN-LAST:event_pBuscarVentaMouseEntered

    private void pBuscarVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pBuscarVentaMouseExited
        this.pBuscarVenta.setBackground(Color.white);
         this.lbBuscarVenta.setForeground(Color.black);
        this.lbBuscarVenta.setFont(font2);
    }//GEN-LAST:event_pBuscarVentaMouseExited

    private void pRegistrarVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pRegistrarVentaMouseClicked
        this.venta = new JFRVenta();
        
    }//GEN-LAST:event_pRegistrarVentaMouseClicked

    private void lbListaPlatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListaPlatosMouseClicked
        try {
            this.lPlato = new JFLPlato();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex, "Error", ERROR);
        }
    }//GEN-LAST:event_lbListaPlatosMouseClicked

    private void lbListaVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListaVentasMouseClicked
        try {
            this.lVenta = new JFLVenta();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex, "Error", ERROR);
        }
    }//GEN-LAST:event_lbListaVentasMouseClicked

    private void lbBuscarVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBuscarVentaMouseClicked
        this.bVenta = new JFBVenta();
    }//GEN-LAST:event_lbBuscarVentaMouseClicked

    private void pRegistrarPlatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pRegistrarPlatoMouseClicked
       try {
            this.plato = new JFRPlato();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex,"Error",ERROR);
        }
    }//GEN-LAST:event_pRegistrarPlatoMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new JFPrincipal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbBuscarVenta;
    private javax.swing.JLabel lbImg;
    private javax.swing.JLabel lbListaPlatos;
    private javax.swing.JLabel lbListaVentas;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbRegistrarPlato;
    private javax.swing.JLabel lbRegistrarVenta;
    private javax.swing.JLabel lbtt1;
    private javax.swing.JLabel lbtt2;
    private javax.swing.JPanel pBuscarVenta;
    private javax.swing.JPanel pListaPlatos;
    private javax.swing.JPanel pListaVentas;
    private javax.swing.JPanel pRegistrarPlato;
    private javax.swing.JPanel pRegistrarVenta;
    // End of variables declaration//GEN-END:variables
}
