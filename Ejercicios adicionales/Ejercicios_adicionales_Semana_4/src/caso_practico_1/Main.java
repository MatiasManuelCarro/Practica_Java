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
       //Se crean 2 libros sin editorial
        Libro libro1 = new Libro("El nombre del viento", "Patrick Rothfuss");
        Libro libro2 = new Libro("El Elfo Oscuro", "R. A. Salvatore");
        
        
        //Se crean 2 libros con editorial
        Libro libro3 = new Libro("Cancion de Hielo y Fuego", "George RR Martin", "Plaza & Janés");
        Libro libro4 = new Libro("El señor de los anillos: La Comunidad del Anillo", "J. R. R. Tolkien", "Minotauro");
        
           
        //mostramos lo libros usando toString()
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);


        System.out.println("\n--------------------------------------\nSe Cambia la editorial por defecto\n");
        
        Libro.cambiarEditorial("Nueva Editorial");
        //vemos como funciona static editorial independiente
        //Volvemos a crear otro libro sin editorial (y con la nueva editorial por defecto)
        Libro libro5 = new Libro("El camino de los Reyes", "Brandon Sanderson");
        
        System.out.println(libro5);
        
        //mostramos los libros de nuevo:
        
       //mostramos lo libros usando toString()
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);
        //vemos como funciona static editorial independiente
        System.out.println(libro5);
        
        //Actualizamos los titulos
        libro3.actualizarTitulo("Song of Fire and Ice");
        libro4.actualizarTitulo("Edicion especial: ", "El señor de los anillos: Las Dos Torres");
        
        System.out.println("\n---------------------------------------\nLibros con titulo actualizados:\n");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);
        System.out.println(libro5);
        
    }
}
