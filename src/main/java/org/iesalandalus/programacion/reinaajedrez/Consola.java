package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
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
	public static void mostrarMenuDirecciones() {
		System.out.println("-----MENU DIRECCIONES-----");
		System.out.println("1- NORTE");
		System.out.println("2- NORESTE");
		System.out.println("3- ESTE");
		System.out.println("4- SURESTE");
		System.out.println("5- SUR");
		System.out.println("6- SUROESTE");
		System.out.println("7- OESTE");
		System.out.println("8- NOROESTE");
	}
	public static Direccion elegirDireccion() {
		int opcionDireccion;
		Direccion direccionElegida = null;
		do {
			System.out.println("ELIGE UNA OPCIÓN:");
			opcionDireccion = Entrada.entero();	
		}while(opcionDireccion < 1 || opcionDireccion > 8);
		
		if (opcionDireccion==1) {
			direccionElegida = Direccion.NORTE;
		}else if (opcionDireccion==2) {
			direccionElegida = Direccion.NORESTE;
		}else if (opcionDireccion==3) {
			direccionElegida = Direccion.ESTE;
		}else if (opcionDireccion==4) {
			direccionElegida = Direccion.SURESTE;
		}else if (opcionDireccion==5) {
			direccionElegida = Direccion.SUR;
		}else if (opcionDireccion==6) {
			direccionElegida = Direccion.SUROESTE;
		}else if (opcionDireccion==7) {
			direccionElegida = Direccion.OESTE;
		}else if (opcionDireccion==8) {
			direccionElegida = Direccion.NOROESTE;
		}
		
		return direccionElegida;
	}
	public static int elegirPasos() {
		int pasos;
		do {
			System.out.println("ELIGE CUANTOS PASOS DAR:");
			pasos = Entrada.entero();	
		}while(pasos < 0);
		
		return pasos;
	}
	public static void despedirse() {
		System.out.println("Hasta luego, Lucas");
	}
}
