/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author Brenes
 */
public class Habitaciones {
    //Atributos
    private String tipo;
    private int numero;
    private double precio;
    private String estado;
    //Constructor
    public Habitaciones(String tipo, int numero, double precio, String estado) {
        this.tipo = tipo;
        this.numero = numero;
        this.precio = precio;
        this.estado = estado;
    }
    //Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    //Enum para definir los tres tipos de estado
    enum estado{
        libre, ocupada, sucia
    }
}
