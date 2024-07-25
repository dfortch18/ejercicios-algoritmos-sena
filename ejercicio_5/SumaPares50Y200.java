public class SumaPares50Y200 {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 50; i <= 200; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }

        System.out.println("Suma total de los números pares entre 50 y 200: " + suma);
    }
}
