package Inscripcion.model;

import Confirmacion.ui.ConfirmacionV;

/**
 *
 * @author Mario Gomez Fernandez
 * @author Miguel Bayon Sanz
 */
public class Persona {
    ConfirmacionV confV;
    private String nombre, ap1, ap2, correo, nif, mes, centro, categoria;
    private int dia, ano;
    private boolean hombre;

    public Persona(String nombre, String ap1, String correo) {
        
        this.nombre = nombre;
        System.out.print(nombre);
        this.ap1 = ap1;
        this.correo = correo;
        
    }
    
    public Persona(String nombre, String ap1, String ap2, String correo, int dia, String mes, int ano, String centro, String nif, boolean hombre) {
        
        this.nombre = nombre;
        System.out.print(nombre);
        this.ap1 = ap1;
        this.ap2 = ap2;
        this.correo = correo;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.centro = centro;
        categoria = "";
        this.hombre = hombre;
        this.nif = nif;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
        
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
        
    public String getSexo(){
        String m= "masculino",f="femenino";
        if(hombre){
        return m;
        }else return f;
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
    public String getCategoria(){
        return categoria;
    }
}
