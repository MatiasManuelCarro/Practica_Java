/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javatp1scanner;

import java.util.Scanner;

/**
 *
 * @author Matias Carro
 */
public class JavaTP1Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
                
        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());      
        
        System.out.println("Su nombre es: "+nombre);
        System.out.println("Su edad es: "+edad);
        
        
    }
    
}
