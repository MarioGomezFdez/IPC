/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.ui;
 import Inscripcion.main.Inscripcion;
/**
 * 
 * @author Mario
 */
public class DatosC {
    private DatosV vista;
    
    public DatosC(DatosV vista) {
        this.vista = vista;
    }
    
    public void abreventanaInscripcion(){
        
        Inscripcion.inscripciones();
    }
}
