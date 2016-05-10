/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.ui;

import Inscripcion.main.Inscripcion;
import Inscripcion.model.Persona;
import javax.swing.JFrame;

/**
 *
 * @author Miguel
 */
public class DatosSM {

    DatosV[] ventana;
    int partActual, numParticipantes;

    public DatosSM(int numParticipantes) {
        ventana = new DatosV[numParticipantes];
        for (int i = 0; i < numParticipantes; i++) {
            ventana[i] = new DatosV();
        }
        this.numParticipantes = numParticipantes;
        partActual = 0;
        start();
    }

    public void start() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                ventana[partActual].setVisible(true);
            }
        });
    }

    public void siguiente() {
        Persona nuevaPersona;
        if (partActual < numParticipantes - 1) {
            hide();
            partActual++;
            show();
        } else {
            for (int i = 0; i < numParticipantes; i++){
                nuevaPersona = ventana[i].datControl.getPersona();
                nuevaPersona.setCategoria(Inscripcion.getCategorias().get(i));
                Inscripcion.addPersona(nuevaPersona);
            }
            
            Inscripcion.datosToConfirmacion(numParticipantes);
        }
    }

    public void anterior() {
        if (partActual > 0) {
            hide();
            partActual--;
            show();
        } else {
            Inscripcion.datosToCategoria();
        }
    }

    public void hide() {
        ventana[partActual].setVisible(false);
    }

    public void show() {
        ventana[partActual].setVisible(true);
    }

    public void close() {
        ventana[partActual].dispose();
    }
}
