package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reinaajedrez.Consola;

public class MainApp {

	private static Reina reina;
	
	private static void crearReinaDefecto() {
		reina = new Reina();
	}
	
	private static void crearReinaColor() {
		
		Color colorElegido = Consola.elegirColor();
		reina = new Reina(colorElegido);
		
	}
	private static void mover() {
		
		Consola.mostrarMenuDirecciones();
		Direccion direccionElegida = Consola.elegirDireccion();
		int pasos = Consola.elegirPasos();
		try {
			reina.mover(direccionElegida, pasos);
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
	}
	private static void mostrarReina() {
		if(reina!=null) {
			System.out.println(reina);
		}else {
			System.out.println("NO SE HA CREADO NINGUNA REINA AÚN");
		}
	}
	private static void ejecutarOpcion(int opcion) {
		switch (opcion) {
			case 1:
				crearReinaDefecto();
				break;
			case 2: 
				crearReinaColor();
				break;
			case 3:
				if(reina != null) {
					mover();
				}
				break;
			case 4:
				Consola.despedirse();
				break;
			default:
				break;
		}
	}
	
	public static void main(String[] args) {
			
		int opcion;
		do {
			Consola.mostrarMenu();
			opcion = Consola.elegirOpcionMenu();
			ejecutarOpcion(opcion);

			if (opcion != 4) {
				mostrarReina();
			}
			
		} while (opcion != 4);

	}

	}