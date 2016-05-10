/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Confirmacion.ui;

import javax.swing.UIManager;
import Inscripcion.main.Inscripcion;
/**
 *
 * @author Mario
 */
public class ConfirmacionV extends javax.swing.JFrame {

    ConfirmacionC confC;

    
    public ConfirmacionV(int numParticipantes) {
        initComponents();
        
        int participantes = numParticipantes;
        
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        
        setLocationRelativeTo(null);
        
        setLabels(participantes);
        
        confC = new ConfirmacionC (this);
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanelContenedor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Nombre_1 = new javax.swing.JLabel();
        Ap1_1 = new javax.swing.JLabel();
        Ap2_1 = new javax.swing.JLabel();
        Correo_1 = new javax.swing.JLabel();
        Nif_1 = new javax.swing.JLabel();
        Sexo_1 = new javax.swing.JLabel();
        Categoria_1 = new javax.swing.JLabel();
        Centro_1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Nombre_2 = new javax.swing.JLabel();
        Ap1_2 = new javax.swing.JLabel();
        Ap2_2 = new javax.swing.JLabel();
        Correo_2 = new javax.swing.JLabel();
        Nif_2 = new javax.swing.JLabel();
        Sexo_2 = new javax.swing.JLabel();
        Categoria_2 = new javax.swing.JLabel();
        Centro_2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Nombre_3 = new javax.swing.JLabel();
        Ap1_3 = new javax.swing.JLabel();
        Ap2_3 = new javax.swing.JLabel();
        Correo_3 = new javax.swing.JLabel();
        Nif_3 = new javax.swing.JLabel();
        Sexo_3 = new javax.swing.JLabel();
        Categoria_3 = new javax.swing.JLabel();
        Centro_3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Nombre_4 = new javax.swing.JLabel();
        Ap1_4 = new javax.swing.JLabel();
        Ap2_4 = new javax.swing.JLabel();
        Correo_4 = new javax.swing.JLabel();
        Nif_4 = new javax.swing.JLabel();
        Sexo_4 = new javax.swing.JLabel();
        Categoria_4 = new javax.swing.JLabel();
        Centro_4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Nombre_5 = new javax.swing.JLabel();
        Ap1_5 = new javax.swing.JLabel();
        Ap2_5 = new javax.swing.JLabel();
        Correo_5 = new javax.swing.JLabel();
        Nif_5 = new javax.swing.JLabel();
        Sexo_5 = new javax.swing.JLabel();
        Categoria_5 = new javax.swing.JLabel();
        Centro_5 = new javax.swing.JLabel();
        Pagar = new javax.swing.JButton();
        Volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Confirmacion");

        jScrollPane2.setHorizontalScrollBar(null);
        jScrollPane2.setMaximumSize(new java.awt.Dimension(440, 218));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(440, 1729));
        jScrollPane2.setVerifyInputWhenFocusTarget(false);

        jPanelContenedor.setLayout(new java.awt.GridLayout(5, 1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Primer participante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 150));

        Nombre_1.setText("Nombre");

        Ap1_1.setText("Primer Apellido");

        Ap2_1.setText("Ap2");

        Correo_1.setText("Correo");

        Nif_1.setText("NIF");

        Sexo_1.setText("Sexo");

        Categoria_1.setText("Categoria");

