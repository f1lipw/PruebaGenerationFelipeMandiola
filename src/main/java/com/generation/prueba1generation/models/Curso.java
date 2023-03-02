package com.generation.prueba1generation.models;

import java.util.ArrayList;

public class Curso {
    public String nombreCurso;
    public ArrayList<String> listaAlumnos;
    
    public Curso() {
    }

    public Curso(String nombreCurso, ArrayList<String> listaAlumnos) {
        this.nombreCurso = nombreCurso;
        this.listaAlumnos = listaAlumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public ArrayList<String> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<String> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    @Override
    public String toString() {
        return "Curso [nombreCurso=" + nombreCurso + ", listaAlumnos=" + listaAlumnos + "]";
    }

    
}


