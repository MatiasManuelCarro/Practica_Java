/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matias.carro.tp.pkg2;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class MatiasCarroTP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anio;
        
                
        System.out.println("Ingrese un año para verificar si es bisiesto: ");
        anio = input.nextInt();
        
        if((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)){
            System.out.println("El año "+anio+" es bisiesto");
        }else {
            System.out.println("El año "+anio+" no es bisiesto");
        }
            
    }
    
}
