public class Usuario {

    private String nombre;
    private String identificacion;

    public Usuario(String identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public String getIdentificación() {
        return identificacion;
    }

    public void setIdentificación(String identificación) {
        this.identificacion = identificación;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "ID: " + identificacion + " Nombre: " + nombre;}
}
