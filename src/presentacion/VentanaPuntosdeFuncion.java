/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

/**
 *
 * @author Francisco Apodaca
 */
public class VentanaPuntosdeFuncion extends javax.swing.JFrame {

    private int puntosEntradas;
    private int puntosSalidas;
    private int puntosConsultas;
    private int puntosArchivos;
    private int puntosInterfaces;
    private double PF;

    /**
     * Creates new form VentanaPuntosdeFuncion
     */
    public VentanaPuntosdeFuncion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void calcularEntradas() {
        int entradaS = Integer.parseInt(txtEntradaSimple.getText());
        int entradaP = Integer.parseInt(txtEntradaPromedio.getText());
        int entradaC = Integer.parseInt(txtEntradaComplejo.getText());
        int resultS = entradaS;
        int resultP = entradaP;
        int resultC = entradaC;

        if (entradaS != 0) {
            resultS = entradaS * 3;
        }
        if (entradaP != 0) {
            resultP = entradaP * 4;
        }
        if (entradaC != 0) {
            resultC = entradaC * 6;
        }
        puntosEntradas = resultS + resultP + resultC;
        txtPuntosEntrada.setText(new Integer(puntosEntradas).toString());
    }

    public void calcularSalidas() {
        int salidaS = Integer.parseInt(txtSalidaSimple.getText());
        int salidaP = Integer.parseInt(txtSalidaPromedio.getText());
        int salidaC = Integer.parseInt(txtSalidaComplejo.getText());
        int resultS = salidaS;
        int resultP = salidaP;
        int resultC = salidaC;

        if (salidaS != 0) {
            resultS = salidaS * 4;
        }
        if (salidaP != 0) {
            resultP = salidaP * 5;
        }
        if (salidaC != 0) {
            resultC = salidaC * 7;
        }
        puntosSalidas = resultS + resultP + resultC;
        txtPuntosSalidas.setText(new Integer(puntosSalidas).toString());
    }

    public void calcularConsultas() {
        int consultaS = Integer.parseInt(txtConsultaSimple.getText());
        int consultaP = Integer.parseInt(txtConsultaPromedio.getText());
        int consultaC = Integer.parseInt(txtConsultaComplejo.getText());
        int resultS = consultaS;
        int resultP = consultaP;
        int resultC = consultaC;

        if (consultaS != 0) {
            resultS = consultaS * 3;
        }
        if (consultaP != 0) {
            resultP = consultaP * 4;
        }
        if (consultaC != 0) {
            resultC = consultaC * 6;
        }
        puntosConsultas = resultS + resultP + resultC;
        txtPuntosConsultas.setText(new Integer(puntosConsultas).toString());

    }

    public void calcularArchivos() {
        int archivoS = Integer.parseInt(txtArchivoSimple.getText());
        int archivoP = Integer.parseInt(txtArchivoPromedio.getText());
        int archivoC = Integer.parseInt(txtArchivoComplejo.getText());
        int resultS = archivoS;
        int resultP = archivoP;
        int resultC = archivoC;

        if (archivoS != 0) {
            resultS = archivoS * 7;
        }
        if (archivoP != 0) {
            resultP = archivoP * 10;
        }
        if (archivoC != 0) {
            resultC = archivoC * 15;
        }
        puntosArchivos = resultS + resultP + resultC;
        txtPuntosArchivos.setText(new Integer(puntosArchivos).toString());

    }

    public void calcularInterfaces() {
        int interfacesS = Integer.parseInt(txtInterfazSimple.getText());
        int interfacesP = Integer.parseInt(txtInterfazPromedio.getText());
        int interfacesC = Integer.parseInt(txtInterfazComplejo.getText());
        int resultS = interfacesS;
        int resultP = interfacesP;
        int resultC = interfacesC;

        if (interfacesS != 0) {
            resultS = interfacesS * 5;
        }
        if (interfacesP != 0) {
            resultP = interfacesP * 7;
        }
        if (interfacesP != 0) {
            resultC = interfacesP * 10;
        }
        puntosInterfaces = resultS + resultP + resultC;
        txtPuntosInterfaces.setText(new Integer(puntosInterfaces).toString());

    }

