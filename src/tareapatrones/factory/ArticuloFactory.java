/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tareapatrones.factory;

import tareapatrones.factory.Articulo;

/**
 *
 * @author jorge
 */
public interface ArticuloFactory {
    public static Articulo createArtic (int tipo ){
    
        switch (tipo) {
            case Snack.PIZZA_HAW:
                return new Pizza("Jamon y pina Enlatada", false, true, true);
                
            case Snack.PIZZA_MAR:
                return new Pizza("Albahaca", true, false, true);    
                
             case Snack.HAMBURGUESA_SENCILLA:
                return new Hamburguesa("short rib", true, false, true, false, true);
                
            default:
                throw new AssertionError();
        }
}
