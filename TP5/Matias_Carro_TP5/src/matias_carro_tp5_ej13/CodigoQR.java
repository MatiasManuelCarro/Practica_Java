/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej13;

/**
 *
 * @author Matias
 */
public class CodigoQR {

    private String valor;
    private Usuario usuario; //asociacion unidireccional

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        if (valor != null) {
            this.valor = valor;
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        if (usuario != null) {
            this.usuario = usuario;
        }
    }

    @Override
    public String toString() {
        return "Valor: " + valor + " " + usuario;
    }
    
    

}
