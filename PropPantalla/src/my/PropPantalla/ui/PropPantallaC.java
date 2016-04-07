/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.PropPantalla.ui;

import my.PropPantalla.ui.PropPantallaV;
import my.PropPantalla.model.Valor;
import java.io.*;

/**
 *
 * @author Mario Gomez Fernandez
 * @author Miguel Bayon Sanz Grupo L2_02
 */
public class PropPantallaC {

    private Valor valor;

    private PropPantallaV vista;

    /**
     * Clase con las funciones de PropPantallaV
     *
     * @param vista PropPantallaV con la imagen de PropPantalla
     */
    public PropPantallaC(PropPantallaV vista) {
        this.vista = vista;
        valor = new Valor();

        leer();

    }

    /**
     * aceptar funcion con las acciones del boton aceptar de la vista
     */
    public void aceptar() {
        guardar();
        exit();
    }

    /**
     * guardar guarda las propiedades de pantalla seleccionadas en la vista
     */
    public void guardar() {
        valor.setBrillo(vista.getBrillo());
        valor.setColor(vista.getColor());
        valor.setContraste(vista.getContraste());
        valor.setOrient(vista.getOrient());
        valor.setResolucion(vista.getResolucion());
        escribir();
    }

    /**
     * escribir introduce los datos de la clase Valor en el fichero data.txt
     */
    public void escribir() {
        int linea = 0;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));) {
            while (linea < 5) {

                switch (linea) {
                    case 0:
                        bw.write(Integer.toString(valor.getBrillo()) + "\n");
                        break;
                    case 1:
                        bw.write(Integer.toString(valor.getContraste()) + "\n");
                        break;
                    case 2:
                        bw.write(Integer.toString(valor.getResolucion()) + "\n");
                        break;
                    case 3:
                        bw.write(Integer.toString(valor.getColor()) + "\n");
                        break;
                    case 4:
                        bw.write(Integer.toString(valor.getOrient()) + "\n");
                        break;

                }

                linea++;
                bw.flush();
            }

        } catch (IOException e) {

        }

    }

    /**
     * leer coge los datos del fichero data.txt y los introduce en la clase
     * Valor
     */
    public void leer() {
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"));) {
            String linea = "a";
            while (linea != null) {
                linea = br.readLine();

                switch (contador) {
                    case 0:
                        valor.setBrillo(Integer.parseInt(linea));
                        vista.setBrillo(valor.getBrillo());
                        break;
                    case 1:
                        valor.setContraste(Integer.parseInt(linea));
                        vista.setContraste(valor.getContraste());
                        break;
                    case 2:
                        valor.setResolucion(Integer.parseInt(linea));
                        vista.setResolucion(valor.getResolucion());
                        break;
                    case 3:
                        valor.setColor(Integer.parseInt(linea));
                        vista.setColor(valor.getColor());
                        break;
                    case 4:
                        valor.setOrient(Integer.parseInt(linea));
                        vista.setOrient(valor.getOrient());
                        break;

                }
                contador++;
            }
        } catch (IOException e) {

        }

    }

    /**
     * exit cierra el programa con normalidad
     */
    public void exit() {
        System.exit(0);
    }

}
