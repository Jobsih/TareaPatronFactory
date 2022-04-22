/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tareapatrones.factory;

import tareapatronesjobv.Computadora;
import tareapatronesjobv.Smartphone;
import tareapatronesjobv.Tablet;

/**
 *
 * @author jorge
 */
public class ArticuloFactory {
    public static Articulo createArtic (int tipo ){
    
        switch (tipo) {
            case Articulo.COMPUTADORA_HP:
                return new Computadora("HP", "Ryzen 5 5600U", 8, 250.0f, "GB",
                                        true, 14.0f);
                
            case Articulo.COMPUTADORA_DELL:
                return new Computadora("Dell", "Intel Core i3 11th Gen",
                        4, 500.0f, "GB", false, 15.6f);
            case Articulo.COMPUTADORA_LENOVO:
                return new Computadora("Lenovo", "Ryzen 7 7800U", 16, 2.0f, 
                        "TB", false, 15.6f);
            case Smartphone.SMARTPHONE_XIAOMI:
                return new Smartphone("Xiaomi Redmi Note 10S", 4, 64, 
                                      "Micro USB", true, 6.0f);
            case Smartphone.SMARTPHONE_HUAWEI:
                return new Smartphone("Huawei Y9S", 128, 6, "USB Tipo C", true,
                                      6.59f);
            case Smartphone.SMARTPHONE_MOTOROLA:
                return new Smartphone("Moto G5 Plus", 32, 3, "Micro USB", true,
                                       5.2f);
            case Tablet.TABLET_SAMSUNG:
                return new Tablet("Samsung Galaxy Tab S6 Lite", "USB Tipo C", 
                        false, 4, 64.0f, "GB", true, 10.4f);
            case Tablet.TABLET_POLAROID:
                return new Tablet("Tablet Polaroid POMDTB006", "Micro USB", 
                        false, 2, 16.0f, "GB", false, 8.0f);
            case Tablet.TABLET_SURFACE:
                return new Tablet("Samsung Galaxy Tab S6 Lite", "USB Tipo C", 
                        true, 4, 128.0f, "GB", true, 12.3f);
            case Tablet.TABLET_IPAD:
                return new Tablet("iPad + Apple Pencil", "Lightning", true, 4,
                        256.0f, "GB", true, 10.2f);
            default:
                throw new AssertionError();
        }
    }
}