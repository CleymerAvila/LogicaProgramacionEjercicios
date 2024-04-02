public class Ejercicio143 {
    public static void main(String[] args) {
        int sumaPares=0;

        for (int i = 1; i <= 100; i++) {
            if (i%2==0) {
                sumaPares+=i;
            }
        }

        System.out.println("La suma de los numeros comprendidos entre 1 y 100 es "+sumaPares);
    }
}
