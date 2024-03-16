import java.util.Random;
import java.util.Scanner;
public class Ejercicio92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int n, productoEscalar;

        System.out.println("Ingrese el tamaño de ambos arreglos");
        n = sc.nextInt();

        int[] arregloA = new int[n];
        int[] arregloB = new int[n];

        for (int i=0; i < n; i++){
            arregloA[i] = aleatorio.nextInt(100);
            arregloB[i] = aleatorio.nextInt(100);
        }

        System.out.println("EL Producto escalar entre los siguientes dos vectores");
        System.out.print("[");
        for (int j = 0; j < arregloA.length;j++ ){
            System.out.print(arregloA[j]+ ", ");
        }
        System.out.print("]");

        System.out.print("\n[");
        for (int z = 0; z < arregloB.length;z++ ){
            System.out.print(arregloB[z]+ ", ");
        }
        System.out.print("]");

        productoEscalar = calcularProductoEscalar(arregloA, arregloB);

        System.out.println();
        System.out.print("\nEs ");
        for (int i = 0; i < n; i++) {
            if (i< n-1){
                System.out.print(arregloA[i]*arregloB[i]+ " + ");
            } else {
                System.out.print(arregloA[i]*arregloB[i]);
            }

        }
        System.out.print(" = "+ productoEscalar);

    }

    public static int calcularProductoEscalar(int[] array1, int[] array2){
        int productoEscalar=0;
        for (int i = 0; i < array1.length; i++) {
            productoEscalar = productoEscalar + array1[i] * array2[i];
        }

        return productoEscalar;
    }
}
