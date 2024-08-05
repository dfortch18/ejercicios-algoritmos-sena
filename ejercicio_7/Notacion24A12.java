import java.util.Scanner;

public class Notacion24A12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer hora24 = null;
        Integer hora12 = null;
        String periodo = null;

        while (true) {
            try {
                System.out.println("Digite la hora en formato 24 horas:");
                hora24 = scanner.nextInt();

                if (hora24 > 0 && hora24 < 24) {
                    break;
                } else {
                    System.out.println("Hora inválida, vuelva a digitarla");
                }
            } catch (Exception e) {
                System.out.println("Número invalido");
                scanner.next();
            }
        }

        if (hora24 < 12) {
            periodo = "a.m.";
        } else {
            periodo = "p.m.";
        }

        if (hora24 == 0) {
            hora12 = 12;
        } else if (hora24 > 12) {
            hora12 = hora24 - 12;
        } else {
            hora12 = hora24;
        }

        System.out.printf("\"La hora en notación 12 horas es: %d %s", hora12, periodo);

        scanner.close();
    }
}