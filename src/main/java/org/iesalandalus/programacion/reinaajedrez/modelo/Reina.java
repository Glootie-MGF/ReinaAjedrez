package org.iesalandalus.programacion.reinaajedrez.modelo;

import EjerciciosIntro.Posicion;

public class Reina {

	private Color color;
	private Posicion posicion;
	
	//Constructor por defecto
	public Reina() {
		 
		color = Color.BLANCO;
		Posicion posicion = new Posicion(1,'d');
	}
	
	//Métodos get y set
	public Color getColor() {
		return color;
	}
	private void setColor(Color color) {
		if(color == null) {
			throw new NullPointerException("No puede ser color nulo");
		}
		this.color = color;
	}

	public Posicion getPosicion() {
		return posicion;
	}
	private void setPosicion(Posicion posicion) {
		if(posicion == null) {
			throw new NullPointerException("No puede ser posición nula");
		}
		this.posicion = new Posicion(posicion);
	}
	
	
}
