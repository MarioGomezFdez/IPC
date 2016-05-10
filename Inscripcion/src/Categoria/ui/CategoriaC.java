package Categoria.ui;

import Inscripcion.main.Inscripcion;
import Inscripcion.model.Persona;

/**
 * @author Mario Gomez Fernandez
 * @author Miguel Bayon Sanz
 */
public class CategoriaC {

    CategoriaSM catSM;
    CategoriaV catVista;

    public CategoriaC(CategoriaV catVista) {
        this.catVista = catVista;
    }

    public boolean validacion() {

        boolean numCatCorrecto = true, datosCorrecto = true;
        int a, b, c, d, total;
        a = (Integer) catVista.getAbsoluta_spn();
        b = (Integer) catVista.getAbsolutaSex_spn();
        c = (Integer) catVista.getAlumnos_spn();
        d = (Integer) catVista.getProfesores_spn();
        total = a + b + c + d;

        if ((total > 5) || (total == 0)) {
            catVista.getNota().setText("<html><font color='red'>Nota: Maximo 5 participaciones, minimo 1</font></html>");
            numCatCorrecto = false;
        }

        if (catVista.getNombre().getText().equals("Nombre*")
                || catVista.getNombre().getText().equals("")
                || catVista.getAp1().getText().equals("Primer apellido*")
                || catVista.getAp1().getText().equals("")
                || catVista.getCorreo().getText().equals("Correo*")
                || catVista.getCorreo().getText().equals("")) {
            catVista.getAsterisco().setText("<html><font color='red'>*Los campos marcados son obligatorios</font></html>");
            datosCorrecto = false;
        }

        return numCatCorrecto && datosCorrecto;
    }

    public void abreVentanaParticipante() {
        Persona newPersona = new Persona(catVista.getNombre().getText(),
                catVista.getAp1().getText(),
                catVista.getCorreo().getText());
        
        if (!catVista.getAp2().getText().equals("")&&!catVista.getAp2().getText().equals("Segundo apellido")){
            newPersona.setAp2(catVista.getAp2().getText());
        }
        
        Inscripcion.addPersona(newPersona);
        Inscripcion.categoriaToDatos((Integer) catVista.getAbsoluta_spn() + (Integer) catVista.getAbsolutaSex_spn() + (Integer) catVista.getAlumnos_spn() + (Integer) catVista.getProfesores_spn());
    }
    

    public void exit() {
        System.exit(0);
    }
}
