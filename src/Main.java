import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    static Biblioteca biblioteca = new Biblioteca();
    static GestorDePrestamos gestor = new GestorDePrestamos(biblioteca);

    public static void main(String[] args) {

        menu();


        /*
        1. Menu con opciones: registrar usuario, agregar libro, realizar prestamo, realizar devolucion, salir.
        (se almacenan los libros y usuarios en la biblioteca)



        * */


    }

    public static void menu() {
         int opcion;
        do {
            System.out.println("MENU DE OPCIONES A EJECUTAR");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Agregar libro");
            System.out.println("3. Realizar prestamo");
            System.out.println("4. Realizar devolucion");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = Integer.parseInt(scan.nextLine());
            accion(opcion);
        } while (opcion != 5);
    }

    public static void accion(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el nombre del usuario: ");
                String nombre = scan.nextLine();
                System.out.println("Ingrese la identificacion del usuario: ");
                String identificacion = scan.nextLine();
                biblioteca.registrarUsuario(new Usuario(identificacion, nombre));
                System.out.println(biblioteca);
                break;

            case 2:
                System.out.println("Ingrese el título del libro: ");
                String titulo = scan.nextLine();
                System.out.println("Ingrese el autor del libro: ");
                String autor = scan.nextLine();
                System.out.println("Ingrese el ISBN del libro: ");
                String ISBN = scan.nextLine();
                biblioteca.agregarLibro(new Libro(titulo, autor, ISBN, "Disponible"));
                System.out.println(biblioteca);
                break;

            case 3:

                break;

            case 4:
            System.out.println("Ingrese la identificación del usuario que realiza la devolución: ");
            String idUsuario = scan.nextLine();
            Usuario usuario1 = biblioteca.buscarUsuarioPorID(idUsuario);

            if (usuario1 == null) {
                System.out.println("Error: Usuario no encontrado.");
                break;
            }

            System.out.println("Ingrese el ISBN del libro a devolver: ");
            String isbnLibroDev = scan.nextLine();
            Libro libro1 = biblioteca.buscarLibroPorISBN(isbnLibroDev);

            if (libro1 == null) {
                System.out.println("Error: Libro no encontrado.");
                break;
            }

            gestor.registrarDevolucion(usuario1, libro1);
            System.out.println(biblioteca);
                break;


            case 5:
                System.out.println("Decidiste salir.");
                break;

            default:
                System.out.println("Opción Inválida, debe hacer una pausa, limpiar pantalla y volver al menú.");
                break;
        }
    }
}

