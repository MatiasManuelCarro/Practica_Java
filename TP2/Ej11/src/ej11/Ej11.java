/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej11;

import java.util.Scanner;

/**
 *
 * @author matias.carro
 */
public class Ej11 {
    
    static double descuento = 0.10;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precio;
         
        System.out.println("Ingrese el precio del producto");
        precio = Double.parseDouble(input.nextLine());
        
        descuentoAplicado(precio);
        
    }
    
    static void descuentoAplicado(double precio) {
        double descuentoAplicado = (precio * descuento);
        System.out.println("El descuento especial aplicado es: "+descuentoAplicado);
        System.out.println("El precio final con descuento es: "+(precio - descuentoAplicado));
        
    }    
    
}
