package Inscripcion.model;

/**
 *
 * @author Mario Gomez Fernandez
 * @author Miguel Bayon Sanz
 */
public class Persona {

    private String nombre, ap1, ap2, correo, nif, mes, centro;
    private int dia, ano;
    private boolean hombre;

    public Persona(String nombre, String ap1, String correo) {
        this.nombre = nombre;
        this.ap1 = ap1;
        this.correo = correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAp1(String ap1) {
        this.ap1 = ap1;
    }

    public void setAp2(String ap2) {
        this.ap2 = ap2;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setSexo(boolean hombre) {
        this.hombre = hombre;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }
    
    public String getNombre(){
        return nombre;
    }
        
    public String getAp1(){
        return ap1;
    }
        
    public String getAp2(){
        return ap2;
    }
        
    public String getCorreo(){
        return correo;
    }
    
    public String getNif(){
        return nif;
    }
        
    public boolean getSexo(){
        return hombre;
    }
        
    public int getDia(){
        return dia;
    }
        
    public String getMes(){
        return mes;
    }
        
    public int getAno(){
        return ano;
    }
        
    public String getCentro(){
        return centro;
    }
}
