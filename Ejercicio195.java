import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio195 {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    
        System.out.println("Ingrese un vector ordenado de 20 elementos y un elemento a buscar (entero)");
        int numerosv[] = new int[20];
        for (int i = 0; i < numerosv.length; i++) {
            System.out.print("Numero "+(i+1)+ ": ");
            numerosv[i] = sc.nextInt();
        }

        //
        
        System.out.println("Elemento a buscar: ");
        //
        
        int elementoABuscar = sc.nextInt();


        if (!vectorEstaOrdenado(numerosv)) {
            Arrays.sort(numerosv);
        }

        int indice = busquedaBinaria(numerosv, elementoABuscar);

        if (indice!=-1) {
            System.out.println("\nEl elemento buscado ("+ elementoABuscar + ") se encuentra en el indice "+indice+ " del arreglo");
            for (int i = 0; i < numerosv.length; i++) {
                System.out.print(numerosv[i]+" ");
            }
        } else {
            System.out.println("\nEl elemento a buscar no se encuentra en el arreglo");
        }

        
    }

    public static boolean vectorEstaOrdenado(int[] num){
        for (int i = 0; i < num.length; i++) {
            if (num[i]>num[i+1]) {
                return false;
            }
        }

        return true;
    }

    public static int busquedaBinaria(int[] arreglo, int elemento) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            
            if (arreglo[medio] == elemento) {
                return medio;  // Se encontró el elemento, devuelve el índice
            } else if (arreglo[medio] < elemento) {
                inicio = medio + 1;  // Buscar en la mitad derecha
            } else {
                fin = medio - 1;  // Buscar en la mitad izquierda
            }
        }
        
        return -1;  // El elemento no se encuentra en el arreglo
    }
}
