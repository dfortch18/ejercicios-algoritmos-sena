import java.util.Scanner;

public class SumaOProducto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a continuación 3 números:");
        
        try {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            int n3 = scanner.nextInt();
            int resultado;

            if (n1 > 0) {
                resultado = n2 * n3;
            } else {
                resultado = n2 + n3;
            }

            System.out.println(resultado);
        } catch (Exception e) {
            System.out.println("Número inválido");
        }
        
        scanner.close();
    }
}
