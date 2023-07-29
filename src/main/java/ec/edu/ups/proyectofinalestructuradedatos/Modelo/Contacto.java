/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.proyectofinalestructuradedatos.Modelo;

/**
 *
 * @author venot
 */
public class Contacto {
    private String nombre;
    private String numero;
    

    public Contacto(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    @Override
    public String toString() {
        return "Contacto [nombre=" + nombre + ", numero=" + numero + "]";
    }
    
    
}
