/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.ui;

import Inscripcion.main.Inscripcion;
import Inscripcion.model.Persona;

/**
 *
 * @author Mario
 */
public class DatosC {

    DatosV datVista;

    public DatosC(DatosV datVista) {
        this.datVista = datVista;
    }

    public void abreAnterior() {
        Inscripcion.getDatosSM().anterior();
    }

    public void abreSiguiente() {
        
        Inscripcion.getDatosSM().siguiente();
    }

    public Persona getPersona(){
        String ap2="";
        if (!datVista.getAp2().getText().equals("")&&!datVista.getAp2().getText().equals("Segundo apellido")){
            ap2 = datVista.getAp2().getText();
        }
        return new Persona (datVista.getNombre().getText(), datVista.getAp1().getText(), ap2, datVista.getCorreo().getText(), datVista.getDia(), datVista.getMes(), datVista.getAno(), datVista.getCentro(), datVista.getNIF().getText(), datVista.getHombre());
    }
    
    public boolean validacion() {

        boolean datosCorrecto = true;

        if (datVista.getNombre().getText().equals("Nombre*")
                || datVista.getNombre().getText().equals("")
                || datVista.getAp1().getText().equals("Primer apellido*")
                || datVista.getAp1().getText().equals("")
                || datVista.getCorreo().getText().equals("Correo*")
                || datVista.getCorreo().getText().equals("")
                || datVista.getNIF().getText().equals("NIF*")
                || datVista.getNIF().getText().equals("")) {
            datVista.getNota().setText("<html><font color='red'>*Los campos marcados son obligatorios</font></html>");
            System.out.println("Ojocuidao");
            datosCorrecto = false;
        }
        return datosCorrecto;
    }
}
