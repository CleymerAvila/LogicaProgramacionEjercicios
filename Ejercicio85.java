import java.util.Scanner;
public class Ejercicio85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        boolean numeroPar;

        System.out.println("Ingrese un numero entero para calcular si es par o impar");
        System.out.print("- ");
        numero = sc.nextInt();

        numeroPar = calcularNumPar(numero);

        if (numeroPar){
            System.out.println("\nEl numero ingresado "+ numero+ " es un numero Par");
        } else {
            System.out.println("\nEl numero ingresado "+ numero + " es un numero Impar");
        }
    }
    public static boolean calcularNumPar(int num){
        boolean par=false;
        if (num % 2 == 0){
            par=true;
        }
        return  par;
    }
}
