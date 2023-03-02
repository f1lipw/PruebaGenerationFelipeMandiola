package com.generation.prueba1generation.models;

import java.util.ArrayList;

public class Alumno extends Persona {
    public ArrayList<Double> notasAlumno;

    public Alumno(ArrayList<Double> notasAlumno) {
        this.notasAlumno = notasAlumno;
    }

    public Alumno(String nombre, String apellido, String curso, ArrayList<Double> notasAlumno) {
        super(nombre, apellido, curso);
        this.notasAlumno = notasAlumno;
    }
    
}
