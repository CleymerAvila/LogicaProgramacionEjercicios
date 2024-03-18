import java.util.Scanner;
public class Ejercicio99 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int anioIngr;
        boolean bisiesto;

        do {
            System.out.println("Ingresa un año para comprobar si es bisiesto");
            System.out.print("- ");
            anioIngr = sc.nextInt();
        } while (anioIngr < 400);
        sc.close();

        bisiesto = calcularBisiesto(anioIngr);

        if(bisiesto){
            System.out.println("\nEl año "+ anioIngr+ " es un año bisiesto");
        } else {
            System.out.println("\nEl año "+ anioIngr+" no es un año bisiesto");
        }


    }

    public static boolean calcularBisiesto(int anio){
        boolean bisiesto = false;
        if (anio % 4 == 0 && anio % 100 !=0) {
            bisiesto = true;
        } else if (anio % 4 == 0 && anio % 100 == 0 && anio % 400 ==0) {
            bisiesto = true;
        }
        return bisiesto;
    }
}
