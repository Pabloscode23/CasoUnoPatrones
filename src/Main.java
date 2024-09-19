import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static int opcion;
    static Biblioteca biblioteca = new Biblioteca();

    public static void main(String[] args) {

        menu();


        /*
        1. Menu con opciones: registrar usuario, agregar libro, realizar prestamo, realizar devolucion, salir.
        (se almacenan los libros y usuarios en la biblioteca)



        * */


    }

    public static void menu() {

        do {
            System.out.println("MENU DE OPCIONES A EJECUTAR");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Agregar libro");
            System.out.println("3. Realizar prestamo");
            System.out.println("4. Realizar devolucion");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = Integer.parseInt(scan.nextLine());
        } while (opcion != 5);
    }

    public static void accion() {
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el nombre del usuario: ");
                String nombre = scan.nextLine();
                System.out.println("Ingrese la identificacion del usuario: ");
                String identificacion = scan.nextLine();
                biblioteca.registrarUsuario(new Usuario(nombre,identificacion));
                break;

            case 2:
                System.out.println("Ingrese el título del libro: ");
                String titulo = scan.nextLine();
                System.out.println("Ingrese el autor del libro: ");
                String autor = scan.nextLine();
                System.out.println("Ingrese el ISBN del libro: ");
                String ISBN = scan.nextLine();
                biblioteca.agregarLibro(new Libro(titulo, autor, ISBN, "Disponible"));
                break;

            case 3:

                break;

            case 4:

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

