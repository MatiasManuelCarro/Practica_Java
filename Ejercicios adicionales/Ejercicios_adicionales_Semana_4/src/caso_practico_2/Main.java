/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_practico_2;

/**
 *
 * @author Matias
 */
public class Main {

    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Matias Carro", 8.25);
        Alumno alumno2 = new Alumno("Emiliano Carro", 9.25);
        Alumno alumno3 = new Alumno("Lucía Fernández");
        Alumno alumno4 = new Alumno("Mateo González", 9.50);
        Alumno alumno5 = new Alumno("Sofía Álvarez");
        Alumno alumno6 = new Alumno("Nicolás Herrera");
        Alumno alumno7 = new Alumno("Cristian Gutierrez");

        alumno3.actualizarPromedio(4.20);
        alumno5.actualizarPromedio(4, 6.2, 8.7);
        alumno6.actualizarPromedio(3);

        System.out.println(alumno1);
        System.out.println(alumno2);
        System.out.println(alumno3);
        System.out.println(alumno4);
        System.out.println(alumno5);
        System.out.println(alumno6);
        System.out.println(alumno7);
        
        //cambiamos la nota de aprobacion:
        Alumno.cambiarNotaAprovacion(7);
        
        //imprimimos nuevamente los alumnos
        System.out.println(alumno1);
        System.out.println(alumno2);
        System.out.println(alumno3);
        System.out.println(alumno4);
        System.out.println(alumno5);
        System.out.println(alumno6);
        System.out.println(alumno7);
        

    }
}
