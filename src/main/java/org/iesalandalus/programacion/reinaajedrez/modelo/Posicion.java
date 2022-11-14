package org.iesalandalus.programacion.reinaajedrez.modelo;

import java.util.Objects;

import EjerciciosIntro.Posicion;

public class Posicion {

	private int fila;
	private char columna;
	
	
	//Constructor con parámetros
	public Posicion(int fila, char columna) {
		setFila(fila);
		setColumna(columna);
	}

	// Constructor copia
	public Posicion(Posicion posicion) {
		if (posicion == null) {
			throw new NullPointerException("Objeto nulo");
		}
		fila = posicion.fila;
		columna = posicion.columna;
	}
	//Método de acceso y modificación
	public int getFila() {
		return fila;
	}
	
	public void setFila(int fila) { 
		if(fila < 1 || fila > 8) {
			throw new IllegalArgumentException("No está dentro de los límites");
		}
		this.fila = fila;
	}
	public int getColumna() {
		return columna;
	}
	public void setColumna(char columna) {
		if(columna < 'a' || columna > 'h') {
			throw new IllegalArgumentException("No está dentro de los límites");
		}
		this.columna = columna;	
	}

	@Override
	public int hashCode() {
		return Objects.hash(columna, fila);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila;
	}

	@Override
	public String toString() {
		return String.format("Posicion [fila=%s, columna=%s]", fila, columna);
	}
	
}
