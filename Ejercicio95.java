import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio95 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num;
        int[] arregloOrdenadoMayorAMenor;
        System.out.print("Ingrese la longitud del vector:");
        num = sc.nextInt();
        int vector[] = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese el entero en la posicion "+ (i+1)+ " del vector");
            vector[i] = sc.nextInt();
        }

        System.out.println("\nDesordenado");
        System.out.print("[");
        for (int i = 0; i < num; i++) {
            System.out.print(vector[i]+", ");
        }
        System.out.print("]\n");

        Arrays.sort(vector);

        System.out.println("\nOrdenado");
        System.out.print("[");
        for (int i = 0; i < num; i++) {
            System.out.print(vector[i]+", ");
        }
        System.out.print("]");

        arregloOrdenadoMayorAMenor = ordenarVectorDeMayoraMenor(vector,num);

        System.out.println();
        System.out.println("\nDe Mayor a menor");
        System.out.print("[");
        for (int i = 0; i < num; i++) {
            System.out.print(arregloOrdenadoMayorAMenor[i]+", ");
        }
        System.out.print("]");
    }

    public static int [] ordenarVectorDeMayoraMenor(int []array, int n){
        int [] arrayOrdenado = new int[n];
        for (int i = 0; i < array.length; i++) {
            arrayOrdenado[i] = array[array.length-(i+1)];
        }
        return arrayOrdenado;
    }
}
