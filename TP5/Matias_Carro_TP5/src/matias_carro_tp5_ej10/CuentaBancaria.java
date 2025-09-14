/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej10;

/**
 *
 * @author Matias
 */
public class CuentaBancaria {

    private String cbu;
    private String saldo;
    private Titular titular;
    private ClaveSeguridad claveSeguridad;

    public CuentaBancaria(String cbu, String saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad("123456", "14/09/2025");
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        if (cbu != null) {
            this.cbu = cbu;
        }
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        if (saldo != null) {
            this.saldo = saldo;
        }
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        if (titular != null) {
            this.titular = titular;
        }
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

}
