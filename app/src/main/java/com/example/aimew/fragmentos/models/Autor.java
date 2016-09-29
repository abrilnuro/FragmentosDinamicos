package com.example.aimew.fragmentos.models;

/**
 * Created by aimew on 29/09/2016.
 */

public class Autor {

    int imagenAutor;
    String nombre;
    String fechaNacimiento;
    String Nacionalidad;


    //constructor
    public Autor(int imagenAutor, String nombre, String fechaNacimiento, String nacionalidad) {
        this.imagenAutor = imagenAutor;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        Nacionalidad = nacionalidad;
    }


    //getters and setters
    public int getImagenAutor() {
        return imagenAutor;
    }

    public void setImagenAutor(int imagenAutor) {
        this.imagenAutor = imagenAutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }
}
