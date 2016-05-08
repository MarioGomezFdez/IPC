/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inscripcion.main;

import Categoria.ui.CategoriaSM;
import Datos.ui.*;
import javax.swing.UIManager;

/**
 *
 * @author Miguel
 */
public class Inscripcion {

    private static CategoriaSM categoriaSM;
    private static DatosSM datosSM;

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

    }

    public static void participantes() {
        categoriaSM.hide();
        datosSM = new DatosSM();
    }
    public static void inscripciones (){
        
        datosSM.hide();
        categoriaSM.show();
    }

    public static CategoriaSM getCategoriaSM() {
        return categoriaSM;
    }

    public static DatosSM getDatosSM() {
        return datosSM;
    }

}
