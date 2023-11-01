package Biblioteca;

public class Prestamo {
	private Bibliotecario bibliotecario;
	private Usuario usuario;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private Libro libro;
	public Biblioteca biblioteca;
	public Libro libro;
	public Usuario usuario;
	public Bibliotecario bibliotecario;

	public Bibliotecario getBibliotecario() {
		return this.bibliotecario;
	}

	public void setBibliotecario(Bibliotecario bibliotecario) {
		this.bibliotecario = bibliotecario;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public LocalDate getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Libro getLibro() {
		return this.libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Prestamo() {
		throw new UnsupportedOperationException();
	}
}