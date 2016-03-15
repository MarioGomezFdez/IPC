/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 * @author Mario
 * @author Miguel
 */
public class ColorChooserVista extends javax.swing.JFrame {

    private ColorChooserControlador controlador;

    /**
     * Creates new form ColorChooser
     */
    public ColorChooserVista() {
        initComponents();
        this.controlador = new ColorChooserControlador(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        slideR = new javax.swing.JSlider();
        slideV = new javax.swing.JSlider();
        slideA = new javax.swing.JSlider();
        tHexad = new javax.swing.JTextField();
        tDec = new javax.swing.JTextField();
        tColor = new javax.swing.JTextField();
        obtener = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(563, 257));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(563, 257));
        jPanel1.setMinimumSize(new java.awt.Dimension(563, 257));

        slideR.setMaximum(255);
        slideR.setMinorTickSpacing(10);
        slideR.setPaintTicks(true);
        slideR.setValue(127);
        slideR.setBorder(javax.swing.BorderFactory.createTitledBorder("Rojo"));
        slideR.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        slideV.setMaximum(255);
        slideV.setMinorTickSpacing(10);
        slideV.setPaintTicks(true);
        slideV.setValue(127);
        slideV.setBorder(javax.swing.BorderFactory.createTitledBorder("Verde"));

        slideA.setMaximum(255);
        slideA.setMinorTickSpacing(10);
        slideA.setPaintTicks(true);
        slideA.setValue(127);
        slideA.setBorder(javax.swing.BorderFactory.createTitledBorder("Azul"));
        slideA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tHexad.setEditable(false);
        tHexad.setText("Pulse el botón Obtener");

        tDec.setEditable(false);
        tDec.setText("Pulse el botón Obtener");

        tColor.setEditable(false);
        tColor.setBackground(new java.awt.Color(255, 255, 255));
        tColor.setMaximumSize(new java.awt.Dimension(46, 46));
        tColor.setMinimumSize(new java.awt.Dimension(46, 46));
        tColor.setPreferredSize(new java.awt.Dimension(46, 46));

        obtener.setText("Obtener");
        obtener.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obtenerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slideR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slideV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slideA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tDec, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tHexad, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(obtener, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(slideR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slideV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slideA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tHexad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tDec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(obtener, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void obtenerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obtenerMouseClicked
        controlador.setColores();
    }//GEN-LAST:event_obtenerMouseClicked

    public int getValorSlideR() {
        return slideR.getValue();
    }

    public int getValorSlideV() {
        return slideV.getValue();
    }

    public int getValorSlideA() {
        return slideA.getValue();
    }

    public void setColor(int rojo, int verde, int azul) {
        tColor.setBackground(new java.awt.Color(rojo, verde, azul));
    }

    public void setNumHexa(String numero) {
        tHexad.setText(numero);
    }

    public void setNumDec(String rojo, String verde, String azul) {
        tDec.setText("[" + rojo + ", " + verde + ", " + azul + "]");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton obtener;
    private javax.swing.JSlider slideA;
    private javax.swing.JSlider slideR;
    private javax.swing.JSlider slideV;
    private javax.swing.JTextField tColor;
    private javax.swing.JTextField tDec;
    private javax.swing.JTextField tHexad;
    // End of variables declaration//GEN-END:variables
}
