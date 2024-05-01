// 246. Escribir un programa que calcule la siguiente serie: 10 + 21 + 32 +… + nn-1.
import java.util.Scanner;

public class Ejercicio246
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cantNum;

        System.out.println("Ingresa la cantidad de numeros para suma de la serie");
        cantNum = sc.nextInt();

        int sumNumerosSerie=0;
        for (int i = 1; i <= cantNum; i++) {
            String num="";
            num=""+ i + (i-1);
            sumNumerosSerie += Integer.parseInt(num);
        }

        System.out.println("La suma de los "+cantNum+" primeros numeros de la serie es: "+sumNumerosSerie);

    }
}
