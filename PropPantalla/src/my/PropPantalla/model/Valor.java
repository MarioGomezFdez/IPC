package my.PropPantalla.model;

/**
 *
 * @author Mario Gomez Fernandez
 * @author Miguel Bayon Sanz Grupo L2_02
 */
public class Valor {

    private int brillo, contraste, resolucion, color, orient;

    /**
     * Constructor vacio de la clase Valor, que representa las propiedades de
     * PropPantalla
     */
    public Valor() {
        brillo = 0;
        contraste = 0;
        resolucion = 0;
        color = 0;
        orient = 0;
    }

    /**
     * Constructor de Valor con parametros introducidos externamente
     *
     * @param brillo entero con el valor del jSlider brillo
     * @param contraste entero con el valor del jSlider Contraste
     * @param resolucion entero con la posicion del jComboBox resolucion
     * @param color entero con la posicion del jComboBox color
     * @param orient entero con la opcion seleccionada de la orientacion
     */
    public Valor(int brillo, int contraste, int resolucion, int color, int orient) {
        this.brillo = brillo;
        this.contraste = contraste;
        this.resolucion = resolucion;
        this.color = color;
        this.orient = orient;
    }

    /**
     * setBrillo setter de la variable brillo
     *
     * @param brillo entero con el valor de brillo
     */
    public void setBrillo(int brillo) {
        this.brillo = brillo;
    }

    /**
     * setContraste setter de la variable contraste
     *
     * @param contraste entero con el valor de contraste
     */
    public void setContraste(int contraste) {
        this.contraste = contraste;
    }

    /**
     * setResolucion setter de la variable resolucion
     *
     * @param resolucion entero con el valor de resolucion
     */
    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    /**
     * setColor setter de la variable color
     *
     * @param color entero con el valor de color
     */
    public void setColor(int color) {
        this.color = color;
    }

    /**
     * setOrient setter de la variable orient
     *
     * @param orient entero con el valor de orient
     */
    public void setOrient(int orient) {
        this.orient = orient;
    }

    /**
     * getBrillo geter de la variable brillo
     *
     * @return brillo entero con el valor de brillo
     */
    public int getBrillo() {
        return brillo;
    }

    /**
     * getContraste geter de la variable contraste
     *
     * @return contraste entero con el valor de contraste
     */
    public int getContraste() {
        return contraste;
    }

    /**
     * getResolucion geter de la variable resolucion
     *
     * @return resolucion entero con el valor de resolucion
     */
    public int getResolucion() {
        return resolucion;
    }

    /**
     * getColor geter de la variable color
     *
     * @return color entero con el valor de color
     */
    public int getColor() {
        return color;
    }

    /**
     * getOrient geter de la variable orient
     *
     * @return orient entero con el valor de orient
     */
    public int getOrient() {
        return orient;
    }

}
