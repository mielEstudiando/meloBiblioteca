package Biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> ListaDeLibros;
    private  String NombreDeBiblioteca;
    private String Direccion;
    public ArrayList<Usuario> usuario = new ArrayList<Usuario>();
    public ArrayList<Bibliotecario> bibliotecarios = new ArrayList<Bibliotecario>();
    public ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
    public String getDireccion() {
        return Direccion;
    }

    public String getNombreDeBiblioteca() {
        return NombreDeBiblioteca;
    }

    public ArrayList<Libro> getListaDeLibros() {
        return ListaDeLibros;
    }

    public Biblioteca(){
        this.Direccion="Dirección";
        this.ListaDeLibros= new ArrayList<Libro>();
        this.NombreDeBiblioteca="Nombre";
    }
    public Biblioteca(String direccion, String nombre){
        this.Direccion = direccion;
        this.ListaDeLibros = new ArrayList<Libro>();
        this.NombreDeBiblioteca = nombre;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public void setNombreDeBiblioteca(String nombreDeBiblioteca) {
        NombreDeBiblioteca = nombreDeBiblioteca;
    }

    public void setListaDeLibros(ArrayList<Libro> listaDeLibros) {
        ListaDeLibros = listaDeLibros;
    }

    public void AgregarLibro(Libro libro) {
        if (!LibroExiste(libro)) this.ListaDeLibros.add(libro);
    }

    public Boolean LibroExiste(Libro libro){
        for (Libro libroExistente : this.ListaDeLibros){
            if (libro.getNombre().equals(libroExistente.getNombre())){
                return true;
            } else return false;
        }
        return false;
    }

    public Libro BuscarLibro(String libro){
        for (Libro libros : this.ListaDeLibros){
            if (libros.getNombre().equals(libro)) {
                return libros;
            } else return null;
        }
        return null;
    }

    public ArrayList<Libro> ObtenerLibroPorAutor(String autor){
        ArrayList<Libro> libros = new ArrayList<Libro>();
        for (Libro libro : this.ListaDeLibros){
            if (libro.getAutor().equals(autor)){
                libros.add(libro);
            }
        }
        return libros;
    }

    public Prestamo GenerarPrestamo(Bibliotecario bibliotecario, Libro libro,
                                    Usuario usuario, LocalDate fechaInicio,
                                    LocalDate fechaFin){
        Prestamo prestamo = new Prestamo(bibliotecario, libro, usuario,
                fechaInicio, fechaFin, this);
        this.prestamos.add(prestamo);
        libro.prestamos.add(prestamo);
        usuario.prestamos.add(prestamo);
        bibliotecario.prestamo.add(prestamo);
        return prestamo;
    }
}
