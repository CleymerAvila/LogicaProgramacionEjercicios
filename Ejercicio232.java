import java.util.Scanner;

public class Ejercicio232 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el cantidad de numero: ");
        int cantNumeros = sc.nextInt();

        int positivos=0;
        int negativos=0;
        int neutros=0;
        for (int i = 0; i < cantNumeros; i++) {
            System.out.print("Numero "+(i+1)+": ");
            int num = sc.nextInt();

            if (num > 0){
                positivos++;
            } else if (num < 0){
                negativos++;
            } else {
                neutros++;
            }
        }

        System.out.println("\nPositivos: "+positivos);
        System.out.println("Negativos: "+negativos);
        System.out.println("Neutros: "+neutros);
    }
}
