import java.util.Scanner;

public class Ejercicio146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador=3;

        System.out.println("Ingresa un numero");
        int n = sc.nextInt();
        sc.close();

        int[] numeros = new int[n];

        numeros[0] = 1;
        numeros[1] = 1;

        for (int i = 2; i < numeros.length; i++) {
            numeros[i] = numeros[i-2] + numeros[i-1];
            if (numeros[i]>=n) {
                break;
            } else {
                contador++;
            }
        }

        int[] serieFibonaci = new int[contador];
        int j=0;
        for(int numero: numeros){
            serieFibonaci[j] = numero;
            j++;
            if (j>=contador) {
                break;
            }
        }

        for (int i = 0; i < serieFibonaci.length-1; i++) {
           System.out.print(serieFibonaci[i]+" ");
        }
    }
}
