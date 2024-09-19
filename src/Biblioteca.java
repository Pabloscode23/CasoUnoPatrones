import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
    }

    public Biblioteca(ArrayList<Libro> libros, ArrayList<Usuario> usuarios) {
        this.libros = libros;
        this.usuarios = usuarios;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public Libro getLibro() {
        if (!libros.isEmpty()) {
            return libros.get(0);
        }
        return null;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }


    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public Usuario getUsuario() {
        if (!usuarios.isEmpty()) {
            return usuarios.get(0);
        }
        return null;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }


    public void agregarLibro(String titulo, String autor, String ISBN, String estado) {
        Libro l = new Libro(titulo, autor, ISBN, estado);
        this.libros.add(l);
    }


    public void registrarUsuario(String nombre, String identificacion) {
        Usuario u = new Usuario(nombre, identificacion);
        this.usuarios.add(u);
    }


    @Override
    public String toString() {
        return "Biblioteca{" +
                "libros=" + libros +
                ", usuarios=" + usuarios +
                '}';
    }
}
