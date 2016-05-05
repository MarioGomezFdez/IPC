/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Categoria.ui;
import java.awt.Color;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerModel;
import javax.swing.UIManager;
/**
 *
 * @author Mario
 */
public class CategoriaV extends javax.swing.JFrame {

    /**
     * Creates new form CategoriaV
     */
    public CategoriaV() {
        initComponents();
        Nombre_text.setForeground(Color.GRAY);
        Ap1_text.setForeground(Color.GRAY);
        Ap2_text.setForeground(Color.GRAY);
        Correo_text.setForeground(Color.GRAY);
        Continuar.requestFocus();
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
        Absoluta_chk = new javax.swing.JCheckBox();
        AbsolutaSex_chk = new javax.swing.JCheckBox();
        Alumnos_chk = new javax.swing.JCheckBox();
        Profesores_chk = new javax.swing.JCheckBox();
        Absoluta_spn = new javax.swing.JSpinner();
        AbsolutaSex_spn = new javax.swing.JSpinner();
        Alumnos_spn = new javax.swing.JSpinner();
        Profesores_spn = new javax.swing.JSpinner();
        Nota = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Nombre_text = new javax.swing.JTextField();
        Ap1_text = new javax.swing.JTextField();
        Ap2_text = new javax.swing.JTextField();
        Correo_text = new javax.swing.JTextField();
        Asterisco = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        Continuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Categoria");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoria"));

        Absoluta_chk.setText("Absoluta");

        AbsolutaSex_chk.setText("Absoluta por sexo");

        Alumnos_chk.setText("Alumnos");

        Profesores_chk.setText("Profesores");

        Absoluta_spn.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        Absoluta_spn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Absoluta_spnStateChanged(evt);
            }
        });

        AbsolutaSex_spn.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        Alumnos_spn.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        Profesores_spn.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        Nota.setText("<html><font color='red'>Nota</font>: un solicitante solo puede pedir 5 participaciones en total</html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Absoluta_chk)
                            .addComponent(Alumnos_chk)
                            .addComponent(Profesores_chk)
                            .addComponent(AbsolutaSex_chk))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Alumnos_spn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Profesores_spn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AbsolutaSex_spn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Absoluta_spn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Nota))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nota)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Absoluta_chk, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Absoluta_spn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AbsolutaSex_chk, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AbsolutaSex_spn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Alumnos_chk, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Alumnos_spn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Profesores_chk, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Profesores_spn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Solicitante"));

        Nombre_text.setText("Nombre*");
        Nombre_text.setNextFocusableComponent(Continuar);
        Nombre_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Nombre_textFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Nombre_textFocusLost(evt);
            }
        });

        Ap1_text.setText("Primer apellido*");
        Ap1_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Ap1_textFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Ap1_textFocusLost(evt);
            }
        });

        Ap2_text.setText("Segundo apellido");
        Ap2_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Ap2_textFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Ap2_textFocusLost(evt);
            }
        });

        Correo_text.setText("Correo*");
        Correo_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Correo_textFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Correo_textFocusLost(evt);
            }
        });

        Asterisco.setText("<html><font color='red'>*</font>Los campos marcados son obligatorios</html>");
        Asterisco.setNextFocusableComponent(Continuar);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Ap1_text, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(Nombre_text))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Correo_text)
                                .addComponent(Ap2_text, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                            .addComponent(Asterisco))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Asterisco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nombre_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ap1_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ap2_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Correo_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Salir.setText("Salir");

        Continuar.setText("Continuar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Salir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Continuar)
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Nombre_textFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Nombre_textFocusGained
        Nombre_text.setForeground(Color.BLACK);
        if(Nombre_text.getText().equals("Nombre*")){
             Nombre_text.setText("");
        }
    }//GEN-LAST:event_Nombre_textFocusGained

    private void Nombre_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Nombre_textFocusLost
       if(Nombre_text.getText().equals("")){

            Nombre_text.setText("Nombre*");
            Nombre_text.setForeground(Color.GRAY);
            
            
      }
    }//GEN-LAST:event_Nombre_textFocusLost

    private void Ap1_textFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Ap1_textFocusGained
        Ap1_text.setForeground(Color.BLACK);
        if(Ap1_text.getText().equals("Primer apellido*")){
             Ap1_text.setText("");
        }
    }//GEN-LAST:event_Ap1_textFocusGained

    private void Ap1_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Ap1_textFocusLost
        if(Ap1_text.getText().equals("")){
            Ap1_text.setText("Primer apellido*");
            Ap1_text.setForeground(Color.GRAY);
       }
    }//GEN-LAST:event_Ap1_textFocusLost

    private void Ap2_textFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Ap2_textFocusGained
        Ap2_text.setForeground(Color.BLACK);
        if(Ap2_text.getText().equals("Segundo apellido")){
             Ap2_text.setText("");
        }
    }//GEN-LAST:event_Ap2_textFocusGained

    private void Ap2_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Ap2_textFocusLost
     
        if(Ap2_text.getText().equals("")){
            Ap2_text.setText("Segundo apellido");
               Ap2_text.setForeground(Color.GRAY);
       }
    }//GEN-LAST:event_Ap2_textFocusLost

    private void Correo_textFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Correo_textFocusGained
        Correo_text.setForeground(Color.BLACK);
        if(Correo_text.getText().equals("Correo*")){
             Correo_text.setText("");
        }
    }//GEN-LAST:event_Correo_textFocusGained

    private void Correo_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Correo_textFocusLost
           if(Correo_text.getText().equals("")){
        Correo_text.setText("Correo*");
        Correo_text.setForeground(Color.GRAY);
       }
    }//GEN-LAST:event_Correo_textFocusLost

    private void Absoluta_spnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Absoluta_spnStateChanged
        Comprobar();
    }//GEN-LAST:event_Absoluta_spnStateChanged
  private SpinnerModel Spinners (int max) {
      SpinnerModel model = new SpinnerNumberModel(max,0,max,1);
      SpinnerModel model1 = new SpinnerNumberModel(0,0,max,1);
      if (max!=5) return model;else {
          return model1;
        }
  } 
  private void Comprobar(){
    
     int a,b,c,d;
     a = (Integer) Absoluta_spn.getValue();
     b = (Integer) AbsolutaSex_spn.getValue();
     c = (Integer) Alumnos_spn.getValue();
     d = (Integer) Profesores_spn.getValue();
     
     if ((a+b+c+d)>5)   {
         System.out.println("Vaia");
         System.out.print(a+b+c+d);
         Absoluta_spn.setModel(Spinners(a));
         AbsolutaSex_spn.setModel(Spinners(b));
         /*
         AbsolutaSex_spn.setModel(Spinners(b));
         Alumnos_spn.setModel(Spinners(c));
         Profesores_spn.setModel(Spinners(d));    
         */
     }else{ 
         Absoluta_spn.setModel(Spinners(5));
         AbsolutaSex_spn.setModel(Spinners(5));
         /*
         AbsolutaSex_spn.setModel(Spinners(5));
         Alumnos_spn.setModel(Spinners(5));
         Profesores_spn.setModel(Spinners(5)); 
       */
     }
  }
    
    
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
            /*
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CategoriaV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoriaV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoriaV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoriaV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new CategoriaV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AbsolutaSex_chk;
    private javax.swing.JSpinner AbsolutaSex_spn;
    private javax.swing.JCheckBox Absoluta_chk;
    private javax.swing.JSpinner Absoluta_spn;
    private javax.swing.JCheckBox Alumnos_chk;
    private javax.swing.JSpinner Alumnos_spn;
    private javax.swing.JTextField Ap1_text;
    private javax.swing.JTextField Ap2_text;
    private javax.swing.JLabel Asterisco;
    private javax.swing.JButton Continuar;
    private javax.swing.JTextField Correo_text;
    private javax.swing.JTextField Nombre_text;
    private javax.swing.JLabel Nota;
    private javax.swing.JCheckBox Profesores_chk;
    private javax.swing.JSpinner Profesores_spn;
    private javax.swing.JButton Salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
