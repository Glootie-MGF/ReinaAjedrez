package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Reina {

	private Color color;
	private Posicion posicion;
	
	//Método
	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {
		if (direccion == null) {
			throw new IllegalArgumentException("La dirección no puede ser nula.");
		}
		if (pasos <= 0 || pasos > 7) {
			throw new IllegalArgumentException("El número de pasos debe ser mayor que cero y menor que 7.");
		}
		String movimientoNoValido = "Movimiento no válido: ";
		switch (direccion) {
			case NORTE:
				try {
					Posicion posicionNueva = new Posicion(posicion.getFila() + pasos, posicion.getColumna());
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(movimientoNoValido + e.getMessage());
				}
				break;
			case NORESTE:
				try {
					Posicion posicionNueva = new Posicion(posicion.getFila() + pasos, (char)(posicion.getColumna() + pasos));
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(movimientoNoValido + e.getMessage());
				}
				break;
			case ESTE:
				try {
					Posicion posicionNueva = new Posicion(posicion.getFila(), (char)(posicion.getColumna() + pasos));
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(movimientoNoValido + e.getMessage());
				}
				break;
			case SURESTE:
				try {
					Posicion posicionNueva = new Posicion(posicion.getFila() - pasos, (char)(posicion.getColumna() + pasos));
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(movimientoNoValido + e.getMessage());
				}
				break;
			case SUR:
				try {
					Posicion posicionNueva = new Posicion(posicion.getFila() - pasos, posicion.getColumna());
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(movimientoNoValido + e.getMessage());
				}
				break;
			case SUROESTE:
				try {
					Posicion posicionNueva = new Posicion(posicion.getFila() - pasos, (char)(posicion.getColumna() - pasos));
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(movimientoNoValido + e.getMessage());
				}
				break;
			case OESTE:
				try {
					Posicion posicionNueva = new Posicion(posicion.getFila(), (char)(posicion.getColumna() - pasos));
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(movimientoNoValido + e.getMessage());
				}
				break;
			case NOROESTE:
				try {
					Posicion posicionNueva = new Posicion(posicion.getFila() + pasos, (char)(posicion.getColumna() - pasos));
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(movimientoNoValido + e.getMessage());
				}
				break;
			default:
				break;
			}
	}

	//Constructor por defecto
	public Reina() {
		 
		color = Color.BLANCO;
		posicion = new Posicion(1,'d');
	}
	//Constructor por parámetros
	public Reina(Color color) {
		setColor(color);
		if(color == Color.NEGRO) {
			posicion = new Posicion (8, 'd');
		}else {
			posicion = new Posicion(1,'d');
		}
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
