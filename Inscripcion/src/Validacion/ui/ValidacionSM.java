/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacion.ui;

import javax.swing.JFrame;

/**
 *
 * @author Miguel
 */
public class ValidacionSM {
    
     JFrame ventana = new JFrame();
    
    public ValidacionSM(){
        start();
    }
    
    public void start(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                    ventana = new ValidacionV();
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
