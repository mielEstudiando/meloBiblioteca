package Biblioteca;

import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private String rut;
	private String telefono;
	public ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Usuario() {
		throw new UnsupportedOperationException();
	}
}