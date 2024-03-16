import java.util.Scanner;
public class Ejercicio94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un numero entero para calcular su valor absoluto");
        System.out.print("- ");
        num = sc.nextInt();

        System.out.println("El |"+ num + "|  es "+ calcularValorAbsoluto(num));

    }

    public static int calcularValorAbsoluto(int n){
        int valorAbsoluto;

        if (n<0){
            valorAbsoluto = n * -1;
        } else if (n == 0){
            valorAbsoluto = 0;
        } else {
            valorAbsoluto = n;
        }
        return valorAbsoluto;
    }
}
