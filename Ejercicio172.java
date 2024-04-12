/**
 * 172. Programa que muestre los 12 periodos(meses), anteriores de acuerdo al
    periodo indicado por el usuario en formato MM AAAA. Ejemplo : 10-2011 = 09-2011
    , 08-2011, 07-2011 , 06-2011, 05-2011 , 04-2011 , 03-2011 , 02-2011 , 01-2011 ,
    12-2010 , 11-2010, 10-2010 .
 */

import java.util.Scanner;

public class Ejercicio172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el periodo en formato MM AAAA");
        String periodoString = sc.nextLine(); sc.close();

        int mes = Integer.parseInt(periodoString.substring(0,2));
        int anio = Integer.parseInt(periodoString.substring(3, 7));

        String periodos[] = new String[12];
        for (int i = 0; i < 12; i++) {
            mes--;
            if(mes==0){
                mes=12;
                anio= anio-1;
            }
            periodos[i] = ""+(mes)+"-"+anio;
        }

        System.out.print(periodoString + " = ");
        for (String periodo : periodos) {
            System.out.print(periodo+ " , ");
        }
    }
}
