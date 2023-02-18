package taller2.consola;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class ConsolaHamburguesas {
    
    private Scanner scanner;

    public ConsolaHamburguesas() {
        scanner = new Scanner(System.in);
    }

    public String input(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        ConsolaHamburguesas consola = new ConsolaHamburguesas();
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("\nTaller 2 Hamburguesas Mateo Calderón Rincón\n");
            System.out.println("1. Mostrar el menú");
            System.out.println("2. Iniciar un nuevo pedido");
            System.out.println("3. Agregar un elemento a un pedido");
            System.out.println("4. Cerrar un pedido y guardar la factura");
            System.out.println("5. Consultar la información de un pedido dado su id");
            System.out.println("6. Salir de la aplicación\n");

            String opcionStr = consola.input("Por favor seleccione una opción: ");
            int opcion = Integer.parseInt(opcionStr);

            if (opcion == 1) {
                System.out.println("Has elegido la opción 1");
            } else if (opcion == 2) {
                System.out.println("Has elegido la opción 2");
            } else if (opcion == 3) {
                System.out.println("Has elegido la opción 3");
            } else if (opcion == 4) {
                System.out.println("Has elegido la opción 4");
            } else if (opcion == 5) {
                System.out.println("Has elegido la opción 5");
            } else if (opcion == 6) {
                System.out.println("Saliendo del programa...");
                continuar = false;
            } else {
                System.out.println("Opción no válida, por favor elige de nuevo.");
            }
        }
    }
}
