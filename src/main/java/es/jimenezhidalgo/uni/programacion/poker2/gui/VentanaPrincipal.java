/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.jimenezhidalgo.uni.programacion.poker2.gui;

import es.jimenezhidalgo.uni.programacion.poker2.JugadorOcasional;
import es.jimenezhidalgo.uni.programacion.poker2.Main;
import javax.swing.JOptionPane;

/**
 *
 * @author jesus.jimenez
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        if(Main.sJugador != null) {
            nombreJugadorJLabel.setText("Bienvenido, " + Main.sJugador.getNombre() + " tu saldo es " + Main.sJugador.getSaldo());
            iniciarSesionJButton.setText("Cerrar sesión");
        } else {
            ingresoJButton.setEnabled(false);
            retirarJButton.setEnabled(false);
        }
        this.setVisible(true);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        registrarseJButton = new javax.swing.JButton();
        iniciarSesionJButton = new javax.swing.JButton();
        apostarJButton = new javax.swing.JButton();
        salirJButton = new javax.swing.JButton();
        inicioJugadorOcasionalJButton = new javax.swing.JButton();
        jugadoresJButton = new javax.swing.JButton();
        nombreJugadorJLabel = new javax.swing.JLabel();
        retirarJButton = new javax.swing.JButton();
        ingresoJButton = new javax.swing.JButton();
        cantidadIngresoJSpinner = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(76, 175, 80));

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));

        jPanel1.setBackground(new java.awt.Color(76, 175, 80));

        jLabel1.setBackground(new java.awt.Color(250, 250, 250));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setText("POKER STAR!");

        registrarseJButton.setText("Registrarse");
        registrarseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarseJButtonActionPerformed(evt);
            }
        });

        iniciarSesionJButton.setText("Iniciar Sesión");
        iniciarSesionJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registrarseJButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iniciarSesionJButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iniciarSesionJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(registrarseJButton)
                .addContainerGap())
        );

        apostarJButton.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        apostarJButton.setForeground(new java.awt.Color(33, 33, 33));
        apostarJButton.setText("Apostar");
        apostarJButton.setPreferredSize(new java.awt.Dimension(96, 42));
        apostarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apostarJButtonActionPerformed(evt);
            }
        });

        salirJButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        salirJButton.setText("Salir");
        salirJButton.setPreferredSize(new java.awt.Dimension(96, 42));
        salirJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirJButtonActionPerformed(evt);
            }
        });

        inicioJugadorOcasionalJButton.setText("Iniciar como jugador ocasional");
        inicioJugadorOcasionalJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioJugadorOcasionalJButtonActionPerformed(evt);
            }
        });

        jugadoresJButton.setText("Jugadores");
        jugadoresJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugadoresJButtonActionPerformed(evt);
            }
        });

        nombreJugadorJLabel.setText(" ");

        retirarJButton.setText("Retirar mis beneficios");
        retirarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarJButtonActionPerformed(evt);
            }
        });

        ingresoJButton.setText("Ingresar en mi cuenta");
        ingresoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoJButtonActionPerformed(evt);
            }
        });

        cantidadIngresoJSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 0.01d));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(apostarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nombreJugadorJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cantidadIngresoJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ingresoJButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jugadoresJButton)
                        .addGap(64, 64, 64)
                        .addComponent(inicioJugadorOcasionalJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(salirJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(retirarJButton)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreJugadorJLabel)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ingresoJButton)
                        .addComponent(cantidadIngresoJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retirarJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(apostarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salirJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inicioJugadorOcasionalJButton)
                        .addComponent(jugadoresJButton))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apostarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apostarJButtonActionPerformed
        if (Main.sJugador == null){
            JOptionPane.showMessageDialog(this, "Para poder apostar, debe iniciar sesión antes", "Inicie sesión", JOptionPane.INFORMATION_MESSAGE);
        } else {
            new VentanaApuesta();
            dispose();
        }
    }//GEN-LAST:event_apostarJButtonActionPerformed

    private void salirJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirJButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_salirJButtonActionPerformed

    private void registrarseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarseJButtonActionPerformed
        new VentanaRegistroJugadorRegistrado();
        dispose();
    }//GEN-LAST:event_registrarseJButtonActionPerformed

    private void iniciarSesionJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSesionJButtonActionPerformed
        if(Main.sJugador == null) {
            VentanaLogin ventanaLogin = new VentanaLogin();
        } else {
            //En caso de que el jugador no sea nulo, cerramos sesión en vez de abrir un login
            Main.sJugador = null;
            new VentanaPrincipal();
        }
        
        dispose();
    }//GEN-LAST:event_iniciarSesionJButtonActionPerformed

    private void jugadoresJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugadoresJButtonActionPerformed
        new VentanaListaJugadores();
        dispose();
    }//GEN-LAST:event_jugadoresJButtonActionPerformed

    private void inicioJugadorOcasionalJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioJugadorOcasionalJButtonActionPerformed
        new VentanaInicioSesiónJugadorOcasional();
        dispose();
    }//GEN-LAST:event_inicioJugadorOcasionalJButtonActionPerformed

    private void retirarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarJButtonActionPerformed
        Main.sJugador.retirarBeneficios();
        JOptionPane.showMessageDialog(this, "Ha retirado sus beneficios y se ha generado una factura\n", "Fondos retirados", JOptionPane.INFORMATION_MESSAGE);
        nombreJugadorJLabel.setText("Bienvenido, " + Main.sJugador.getNombre() + " tu saldo es " + Main.sJugador.getSaldo());
    }//GEN-LAST:event_retirarJButtonActionPerformed

    private void ingresoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoJButtonActionPerformed
        if((double) cantidadIngresoJSpinner.getValue() <= 0) {
           JOptionPane.showMessageDialog(this, "Debe de ingresar una cantidad mayor que 0\n", "Error", JOptionPane.ERROR_MESSAGE);
           return;
        }
        
        Main.sJugador.aumentarSaldo((double) cantidadIngresoJSpinner.getValue());
        JOptionPane.showMessageDialog(this, "Se ha aumentado su saldo\n", "Error", JOptionPane.INFORMATION_MESSAGE);
        nombreJugadorJLabel.setText("Bienvenido, " + Main.sJugador.getNombre() + " tu saldo es " + Main.sJugador.getSaldo());
    }//GEN-LAST:event_ingresoJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apostarJButton;
    private javax.swing.JSpinner cantidadIngresoJSpinner;
    private javax.swing.JButton ingresoJButton;
    private javax.swing.JButton iniciarSesionJButton;
    private javax.swing.JButton inicioJugadorOcasionalJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jugadoresJButton;
    private javax.swing.JLabel nombreJugadorJLabel;
    private javax.swing.JButton registrarseJButton;
    private javax.swing.JButton retirarJButton;
    private javax.swing.JButton salirJButton;
    // End of variables declaration//GEN-END:variables
}
