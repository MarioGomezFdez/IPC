/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.ui;

import Inscripcion.main.Inscripcion;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Mario
 */
public class DatosV extends javax.swing.JFrame {

    DatosC datControl;
    String categoria;
    int numPart;

    /**
     * Creates new form DatosV
     */
    public DatosV(int numPart, int total) {
        initComponents();
        setLocationRelativeTo(null);
        TextNombre.setForeground(Color.GRAY);
        TextAp1.setForeground(Color.GRAY);
        TextAp2.setForeground(Color.GRAY);
        TextCorreo.setForeground(Color.GRAY);
        TextNIF.setForeground(Color.GRAY);
        Continuar.requestFocus();
        datControl = new DatosC(this);
        this.categoria = categoria;
        cambiarBorde(numPart,total);
        System.out.println(datControl.getCategoriaI(numPart));
    }
    public void cambiarBorde(int numPart, int total){
        TitledBorder tmp = (TitledBorder) this.DatosPart.getBorder();
            tmp.setTitle("Datos de usuario "+(numPart+1)+"/"+total+" Categoria: "+datControl.getCategoriaI(numPart));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupCentro = new javax.swing.ButtonGroup();
        GroupSexo = new javax.swing.ButtonGroup();
        DatosPart = new javax.swing.JPanel();
        TextNombre = new javax.swing.JTextField();
        TextAp1 = new javax.swing.JTextField();
        TextAp2 = new javax.swing.JTextField();
        TextCorreo = new javax.swing.JTextField();
        TextNIF = new javax.swing.JTextField();
        RellenarChk = new javax.swing.JCheckBox();
        ButHombre = new javax.swing.JRadioButton();
        ButMujer = new javax.swing.JRadioButton();
        Centro = new javax.swing.JLabel();
        ButUVa = new javax.swing.JRadioButton();
        ButOtro = new javax.swing.JRadioButton();
        ButNinguno = new javax.swing.JRadioButton();
        Sexo = new javax.swing.JLabel();
        Continuar = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        Fecha = new javax.swing.JLabel();
        CmbDia = new javax.swing.JComboBox<>();
        CmbMes = new javax.swing.JComboBox<>();
        CmbAno = new javax.swing.JComboBox<>();
        OtraUni = new javax.swing.JPanel();
        TextOtraUni = new javax.swing.JTextField();
        Nota = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inscripcion");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        DatosPart.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Participante"));

        TextNombre.setText("Nombre*");
        TextNombre.setNextFocusableComponent(TextAp1);
        TextNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextNombreFocusLost(evt);
            }
        });

        TextAp1.setText("Primer apellido*");
        TextAp1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextAp1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextAp1FocusLost(evt);
            }
        });

        TextAp2.setText("Segundo apellido");
        TextAp2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextAp2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextAp2FocusLost(evt);
            }
        });

        TextCorreo.setText("Correo*");
        TextCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextCorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextCorreoFocusLost(evt);
            }
        });

        TextNIF.setText("NIF*");
        TextNIF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextNIF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextNIFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextNIFFocusLost(evt);
            }
        });

        RellenarChk.setText("Rellenar con datos del solicitante");
        RellenarChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RellenarChkActionPerformed(evt);
            }
        });

        GroupSexo.add(ButHombre);
        ButHombre.setSelected(true);
        ButHombre.setText("Hombre");

        GroupSexo.add(ButMujer);
        ButMujer.setText("Mujer");

        Centro.setText("Centro del que procede");

        GroupCentro.add(ButUVa);
        ButUVa.setSelected(true);
        ButUVa.setText("UVa");
        ButUVa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButUVaActionPerformed(evt);
            }
        });

        GroupCentro.add(ButOtro);
        ButOtro.setText("Otro");
        ButOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButOtroActionPerformed(evt);
            }
        });

        GroupCentro.add(ButNinguno);
        ButNinguno.setText("Ninguno");
        ButNinguno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButNingunoActionPerformed(evt);
            }
        });

        Sexo.setText("Sexo");

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

        Fecha.setText("Fecha de Nacimiento");

        CmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        CmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        CmbAno.setModel(new javax.swing.DefaultComboBoxModel<>(creaFechas()));

        OtraUni.setLayout(new java.awt.BorderLayout());
        OtraUni.add(TextOtraUni, java.awt.BorderLayout.CENTER);

        OtraUni.setVisible(false);

        Nota.setText("<html><font color='red'>*</font>Campos obligatorios</html>");
        Nota.setMaximumSize(new java.awt.Dimension(66, 34));
        Nota.setMinimumSize(new java.awt.Dimension(66, 34));
        Nota.setPreferredSize(new java.awt.Dimension(66, 34));

        javax.swing.GroupLayout DatosPartLayout = new javax.swing.GroupLayout(DatosPart);
        DatosPart.setLayout(DatosPartLayout);
        DatosPartLayout.setHorizontalGroup(
            DatosPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPartLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DatosPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosPartLayout.createSequentialGroup()
                        .addGroup(DatosPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextNIF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextAp2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextAp1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DatosPartLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(ButUVa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButNinguno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButOtro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(OtraUni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(TextNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Centro, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(DatosPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RellenarChk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Nota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosPartLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Volver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Continuar))
                    .addGroup(DatosPartLayout.createSequentialGroup()
                        .addGroup(DatosPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fecha)
                            .addComponent(Sexo)
                            .addGroup(DatosPartLayout.createSequentialGroup()
                                .addComponent(ButHombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButMujer))
                            .addGroup(DatosPartLayout.createSequentialGroup()
                                .addComponent(CmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CmbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        DatosPartLayout.setVerticalGroup(
            DatosPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPartLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DatosPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RellenarChk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DatosPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DatosPartLayout.createSequentialGroup()
                        .addComponent(TextAp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextAp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextNIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sexo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DatosPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButHombre)
                    .addComponent(ButMujer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Fecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DatosPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Centro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DatosPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButUVa)
                        .addComponent(ButNinguno)
                        .addComponent(ButOtro))
                    .addComponent(OtraUni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DatosPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Continuar)
                    .addComponent(Volver))
                .addContainerGap())
        );

        getContentPane().add(DatosPart, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RellenarChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RellenarChkActionPerformed
        if (RellenarChk.isSelected()) {
            
            TextNombre.setEnabled(false);
            TextAp1.setEnabled(false);
            TextAp2.setEnabled(false);
            TextCorreo.setEnabled(false);
            
            TextNombre.setText(Inscripcion.getPersona(0).getNombre());
            TextAp1.setText(Inscripcion.getPersona(0).getAp1());
            if((Inscripcion.getPersona(0).getAp2()).equals("")){
                TextAp2.setEnabled(true);
            }else{
                TextAp2.setText(Inscripcion.getPersona(0).getAp2());
            }
            TextCorreo.setText(Inscripcion.getPersona(0).getCorreo());
            
        } else {
            TextNombre.setEnabled(true);
            TextAp1.setEnabled(true);
            TextAp2.setEnabled(true);
            TextCorreo.setEnabled(true);
        }
    }//GEN-LAST:event_RellenarChkActionPerformed

    private void ButOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButOtroActionPerformed
        OtraUniVisible();
    }//GEN-LAST:event_ButOtroActionPerformed

    private void ButNingunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButNingunoActionPerformed
        OtraUniVisible();
    }//GEN-LAST:event_ButNingunoActionPerformed

    private void ButUVaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButUVaActionPerformed
        OtraUniVisible();
    }//GEN-LAST:event_ButUVaActionPerformed

    private void TextNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextNombreFocusGained
        TextNombre.setForeground(Color.BLACK);
        if (TextNombre.getText().equals("Nombre*")) {
            TextNombre.setText("");
        }
    }//GEN-LAST:event_TextNombreFocusGained

    private void TextNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextNombreFocusLost
        if (TextNombre.getText().equals("")) {
            TextNombre.setText("Nombre*");
            TextNombre.setForeground(Color.GRAY);
        }


    }//GEN-LAST:event_TextNombreFocusLost

    private void TextAp1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextAp1FocusGained
        TextAp1.setForeground(Color.BLACK);
        if (TextAp1.getText().equals("Primer apellido*")) {
            TextAp1.setText("");
        }
    }//GEN-LAST:event_TextAp1FocusGained

    private void TextAp1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextAp1FocusLost
        if (TextAp1.getText().equals("")) {
            TextAp1.setText("Primer apellido*");
            TextAp1.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_TextAp1FocusLost

    private void TextAp2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextAp2FocusGained
        TextAp2.setForeground(Color.BLACK);
        if (TextAp2.getText().equals("Segundo apellido")) {
            TextAp2.setText("");
        }
    }//GEN-LAST:event_TextAp2FocusGained

    private void TextAp2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextAp2FocusLost
        if (TextAp2.getText().equals("")) {
            TextAp2.setText("Segundo apellido");
            TextAp2.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_TextAp2FocusLost

    private void TextCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextCorreoFocusGained
        TextCorreo.setForeground(Color.BLACK);
        if (TextCorreo.getText().equals("Correo*")) {
            TextCorreo.setText("");
        }
    }//GEN-LAST:event_TextCorreoFocusGained

    private void TextCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextCorreoFocusLost
        if (TextCorreo.getText().equals("")) {
            TextCorreo.setText("Correo*");
            TextCorreo.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_TextCorreoFocusLost

    private void TextNIFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextNIFFocusGained
        TextNIF.setForeground(Color.BLACK);
        if (TextNIF.getText().equals("NIF*")) {
            TextNIF.setText("");
        }
    }//GEN-LAST:event_TextNIFFocusGained

    private void TextNIFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextNIFFocusLost
        if (TextNIF.getText().equals("")) {
            TextNIF.setText("NIF*");
            TextNIF.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_TextNIFFocusLost

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        datControl.abreAnterior();
    }//GEN-LAST:event_VolverActionPerformed

    private void ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinuarActionPerformed
        if (datControl.validacion()) {
            datControl.abreSiguiente();
        }
    }//GEN-LAST:event_ContinuarActionPerformed

    public String[] creaFechas() {
        String[] fechas = new String[99];
        for (int i = 0; i <= 98; i++) {
            fechas[98 - i] = Integer.toString(i + 1900);
        }
        return fechas;
    }

    public void OtraUniVisible() {
        if (ButOtro.isSelected()) {
            OtraUni.setVisible(true);
        } else {
            OtraUni.setVisible(false);
        }
    }
    public javax.swing.JTextField getNombre() {
        return TextNombre;
    }

    public javax.swing.JTextField getAp1() {
        return TextAp1;
    }
    
    public javax.swing.JTextField getAp2() {
        return TextAp2;
    }

    public javax.swing.JTextField getCorreo() {
        return TextCorreo;
    }
    
    public int getDia() {
        return Integer.parseInt(CmbDia.getSelectedItem().toString());
    }
    
    public String getMes() {
        return (String)CmbMes.getSelectedItem().toString();
    }
    
    public int getAno() {
        return Integer.parseInt(CmbAno.getSelectedItem().toString());
    }
    
     public javax.swing.JTextField getNIF() {
        return TextNIF;
    }
     
    public boolean getHombre() {
        return ButHombre.isSelected();
    }
    
    public String getCentro() {
        if (ButUVa.isSelected()){ return "UVa";
        } else if (ButNinguno.isSelected()) { return "Sin centro";
        } return TextOtraUni.getText();
    }
     
    public javax.swing.JLabel getNota() {
        return Nota;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ButHombre;
    private javax.swing.JRadioButton ButMujer;
    private javax.swing.JRadioButton ButNinguno;
    private javax.swing.JRadioButton ButOtro;
    private javax.swing.JRadioButton ButUVa;
    private javax.swing.JLabel Centro;
    private javax.swing.JComboBox<String> CmbAno;
    private javax.swing.JComboBox<String> CmbDia;
    private javax.swing.JComboBox<String> CmbMes;
    private javax.swing.JButton Continuar;
    private javax.swing.JPanel DatosPart;
    private javax.swing.JLabel Fecha;
    private javax.swing.ButtonGroup GroupCentro;
    private javax.swing.ButtonGroup GroupSexo;
    private javax.swing.JLabel Nota;
    private javax.swing.JPanel OtraUni;
    private javax.swing.JCheckBox RellenarChk;
    private javax.swing.JLabel Sexo;
    private javax.swing.JTextField TextAp1;
    private javax.swing.JTextField TextAp2;
    private javax.swing.JTextField TextCorreo;
    private javax.swing.JTextField TextNIF;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JTextField TextOtraUni;
    private javax.swing.JButton Volver;
    // End of variables declaration//GEN-END:variables
}
