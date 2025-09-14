/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej13;

/**
 *
 * @author Matias
 */
public class Main {
    public static void main(String[] args) {
        
        Usuario usuario1 = new Usuario("Matias Carro", "matias.carro@mail.com");
        //GeneradorQR generador1 = new GeneradorQR();
        GeneradorQR.generar("123456", usuario1);
        
    }
}
