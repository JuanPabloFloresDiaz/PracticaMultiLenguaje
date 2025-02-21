import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Objeto Scanner para leer datos de la consola
        Scanner scanner = new Scanner(System.in);
        // Se pide al usuario que ingrese la base y la altura del rectángulo 
        double base = Teclado.readDoublePositive(scanner, "Ingrese la base del rectángulo:");
        double altura = Teclado.readDoublePositive(scanner, "Ingrese la altura del rectángulo:");
        // Se calcula el área del rectángulo
        double area = base * altura;
        // Se muestra el área del rectángulo
        System.out.println("El área del rectángulo es: " + area);
    }
}