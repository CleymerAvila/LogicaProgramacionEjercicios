import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double longCabelloCM, longCabelloMT;
        int edad;

        System.out.println("Ingrese la edad para calcular la longitud del cabello \nsuponiendo quee nunca hubiera sido cortado");
        System.out.print("Edad: ");
        edad = sc.nextInt();
        sc.close();

        double edadEnMeses= edad*12;
        longCabelloCM = (edadEnMeses/2)*1;
        longCabelloMT = longCabelloCM / 100;

        System.out.println("La longitud del cabello con respecto a "+ edad + " años de edad: "+longCabelloMT + " metros");
    }

    
}
