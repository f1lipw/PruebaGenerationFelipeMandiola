package com.generation.prueba1generation;

import java.util.ArrayList; 
import java.util.HashMap;

import com.generation.prueba1generation.models.Curso;
import com.generation.prueba1generation.models.Alumno;

public class Prueba1generationApplication {

	/*
	 * Función que permita al profesor ingresar notas por estudiante y que luego permita obtener el promedio
	 * de cada estudiante: Para esto se debe crear una lista por estudiante en donde se  pueda ir guardando las notas
	 * de cada uno, posterior a eso en la misma función se deben sumar las notas y dividirla por el length del array
	 */

	 public static double notaPromedio(ArrayList<Double> arreglo) {
		double promedio = 0;
		double acumulador = 0;
		for (var i=0; i < arreglo.size(); i++) {
			acumulador += arreglo.get(i);
		}
		promedio = acumulador/(arreglo.size());
		return promedio;
	 }
	
	 /*
	 * Función que permita guardar un arreglo de una cierta cantidad de alumnos por curso y que luego los muestre:
	 * Para esto se debe crear una función que por cada alumno ingresado lo vaya guardando en un arreglo y posterior
	 * a eso pueda mostrar todos los alumnos en el arreglo dentro de la función
	 * 
	 * Aquí haré que pueda elegir desde que indice puede escoger el arreglo
	 */
	 public static ArrayList<String> arregloAlumnos (ArrayList<String> arreglo1) {
		ArrayList<String> arregloa = new ArrayList<String>();
		Curso arregloCurso = new Curso();
		arregloa = arregloCurso.getListaAlumnos();
		for (var i = 0; i < arregloa.size(); i++) {
			arreglo1.add(arregloa.get(i));
		}
		return arreglo1;
	 }


	 /*
	 * Función que dado un arreglo de notas obtenga la mejor nota. la peor nota y el promedio de notas: Para esto
	 * se podría ocupar las listas creadas anteriormente en la primera función (opción 1) tomar todos los promedios
	 * de los estudiantes, sumarlos y dividirlos por la cantidad de estudiantes, para las peores y mejores notas  
	 */

	 public static ArrayList<Double> promMenorMayor (ArrayList<Double> arreglopmm) {
		//promedio
		double promedio = 0;
		double acumulador = 0;
		for (int i = 0; i < arreglopmm.size(); i++) {
			
		}
		return arreglopmm;
	 }

	public static void main(String[] args) {
/* 		ArrayList<Double> arreglonotas = new ArrayList<Double>();
		arreglonotas.add(3.4);
		arreglonotas.add(4.5);
		String curso1 = "";
		curso1.setCurso("hola");
		Alumno alumno1 = new Alumno();
		alumno1.setNotasAlumno(arreglonotas);
		alumno1.setCurso(curso1);
		System.out.println(alumno1);  */
/* 		ArrayList <Double> arreglo1 = new ArrayList<Double>();
		arreglo1.add(2.0);
		arreglo1.add(3.0);
		//System.out.println(arreglo1);
		//System.out.println(arreglo1.size());
		System.out.println(promedioNota(arreglo1)); */
/* 		ArrayList<String> arreglo1 = new ArrayList<String>();
		Curso curso1 = new Curso();
		curso1.setListaAlumnos();
		//System.out.println(curso1);
	System.out.println(arregloAlumnos(arreglo1)); */ 
	}
	}
