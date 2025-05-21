package Programa_Consola;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Persona> personas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        capturarPersonas();
        mostrarNombresYGeneros();
        System.out.println("\nPromedio de edades: " + calcularPromedioEdades());
        System.out.println("Cantidad de personas masculinas: " + contarPersonasPorGenero("Masculino"));
        System.out.println("Cantidad de personas femeninas: " + contarPersonasPorGenero("Femenino"));
    }

    // Método para capturar 5 personas
    public static void capturarPersonas() {
        for (int i = 0; i < 5; i++) {
            System.out.println("\nIngrese datos de la persona " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Género (Masculino/Femenino): ");
            String genero = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            Persona persona = new Persona(nombre, apellido, genero, edad);
            personas.add(persona);
        }
    }

    // Método para mostrar nombres y géneros
    public static void mostrarNombresYGeneros() {
        System.out.println("\nNombres y géneros de las personas:");
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre() + ", Género: " + persona.getGenero());
        }
    }

    // Método para calcular promedio de edades
    public static double calcularPromedioEdades() {
        int sumaEdades = 0;
        for (Persona persona : personas) {
            sumaEdades += persona.getEdad();
        }
        return (double) sumaEdades / personas.size();
    }

    // Método para contar personas por género
    public static int contarPersonasPorGenero(String genero) {
        int contador = 0;
        for (Persona persona : personas) {
            if (persona.getGenero().equalsIgnoreCase(genero)) {
                contador++;
            }
        }
        return contador;
    }
} 