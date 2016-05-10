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

    /**
     * Constructor para el solicitante
     *
     * @param nombre del solicitante
     * @param ap1 del solicitante
     * @param correo del solicitante
     */
    public Persona(String nombre, String ap1, String correo) {

        this.nombre = nombre;
        this.ap1 = ap1;
        this.ap2 = "";
        this.correo = correo;

    }

    /**
     * Constructor para los participantes
     *
     * @param nombre del participante
     * @param ap1 del participante
     * @param ap2 del participante
     * @param correo del participante
     * @param dia de nacimiento del participante
     * @param mes de nacimiento del participante
     * @param ano de nacimiento del participante
     * @param centro del participante
     * @param nif del participante
     * @param hombre referido al sexo del participante
     */
    public Persona(String nombre, String ap1, String ap2, String correo, int dia, String mes, int ano, String centro, String nif, boolean hombre) {

        this.nombre = nombre;
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

    /**
     * setter de categoria
     *
     * @param categoria
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * setter de nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * setter del primer apellido
     *
     * @param ap1
     */
    public void setAp1(String ap1) {
        this.ap1 = ap1;
    }

    /**
     * setter del segundo apellido
     *
     * @param ap2
     */
    public void setAp2(String ap2) {
        this.ap2 = ap2;
    }

    /**
     * setter de correo
     *
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * setter del nif
     *
     * @param nif
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * setter del dia de nacimiento
     *
     * @param dia
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * setter del mes de nacimiento
     *
     * @param mes
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * setter del ano de nacimiento
     *
     * @param ano
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * setter del sexo
     *
     * @param hombre
     */
    public void setSexo(boolean hombre) {
        this.hombre = hombre;
    }

    /**
     * setter del centro
     *
     * @param centro
     */
    public void setCentro(String centro) {
        this.centro = centro;
    }

    /**
     * getter del nombre
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * getter del primer apellido
     *
     * @return ap1
     */
    public String getAp1() {
        return ap1;
    }

    /**
     * getter del segundo apellido
     *
     * @return ap2
     */
    public String getAp2() {
        return ap2;
    }

    /**
     * getter del correo
     *
     * @return correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * getter del nif
     *
     * @return nif
     */
    public String getNif() {
        return nif;
    }

    /**
     * getter del sexo
     *
     * @return hombre/no hombre
     */
    public String getSexo() {
        String m = "masculino", f = "femenino";
        if (hombre) {
            return m;
        } else {
            return f;
        }
    }

    /**
     * getter del dia
     *
     * @return dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * getter del mes
     *
     * @return mes
     */
    public String getMes() {
        return mes;
    }

    /**
     * getter del ano
     *
     * @return ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * getter del centro
     *
     * @return centro
     */
    public String getCentro() {
        return centro;
    }

    /**
     * getter de la categoria
     *
     * @return categoria
     */
    public String getCategoria() {
        return categoria;
    }
}
