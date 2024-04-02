public class Ejercicio144 {
    public static void main(String[] args) {
        int sumaPares=0;
        Long multImpares=1L;

        for (int i = 1; i <= 100; i++) {
            if (i%2==0) {
                sumaPares+=i;
            }

            if (i%2!=0) {
                multImpares*=i;
            }
        }

        System.out.println("La suma de los numeros pares entre 1 y 100 es: "+sumaPares);
        System.out.println("La multiplicion de los numeros impares comprendidos entre 1 y 100 es: "+multImpares);
    }
}
