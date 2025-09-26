/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_practico_4;

/**
 *
 * @author Matias
 */
public class Main {

    public static void main(String[] args) {
        Cuenta cuenta100 = new Cuenta("John Doe");
        Cuenta cuenta101 = new Cuenta("Juan Perez", 150000.00);
        Cuenta cuenta102 = new Cuenta("Cuenta de prueba");

        System.out.println(cuenta100);
        System.out.println(cuenta101);
        System.out.println(cuenta102);
        
        //iniciamos el valor del dolar
        Cuenta.setPrecioDolarHoy(1360);

        //depositamos en la cuenta de prueba
        cuenta102.depositar(10000);
        //verificamos el monto
        cuenta102.consultarSaldo();

        //Extramos saldo de la cuenta
        cuenta102.extraer(5000);
        //verificamos el monto
        cuenta102.consultarSaldo();

        //volvemos a extraerle, pero mas de lo que es posible        
        cuenta102.extraer(500000);

        //mostramos el saldo de la cuenta 101 en dolares
        cuenta101.cotizacionDolar();
        
        //actualizamos el valor del dolar
        Cuenta.setPrecioDolarHoy(1450);
        
        //volvemos a mostrar  el saldo de la cuenta 101 en dolares
        cuenta101.cotizacionDolar();
        
        

    }

}
