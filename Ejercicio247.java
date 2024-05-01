import java.util.Scanner;

public class Ejercicio247
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba un numero para calcular su cuadrado");
        int num = sc.nextInt();

        int cuadrado=0;
        int contador=1;
        int  suma=contador;
        while (contador<=num){
            cuadrado+=suma;
            contador++;
            suma+=2;
        }

        System.out.println("El cuadrado de "+num+ " es: "+cuadrado);
    }
}
