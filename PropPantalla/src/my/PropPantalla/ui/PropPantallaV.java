package my.PropPantalla.ui;

/**
 *
 * @author Mario Gomez Fernandez
 * @author Miguel Bayon Sanz Grupo L2_02
 */
public class PropPantallaV extends javax.swing.JFrame {

    /**
     * Creates new form PropPantallaV
     */
    private PropPantallaC control;

    public PropPantallaV() {
        initComponents();

        this.control = new PropPantallaC(this);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        horizontal = new javax.swing.JRadioButton();
        vertical = new javax.swing.JRadioButton();
        h_invertido = new javax.swing.JRadioButton();
        v_invertido = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        coloresCB = new javax.swing.JComboBox<>();
        cancelar = new javax.swing.JButton();
        aplicar = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();
        brillo = new javax.swing.JSlider();
        contraste = new javax.swing.JSlider();
        jPanel5 = new javax.swing.JPanel();
        resolucionCB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Giro"));

        buttonGroup1.add(horizontal);
        horizontal.setSelected(true);
        horizontal.setText("Horizontal (0º)");

        buttonGroup1.add(vertical);
        vertical.setText("Vertical (90º)");

        buttonGroup1.add(h_invertido);
        h_invertido.setText("Horizontal invertido (180º)");

        buttonGroup1.add(v_invertido);
        v_invertido.setText("Vertical invertido (270º)");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(horizontal)
                    .addComponent(vertical)
                    .addComponent(h_invertido)
                    .addComponent(v_invertido))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(horizontal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vertical)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(h_invertido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(v_invertido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Colores"));
        jPanel6.setPreferredSize(new java.awt.Dimension(287, 65));

        coloresCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LCD color", "Adobe RGB", "HD 709-A", "Perfil RGB generico", "SD 170M-A" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(coloresCB, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(coloresCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        aplicar.setText("Aplicar");
        aplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicarActionPerformed(evt);
            }
        });

        aceptar.setText("Aceptar");
        aceptar.setToolTipText("");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        brillo.setValue(100);
        brillo.setBorder(javax.swing.BorderFactory.createTitledBorder("Brillo"));

        contraste.setBorder(javax.swing.BorderFactory.createTitledBorder("Contraste"));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Resolución"));
        jPanel5.setPreferredSize(new java.awt.Dimension(236, 65));

        resolucionCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1366x768", "1024x768", "1280x1024", "1280x800", "1920x1080", "800x600" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(resolucionCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(104, 104, 104))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(resolucionCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(brillo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(contraste, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(aceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aplicar)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(112, 112, 112))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(contraste, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(brillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aceptar)
                            .addComponent(cancelar)
                            .addComponent(aplicar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * cancelarActionPerformed llama a la funcion del boton cancelar
     *
     * @param evt evento que activa la funcion de cancelar
     */
    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        control.exit();
    }//GEN-LAST:event_cancelarActionPerformed

    /**
     * aceptarActionPerformed llama a la funcion del boton aceptar
     *
     * @param evt evento que activa la funcion de aceptar
     */
    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        control.aceptar();
    }//GEN-LAST:event_aceptarActionPerformed

    /**
     * aplicarActionPerformed llama a la funcion del boton aplicar
     *
     * @param evt evento que activa la funcion de aplicar
     */
    private void aplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicarActionPerformed
        control.guardar();
    }//GEN-LAST:event_aplicarActionPerformed

    /**
     * getBrillo getter del parametro valor del jSlider brillo
     *
     * @return entero con la posicion de brillo
     */
    public int getBrillo() {
        return brillo.getValue();
    }

    /**
     * getContraste getter del parametro valor del jSlider contraste
     *
     * @return entero con la posicion de contraste
     */
    public int getContraste() {
        return contraste.getValue();
    }

    /**
     * getResolucion getter de la posicion del JComboBox resolucionCB
     *
     * @return entero con la posicion de la opcion escogida
     */
    public int getResolucion() {
        return resolucionCB.getSelectedIndex();
    }

    /**
     * getResolucion getter de la posicion del JComboBox coloresCB
     *
     * @return entero con la posicion de la opcion escogida
     */
    public int getColor() {
        return coloresCB.getSelectedIndex();
    }

    /**
     * getResolucion indica cual de los jRadioButton de posicion esta activado
     *
     * @return entero con la posicion de la opcion escogida
     */
    public int getOrient() {
        if (horizontal.isSelected()) {
            return 0;
        } else if (vertical.isSelected()) {
            return 1;
        } else if (v_invertido.isSelected()) {
            return 2;
        } else if (h_invertido.isSelected()) {
            return 3;
        }
        return 0;
    }

    /**
     * setBrillo setter del parametro del jSlider brillo
     *
     * @param brillo entero con el nuevo brillo
     */
    public void setBrillo(int brillo) {
        this.brillo.setValue(brillo);
    }

    /**
     * setBrillo setter del parametro del jSlider contraste
     *
     * @param contraste entero con el nuevo contraste
     */
    public void setContraste(int contraste) {
        this.contraste.setValue(contraste);
    }

    /**
     * setResolucion setter de la nueva posicion del jComboBox resolucion
     *
     * @param resolucion entero con la nueva posicion de resolucion
     */
    public void setResolucion(int resolucion) {
        this.resolucionCB.setSelectedIndex(resolucion);
    }

    /**
     * setResolucion setter de la nueva posicion del jComboBox coloresCB
     *
     * @param color entero con la nueva posicion de coloresCB
     */
    public void setColor(int color) {
        this.coloresCB.setSelectedIndex(color);
    }

    /**
     * setOrient setter que establece cual de las cuatro orientaciones esta
     * seleccionada
     *
     * @param orient int con la orientacion seleccionada
     */
    public void setOrient(int orient) {
        switch (orient) {
            case 0:
                horizontal.setSelected(true);
                break;
            case 1:
                vertical.setSelected(true);
                break;
            case 2:
                v_invertido.setSelected(true);
                break;
            case 3:
                h_invertido.setSelected(true);
                break;
            default:
                horizontal.setSelected(true);
        }

    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton aplicar;
    private javax.swing.JSlider brillo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox<String> coloresCB;
    private javax.swing.JSlider contraste;
    private javax.swing.JRadioButton h_invertido;
    private javax.swing.JRadioButton horizontal;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JComboBox<String> resolucionCB;
    private javax.swing.JRadioButton v_invertido;
    private javax.swing.JRadioButton vertical;
    // End of variables declaration//GEN-END:variables
}