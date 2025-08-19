/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias.carro.tp.pkg2;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class ejercicio2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1, numero2, numero3;
                                             
        System.out.println("Ingrese el primer numero");
        numero1 = input.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2 = input.nextInt();
        System.out.println("Ingrese el tercer numero");
        numero3 = input.nextInt();
        
        if(numero1 >= numero2 && numero1 >= numero3){
            System.out.println("El numero "+numero1+" es el mayor");
        }else if(numero2 >= numero1 && numero2 >= numero3){
            System.out.println("El numero "+numero2+" es el mayor");
        }else{
            System.out.println("El numero "+numero3+" es el mayor");           
            
        } 
                        
            
    

    }        
}
