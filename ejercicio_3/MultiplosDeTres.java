public class MultiplosDeTres {

    public static void main(String[] args) {
        int suma = 0;
        int iteraciones = 0;

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                suma += i;
                if (iteraciones < 5) {
                    System.out.printf("%d --------> %d%n", i, suma);
                } else {
                    if (iteraciones == 5) {
                        System.out.println("------------------");
                    }
                    System.out.println(i);
                }
                iteraciones++;
            }
        }
        System.out.printf("Suma total: %d%n", suma);
    }
}
