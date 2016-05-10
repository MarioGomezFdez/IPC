/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Confirmacion.ui;

import javax.swing.JFrame;

/**
 *
 * @author Miguel
 */
public class ConfirmacionSM {
    
    JFrame ventana = new JFrame();
    
    public ConfirmacionSM(int numParticipantes){
        start();
    }
    
    public void start(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                    ventana = new ConfirmacionV();
                    ventana.setVisible(true);
            }
        });
    }
    
    public void hide(){
        ventana.setVisible(false);
    }
    
    public void show(){
        ventana.setVisible(true);
    }
    
    public void close(){
        ventana.dispose();
    }
}
