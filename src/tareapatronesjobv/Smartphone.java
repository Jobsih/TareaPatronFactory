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
public class Smartphone implements Articulo{
    
    private String modelo;
    private int almacenamiento;
    private int ram;
    private String tipoEntrada;
    private boolean aux;
    private float tamanio;

    public Smartphone() {
    }

    public Smartphone(String modelo, int almacenamiento, int ram, String tipoEntrada ,boolean aux , float tamanio) {
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.ram = ram;
        this.tipoEntrada = tipoEntrada;
        this.aux = aux;
        this.tamanio = tamanio;
    }

    public boolean isAux() {
        return aux;
    }

    public void setAux(boolean aux) {
        this.aux = aux;
    }
    
    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamaño) {
        this.tamanio = tamaño;
    }
    
     public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "modelo=" + modelo + ", almacenamiento=" 
                + almacenamiento + " GB , ram=" + ram + " GB, " +
                "Tipo de Entrada=" + tipoEntrada +
                ", aux= "+ aux + ", tamanio=" + tamanio +" pulgadas" + '}';
    }

   
    
    
}
