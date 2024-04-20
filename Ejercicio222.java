/**
 * 222. Algoritmo que lea números enteros hasta teclear 0, y nos muestre el máximo, el
 *  mínimo y la media de todos ellos. Piensa cómo debemos inicializar las variables.
 */

import java.util.Scanner;

public class Ejercicio222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=-1;
        int numMaximo=0;
        int numMinimo=0;
        int sumNumeros=0;
        float media;
        int cantNumeros=0;

        do {
            System.out.println("Ingresa numeros enteros parara al ingresar cero");
            num = sc.nextInt();
            if (num!=0){
                if (num>numMaximo){
                    numMaximo= num;
                }

                if (num<numMinimo){
                    numMinimo=num;
                }
                cantNumeros++;

                sumNumeros+=num;
            }


        } while (num != 0);

        media =(float) sumNumeros / cantNumeros;

        System.out.printf("\n%s %.2f","EL media de los numeros enteros ingresados es: ", media);
        System.out.println("\nEl maximo es el "+numMaximo);
        System.out.println("El minimo es el "+numMinimo);

    }
}
