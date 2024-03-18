import java.util.Scanner;
public class Ejercicio100 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2, suma;
        boolean par;

        System.out.println("Ingresa dos numero para verificar si la suma es par o impar");
        System.out.print("Numero 1: ");
        n1 = leer.nextInt();
        System.out.print("Numero 2. ");
        n2 = leer.nextInt();
        leer.close();

        suma = n1 + n2;

        par = calcularParoImpar(suma);

        if (par){
            System.out.println("\nLa suma "+ suma + " es un numero par");
        } else {
            System.out.println("\nLa suma "+ suma+ " es un numero impar");
        }
    }

    public static boolean calcularParoImpar(int numero){
        boolean par= false;
        if (numero % 2 == 0){
            par = true;
        }
        return par;
    }
}
