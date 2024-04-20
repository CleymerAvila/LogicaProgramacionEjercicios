/**
 * Dada una secuencia de números leídos por teclado, que acabe con un–1, por
 *  ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,……,-1; Realizar el algoritmo que calcule la media
 *  aritmética. El usuario no debe insertar números negativos.
 */

import java.util.Scanner;

public class Ejercicio220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumNumeros=0;
        int num;
        int cantNumeros=0;
        do {
            System.out.println("Ingresa numeros acabara al ingresar -1");
             num = sc.nextInt();
            while (num < 0 && num!=-1){
                System.out.println("Valores no validos deben ser positivos intente de nuevo!");
                System.out.println("Ingresa numeros positivos acabara al ingresar -1");
                num = sc.nextInt();
            }
            if (num==-1){
                continue;
            }

            cantNumeros++;
            sumNumeros+=num;

        } while (num!=-1);

        double mediaAritmetica = (double) sumNumeros / cantNumeros;


        System.out.println("\nLa media aritmetica de los numeros ingresados antes de -1 es "+mediaAritmetica);
    }
}
