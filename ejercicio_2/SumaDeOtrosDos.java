import java.util.Scanner;

public class SumaDeOtrosDos {

    public static void main(String[] args) {
        Integer n1 = null;
        Integer n2 = null;
        Integer n3 = null;
        Integer suma = null;
        Integer sumando1 = null;
        Integer sumando2 = null;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a continuación 3 números:");
        
        try {
            n1 = scanner.nextInt();
            n2 = scanner.nextInt();
            n3 = scanner.nextInt();

            if (n1.equals(n2 + n3)) {
                suma = n1;
                sumando1 = n2;
                sumando2 = n3;
            } else if (n2.equals(n1 + n3)) {
                suma = n2;
                sumando1 = n1;
                sumando2 = n3;
            } else if (n3.equals(n1 + n2)) {
                suma = n3;
                sumando1 = n1;
                sumando2 = n2;
            }

            if (suma != null) {
                System.out.printf("El número %d es la suma de %d + %d%n", suma, sumando1, sumando2);
            } else {
                System.out.println("Ningún número es la suma de los otros dos.");
            }

        } catch (Exception e) {
            System.out.println("Número inválido");
        }

        scanner.close();
    }
}
