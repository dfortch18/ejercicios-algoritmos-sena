public class PotenciasDeDos {
    public static void main(String[] args) {
        int potencia = 0;
        int resultado = 1;

        while (resultado <= 100) {
            System.out.printf("2^%d = %d%n", potencia, resultado);
            potencia++;
            resultado *= 2;
        }
    }
}
