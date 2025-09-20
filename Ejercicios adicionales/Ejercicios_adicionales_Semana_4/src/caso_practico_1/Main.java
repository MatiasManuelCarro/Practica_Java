/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_practico_1;

/**
 *
 * @author Matias
 */
public class Main {

    public static void main(String[] args) {
        //String prefijo;
        //String nuevoTitulo;
        //String nuevaEditorial;

        //Se crean 2 libros con editorial
        Libro libro1 = new Libro("Cancion de Hielo y Fuego", "George RR Martin", "Plaza & Janés");
        Libro libro2 = new Libro("El señor de los anillos: La Comunidad del Anillo", "J. R. R. Tolkien", "Minotauro");

        //Se crean 2 libros sin editorial
        Libro libro3 = new Libro("El nombre del viento", "Patrick Rothfuss");
        Libro libro4 = new Libro("El Elfo Oscuro", "R. A. Salvatore");
        
        //mostramos lo libros usando toString()
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);
        
        //vemos la
        
    }
}
