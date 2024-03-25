import java.util.Scanner;

public class Ejercicio121 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int sumaNumeros=0;
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el numero "+(i+1));
            numeros[i] = sc.nextInt();
            sumaNumeros = sumaNumeros + numeros[i];
        } sc.close();

        System.out.println("\nLa suma de los 5 numeros es "+ sumaNumeros);
    }
}