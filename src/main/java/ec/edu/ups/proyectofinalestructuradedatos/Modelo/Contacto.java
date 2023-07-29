/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.proyectofinalestructuradedatos.Modelo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author venot
 */
public class Contacto {
    private String nombre;
    private String numero;
    private Map<String, String> redesSociales;
    

    public Contacto(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
        this.redesSociales = new HashMap<>();
    }
    
    public void agregarRedSocial(String redSocial, String url) {
        redesSociales.put(redSocial, url);
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
        return "Contacto{" + "nombre=" + nombre + ", numero=" + numero + ", redesSociales=" + redesSociales + '}';
    }
    
    
    
    
}
