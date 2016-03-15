/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 * @author Mario
 * @author Miguel
 */
public class ColorChooserControlador {

    private ColorChooserVista vista;

    public ColorChooserControlador(ColorChooserVista vista) {
        this.vista = vista;
    }

    public String toHex() {
        return "#" + toBrowserHexValue(vista.getValorSlideR()) + toBrowserHexValue(vista.getValorSlideV()) + toBrowserHexValue(vista.getValorSlideA());
    }

    private static String toBrowserHexValue(int number) {
        StringBuilder build = new StringBuilder(Integer.toHexString(number & 0xff));
        while (build.length() < 2) {
            build.append("0");
        }
        return build.toString().toUpperCase();
    }
    
    public void setColores(){
        vista.setColor(vista.getValorSlideR(),vista.getValorSlideV(),vista.getValorSlideA());
        vista.setNumHexa(toHex());
        vista.setNumDec(Integer.toString(vista.getValorSlideR()), Integer.toString(vista.getValorSlideV()), Integer.toString(vista.getValorSlideA()));
    }

}
