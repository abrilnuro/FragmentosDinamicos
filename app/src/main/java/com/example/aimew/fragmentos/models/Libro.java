package com.example.aimew.fragmentos.models;

/**
 * Created by aimew on 26/09/2016.
 */

public class Libro {

    String nombre;
    int imagen;

    //constructor
    public Libro(String nombre, int imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    //getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
