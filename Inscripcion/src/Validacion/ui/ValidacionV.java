/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacion.ui;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Mario Gomez Fernandez
 * @author Miguel Bayon Sanz
 */
public class ValidacionV extends javax.swing.JFrame {

    ValidacionC valControl;

    /**
     * Creates new form Validacion
     */
    public ValidacionV() {
        initComponents();
        setLocationRelativeTo(null);
        valControl = new ValidacionC(this);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Us_lab = new javax.swing.JLabel();
        Con_lab = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        Continuar = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        NoCuenta = new javax.swing.JRadioButton();
        Instrucciones = new javax.swing.JLabel();
        Contraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Us_lab.setText("Usuario");

        Con_lab.setText("Contraseña");

        Continuar.setText("Continuar");
        Continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinuarActionPerformed(evt);
            }
        });

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        NoCuenta.setText("No tengo cuenta");

        Instrucciones.setText("Introduzca nombre de usuario y contraseña (obligatorio): ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Con_lab)
                            .addComponent(Us_lab))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(Contraseña))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Volver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Continuar))
                            .addComponent(NoCuenta)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Instrucciones)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(Instrucciones)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(NoCuenta)
                                .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Us_lab))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Con_lab)
                            .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Continuar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(Volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Maneja el evento del boton Continuar
     *
     * @param evt evento de pulsar el boton
     */
    private void ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinuarActionPerformed
        if (valControl.Validar()) {
            JOptionPane pasarela = new JOptionPane();
            JOptionPane.showMessageDialog(pasarela, "Redirigido a una pasarela de pago segura.");
            valControl.Salir();
        }
    }//GEN-LAST:event_ContinuarActionPerformed

    /**
     * Maneja el evento del boton Volver
     *
     * @param evt evento de pulsar el boton
     */
    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        valControl.Volver();
    }//GEN-LAST:event_VolverActionPerformed

    /**
     * devuelve true si esta pulsado el boton NoCuenta
     */
    public boolean getNoCuenta() {
        return NoCuenta.isSelected();
    }

    /**
     * getter del label GetInstrucciones
     *
     * @return Instrucciones
     */
    public javax.swing.JLabel getInstrucciones() {
        return Instrucciones;
    }

    /**
     * getter del texto contenido en el JTextField Usuario
     *
     * @return String contenido en Usuario
     */
    public String getUsuario() {
        return Usuario.getText();
    }

    /**
     * getter del String contenido en el JPasswordField Contraseña
     *
     * @return String contenido en Contraseña
     */
    public String getContraseña() {
        return Contraseña.getText();
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Con_lab;
    private javax.swing.JButton Continuar;
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JLabel Instrucciones;
    private javax.swing.JRadioButton NoCuenta;
    private javax.swing.JLabel Us_lab;
    private javax.swing.JTextField Usuario;
    private javax.swing.JButton Volver;
    // End of variables declaration//GEN-END:variables

}
