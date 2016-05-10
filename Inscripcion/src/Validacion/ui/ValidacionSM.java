/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacion.ui;

import javax.swing.JFrame;

/**
 *
 * @author Mario Gomez Fernandez
 * @author Miguel Bayon Sanz
 */
public class ValidacionSM {

    JFrame ventana = new JFrame();

    /**
     * Constructor que inicializa la ventana
     */
    public ValidacionSM() {
        start();
    }

    /**
     * Inicializa la ventana y la hace visible
     */
    public void start() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ventana = new ValidacionV();
                ventana.setVisible(true);
            }
        });
    }

    /**
     * Oculta la ventana de validacion
     */
    public void hide() {
        ventana.setVisible(false);
    }

    /**
     * Muestra la ventana de validacion
     */
    public void show() {
        ventana.setVisible(true);
    }

    /**
     * Cierra la ventana de validacion
     */
    public void close() {
        ventana.dispose();
    }
}
