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
        return;
    }

    @Override
    public String toString() {
        return "n/a";
    }
}
