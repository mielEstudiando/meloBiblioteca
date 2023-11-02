import Biblioteca.*;

import java.time.LocalDate;

public class TesteoFeo {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Bibliotecario bibliotecario = new Bibliotecario();
        Usuario usuario = new Usuario();
        Libro libroMelo = new Libro("melo flaco","miel", "melo gordo");
        Libro libro = new Libro();
        biblioteca.AgregarLibro(libroMelo);
        biblioteca.AgregarLibro(libroMelo);
        System.out.println(biblioteca.LibroExiste(libroMelo));
        System.out.println(biblioteca.BuscarLibro("melo gordo"));
        System.out.println(biblioteca.ObtenerLibroPorAutor("melo flaco"));
        System.out.println(biblioteca.BuscarLibro("VFDFS"));
        biblioteca.GenerarPrestamo(bibliotecario, libroMelo, usuario,
                LocalDate.now(), LocalDate.now());
        biblioteca.GenerarPrestamo(bibliotecario, libro, usuario,
                LocalDate.now(), LocalDate.now());
        System.out.println(biblioteca.prestamos);
    }
}
