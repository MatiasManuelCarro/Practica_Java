/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_practico_2;

/**
 *
 * @author Matias
 */
public class Alumno {

    private String nombre;
    double promedio;
    static double notaAprobacion = 6;

    public Alumno(String nombre) {
        this.nombre = nombre;
        //this.promedio = 0;
    }

    public Alumno(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public void actualizarPromedio(double nuevoPromedio) {
        if (nuevoPromedio > 0) {
            this.promedio = nuevoPromedio;
        }
    }

    public void actualizarPromedio(double nota1, double nota2, double nota3) {
        if (nota1 > 0 && nota1 <= 10
                && nota2 > 0 && nota2 <= 10
                && nota3 > 0 && nota3 <= 10) {
            this.promedio = ((nota1 + nota2 + nota3) / 3);

        }
    }

    //retorna True si promedio >= notaAprobacion
    public boolean aprobo() {
        return this.promedio >= notaAprobacion;

    }

    static void cambiarNotaAprovacion(double nueva) {
        if (nueva > 0 && nueva <= 10) {
            System.out.println("\nSe cambia nota de aprobacion a: " + nueva);
            notaAprobacion = nueva;

        }
    }

    @Override
    public String toString() {
        return "\nNombre de alumno: " + nombre + " Promedio: " + promedio + " Aprobado: " + aprobo();
    }

}
