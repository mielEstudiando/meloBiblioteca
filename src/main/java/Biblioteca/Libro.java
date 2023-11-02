package Biblioteca;

import java.util.ArrayList;

public class Libro {
    private String Nombre, Autor,
    Editorial;

    public String getNombre() {
        return Nombre;
    }
    public String getAutor() {
        return Autor;
    }

    public String getEditorial() {
        return Editorial;
    }

    public ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();

    public Libro (){
        this.Autor = "Autor";
        this.Editorial = "Editorial";
        this.Nombre = "Nombre";
    }

    public Libro (String autor, String editorial, String nombre){
        this.Autor = autor;
        this.Editorial = editorial;
        this.Nombre = nombre;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public void setEditorial(String editorial) {
        Editorial = editorial;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
