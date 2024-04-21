import java.util.Scanner;

public class Ejercicio234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero para conprobar si es capicuá o no");
        String numero = String.valueOf(sc.nextInt());

        String numAlreves="";

        for (int i = numero.length()-1; i >= 0; i--) {
            numAlreves+=numero.charAt(i);
        }

        if (numAlreves.equals(numero)){
            System.out.println("\nEl numero ingresado es capicuá");
        } else {
            System.out.println("\nEl numero ingresado no es capicuá");
        }
    }
}
