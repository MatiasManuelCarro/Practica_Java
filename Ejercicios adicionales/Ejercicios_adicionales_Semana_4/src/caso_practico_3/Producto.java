/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_practico_3;

/**
 *
 * @author Matias
 */
public class Producto {

    private String nombre;
    private double precioBase;
    private static double IVA = 0.21;
    private static double precioPorDefecto = 100.00;

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public Producto(String nombre) {
        this.nombre = nombre;
        this.precioBase = precioPorDefecto;

    }

    //4 metodo sobrecargado aplicarDescuento
    public void aplicarDescuento(double porcentajeDescuento) {
        if (porcentajeDescuento > 0) {
            this.precioBase = precioBase - (precioBase * (porcentajeDescuento / 100));
        }
    }

    public void aplicarDescuento(double porcentajeDescuento, double precioMinimo) {
        if (porcentajeDescuento > 0 && precioMinimo > 0
                && precioBase - (precioBase * (precioBase / 100)) >= precioMinimo) {
            this.precioBase = precioBase - (precioBase * (porcentajeDescuento / 100));
        } else {
            precioBase = precioMinimo;
        }

    }

    //5 Metodo calcularpreciofinal
    public double calcularPrecioFinal() {
        return this.precioBase + (this.precioBase * IVA);
    }

    public static void cambiarIVA(double nuevo) {
        if (nuevo > 0) {
            IVA = (nuevo / 100);
            System.out.println("\nSe cambia el IVA a: " + IVA);
        }
    }

    @Override
    public String toString() {
        return "\nNombre producto: " + nombre + " | Precio base: " + precioBase + " | Precio final + IVA :" + calcularPrecioFinal();
    }

}
