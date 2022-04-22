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
    
    private String marca;
    private int almacenamiento;
    private int ram;
    private boolean aux;
    private float tamanio;

    public Smartphone() {
    }

    public Smartphone(String marca, int almacenamiento, int ram, boolean aux , float tamaño) {
        this.marca = marca;
        this.almacenamiento = almacenamiento;
        this.ram = ram;
        this.aux = aux;
        this.tamanio = tamaño;
    }

    public boolean isAux() {
        return aux;
    }

    public void setAux(boolean aux) {
        this.aux = aux;
    }
    
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

    @Override
    public String toString() {
        return "Smartphone{" + "marca=" + marca + ", almacenamiento=" + almacenamiento + "GB , ram=" + ram + " GB, tamanio=" + tamanio +" pulgadas"+ + '}';
    }
    
    
}
