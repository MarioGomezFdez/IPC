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

    public String getCategoriaI(int i) {
        return Inscripcion.getCategorias().get(i);
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
            datosCorrecto = false;
        }
        if (!datVista.getNombre().getText().matches("^[a-zA-Z]+$")
                || !datVista.getAp1().getText().matches("^[a-zA-Z]+$") 
                || !datVista.getAp2().getText().matches("^[a-zA-Z]+$")){
            
                datVista.getNota().setText("<html><font color='red'>*Introduzca nombre y apellidos validos</font></html>");
                datosCorrecto = false;
        }
        String dni = datVista.getNIF().getText();
        String numero = dni.substring(0,dni.length()-1 );
        String let = dni.substring(dni.length()-1,dni.length());
        if (numero.length()==8){
        for (int i=0; i<8; i++) {
             if(!Character.isDigit(dni.charAt(i))){
                   datosCorrecto = false;
                    datVista.getNota().setText("<html><font color='red'>*Introduzca dni valido</font></html>");
             }
        }  
        }
        if (numero.length()!=8||!Character.isLetter(let.charAt(0))){
            
            datVista.getNota().setText("<html><font color='red'>*Introduzca dni valido</font></html>");
            datosCorrecto=false;
            
        }
        
        
        return datosCorrecto;
    }
}
