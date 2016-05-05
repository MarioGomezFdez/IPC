package Categoria.ui;

/**
 * @author Mario Gomez Fernandez
 * @author Miguel Bayon Sanz
 */
public class CategoriaC {
    
    CategoriaV catVista;
    
    public CategoriaC (CategoriaV catVista){
        this.catVista = catVista;
    }
    
    public boolean validacion (){
        int a,b,c,d, total;
        a = (Integer)catVista.getAbsoluta().getValue();
        b = (Integer)catVista.getAbsolutaSex().getValue();
        c = (Integer)catVista.getAlumnos().getValue();
        d = (Integer)catVista.getProfesores().getValue();
        total = a+b+c+d;
        
        if ((total)>5){
        catVista.Nota.setText("<html><font color='red'>Nota: un solicitante solo puede pedir 5 participaciones en total</font></html>");
        }
        
        if(((catVista.Nombre_text.getText().equals("Nombre*"))||(catVista.Nombre_text.getText().equals("")))||((catVista.Ap1_text.getText().equals("Ap1*"))||(catVista.Ap1_text.getText().equals("")))||((catVista.Correo_text.getText().equals("Correo*"))||(catVista.Correo_text.getText().equals("")))){
          catVista.Asterisco.setText("<html><font color='red'>*Los campos marcados son obligatorios</font></html>");
        }   
        return true;
    }
    
    public void exit() {
        System.exit(0);
    }
}
