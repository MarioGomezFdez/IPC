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
 * @author Miguel
 */
public class Inscripcion {

    private static CategoriaSM categoriaSM;
    private static DatosSM datosSM;
    private static ConfirmacionSM confSM;
    private static ValidacionSM validSM;
    private static ArrayList<Persona> personas;
    private static ArrayList<String> categorias;
    
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

    public static void addPersona(Persona nuevaPersona){
        personas.add(nuevaPersona);
    }
    
    public static void removeLista(){
        personas.clear();
    }
    
    public static Persona getPersona (int i){
        //Por defecto y motivos de codigo, la posicion 0 sera el solicitante
        return personas.get(i);
    }
    
    //Movimiento entre ventanas
    public static void categoriaToDatos(int numParticipantes) {
        categoriaSM.hide();
        categorias = categoriaSM.getVentana().getCategoria();
        datosSM = new DatosSM(numParticipantes);
    }
    
    public static ArrayList<String> getCategorias () {
        return categorias;
    }
    
    public static void datosToCategoria (){
        datosSM.hide();
        categoriaSM.show();
    }
    
    public static void datosToConfirmacion(int numParticipantes){
        datosSM.hide();//deberia hacer dispose seguramente. deberia hacer un dispose para todas las ventanas
        confSM = new ConfirmacionSM(numParticipantes);
    }
    
    public static void ConfirmacionToDatos(){
        confSM.close();
        datosSM.show();
    }
    public static void ConfirmacionToValidacion(){
        confSM.hide();
        validSM = new ValidacionSM();
    }
    public static void ValidacionToConfirmacion(){
        validSM.close();
        confSM.show();
    }

    //Getters de maquinas de estado
    public static CategoriaSM getCategoriaSM() {
        return categoriaSM;
    }

    public static DatosSM getDatosSM() {
        return datosSM;
    }
    
    public static ConfirmacionSM getConfSM(){
        return confSM;
    }
    public static ValidacionSM getValidSM(){
        return validSM;
    }
}
