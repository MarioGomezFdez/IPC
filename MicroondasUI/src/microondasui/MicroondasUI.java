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
    
    private boolean funcionando, lleno;
    
    public MicroondasUI() {
        initComponents();
        funcionando = false;
        lleno = false;
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
        comida = new javax.swing.JButton();
        Texto = new javax.swing.JPanel();
        textoTiempo = new javax.swing.JTextField();
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
        setTitle("Microondas");
        setMinimumSize(new java.awt.Dimension(613, 326));
        setPreferredSize(new java.awt.Dimension(613, 326));

        Botonaso.setLayout(new java.awt.GridLayout());

        comida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comida.setText("Vacío");
        comida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comidaMouseClicked(evt);
            }
        });
        Botonaso.add(comida);

        Texto.setLayout(new java.awt.GridLayout());

        textoTiempo.setEditable(false);
        textoTiempo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textoTiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textoTiempo.setText("Inserte tiempo");
        Texto.add(textoTiempo);

        Botones.setLayout(new java.awt.GridLayout(4, 3));

        t1.setText("1");
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1MouseClicked(evt);
            }
        });
        Botones.add(t1);

        t2.setText("2");
        t2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t2MouseClicked(evt);
            }
        });
        Botones.add(t2);

        t3.setText("3");
        t3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t3MouseClicked(evt);
            }
        });
        Botones.add(t3);

        t4.setText("4");
        t4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t4MouseClicked(evt);
            }
        });
        Botones.add(t4);

        t5.setText("5");
        t5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t5MouseClicked(evt);
            }
        });
        Botones.add(t5);

        t6.setText("6");
        t6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t6MouseClicked(evt);
            }
        });
        Botones.add(t6);

        t7.setText("7");
        t7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t7MouseClicked(evt);
            }
        });
        Botones.add(t7);

        t8.setText("8");
        t8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t8MouseClicked(evt);
            }
        });
        Botones.add(t8);

        t9.setText("9");
        t9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t9MouseClicked(evt);
            }
        });
        Botones.add(t9);

        t0.setText("0");
        t0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t0MouseClicked(evt);
            }
        });
        Botones.add(t0);

        bStart.setText("Start");
        bStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bStartMouseClicked(evt);
            }
        });
        Botones.add(bStart);

        bStop.setText("Stop");
        bStop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bStopMouseClicked(evt);
            }
        });
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
                .addComponent(Botones, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("Programa para IPC");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseClicked
        if (funcionando){ 
        }else if(textoTiempo.getText().equals("Inserte tiempo")){
            textoTiempo.setText("1");
        }else{
            textoTiempo.setText(textoTiempo.getText()+"1");
        }
    }//GEN-LAST:event_t1MouseClicked

    private void t2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t2MouseClicked
        if (funcionando){ 
        }else if(textoTiempo.getText().equals("Inserte tiempo")){
            textoTiempo.setText("2");
        }else{
            textoTiempo.setText(textoTiempo.getText()+"2");
        }
    }//GEN-LAST:event_t2MouseClicked

    private void t3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t3MouseClicked
        if (funcionando){ 
        }else if(textoTiempo.getText().equals("Inserte tiempo")){
            textoTiempo.setText("3");
        }else{
            textoTiempo.setText(textoTiempo.getText()+"3");
        }
    }//GEN-LAST:event_t3MouseClicked

    private void t4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t4MouseClicked
        if (funcionando){ 
        }else if(textoTiempo.getText().equals("Inserte tiempo")){
            textoTiempo.setText("4");
        }else{
            textoTiempo.setText(textoTiempo.getText()+"4");
        }
    }//GEN-LAST:event_t4MouseClicked

    private void t5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t5MouseClicked
        if (funcionando){ 
        }else if(textoTiempo.getText().equals("Inserte tiempo")){
            textoTiempo.setText("5");
        }else{
            textoTiempo.setText(textoTiempo.getText()+"5");
        }
    }//GEN-LAST:event_t5MouseClicked

    private void t6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t6MouseClicked
        if (funcionando){ 
        }else if(textoTiempo.getText().equals("Inserte tiempo")){
            textoTiempo.setText("6");
        }else{
            textoTiempo.setText(textoTiempo.getText()+"6");
        }
    }//GEN-LAST:event_t6MouseClicked

    private void t7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t7MouseClicked
        if (funcionando){ 
        }else if(textoTiempo.getText().equals("Inserte tiempo")){
            textoTiempo.setText("7");
        }else{
            textoTiempo.setText(textoTiempo.getText()+"7");
        }
    }//GEN-LAST:event_t7MouseClicked

    private void t8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t8MouseClicked
        if (funcionando){ 
        }else if(textoTiempo.getText().equals("Inserte tiempo")){
            textoTiempo.setText("8");
        }else{
            textoTiempo.setText(textoTiempo.getText()+"8");
        }
    }//GEN-LAST:event_t8MouseClicked

    private void t9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t9MouseClicked
        if (funcionando){ 
        }else if(textoTiempo.getText().equals("Inserte tiempo")){
            textoTiempo.setText("9");
        }else{
            textoTiempo.setText(textoTiempo.getText()+"9");
        }
    }//GEN-LAST:event_t9MouseClicked

    private void t0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t0MouseClicked
        if (funcionando || textoTiempo.getText().equals("Inserte tiempo")){ 
        }else{
            textoTiempo.setText(textoTiempo.getText()+"0");
        }
    }//GEN-LAST:event_t0MouseClicked

    private void bStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bStartMouseClicked
        // Falta añadir la funcion de cronometro
    }//GEN-LAST:event_bStartMouseClicked

    private void bStopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bStopMouseClicked
        if (!funcionando && !textoTiempo.getText().equals("Inserte tiempo")){
            textoTiempo.setText("Inserte tiempo");
        }
    }//GEN-LAST:event_bStopMouseClicked

    private void comidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comidaMouseClicked
        if (lleno){
            lleno = false;
            comida.setText("Vacío");
        } else if (!lleno){
            lleno = true;
            comida.setText("Comida");
        }
    }//GEN-LAST:event_comidaMouseClicked

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
    private javax.swing.JPanel Texto;
    private javax.swing.JButton bStart;
    private javax.swing.JButton bStop;
    private javax.swing.JButton comida;
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
    private javax.swing.JTextField textoTiempo;
    // End of variables declaration//GEN-END:variables
}
