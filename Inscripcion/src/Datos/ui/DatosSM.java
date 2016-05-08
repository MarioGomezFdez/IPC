/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.ui;

import javax.swing.JFrame;

/**
 *
 * @author Miguel
 */
public class DatosSM {

    private JFrame ventana;

    public DatosSM() {
        start();
    }

    public void start() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ventana = new DatosV();
                ventana.setVisible(true);
            }
        });
    }

}
