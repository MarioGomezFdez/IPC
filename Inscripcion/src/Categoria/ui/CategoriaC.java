package Categoria.ui;

import Inscripcion.main.Inscripcion;

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

        if ((total) > 5) {
            catVista.getNota().setText("<html><font color='red'>Nota: un solicitante solo puede pedir 5 participaciones en total</font></html>");
            numCatCorrecto = false;
        }

        if (((catVista.getNombre().equals("Nombre*")) || (catVista.getNombre().getText().equals(""))) || ((catVista.getAp1().getText().equals("Ap1*")) || (catVista.getAp1().getText().equals(""))) || ((catVista.getCorreo().getText().equals("Correo*")) || (catVista.getCorreo().getText().equals("")))) {
            catVista.getAsterisco().setText("<html><font color='red'>*Los campos marcados son obligatorios</font></html>");
            datosCorrecto = false;
        }
        return numCatCorrecto && datosCorrecto;
    }

    public void abreVentanaParticipante() {
        System.out.println("papadopoudos");
        Inscripcion.participantes();
    }

    public void exit() {
        System.exit(0);
    }
}
