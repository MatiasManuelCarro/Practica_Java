/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matias_carro_tp5_ej1;

/**
 *
 * @author Matias
 */
public class Matias_Carro_TP5_Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Titular titular1 = new Titular("Matias Carro", "12345678");
        Foto foto1 = new Foto("fotoMatias", ".JPG");

        Pasaporte pasaporte1 = new Pasaporte("00000001", "21/05/2024", titular1, foto1);

        System.out.println(pasaporte1);
        
        titular1.setNombre("Carro Matias");
        
        System.out.println(pasaporte1);
        
        Titular titular2 = new Titular("Emiliano Carro", "87654321");
        Foto foto2 = new Foto("fotoEmiliano", ".PNG");
        
        Pasaporte pasaporte2 = new Pasaporte("00000002", "15/02/2020", titular2, foto2);
        
        System.out.println("");
        System.out.println(pasaporte2);
        
        
        



        

    }

}
