/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microondasui;

/**
 *
 * @author Miguel
 */
public class MicroondasUI extends javax.swing.JFrame {

    /**
     * Creates new form MicroUI
     */
    public MicroondasUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Botonaso = new javax.swing.JPanel();
        Comida = new javax.swing.JButton();
        Texto = new javax.swing.JPanel();
        Tiempo = new javax.swing.JTextField();
        Botones = new javax.swing.JPanel();
        t1 = new javax.swing.JButton();
        t2 = new javax.swing.JButton();
        t3 = new javax.swing.JButton();
        t4 = new javax.swing.JButton();
        t5 = new javax.swing.JButton();
        t6 = new javax.swing.JButton();
        t7 = new javax.swing.JButton();
        t8 = new javax.swing.JButton();
        t9 = new javax.swing.JButton();
        t0 = new javax.swing.JButton();
        bStart = new javax.swing.JButton();
        bStop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Botonaso.setLayout(new java.awt.GridLayout());

        Comida.setText("Comida");
        Comida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComidaActionPerformed(evt);
            }
        });
        Botonaso.add(Comida);

        Texto.setLayout(new java.awt.GridLayout());

        Tiempo.setText("Inserte tiempo");
        Texto.add(Tiempo);

        Botones.setLayout(new java.awt.GridLayout(4, 3));

        t1.setText("1");
        Botones.add(t1);

        t2.setText("2");
        Botones.add(t2);

        t3.setText("3");
        Botones.add(t3);

        t4.setText("4");
        Botones.add(t4);

        t5.setText("5");
        Botones.add(t5);

        t6.setText("6");
        Botones.add(t6);

        t7.setText("7");
        Botones.add(t7);

        t8.setText("8");
        Botones.add(t8);

        t9.setText("9");
        Botones.add(t9);

        t0.setText("0");
        Botones.add(t0);

        bStart.setText("Start");
        Botones.add(bStart);

        bStop.setText("Stop");
        Botones.add(bStop);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Botonaso, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Texto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Botones, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Botonaso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Botones, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComidaActionPerformed

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
            java.util.logging.Logger.getLogger(MicroondasUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MicroondasUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MicroondasUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MicroondasUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MicroondasUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Botonaso;
    private javax.swing.JPanel Botones;
    private javax.swing.JButton Comida;
    private javax.swing.JPanel Texto;
    private javax.swing.JTextField Tiempo;
    private javax.swing.JButton bStart;
    private javax.swing.JButton bStop;
    private javax.swing.JButton t0;
    private javax.swing.JButton t1;
    private javax.swing.JButton t2;
    private javax.swing.JButton t3;
    private javax.swing.JButton t4;
    private javax.swing.JButton t5;
    private javax.swing.JButton t6;
    private javax.swing.JButton t7;
    private javax.swing.JButton t8;
    private javax.swing.JButton t9;
    // End of variables declaration//GEN-END:variables
}
