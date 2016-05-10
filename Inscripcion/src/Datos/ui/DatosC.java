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
