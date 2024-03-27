import java.util.Scanner;

public class Ejercicio129 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;
        int anio;
        boolean bisiesto=false;
        int cantdias;

        do {
            System.out.println("Ingresa el mes y el año para verificar la cantidad dias de dicho mes");
            System.out.print("Mes: "); mes = sc.nextInt();
            System.out.print("Año: "); anio = sc.nextInt();
        } while (mes<=0 || mes > 12 || anio < 1000 || anio > 4000); sc.close();

        if (anio % 4 == 0 && anio % 100 !=0) {
            bisiesto=true;
        } else if (anio % 4 == 0 && anio % 100 == 0 && anio % 400 ==0) {
           bisiesto = true;
        } else {
            bisiesto=false;
        }

        if (mes==1) {
            cantdias=31;
        } else if (mes==2) {
            if (bisiesto) {
                cantdias=29;
            } else {
                cantdias = 28;
            }
        } else if (mes==3) {
            cantdias=31;
        } else if (mes==4) {
            cantdias=30;
        } else if (mes==5) {
            cantdias=31;
        } else if (mes==6) {
            cantdias=30;
        } else if (mes==7) {
            cantdias=31;
        } else  if (mes==8) {
            cantdias=31;
        } else if (mes==9) {
            cantdias=30;
        } else if (mes==10) {
            cantdias=31;
        } else if (mes==11) {
            cantdias=30;
        } else {
            cantdias=31;
        }

        System.out.println("La cantidad de dias del mes "+ mes + " del año "+anio + " es "+cantdias);

    }
}
