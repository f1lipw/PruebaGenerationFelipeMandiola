package com.generation.prueba1generation.models;

public class Persona {
    public String nombre;
    public String apellido;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String curso) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    } 
}

