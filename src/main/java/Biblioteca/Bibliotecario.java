package Biblioteca;

import java.util.ArrayList;

public class Bibliotecario {
	private String nombre;
	private String rut;
	private String direccion;
	private String id;
	public Biblioteca biblioteca;
	public ArrayList<Prestamo> prestamo = new ArrayList<Prestamo>();

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

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Bibliotecario() {
		this.nombre = "nombre";
		this.id = "id";
		this.rut = "rut";
		this.direccion = "dirección";
	}

	public Bibliotecario(String nombre, String id, String rut,
						 String direccion, Biblioteca trabajo){
		this.nombre = nombre;
		this.direccion = direccion;
		this.id = id;
		this.rut = rut;
		this.biblioteca = trabajo;
	}
}