/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

/**
 *
 * @author stissera
 */

public class Persona {
    private String nombre;
    private int numeroMesa;

    public Persona(String nombre, int numeroMesa) {
        this.nombre = nombre;
        this.numeroMesa = numeroMesa;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }
    
    @Override
    public String toString() {
        return nombre + " (" + numeroMesa + ")";
    }

    public int compareTo(Persona o) { return this.nombre.compareTo(o.nombre);}
    
}