    public void calcularPuntosdeFuncionSinAjustar() {
        PF = puntosEntradas + puntosSalidas + puntosArchivos + puntosConsultas + puntosInterfaces;
        txtTotal.setText(new Double(PF).toString());
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtEntradaSimple = new javax.swing.JTextField();
        txtEntradaPromedio = new javax.swing.JTextField();
        txtEntradaComplejo = new javax.swing.JTextField();
        txtPuntosEntrada = new javax.swing.JTextField();
        txtSalidaPromedio = new javax.swing.JTextField();
        txtSalidaSimple = new javax.swing.JTextField();
        txtSalidaComplejo = new javax.swing.JTextField();
        txtPuntosSalidas = new javax.swing.JTextField();
        txtConsultaSimple = new javax.swing.JTextField();
        txtConsultaPromedio = new javax.swing.JTextField();
        txtConsultaComplejo = new javax.swing.JTextField();
        txtPuntosConsultas = new javax.swing.JTextField();
        txtArchivoSimple = new javax.swing.JTextField();
        txtArchivoPromedio = new javax.swing.JTextField();
        txtArchivoComplejo = new javax.swing.JTextField();
        txtPuntosArchivos = new javax.swing.JTextField();
        txtInterfazSimple = new javax.swing.JTextField();
        txtInterfazPromedio = new javax.swing.JTextField();
        txtInterfazComplejo = new javax.swing.JTextField();
        txtPuntosInterfaces = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        botonCalcular = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese los datos en la tabla siguiente:"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ELEMENTOS:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Entradas");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Salidas");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Consultas");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Archivos");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("SIMPLE");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("PROMEDIO");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Interfaces");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("COMPLEJO");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("PUNTOS");

        txtEntradaSimple.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEntradaSimple.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtEntradaPromedio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEntradaPromedio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtEntradaComplejo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEntradaComplejo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtPuntosEntrada.setEditable(false);
        txtPuntosEntrada.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPuntosEntrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPuntosEntrada.setText("0");
        txtPuntosEntrada.setFocusable(false);

        txtSalidaPromedio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSalidaPromedio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtSalidaSimple.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSalidaSimple.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtSalidaComplejo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSalidaComplejo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtPuntosSalidas.setEditable(false);
        txtPuntosSalidas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPuntosSalidas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPuntosSalidas.setText("0");
        txtPuntosSalidas.setFocusable(false);

        txtConsultaSimple.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtConsultaSimple.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtConsultaPromedio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtConsultaPromedio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtConsultaComplejo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtConsultaComplejo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtPuntosConsultas.setEditable(false);
        txtPuntosConsultas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPuntosConsultas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPuntosConsultas.setText("0");
        txtPuntosConsultas.setFocusable(false);

        txtArchivoSimple.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtArchivoSimple.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtArchivoPromedio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtArchivoPromedio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtArchivoComplejo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtArchivoComplejo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtPuntosArchivos.setEditable(false);
        txtPuntosArchivos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPuntosArchivos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPuntosArchivos.setText("0");
        txtPuntosArchivos.setFocusable(false);

        txtInterfazSimple.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtInterfazSimple.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtInterfazPromedio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtInterfazPromedio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtInterfazComplejo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtInterfazComplejo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtPuntosInterfaces.setEditable(false);
        txtPuntosInterfaces.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPuntosInterfaces.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPuntosInterfaces.setText("0");
        txtPuntosInterfaces.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtArchivoSimple, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEntradaSimple, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSalidaSimple)
                    .addComponent(txtConsultaSimple, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInterfazSimple))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtConsultaPromedio, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(txtSalidaPromedio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEntradaPromedio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtArchivoPromedio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtInterfazPromedio, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel12)
                        .addContainerGap(67, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtConsultaComplejo, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(txtSalidaComplejo)
                            .addComponent(txtEntradaComplejo)
                            .addComponent(txtArchivoComplejo)
                            .addComponent(txtInterfazComplejo))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPuntosEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtPuntosSalidas)
                            .addComponent(txtPuntosConsultas)
                            .addComponent(txtPuntosArchivos)
                            .addComponent(txtPuntosInterfaces))
                        .addGap(50, 50, 50))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel7))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEntradaSimple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEntradaPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEntradaComplejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPuntosEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSalidaPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtSalidaSimple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSalidaComplejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtConsultaSimple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConsultaPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConsultaComplejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPuntosConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtArchivoSimple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtArchivoPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtArchivoComplejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPuntosArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtPuntosSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtInterfazSimple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInterfazPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInterfazComplejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPuntosInterfaces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setFocusable(false);

        botonCalcular.setText("calcular");
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonCalcular)
                .addGap(96, 96, 96)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonCalcular))
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(34, 34, 34))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        calcularEntradas();
        calcularSalidas();
        calcularArchivos();
        calcularConsultas();
        calcularInterfaces();
        calcularPuntosdeFuncionSinAjustar();
    }//GEN-LAST:event_botonCalcularActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VentanaPuntosdeFuncionFactordeAjuste vpffa = new VentanaPuntosdeFuncionFactordeAjuste();
        vpffa.setVisible(true);
        vpffa.getTxtPFsinAjustar().setText(txtTotal.getText());
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPuntosdeFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPuntosdeFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPuntosdeFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPuntosdeFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPuntosdeFuncion().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalcular;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtArchivoComplejo;
    private javax.swing.JTextField txtArchivoPromedio;
    private javax.swing.JTextField txtArchivoSimple;
    private javax.swing.JTextField txtConsultaComplejo;
    private javax.swing.JTextField txtConsultaPromedio;
    private javax.swing.JTextField txtConsultaSimple;
    private javax.swing.JTextField txtEntradaComplejo;
    private javax.swing.JTextField txtEntradaPromedio;
    private javax.swing.JTextField txtEntradaSimple;
    private javax.swing.JTextField txtInterfazComplejo;
    private javax.swing.JTextField txtInterfazPromedio;
    private javax.swing.JTextField txtInterfazSimple;
    private javax.swing.JTextField txtPuntosArchivos;
    private javax.swing.JTextField txtPuntosConsultas;
    private javax.swing.JTextField txtPuntosEntrada;
    private javax.swing.JTextField txtPuntosInterfaces;
    private javax.swing.JTextField txtPuntosSalidas;
    private javax.swing.JTextField txtSalidaComplejo;
    private javax.swing.JTextField txtSalidaPromedio;
    private javax.swing.JTextField txtSalidaSimple;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JTextField getTxtTotal() {
        return txtTotal;
    }

    public void setTxtTotal(javax.swing.JTextField txtTotal) {
        this.txtTotal = txtTotal;
    }
}
