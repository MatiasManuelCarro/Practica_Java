/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_practico_1;

/**
 *
 * @author Matias
 */
public class Libro {

    private String titulo;
    private String autor;
    private String editorial;
    private static String editorialPorDefecto = "independiente";
    
    

    //Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorialPorDefecto;
    }

    public Libro(String titulo, String autor, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void actualizarTitulo(String nuevoTitulo) {
        if (titulo != null) {
            this.titulo = nuevoTitulo;
        }
    }

    public void actualizarTitulo(String prefijo, String nuevoTitulo) {
        if (titulo != null) {
            this.titulo = prefijo + " " + nuevoTitulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor != null) {
            this.autor = autor;
        }
    }

    public static void cambiarEditorial(String nuevaEditorial) {
        Libro.editorialPorDefecto = nuevaEditorial;
    }
    


    @Override
    public String toString() {
        return "\nTitulo: " + titulo + "\nAutor: " + autor + "\nEditorial: " + editorial;
    }

}
