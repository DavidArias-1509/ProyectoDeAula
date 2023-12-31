package vista;

import cuentas.Plato;
import cuentas.Venta;
import empleados.Cliente;
import empleados.Empleado;
import excepciones.ExceptionRestaurante;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import persistencias.ArchivoPlato;
import persistencias.ArchivoVenta;
import persistencias.Logica;

public class JFRVenta extends javax.swing.JFrame {
    
    private Logica plato;
    private Logica venta;
    private JFRPlato rPlato;
    private Venta v;
    public JFRVenta() {
        initComponents();
        this.v = new Venta();
        this.plato= new ArchivoPlato();
        this.venta = new ArchivoVenta();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lbNombre = new javax.swing.JLabel();
        lbImg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jBaddPlato = new javax.swing.JButton();
        jTFFecha = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jBCandelar = new javax.swing.JButton();
        jTFCodVenta = new javax.swing.JTextField();
        jTFIdEmpleado = new javax.swing.JTextField();
        jTFNombreEmpleado = new javax.swing.JTextField();
        jTFIdCliente = new javax.swing.JTextField();
        jTFNombreCliente = new javax.swing.JTextField();
        jTFEmail = new javax.swing.JTextField();
        jLBValortotal = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lbtt1 = new javax.swing.JLabel();
        lbtt2 = new javax.swing.JLabel();
        lbtt3 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lbImg, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbImg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 112, 36)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 112, 36))));

        jLabel1.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Fecha: ");

        jLabel2.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Codigo Venta: ");

        jLabel3.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Empleado");

        jLabel4.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Identificación: ");

        jLabel5.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre: ");

        jLabel6.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cliente");

        jLabel7.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Identificación: ");

        jLabel8.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nombre: ");

        jLabel9.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("E-mail: ");

        jLabel10.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Platos");

        jLabel11.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Valor Total:");

        jBaddPlato.setBackground(new java.awt.Color(232, 112, 36));
        jBaddPlato.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jBaddPlato.setText("Añadir");
        jBaddPlato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBaddPlatoMouseClicked(evt);
            }
        });

        jTFFecha.setBackground(new java.awt.Color(255, 255, 255));
        jTFFecha.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jTFFecha.setForeground(new java.awt.Color(51, 51, 51));
        jTFFecha.setText("dd/mm/aaaa");
        jTFFecha.setToolTipText("");
        jTFFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTFFecha.setCaretColor(new java.awt.Color(0, 0, 0));
        jTFFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFFechaActionPerformed(evt);
            }
        });

        jBGuardar.setBackground(new java.awt.Color(232, 112, 36));
        jBGuardar.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jBGuardar.setText("GUARDAR");
        jBGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBGuardarMouseClicked(evt);
            }
        });
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBCandelar.setBackground(new java.awt.Color(232, 112, 36));
        jBCandelar.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jBCandelar.setText("CANCELAR");
        jBCandelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBCandelarMouseClicked(evt);
            }
        });
        jBCandelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCandelarActionPerformed(evt);
            }
        });

        jTFCodVenta.setEditable(false);
        jTFCodVenta.setBackground(new java.awt.Color(255, 255, 255));
        jTFCodVenta.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jTFCodVenta.setForeground(new java.awt.Color(51, 51, 51));
        jTFCodVenta.setText("0");
        jTFCodVenta.setToolTipText("");
        jTFCodVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTFCodVenta.setCaretColor(new java.awt.Color(0, 0, 0));
        jTFCodVenta.setEnabled(false);

        jTFIdEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        jTFIdEmpleado.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jTFIdEmpleado.setForeground(new java.awt.Color(51, 51, 51));
        jTFIdEmpleado.setToolTipText("");
        jTFIdEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTFIdEmpleado.setCaretColor(new java.awt.Color(0, 0, 0));

        jTFNombreEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        jTFNombreEmpleado.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jTFNombreEmpleado.setForeground(new java.awt.Color(51, 51, 51));
        jTFNombreEmpleado.setToolTipText("");
        jTFNombreEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTFNombreEmpleado.setCaretColor(new java.awt.Color(0, 0, 0));

        jTFIdCliente.setBackground(new java.awt.Color(255, 255, 255));
        jTFIdCliente.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jTFIdCliente.setForeground(new java.awt.Color(51, 51, 51));
        jTFIdCliente.setToolTipText("");
        jTFIdCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTFIdCliente.setCaretColor(new java.awt.Color(0, 0, 0));

        jTFNombreCliente.setBackground(new java.awt.Color(255, 255, 255));
        jTFNombreCliente.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jTFNombreCliente.setForeground(new java.awt.Color(51, 51, 51));
        jTFNombreCliente.setToolTipText("");
        jTFNombreCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTFNombreCliente.setCaretColor(new java.awt.Color(0, 0, 0));

        jTFEmail.setBackground(new java.awt.Color(255, 255, 255));
        jTFEmail.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jTFEmail.setForeground(new java.awt.Color(51, 51, 51));
        jTFEmail.setText("example@mail.com");
        jTFEmail.setToolTipText("");
        jTFEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTFEmail.setCaretColor(new java.awt.Color(0, 0, 0));

        jLBValortotal.setForeground(new java.awt.Color(0, 0, 0));
        jLBValortotal.setText("0");

        jSeparator1.setForeground(new java.awt.Color(232, 112, 36));

        jSeparator2.setForeground(new java.awt.Color(232, 112, 36));

        jSeparator3.setForeground(new java.awt.Color(232, 112, 36));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLBValortotal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBaddPlato)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBCandelar)))
                        .addGap(338, 338, 338))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTFCodVenta))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTFIdCliente))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTFEmail))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTFNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFCodVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTFNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBaddPlato)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLBValortotal))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBCandelar))
                .addGap(7, 7, 7))
        );

        lbtt1.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        lbtt1.setForeground(new java.awt.Color(0, 0, 0));
        lbtt1.setText("Restaurante : La góndola ");

        lbtt2.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        lbtt2.setForeground(new java.awt.Color(0, 0, 0));
        lbtt2.setText("Sistema de Contabilidad");

        lbtt3.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        lbtt3.setForeground(new java.awt.Color(0, 0, 0));
        lbtt3.setText("Registrar Venta");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbtt2)
                    .addComponent(lbtt3)
                    .addComponent(lbtt1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbtt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbtt2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbtt3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(313, 313, 313))
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
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBaddPlatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBaddPlatoMouseClicked
        JOptionPane.showMessageDialog(null, "Agrege un plato");
        String nombre = JOptionPane.showInputDialog("Ingrese Codigo del plato");
        Plato p = (Plato) plato.buscarItem(nombre);
        if( p == null){
            try {
               int resultado = JOptionPane.showConfirmDialog(this, "Plato no existe, desea ir a agregarlo?","Error busqueda",JOptionPane.YES_NO_OPTION);
               if(resultado == JOptionPane.YES_OPTION){
                   this.rPlato = new JFRPlato();
               }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }else{
            this.v.addPlato(p);
            this.jLBValortotal.setText(String.valueOf(v.calcularValorVenta()));
        }
    }//GEN-LAST:event_jBaddPlatoMouseClicked

    private void jBGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGuardarMouseClicked
       ExceptionRestaurante excep = new ExceptionRestaurante();
       DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            if(v.getPlatos().size()<=0){
                throw new IOException("Se debe agregar almenos un plato");
            }
            LocalDate fecha = LocalDate.parse(excep.espaciosEnBlancos(this.jTFFecha.getText()), formato);
            Long idEmple = Long.parseLong(excep.espaciosEnBlancos(this.jTFIdEmpleado.getText()));
            String nomEmple = excep.espaciosEnBlancos(this.jTFNombreEmpleado.getText());
            Long idClien = Long.parseLong(excep.espaciosEnBlancos(this.jTFIdCliente.getText()));
            String nomClien = excep.espaciosEnBlancos(this.jTFNombreCliente.getText());
            String email = excep.espaciosEnBlancos(this.jTFEmail.getText());
            Empleado e = new Empleado(nomEmple,idEmple);
            Cliente c = new Cliente(email,nomClien,idClien);
            v.setEmpleado(e);
            v.setFechaVenta(fecha);
            v.setCliente(c);
            this.jTFCodVenta.setText(v.getCodigoVenta());
            venta.agregarItem(v);
            JOptionPane.showMessageDialog(null, "Guardando Venta");
            this.limpiar();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }catch(java.time.format.DateTimeParseException ex){
            JOptionPane.showMessageDialog(this, "Formato de la Fecha no es valido(dd/mm/aaaa)");
            this.jTFFecha.setText(LocalDate.now().format(formato).toString());
        }
    }//GEN-LAST:event_jBGuardarMouseClicked

    public void limpiar(){
        this.jTFEmail.setText("");
        this.jTFIdCliente.setText("");
        this.jTFIdEmpleado.setText("");
        this.jTFNombreCliente.setText("");
        this.jTFNombreEmpleado.setText("");
        this.jLBValortotal.setText("");
    }
    private void jBCandelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCandelarMouseClicked
       JOptionPane.showMessageDialog(null, "Cancelando Venta");
       this.limpiar();
    }//GEN-LAST:event_jBCandelarMouseClicked

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBCandelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCandelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCandelarActionPerformed

    private void jTFFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFFechaActionPerformed
     public Font font = new Font("Lucida Console", Font.BOLD, 18);
    public Font font2 = new Font("Lucida Console", Font.PLAIN, 18);
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCandelar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBaddPlato;
    private javax.swing.JLabel jLBValortotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTFCodVenta;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFFecha;
    private javax.swing.JTextField jTFIdCliente;
    private javax.swing.JTextField jTFIdEmpleado;
    private javax.swing.JTextField jTFNombreCliente;
    private javax.swing.JTextField jTFNombreEmpleado;
    private javax.swing.JLabel lbImg;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbtt1;
    private javax.swing.JLabel lbtt2;
    private javax.swing.JLabel lbtt3;
    // End of variables declaration//GEN-END:variables
}
