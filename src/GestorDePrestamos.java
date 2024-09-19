public class GestorDePrestamos {

    private Biblioteca biblioteca;

    public GestorDePrestamos() {
    }

    public GestorDePrestamos(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void realizarPrestamo(Usuario usuario, Libro libro) {
        return;
    }

public void registrarDevolucion(Usuario usuario, Libro libro) {
    Libro libroEnBiblioteca = biblioteca.buscarLibroPorISBN(libro.getISBN());
    
    if (libroEnBiblioteca == null) {
        System.out.println("Error: El libro no pertenece a esta biblioteca.");
        return;
    }

    if (!libroEnBiblioteca.getEstado().equals("Prestado")) {
        System.out.println("Error: El libro '" + libro.getTitulo() + "' no está prestado.");
        return;
    }

    libroEnBiblioteca.setEstado("Disponible");
    System.out.println("El libro '" + libro.getTitulo() + "' ha sido devuelto exitosamente por el usuario " + usuario.getNombre() + ".");
}

    @Override
    public String toString() {
        return "n/a";
    }
}
