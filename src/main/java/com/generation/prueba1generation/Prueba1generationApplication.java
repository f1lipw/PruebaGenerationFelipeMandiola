package com.generation.prueba1generation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import com.generation.prueba1generation.models.Curso;
import com.generation.prueba1generation.models.Alumno;

public class Prueba1generationApplication {

	/*
	 * Función que permita al profesor ingresar notas por estudiante y que luego permita obtener el promedio
	 * de cada estudiante: Para esto se debe crear una lista por estudiante en donde se  pueda ir guardando las notas
	 * de cada uno, posterior a eso en la misma función se deben sumar las notas y dividirla por el length del array
	 */

	 public static double notaPromedio(ArrayList<Double> arreglo) {
		//ingreso estudiante y notas
		
		//promedio
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

	 public static ArrayList<Double> promMenorMayor (ArrayList<Double> arreglo) {
		//Lista donde se va a guardar el arreglo con el promedio, menor y mayor nota
		ArrayList <Double> arreglopmm = new ArrayList<Double>();
		//promedio
		double promedio = 0;
		double acumulador = 0;
		for (int i = 0; i < arreglo.size(); i++) {
			acumulador += arreglo.get(i);
		}
		promedio = acumulador/(arreglo.size());
		arreglopmm.add(promedio);
		//menor
		double min = arreglo.get(0);
		for (int i = 1; i < arreglo.size(); i++) {
			if (arreglo.get(i) < min) {
				min = arreglo.get(i);
			}
		}
		arreglopmm.add(min);
		double max = arreglo.get(0);
		for (int i = 1; i < arreglo.size(); i++) {
			if (arreglo.get(i) > max) {
				max = arreglo.get(i);
			}
		}
		arreglopmm.add(max);
		return arreglopmm;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nombreAlumno = "";
		HashMap <String, ArrayList<Double>> libroClase = new HashMap<String, ArrayList<Double>>();
		int cantidadAlumnos;
		int cantidadNotas;

		do{
			System.out.println("Indique cantidad de alumnos a ingresar: ");
			cantidadAlumnos = teclado.nextInt(); 
			if (cantidadAlumnos <= 0){
				System.out.println("Ingrese cantidad de alumnos mayor a 0");
			}
		}while (cantidadAlumnos <=0);

		do{
			System.out.println("Indique cantidad de notas por alumno: ");
			cantidadNotas = teclado.nextInt();
			if (cantidadNotas <= 0){
				System.out.println("Ingrese cantidad de notas mayor a 0");
			}
		}while(cantidadNotas <= 0);

		for(int i = 1; i <= cantidadAlumnos; i++){
			teclado.nextLine();
			ArrayList <Double> notasAlumnos = new ArrayList<Double>();
			System.out.println("Ingresa nombre del alumno");
			nombreAlumno = teclado.nextLine();
			for (int x = 1; x <= cantidadNotas; x++){
				System.out.println("Ingresar nota" + x + "del alumno" + nombreAlumno + ": ");
				double nota = teclado.nextDouble();
				notasAlumnos.add(nota);
			}
			libroClase.put(nombreAlumno, notasAlumnos);
		}

		int opcion = 1;

		while (opcion != 0){

			do{
				System.out.println("******Inicio menú******");
				System.out.println("Seleccione 1 para obtener el promedio de cada estudiante");
				System.out.println("Seleccione 2 para obtener alumnos dada una cantidad seleccionada");
				System.out.println("Seleccione 3 para obtener el promedio, el menor y la mayor nota de un alumno");
			}while (opcion < 0 || opcion > 3);
		}

	}
}