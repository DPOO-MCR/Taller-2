package taller2.consola;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import taller2.modelo.Restaurante;



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
                ejecutarCargarMenu();
            } else if (opcion == 2) {
                System.out.println("Has elegido la opción 2");
                ejecutarPedido();
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
    
    
    
    
    private static void ejecutarCargarMenu()
	{
		System.out.println("\n" + "Mostrar el menú" + "\n");

		


			 
			// MENU
		        Map<String, String> datosAgrupados = new HashMap<>();

		        try (BufferedReader br = new BufferedReader(new FileReader("data/menu.txt"))) {
		            String linea;
		            while ((linea = br.readLine()) != null) {
		                String[] partes = linea.split(";");
		                String a = partes[0];
		                String b = partes[1];

		                
		                if (datosAgrupados.containsKey(a)) {
		                    String bAnterior = datosAgrupados.get(a);
		                    datosAgrupados.put(a, bAnterior + ": " + b);
		                } else {
		                    datosAgrupados.put(a, b);
		                }
		            }
		        } catch (IOException e) {
		            e.printStackTrace();
		        }

		        
		        System.out.println("\n" + "Menu" + "\n");
		        for (Map.Entry<String, String> entry : datosAgrupados.entrySet()) {
		            String a = entry.getKey();
		            String b = entry.getValue();
		            System.out.println(a + ": " + b);
		        }
		        
		     // INGREDIENTES
		        
		        Map<String, String> datosIngredientes = new HashMap<>();

		        try (BufferedReader br = new BufferedReader(new FileReader("data/ingredientes.txt"))) {
		            String linea;
		            while ((linea = br.readLine()) != null) {
		                String[] partes = linea.split(";");
		                String a = partes[0];
		                String b = partes[1];

		                if (datosIngredientes.containsKey(a)) {
		                    String bAnterior = datosIngredientes.get(a);
		                    datosIngredientes.put(a, bAnterior + ": " + b);
		                } else {
		                	datosIngredientes.put(a, b);
		                }
		            }
		        } catch (IOException e) {
		            e.printStackTrace();
		        }


		        System.out.println("\n" + "Ingredientes" + "\n");
		        for (Map.Entry<String, String> entry : datosIngredientes.entrySet()) {
		            String a = entry.getKey();
		            String b = entry.getValue();
		            System.out.println(a + ": " + b);
		        }
		        
		        
	// COMBOS	            
		            String line = "";
		            String delimiter = ";"; 

		            System.out.println("\n" + "Combos" + "\n");
		            try (BufferedReader br = new BufferedReader(new FileReader("data/combos.txt"))) {
		                while ((line = br.readLine()) != null) {
		                    String[] data = line.split(delimiter);
		                    String output = data[0] + " (" + data[1] + "): " + data[2] + ", " + data[3] + ", " + data[4];
		                    System.out.println(output);
		                }
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
    
		
}	

    
    private static void ejecutarPedido()
    {
    	System.out.println("\n" + "Realizar un pedido" + "\n");

    	
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();


        System.out.print("Ingrese su dirección: ");
        scanner.nextLine(); 
        String direccion = scanner.nextLine();

        

        System.out.println("Su nombre es " + nombre );
        System.out.println("Su dirección es " + direccion + ".");
        scanner.close();
    }




}

	

