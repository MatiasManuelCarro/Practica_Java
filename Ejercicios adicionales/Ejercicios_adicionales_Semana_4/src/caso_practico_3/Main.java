/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_practico_3;

/**
 *
 * @author Matias
 */
public class Main {

    public static void main(String[] args) {
        Producto producto1 = new Producto("Mother ASUS B550", 100000.00);
        Producto producto2 = new Producto("Micro Ryzen 5", 220000.99);
        Producto producto3 = new Producto("Memoria RAM");
        Producto producto4 = new Producto("NVME 1TB", 95000.00);
        Producto producto5 = new Producto("AIO 240mm", 150000.00);

        producto2.aplicarDescuento(10);
        producto3.aplicarDescuento(90, 50000.00);
        producto5.aplicarDescuento(10, 500000.00);

        //mostramos los productos:
        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
        System.out.println(producto4);
        System.out.println(producto5);

        //se cambia el IVA
        Producto.cambiarIVA(15);

        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
        System.out.println(producto4);
        System.out.println(producto5);

    }

}
