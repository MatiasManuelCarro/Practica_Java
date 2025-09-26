/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_practico_4;

/**
 *
 * @author Matias
 */
public class Cuenta {

    private int numero;
    private String titular;
    private double saldo;
    private static int ultimoNumero = 100;
    private static int totalCuentas;
    private static double precioDolarHoy;

    public Cuenta(String titular) {
        this.titular = titular;
        this.numero = ultimoNumero++;
        Cuenta.totalCuentas++;
    }

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        this.numero = ultimoNumero++;
        Cuenta.totalCuentas++;
    }

    public void consultarSaldo() {
        System.out.println("El saldo de la cuenta " + this.numero + " es: " + this.saldo);
    }

    //String.format("%.2f," -- redondea a 2 decimales
    public void cotizacionDolar() {
        System.out.println("La cotizacion en U$D de la cuenta "+ this.numero + " es: " +String.format("%.2f", this.saldo / precioDolarHoy));
    }
    
    public static void setPrecioDolarHoy(double precioDolarHoy){
        if (precioDolarHoy > 0){
            Cuenta.precioDolarHoy = precioDolarHoy;
        }      
    }

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
        }
    }

    public void extraer(double monto) {
        if (monto > 0 && monto <= this.saldo) {
            this.saldo -= monto;
        } else {
            System.out.println("\nNo hay saldo suficiente para la extraccion");
        }
    }

    public static void mostrarTotalCuentas() {
        System.out.println("Total de cuentas: " + totalCuentas);
    }

    @Override
    public String toString() {
        return "\nNumero de cuenta: " + numero
                + "\nTitular: " + titular
                + "\nSaldo de la cuenta: " + saldo;

    }

}
