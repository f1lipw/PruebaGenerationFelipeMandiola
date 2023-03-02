package com.generation.prueba1generation;

import java.util.ArrayList; 

public class Prueba1generationApplication {

	/*
	 * Función que permita al profesor ingresar notas por estudiante y que luego permita obtener el promedio
	 * de cada estudiante: Para esto se debe crear una lista por estudiante en donde se  pueda ir guardando las notas
	 * de cada uno, posterior a eso en la misma función se deben sumar las notas y dividirla por el length del array
	 */
	


	public static double promedioNota(ArrayList<Double> arreglo){
		//Declaración de variables
		int i = 0;
		double promedio = 0;
		double acumulador = 0;
		double nota = 0;
		int cantAlumnos = 0;

		//Función que permite ingresar las notas de los alumnos por alumno, por lo tanto me debería permitir
		//ingresar al alumno y sus correspondientes notas.
		//Función que calcula el promedio de notas de un arreglo
		while (i <= (arreglo.size()-1)) {
			nota = arreglo.get(i);
			acumulador = acumulador + nota;
			i++;
		}
		cantAlumnos = arreglo.size();
		promedio = acumulador/(cantAlumnos);
		return promedio;
	}


	 /*
	 * Función que permita guardar un arreglo de una cierta cantidad de alumnos por curso y que luego los muestre:
	 * Para esto se debe crear una función que por cada alumno ingresado lo vaya guardando en un arreglo y posterior
	 * a eso pueda mostrar todos los alumnos en el arreglo dentro de la función
	 */
	
	 /*
	 * Función que dado un arreglo de notas obtenga la mejor nota. la peor nota y el promedio de notas: Para esto
	 * se podría ocupar las listas creadas anteriormente en la primera función (opción 1) tomar todos los promedios
	 * de los estudiantes, sumarlos y dividirlos por la cantidad de estudiantes, para las peores y mejores notas  
	 */

	public static void main(String[] args) {
		ArrayList <Double> arreglo1 = new ArrayList<Double>();
		arreglo1.add(2.0);
		arreglo1.add(3.0);
		//System.out.println(arreglo1);
		//System.out.println(arreglo1.size());
		System.out.println(promedioNota(arreglo1));
	}

}
