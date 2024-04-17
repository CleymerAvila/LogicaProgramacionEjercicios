import java.util.Scanner;

public class Ejercicio194 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;

        System.out.println("Ingresa 10 numero para ordenarlos");
        int numeros[] = new int[10];

        // Ingreso de numeros
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numeros "+(i+1)+": ");
            numeros[i] = sc.nextInt();
        } sc.close();

        // Ordenar numeros de menor a mayor
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Intercambiar los números
                    temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("\nNumeros ordenados: ");
        for (int i : numeros) {
            System.out.print(i);
        }
    }
}