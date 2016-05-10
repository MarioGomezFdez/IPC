/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacion.ui;

import Inscripcion.main.Inscripcion;

/**
 *
 * @author Mario Gomez Fernandez
 * @author Miguel Bayorn Sanz
 */

public class ValidacionC {

    ValidacionV valVista;

    /**
     * Constructor del controlador de Validacion
     *
     * @param valVista vista de Validacion
     */
    public ValidacionC(ValidacionV valVista) {
        this.valVista = valVista;
    }

    /**
     * Funcion que termina el programa al rellenar todo
     */
    public void Salir() {
        System.exit(0);
    }

    /**
     * Comprueba que todos los campos de la vista esten correctamente rellenos
     *
     * @return true si esta todo correcto
     */
    public boolean Validar() {
        boolean rellenos = false;

        if (((!valVista.getUsuario().equals("") && !valVista.getContraseña().equals(""))) || valVista.getNoCuenta() == true) {
            rellenos = true;
        } else {
            valVista.getInstrucciones().setText("<html><font color='red'>Usuario y contraseña son obligatorios</font></html>");
        }

        return rellenos;
    }

    /**
     * Funcion del boton volver
     */
    public void Volver() {
        Inscripcion.ValidacionToConfirmacion();
    }

}
