public class Ejercicio115 {
    public static void main(String[] args) {
        int sumPares=0;
        for (int i = 1; i <= 1000; i++) {
            
            if (i % 2 == 0) {
                System.out.print(i+" + ");
                sumPares = sumPares + i;
            }
        }

        System.out.println("\n\nSuma Pares del 1-1000: "+sumPares);
    }
}