        Centro_1.setText("Centro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Nombre_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ap1_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ap2_1))
                    .addComponent(Correo_1)
                    .addComponent(Nif_1)
                    .addComponent(Sexo_1)
                    .addComponent(Categoria_1)
                    .addComponent(Centro_1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre_1)
                    .addComponent(Ap1_1)
                    .addComponent(Ap2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Correo_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Nif_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sexo_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Categoria_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Centro_1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelContenedor.add(jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Segundo participante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N

        Nombre_2.setText("Nombre");

        Ap1_2.setText("Primer Apellido");

        Ap2_2.setText("Ap2");

        Correo_2.setText("Correo");

        Nif_2.setText("NIF");

        Sexo_2.setText("Sexo");

        Categoria_2.setText("Categoria");

        Centro_2.setText("Centro");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Nombre_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ap1_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ap2_2))
                    .addComponent(Correo_2)
                    .addComponent(Nif_2)
                    .addComponent(Sexo_2)
                    .addComponent(Categoria_2)
                    .addComponent(Centro_2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre_2)
                    .addComponent(Ap1_2)
                    .addComponent(Ap2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Correo_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Nif_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sexo_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Categoria_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Centro_2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelContenedor.add(jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tercer participante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N

        Nombre_3.setText("Nombre");

        Ap1_3.setText("Primer Apellido");

        Ap2_3.setText("Ap2");

        Correo_3.setText("Correo");

        Nif_3.setText("NIF");

        Sexo_3.setText("Sexo");

        Categoria_3.setText("Categoria");

        Centro_3.setText("Centro");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Nombre_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ap1_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ap2_3))
                    .addComponent(Correo_3)
                    .addComponent(Nif_3)
                    .addComponent(Sexo_3)
                    .addComponent(Categoria_3)
                    .addComponent(Centro_3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre_3)
                    .addComponent(Ap1_3)
                    .addComponent(Ap2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Correo_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Nif_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sexo_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Categoria_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Centro_3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelContenedor.add(jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cuarto participante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N

        Nombre_4.setText("Nombre");

        Ap1_4.setText("Primer Apellido");

        Ap2_4.setText("Ap2");

        Correo_4.setText("Correo");

        Nif_4.setText("NIF");

        Sexo_4.setText("Sexo");

        Categoria_4.setText("Categoria");

        Centro_4.setText("Centro");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Nombre_4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ap1_4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ap2_4))
                    .addComponent(Correo_4)
                    .addComponent(Nif_4)
                    .addComponent(Sexo_4)
                    .addComponent(Categoria_4)
                    .addComponent(Centro_4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre_4)
                    .addComponent(Ap1_4)
                    .addComponent(Ap2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Correo_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Nif_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sexo_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Categoria_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Centro_4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelContenedor.add(jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quinto participante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N

        Nombre_5.setText("Nombre");

        Ap1_5.setText("Primer Apellido");

        Ap2_5.setText("Ap2");

        Correo_5.setText("Correo");

        Nif_5.setText("NIF");

        Sexo_5.setText("Sexo");

        Categoria_5.setText("Categoria");

        Centro_5.setText("Centro");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Nombre_5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ap1_5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ap2_5))
                    .addComponent(Correo_5)
                    .addComponent(Nif_5)
                    .addComponent(Sexo_5)
                    .addComponent(Categoria_5)
                    .addComponent(Centro_5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre_5)
                    .addComponent(Ap1_5)
                    .addComponent(Ap2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Correo_5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Nif_5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sexo_5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Categoria_5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Centro_5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelContenedor.add(jPanel5);

        jScrollPane2.setViewportView(jPanelContenedor);

        Pagar.setText("Pagar");
        Pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagarActionPerformed(evt);
            }
        });

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Volver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pagar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pagar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(Volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        confC.volver();
    }//GEN-LAST:event_VolverActionPerformed

    private void PagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagarActionPerformed
        confC.adelante();
    }//GEN-LAST:event_PagarActionPerformed

    /**
     * @param args the command line arguments
     */
   public void setLabels(int participantes){
       
      switch(participantes){
          
          case 5:
              
              Rellena_5();
          
          case 4:
              Rellena_4();
              
          case 3:
              Rellena_3(); 
              
          case 2:
              Rellena_2();  
          case 1:
              Rellena_1();
              break;
              
          }
      }
       
   
   public void Rellena_1(){
       
       Inscripcion.getPersona(0).getNombre();
       
       Nombre_1.setText(Inscripcion.getPersona(0).getNombre());
       Ap1_1.setText(Inscripcion.getPersona(0).getAp1());
       Ap2_1.setText(Inscripcion.getPersona(0).getAp2());
       Categoria_1.setText(Inscripcion.getPersona(0).getCategoria());
       Centro_1.setText(Inscripcion.getPersona(0).getCentro());
       Sexo_1.setText(Inscripcion.getPersona(0).getSexo());
       Nif_1.setText(Inscripcion.getPersona(0).getNif());
       Correo_1.setText(Inscripcion.getPersona(0).getCorreo());
}
   
   public void Rellena_2(){
       
       jPanel2.setVisible(true);
       
       Nombre_2.setText(Inscripcion.getPersona(1).getNombre());
       Ap1_2.setText(Inscripcion.getPersona(1).getAp1());
       Ap2_2.setText(Inscripcion.getPersona(1).getAp2());
       Categoria_2.setText(Inscripcion.getPersona(1).getCategoria());
       Centro_2.setText(Inscripcion.getPersona(1).getCentro());
       Sexo_2.setText(Inscripcion.getPersona(1).getSexo());
       Nif_2.setText(Inscripcion.getPersona(1).getNif());
       Correo_2.setText(Inscripcion.getPersona(1).getCorreo());
   }
   
   public void Rellena_3(){
       
       jPanel3.setVisible(true);
       
       Nombre_3.setText(Inscripcion.getPersona(2).getNombre());
       Ap1_3.setText(Inscripcion.getPersona(2).getAp1());
       Ap2_3.setText(Inscripcion.getPersona(2).getAp2());
       Categoria_3.setText(Inscripcion.getPersona(2).getCategoria());
       Centro_3.setText(Inscripcion.getPersona(2).getCentro());
       Sexo_3.setText(Inscripcion.getPersona(2).getSexo());
       Nif_3.setText(Inscripcion.getPersona(2).getNif());
       Correo_3.setText(Inscripcion.getPersona(2).getCorreo());
   }
   public void Rellena_4(){
       
       jPanel4.setVisible(true);
       
       Nombre_4.setText(Inscripcion.getPersona(3).getNombre());
       Ap1_4.setText(Inscripcion.getPersona(3).getAp1());
       Ap2_4.setText(Inscripcion.getPersona(3).getAp2());
       Categoria_4.setText(Inscripcion.getPersona(3).getCategoria());
       Centro_4.setText(Inscripcion.getPersona(3).getCentro());
       Sexo_4.setText(Inscripcion.getPersona(3).getSexo());
       Nif_4.setText(Inscripcion.getPersona(3).getNif());
       Correo_4.setText(Inscripcion.getPersona(3).getCorreo());
   }
   public void Rellena_5(){
       
       jPanel5.setVisible(true);
       
       Nombre_5.setText(Inscripcion.getPersona(4).getNombre());
       Ap1_5.setText(Inscripcion.getPersona(4).getAp1());
       Ap2_5.setText(Inscripcion.getPersona(4).getAp2());
       Categoria_5.setText(Inscripcion.getPersona(4).getCategoria());
       Centro_5.setText(Inscripcion.getPersona(4).getCentro());
       Sexo_5.setText(Inscripcion.getPersona(4).getSexo());
       Nif_5.setText(Inscripcion.getPersona(4).getNif());
       Correo_5.setText(Inscripcion.getPersona(4).getCorreo());
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ap1_1;
    private javax.swing.JLabel Ap1_2;
    private javax.swing.JLabel Ap1_3;
    private javax.swing.JLabel Ap1_4;
    private javax.swing.JLabel Ap1_5;
    private javax.swing.JLabel Ap2_1;
    private javax.swing.JLabel Ap2_2;
    private javax.swing.JLabel Ap2_3;
    private javax.swing.JLabel Ap2_4;
    private javax.swing.JLabel Ap2_5;
    private javax.swing.JLabel Categoria_1;
    private javax.swing.JLabel Categoria_2;
    private javax.swing.JLabel Categoria_3;
    private javax.swing.JLabel Categoria_4;
    private javax.swing.JLabel Categoria_5;
    private javax.swing.JLabel Centro_1;
    private javax.swing.JLabel Centro_2;
    private javax.swing.JLabel Centro_3;
    private javax.swing.JLabel Centro_4;
    private javax.swing.JLabel Centro_5;
    private javax.swing.JLabel Correo_1;
    private javax.swing.JLabel Correo_2;
    private javax.swing.JLabel Correo_3;
    private javax.swing.JLabel Correo_4;
    private javax.swing.JLabel Correo_5;
    private javax.swing.JLabel Nif_1;
    private javax.swing.JLabel Nif_2;
    private javax.swing.JLabel Nif_3;
    private javax.swing.JLabel Nif_4;
    private javax.swing.JLabel Nif_5;
    private javax.swing.JLabel Nombre_1;
    private javax.swing.JLabel Nombre_2;
    private javax.swing.JLabel Nombre_3;
    private javax.swing.JLabel Nombre_4;
    private javax.swing.JLabel Nombre_5;
    private javax.swing.JButton Pagar;
    private javax.swing.JLabel Sexo_1;
    private javax.swing.JLabel Sexo_2;
    private javax.swing.JLabel Sexo_3;
    private javax.swing.JLabel Sexo_4;
    private javax.swing.JLabel Sexo_5;
    private javax.swing.JButton Volver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
