/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inscripcion.main;

import Categoria.ui.*;
import Datos.ui.*;
import Confirmacion.ui.*;
import Validacion.ui.*;
import Inscripcion.model.Persona;
import javax.swing.UIManager;
import java.util.ArrayList;

/**
 *
 * @author Mario Gomez Fernandez
 * @author Miguel Bayon Sanz
 */
public class Inscripcion {

    private static CategoriaSM categoriaSM;
    private static DatosSM datosSM;
    private static ConfirmacionSM confSM;
    private static ValidacionSM validSM;
    private static ArrayList<Persona> personas;
    private static ArrayList<String> categorias;

    /**
     * Inicia el main que controla las maquinas de estado de las ventanas
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DatosV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        categoriaSM = new CategoriaSM();
        personas = new ArrayList<Persona>();
    }

    /**
     * Anade una nueva persona a la lista
     *
     * @param nuevaPersona
     */
    public static void addPersona(Persona nuevaPersona) {
        personas.add(nuevaPersona);
    }

    /**
     * Borra la lista entera de personas
     */
    public static void removeLista() {
        personas.clear();
    }

    /**
     * Devuelve la persona buscada en la lista
     *
     * @param i posicion buscada
     * @return persona buscada
     */
    public static Persona getPersona(int i) {
        //Por defecto y motivos de codigo, la posicion 0 sera el solicitante
        return personas.get(i);
    }

    /**
     * getter de la lista de categorias cogidas
     * @return ArrayList con las categorias
     */
    public static ArrayList<String> getCategorias() {
        return categorias;
    }

    //Movimiento entre ventanas
    /**
     * Lleva de la ventana categoria a datos
     * @param numParticipantes
     */
    public static void categoriaToDatos(int numParticipantes) {
        categoriaSM.hide();
        categorias = categoriaSM.getVentana().getCategoria();
        datosSM = new DatosSM(numParticipantes);
    }

    /**
     * Lleva de la ventana de datos a categoria
     */
    public static void datosToCategoria() {
        datosSM.close();
        categorias.clear();
        personas.clear();
        categoriaSM.show();
    }

    /**
     * Lleva de la ventana de datos a la de confirmacion
     * @param numParticipantes 
     */
    public static void datosToConfirmacion(int numParticipantes) {
        datosSM.hide();//deberia hacer dispose seguramente. deberia hacer un dispose para todas las ventanas
        confSM = new ConfirmacionSM(numParticipantes);
    }

    /**
     * Lleva de la ventana de confirmacion a la de datos
     */
    public static void ConfirmacionToDatos() {
        confSM.close();
        for (int i = 0; i < datosSM.getNumParticipantes(); i++) {
            personas.remove(1);
        }
        datosSM.show();
    }

    /**
     * Lleva de la ventana de confirmacion a la de validacion
     */
    public static void ConfirmacionToValidacion() {
        confSM.hide();
        validSM = new ValidacionSM();
    }

    /**
     * Lleva de la ventana de validacion a la de confirmacion
     */
    public static void ValidacionToConfirmacion() {
        validSM.close();
        confSM.show();
    }

    //Getters de maquinas de estado
    /**
     * Devuelve la maquina de estados de Categoria
     * @return categoriaSM
     */
    public static CategoriaSM getCategoriaSM() {
        return categoriaSM;
    }

    /**
     * Devuelve la maquina de estados de Datos
     * @return datosSM
     */
    public static DatosSM getDatosSM() {
        return datosSM;
    }

    /**
     * Devuelve la maquina de estados de Confirmacion
     * @return confSM
     */
    public static ConfirmacionSM getConfSM() {
        return confSM;
    }

    /**
     * Devuelve la maquina de estados de Validacion
     * @return validSM
     */
    public static ValidacionSM getValidSM() {
        return validSM;
    }
}
