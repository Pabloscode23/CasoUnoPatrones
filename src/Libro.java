public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private String estado;

    public Libro() {
    }

    public Libro(String titulo, String autor, String ISBN, String estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + " Autor: " + autor + " ISBN: " + ISBN + " Estado: " + estado;
    }
}