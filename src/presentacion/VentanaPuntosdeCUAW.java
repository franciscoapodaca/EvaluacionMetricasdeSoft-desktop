/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Examen Práctico #1
 */
public class VentanaPuntosdeCUAW extends javax.swing.JFrame {

    private int resultadoS;
    private int resultadoP;
    private int resultadoC;

    /**
     * Creates new form VentanaPuntosdeCU
     */
    public VentanaPuntosdeCUAW() {
        initComponents();
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

        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        etiqueta1 = new javax.swing.JLabel();
        etiqueta2 = new javax.swing.JLabel();
        etiqueta3 = new javax.swing.JLabel();
        txtActorSimple = new javax.swing.JTextField();
        txtActorPromedio = new javax.swing.JTextField();
        totalComplejo = new javax.swing.JTextField();
        totalSimple = new javax.swing.JTextField();
        totalPromedio = new javax.swing.JTextField();
        totalAW = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtActorComplejo = new javax.swing.JTextField();
        botonCalcular = new javax.swing.JButton();
        botonSiguiente = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DETERMINACIÓN DEL FACTOR DE PESO DE LOS ACTORES (AW)");
        setMaximumSize(new java.awt.Dimension(936, 540));
        setMinimumSize(new java.awt.Dimension(936, 540));
        setPreferredSize(new java.awt.Dimension(936, 540));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Tipo de actor:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Descripción:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Factor de Peso:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Número de Actores:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel16)
                .addGap(121, 121, 121)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(31, 31, 31)
                .addComponent(jLabel20)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 770, 40));

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Resultado:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel17)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 150, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Simple");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Promedio");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Complejo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("El actor representa otro sistema");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("El actor representa otro sistema ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 260, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("interactuando a través de protocolos ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("o es un humano con interacción terminal");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("El actor es un humano a través ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("de una interfaz gráfica de usuario");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        etiqueta1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        etiqueta1.setForeground(new java.awt.Color(255, 255, 255));
        etiqueta1.setText("1");
        getContentPane().add(etiqueta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));

        etiqueta2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        etiqueta2.setForeground(new java.awt.Color(255, 255, 255));
        etiqueta2.setText("2");
        getContentPane().add(etiqueta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        etiqueta3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        etiqueta3.setForeground(new java.awt.Color(255, 255, 255));
        etiqueta3.setText("3");
        getContentPane().add(etiqueta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, -1, -1));

        txtActorSimple.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtActorSimple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtActorSimple.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        txtActorSimple.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtActorSimpleKeyTyped(evt);
            }
        });
        getContentPane().add(txtActorSimple, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 100, -1));

        txtActorPromedio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtActorPromedio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtActorPromedio.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        txtActorPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActorPromedioActionPerformed(evt);
            }
        });
        txtActorPromedio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtActorPromedioKeyTyped(evt);
            }
        });
        getContentPane().add(txtActorPromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 100, -1));

        totalComplejo.setEditable(false);
        totalComplejo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalComplejo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalComplejo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        totalComplejo.setFocusable(false);
        getContentPane().add(totalComplejo, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, 100, -1));

        totalSimple.setEditable(false);
        totalSimple.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalSimple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalSimple.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        totalSimple.setFocusable(false);
        getContentPane().add(totalSimple, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, 100, -1));

        totalPromedio.setEditable(false);
        totalPromedio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalPromedio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalPromedio.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        totalPromedio.setFocusable(false);
        totalPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPromedioActionPerformed(evt);
            }
        });
        getContentPane().add(totalPromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, 100, -1));

        totalAW.setEditable(false);
        totalAW.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        totalAW.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalAW.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        totalAW.setFocusable(false);
        getContentPane().add(totalAW, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 330, 110, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("TOTAL AW:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, -1, -1));

        txtActorComplejo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtActorComplejo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtActorComplejo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        txtActorComplejo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtActorComplejoKeyTyped(evt);
            }
        });
        getContentPane().add(txtActorComplejo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 100, -1));

        botonCalcular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonCalcular.setText("Calcular");
        botonCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(botonCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, 40));

        botonSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botonSiguiente.png"))); // NOI18N
        botonSiguiente.setBorder(null);
        botonSiguiente.setBorderPainted(false);
        botonSiguiente.setContentAreaFilled(false);
        botonSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSiguiente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botonSiguienteG.png"))); // NOI18N
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(botonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 400, 90, 100));

        botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/volverMenuPrincipal.png"))); // NOI18N
        botonVolver.setBorder(null);
        botonVolver.setBorderPainted(false);
        botonVolver.setContentAreaFilled(false);
        botonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVolver.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/volverMenuPrincipalG.png"))); // NOI18N
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo5.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void calcularActorSimple() {
        int numActorS = Integer.parseInt(txtActorSimple.getText().toString());
        resultadoS = numActorS * 1;
        totalSimple.setText((new Integer(resultadoS).toString()));
    }

    public void calcularActorPromedio() {
        int numActorP = Integer.parseInt(txtActorPromedio.getText().toString());
        resultadoP = numActorP * 2;
        totalPromedio.setText((new Integer(resultadoP).toString()));
    }

    public void calcularActorComplejo() {
        int numActorC = Integer.parseInt(txtActorComplejo.getText().toString());
        resultadoC = numActorC * 3;
        totalComplejo.setText((new Integer(resultadoC).toString()));
    }

    public JTextField getTotalAW() {
        return totalAW;
    }

    public void setTotalAW(JTextField totalAW) {
        this.totalAW = totalAW;
    }

    public void calculoAW() {
        int suma = resultadoS + resultadoP + resultadoC;
        totalAW.setText((new Integer(suma).toString()));
    }
    private void txtActorPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActorPromedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActorPromedioActionPerformed

    private void totalPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPromedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPromedioActionPerformed

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        if (txtActorComplejo.getText().isEmpty() || txtActorPromedio.getText().isEmpty() || txtActorComplejo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Verifique que no existan campos vacios");
        } else {
            calcularActorComplejo();
            calcularActorPromedio();
            calcularActorSimple();
            calculoAW();
        }

    }//GEN-LAST:event_botonCalcularActionPerformed

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        if (totalAW.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe de realizar el calculo del peso de los actores para continuar");
        } else {
            VentanaPuntosdeCUCW vpcuw = new VentanaPuntosdeCUCW();
            vpcuw.setVisible(true);
            vpcuw.getTxtAWS().setText(totalAW.getText());
            this.dispose();
        }

    }//GEN-LAST:event_botonSiguienteActionPerformed

    private void txtActorSimpleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtActorSimpleKeyTyped
        validacionNumeros(evt);
    }//GEN-LAST:event_txtActorSimpleKeyTyped

    private void txtActorPromedioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtActorPromedioKeyTyped
        validacionNumeros(evt);
    }//GEN-LAST:event_txtActorPromedioKeyTyped

    private void txtActorComplejoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtActorComplejoKeyTyped
        validacionNumeros(evt);
    }//GEN-LAST:event_txtActorComplejoKeyTyped

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        VentanaPrincipal vp = new VentanaPrincipal();
        vp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonVolverActionPerformed
    public void validacionNumeros(java.awt.event.KeyEvent evt) {
        if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten números");
        }
    }
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalcular;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel etiqueta1;
    private javax.swing.JLabel etiqueta2;
    private javax.swing.JLabel etiqueta3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField totalAW;
    private javax.swing.JTextField totalComplejo;
    private javax.swing.JTextField totalPromedio;
    private javax.swing.JTextField totalSimple;
    private javax.swing.JTextField txtActorComplejo;
    private javax.swing.JTextField txtActorPromedio;
    private javax.swing.JTextField txtActorSimple;
    // End of variables declaration//GEN-END:variables
}
