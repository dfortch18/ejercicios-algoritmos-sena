import java.util.Scanner;

public class CelsiusAFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite la temperatura en grados Celsius (C°): ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        
        System.out.println("La cantidad en grados Fahrenheit (F) es: " + fahrenheit);
        
        scanner.close();
    }
}
