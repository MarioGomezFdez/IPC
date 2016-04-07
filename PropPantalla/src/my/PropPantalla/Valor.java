/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.PropPantalla;

/**
 *
 * @author Mario
 * @author Miguel
 */
public class Valor {

    private int brillo, contraste, resolucion, color, orient;

    public Valor() {
        brillo = 0;
        contraste = 0;
        resolucion = 0;
        color = 0;
        orient = 0;
    }

    public Valor(int brillo, int contraste, int resolucion, int color, int orient) {
        this.brillo = brillo;
        this.contraste = contraste;
        this.resolucion = resolucion;
        this.color = color;
        this.orient = orient;
    }

    public void setBrillo(int brillo) {
        this.brillo = brillo;
    }

    public void setContraste(int contraste) {
        this.contraste = contraste;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setOrient(int orient) {
        this.orient = orient;
    }

    public int getBrillo() {
        return brillo;
    }

    public int getContraste() {
        return contraste;
    }

    public int getResolucion() {
         return resolucion;
    }

    public int getColor() {
    return color;
    }

    public int getOrient() {
        return orient;
    }

}
