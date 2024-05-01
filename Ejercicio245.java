import java.util.Scanner;

public class Ejercicio245
{
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Escribe la cantidad de los primeros numeros naturales a los que se sumarán los cuadrados ");
            num = sc.nextInt();
        } while (num<=0); sc.close();

        int sumCuadrados=0;
        for (int i = 1; i <= num; i++) {
            sumCuadrados+= i*i;
        }

        System.out.println("la suma de cuadrados de los primeros "+num+" numeros naturales es: "+sumCuadrados);
    }
}
