import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();

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


    public void agregarLibro(Libro libro) {
        if (buscarLibroPorISBN(libro.getISBN()) != null) {
            System.out.println("Error: El libro con ISBN '" + libro.getISBN() + "' ya existe en la biblioteca.");
        } else {
            libros.add(libro);
            System.out.println("El libro '" + libro.getTitulo() + "' ha sido agregado exitosamente.");
        }
    }

    public void registrarUsuario(Usuario usuario) {
            if (buscarUsuarioPorID(usuario.getIdentificacion()) != null) {
                System.out.println("Error: El usuario con ID '" + usuario.getIdentificacion() + "' ya está registrado.");
            } else {
                usuarios.add(usuario);
                System.out.println("El usuario '" + usuario.getNombre() + "' ha sido registrado exitosamente.");
            }
        }

    public Libro buscarLibroPorISBN(String isbn) {
        for (Libro libro : libros) {
            if (libro.getISBN().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public Usuario buscarUsuarioPorID(String id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdentificacion().equals(id)) {
                return usuario;
            }
        }
        return null;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Biblioteca:\n");
        sb.append("Libros:\n");
        if (libros.isEmpty()) {
            sb.append("  No hay libros en la biblioteca.\n");
        } else {
            for (Libro libro : libros) {
                sb.append("  ").append(libro.toString()).append("\n");
            }
        }

        sb.append("Usuarios:\n");
        if (usuarios.isEmpty()) {
            sb.append("  No hay usuarios registrados.\n");
        } else {
            for (Usuario usuario : usuarios) {
                sb.append("  ").append(usuario.toString()).append("\n");
            }
        }

        return sb.toString();
    }
}
