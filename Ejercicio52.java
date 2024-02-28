import java.util.Scanner;

public class Ejercicio52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Ingresa un numero");
        numero = sc.nextInt();
        sc.close();

        tablaMultiplicar(numero);

    }

    public static void tablaMultiplicar(int num){
        for (int i = 0; i <= 10; i++) {
            System.out.println(num +" X "+i+ " = "+(num*i));
        }
        

    }
}
