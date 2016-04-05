/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PropPantalla.ui;

/**
 *
 * @author Mario Gómez
 * @author Miguel Bayón
 */
public class PropPantallaC {

    private PropPantallaV vista;

    public PropPantallaC(PropPantallaV vista) {
        this.vista = new PropPantallaV();
    }

    public void aceptar() {
        this.guardar();
        this.exit();
    }

    public void guardar() {
        System.out.println("Guardado");
    }

    public void exit() {
        System.exit(0);
    }

}
