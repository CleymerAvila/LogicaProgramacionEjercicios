import java.util.Scanner;

public class Ejercicio235 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de los primeros numeros \nde la serie fibonaci imprimir");
        int cantidadFibonaci = Math.abs(sc.nextInt());


        int primerNumero=0;
        int segundoNumero=1;
        int sumaNums=0;
        String serieFibonaci=primerNumero + " "+ segundoNumero;
        for (int i = 2; i < cantidadFibonaci; i++) {
            sumaNums = primerNumero + segundoNumero;
            serieFibonaci+=" "+sumaNums;
            primerNumero = segundoNumero;
            segundoNumero = sumaNums;
        }

        System.out.println("\n"+serieFibonaci);

    }
}
