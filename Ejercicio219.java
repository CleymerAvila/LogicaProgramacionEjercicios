/**
 * 219. Se pide representar el algoritmo que nos calcule la suma de los N primeros
 *  números pares. Es decir, si insertamos un 5, nos haga la suma de 6+8+10+12+14.
 */

import java.util.Scanner;

public class Ejercicio219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum=0;

        do {
            System.out.println("Ingresa un numero ");
            num = sc.nextInt();
        } while (num < 0);

        if (num % 2 != 0){

            num++;
            sum=num;
            int numerosImprimidos=1;
            System.out.print(""+num);
            while (numerosImprimidos<5){
                numerosImprimidos++;
                num+=2;
                sum+=num;
                System.out.print("+"+num);
                if (numerosImprimidos==5){
                    break;
                }

            }
            System.out.print(" = "+sum);
        } else {
            int numImprimidos=1;
            num+=2;
            sum=num;
            System.out.print(""+num);
            while (numImprimidos<5){
                numImprimidos++;
                num+=2;
                sum+=num;
                System.out.print("+"+num);
                if (numImprimidos==5){
                    break;
                }

            }
            System.out.print(" = "+sum);
        }

    }
}
