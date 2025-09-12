/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
            int precio;
            String categoria;
            
                                             
            System.out.println("Ingrese el precio del producto");
            precio = Integer.parseInt(input.nextLine());
            
            System.out.println("Ingrese la categoria del producto A, B o C en mayusculas");
            categoria = input.nextLine();
            
            if(categoria.equals("A")){
                System.out.println("Descuento final ñññ{uuúu aplicado: 10% \nEl precio final es:"+(precio-precio*0.10));                
            }else if(categoria.equals("B")){
                System.out.println("El precio final es:"+(precio-precio*0.15));
    }
    
}
