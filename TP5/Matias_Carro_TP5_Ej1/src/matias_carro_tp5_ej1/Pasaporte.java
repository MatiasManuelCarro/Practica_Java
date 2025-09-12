/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej1;

/**
 *
 * @author Matias
 */
public class Pasaporte {

    private String numero;
    private String fechaEmision;
    private Titular titular;
    private Foto foto;

    public Pasaporte(String numero, String fechaEmision, Titular titular, Foto foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.titular = titular;
        this.foto = foto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
 

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        if (fechaEmision != null) {
            this.fechaEmision = fechaEmision;
        }
    }

    public Titular getTitular() {
        return titular;
        
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

   
    
    @Override
    public String toString() {
        return "Numero de pasaporte: "+numero+ " | Nombre del Titular: " + titular.getNombre() +" | dni: "+titular.getDni()+ " | fecha de emision: " + fechaEmision+ " | Foto: "+foto.getImagen()+foto.getFormato();
    }

}
