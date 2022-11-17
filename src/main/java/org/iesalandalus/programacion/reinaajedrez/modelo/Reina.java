package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Reina {

	private Color color;
	private Posicion posicion;
	
	//Método mover
	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {
		if (direccion == null) {
			throw new NullPointerException("ERROR: La dirección no puede ser nula.");
		}
		if (pasos <= 0 || pasos > 7) {
			throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
		}
		
		String movimientoNoValido = "ERROR: Movimiento no válido (se sale del tablero).";
		Posicion posicionNueva;
		
		switch (direccion) {
			case NORTE:
				try {
					posicionNueva = new Posicion((posicion.getFila() + pasos), posicion.getColumna());
					setPosicion(posicionNueva);
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(movimientoNoValido);
				}
				break;
			case NORESTE:
				try {
					posicionNueva = new Posicion(posicion.getFila() + pasos, (char)(posicion.getColumna() + pasos));
					setPosicion(posicionNueva);
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(movimientoNoValido);
				}
				break;
			case ESTE:
				try {
					posicionNueva = new Posicion(posicion.getFila(), (char)(posicion.getColumna() + pasos));
					setPosicion(posicionNueva);
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(movimientoNoValido);
				}
				break;
			case SURESTE:
				try {
					posicionNueva = new Posicion(posicion.getFila() - pasos, (char)(posicion.getColumna() + pasos));
					setPosicion(posicionNueva);
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(movimientoNoValido);
				}
				break;
			case SUR:
				try {
					posicionNueva = new Posicion(posicion.getFila() - pasos, posicion.getColumna());
					setPosicion(posicionNueva);
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(movimientoNoValido);
				}
				break;
			case SUROESTE:
				try {
					posicionNueva = new Posicion(posicion.getFila() - pasos, (char)(posicion.getColumna() - pasos));
					setPosicion(posicionNueva);
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(movimientoNoValido);
				}
				break;
			case OESTE:
				try {
					posicionNueva = new Posicion(posicion.getFila(), (char)(posicion.getColumna() - pasos));
					setPosicion(posicionNueva);
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(movimientoNoValido);
				}
				break;
			case NOROESTE:
				try {
					posicionNueva = new Posicion(posicion.getFila() + pasos, (char)(posicion.getColumna() - pasos));
					setPosicion(posicionNueva);
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(movimientoNoValido);
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
		}else if(color == Color.BLANCO) {
			posicion = new Posicion(1,'d');
		}
	}
	//Métodos get y set
	public Color getColor() {
		return color;
	}

	private void setColor(Color color) {
		if(color == null) {
			throw new NullPointerException("ERROR: El color no puede ser nulo.");
		}
		this.color = color;
	}

	public Posicion getPosicion() {
		return posicion;
	}
	private void setPosicion(Posicion posicion) {
		if(posicion == null) {
			throw new NullPointerException("ERROR: No puede ser posición nula");
		}
		this.posicion = new Posicion(posicion);
	}

	//Mostrar estado del objeto
	@Override
	public String toString() {
		return String.format("color=%s, posicion=(%s)", color, posicion);
	}
	
	
}
