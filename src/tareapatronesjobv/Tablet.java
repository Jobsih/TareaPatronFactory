/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapatronesjobv;

import tareapatrones.factory.Articulo;

/**
 *
 * @author jorge
 */
public class Tablet implements Articulo{
    
    private String modelo;
    private String tipoEntrada;
    private boolean teclado;
    private int ram;
    private float almacenamiento;
    private String escalaAlmacenamiento;
    private boolean stylus;
    private float tamanioPantalla;

    public Tablet() {
    }

    public Tablet(String modelo, String tipoEntrada, boolean teclado, int ram, float almacenamiento, String escalaAlmacenamiento, boolean stylus, float tamanioPantalla) {
        this.modelo = modelo;
        this.tipoEntrada = tipoEntrada;
        this.teclado = teclado;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.escalaAlmacenamiento = escalaAlmacenamiento;
        this.stylus = stylus;
        this.tamanioPantalla = tamanioPantalla;
    }

    public float getTamanioPantalla() {
        return tamanioPantalla;
    }

    public void setTamanioPantalla(float tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public boolean isTeclado() {
        return teclado;
    }

    public void setTeclado(boolean teclado) {
        this.teclado = teclado;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public float getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(float almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getEscalaAlmacenamiento() {
        return escalaAlmacenamiento;
    }

    public void setEscalaAlmacenamiento(String escalaAlmacenamiento) {
        this.escalaAlmacenamiento = escalaAlmacenamiento;
    }

    public boolean isStylus() {
        return stylus;
    }

    public void setStylus(boolean stylus) {
        this.stylus = stylus;
    }

    @Override
    public String toString() {
        return "Tablet{" + "modelo=" + modelo + ", tipoEntrada=" + tipoEntrada 
                + ", Teclado=" + teclado + ", ram=" + ram + ", almacenamiento=" +
                almacenamiento + " " + escalaAlmacenamiento + ", stylus=" 
                + stylus + ", tamanioPantalla=" + tamanioPantalla + " pulgadas" 
                + '}';
    }

}
