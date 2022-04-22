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
public class Computadora implements Articulo{
    
    private String marca;
    private String procesador;
    private int ram;
    private float almacenamiento;
    private String escalaAlmacenamiento; //GB o TB
    private boolean ssd;
    private float tamanioPantalla;

    public Computadora() {
    }

    public Computadora(String marca,String procesador, int ram, float almacenamiento, String escalaAlmacenamiento, boolean ssd, float tamanioPantalla) {
        this.marca = marca;
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.escalaAlmacenamiento = escalaAlmacenamiento;
        this.ssd = ssd;
        this.tamanioPantalla = tamanioPantalla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    

    public float getTamanioPantalla() {
        return tamanioPantalla;
    }

    public void setTamanioPantalla(float tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
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

    public boolean isSsd() {
        return ssd;
    }

    public void setSsd(boolean ssd) {
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "Computadora{" +"marca=" + marca + "procesador=" + procesador + ", ram=" + ram 
                + " GB, almacenamiento=" + almacenamiento +" "+ escalaAlmacenamiento + ", ssd=" + ssd + ", tamanioPantalla=" + tamanioPantalla+ " pulgadas" + '}';
    }
    
}
