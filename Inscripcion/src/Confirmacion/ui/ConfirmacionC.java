/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Confirmacion.ui;

import Inscripcion.main.Inscripcion;

/**
 *
 * @author Miguel
 */
public class ConfirmacionC {
    
    ConfirmacionV confV;
    
    public ConfirmacionC(ConfirmacionV confV){
        this.confV = confV;
    }

    public void volver() {
       Inscripcion.ConfirmacionToDatos();
    }
    public void adelante(){
        Inscripcion.ConfirmacionToValidacion();
    }
    
    
}
