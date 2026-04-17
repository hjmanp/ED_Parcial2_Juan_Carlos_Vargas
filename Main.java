import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDobleCircular lista = new ListaDobleCircular();
        int opcion;

        do {
            System.out.println("\n--- LISTA DOBLEMENTE ENLAZADA CIRCULAR ---");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Eliminar al inicio");
            System.out.println("4. Eliminar al final");
            System.out.println("5. Buscar elemento");
            System.out.println("6. Imprimir lista");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            
            // Verificación simple para evitar errores si el usuario ingresa texto
            if (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next(); 
                opcion = 0;
                continue;
            }
            
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número a insertar al inicio: ");
                    lista.insertarAlInicio(scanner.nextInt());
                    lista.imprimir();
                    break;
                case 2:
                    System.out.print("Ingrese el número a insertar al final: ");
                    lista.insertarAlFinal(scanner.nextInt());
                    lista.imprimir();
                    break;
                case 3:
                    lista.eliminarAlInicio();
                    lista.imprimir();
                    break;
                case 4:
                    lista.eliminarAlFinal();
                    lista.imprimir();
                    break;
                case 5:
                    System.out.print("Ingrese el número a buscar: ");
                    lista.buscarElemento(scanner.nextInt());
                    break;
                case 6:
                    lista.imprimir();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 7);

        scanner.close();
    }
}