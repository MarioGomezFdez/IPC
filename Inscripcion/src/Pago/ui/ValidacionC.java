/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pago.ui;

/**
 *
 * @author Mario
 * 
 */

 
public class ValidacionC {
   ValidacionV valVista;
    
    public ValidacionC(ValidacionV valVista) {
        this.valVista = valVista;
    }
    
    public void Salir(){
        System.exit(0);
    }

    public boolean Validar(){
        boolean rellenos = false;
        
        if(((!valVista.getUsuario().equals("")&&!valVista.getContraseña().equals("")))||valVista.getNoCuenta()==true){
            rellenos = true;
        }else{
            valVista.getInstrucciones().setText("<html><font color='red'>Usuario y contraseña son obligatorios</font></html>");
        }
        
        return rellenos;
    }

 

    
    
    
    
    
}
