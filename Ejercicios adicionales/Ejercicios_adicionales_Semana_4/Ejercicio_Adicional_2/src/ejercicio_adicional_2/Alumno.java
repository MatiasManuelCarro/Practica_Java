/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_adicional_2;

/**
 *
 * @author Matias
 */
public class Alumno {

    private String nombre;
    private double promedio;
    static double notaAprobacion = 6;

    public Alumno(String Nombre, double promedio) {
        this.nombre = Nombre;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public boolean aprobo(){
        return promedio >= notaAprobacion;
    }
    
    static double cambiarNotaAprobacion()
    
}
