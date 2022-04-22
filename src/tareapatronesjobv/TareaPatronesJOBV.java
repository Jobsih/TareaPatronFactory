/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareapatronesjobv;

import java.util.Scanner;
import tareapatrones.factory.Articulo;
import tareapatrones.factory.ArticuloFactory;

/**
 *
 * @author jorge
 */
public class TareaPatronesJOBV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int eleccion = 0;
        
        System.out.println("Que deseas comprar?:");
        System.out.println(Computadora.COMPUTADORA_HP + ") Computadora HP");
        System.out.println(Computadora.COMPUTADORA_DELL + ") Computadora Dell");
        System.out.println(Computadora.COMPUTADORA_LENOVO + ") Computadora Lenovo");
        System.out.println(Smartphone.SMARTPHONE_XIAOMI + ") Celular Xiaomi");
        System.out.println(Smartphone.SMARTPHONE_HUAWEI + ") Celular Huawei");
        System.out.println(Smartphone.SMARTPHONE_MOTOROLA + ") Celular Motorola");
        System.out.println(Tablet.TABLET_SAMSUNG + ") Tablet Samsung");
        System.out.println(Tablet.TABLET_POLAROID + ") Tablet Polaroid");
        System.out.println(Tablet.TABLET_SURFACE + ") Tablet Surface");
        System.out.println(Tablet.TABLET_IPAD + ") Tablet iPad");
        
        try {
            System.out.print("Elige el numero:");
            eleccion = teclado.nextInt();
            
            
        } catch (Exception e) {
            
            System.out.println("No capturaste un numero");
            
        }
        
        Articulo producto = ArticuloFactory.createArtic(eleccion);
        System.out.println(producto.toString());
    }
    
}
