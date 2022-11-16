package org.iesalandalus.programacion.reinaajedrez.modelo;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

	private Consola() {
		
	}
	public static void mostrarMenu() {
		System.out.println("-----MENU-----");
		System.out.println("1- Crear Reina por defecto.");
		System.out.println("2- Crear Reina eligiendo color.");
		System.out.println("3- Mover Reina.");
		System.out.println("4- Salir.");
	}
	public static int elegirOpcionMenu() {
		int opcion;
		do {
			System.out.println("ELIGE UNA OPCIÓN DEL 1 AL 4:");
			opcion = Entrada.entero();	
		}while(opcion < 1 || opcion > 4);
		
		return opcion;
	}
	public static Color elegirColor() {
		System.out.println("-----ELEGIR COLOR-----");
		System.out.println("1- Reina Blanca.");
		System.out.println("2- Reina Negra.");
		
		int opcionColor;
		Color colorElegido = null;
		do {
			System.out.println("ELIGE UNA OPCIÓN:");
			opcionColor = Entrada.entero();	
		}while(opcionColor < 1 || opcionColor > 2);
		
		if (opcionColor==1) {
			colorElegido = Color.BLANCO;
		}else if (opcionColor==2) {
			colorElegido = Color.NEGRO;
		}
		
		return colorElegido;
	}
}
