import java.util.Scanner;

// Clase que permite leer datos de la consola
public class Teclado {
    // Scanner para leer datos de la consola
    private static final Scanner scanner = new Scanner(System.in);

    // Métodos para leer datos de la consola
    // Método para leer un número decimal.
    public static double readDouble() {
        // Variable para almacenar el número
        double numero;
        // Ciclo para leer el número, si no es un número válido se muestra un mensaje de error
        while (true) {
            try {
                numero = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Intente de nuevo:");
            }
        }
        return numero;
    }

    // Método para leer un número decimal positivo.
    public static double readDoublePositive(Scanner scanner, String mensaje) {
        // Variable para almacenar el número
        double numero;
        // Ciclo para leer el número, si no es un número válido se muestra un mensaje de error
        while (true) {
            System.out.println(mensaje);
            try {
                numero = Double.parseDouble(scanner.nextLine());
                if (numero > 0) {
                    return numero;
                }
                System.out.println("El número debe ser mayor que 0. Intente de nuevo:");
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Intente de nuevo:");
            }
        }
    }

    // Método para leer un número entero.
    public static int readInteger() {
        // Variable para almacenar el número
        int numero;
        // Ciclo para leer el número, si no es un número válido se muestra un mensaje de error
        while (true) {
            try {
                numero = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Intente de nuevo:");
            }
        }
        return numero;
    }

    // Método para leer un número entero positivo.
    public static String readText() {
        // Variable para almacenar el texto
        String texto;
        // Ciclo para leer el texto, si no es un texto válido se muestra un mensaje de error
        while (true) {
            texto = scanner.nextLine().trim();
            if (!texto.isEmpty()) {
                break;
            }
            System.out.println("El texto no puede estar vacío. Intente de nuevo:");
        }
        return texto;
    }
}
