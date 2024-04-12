import java.util.Scanner;

/**
 *  171. Programa que permita la conversión de unidades (peso, distancia, temperatura)
    mostrando un menú para el usuario como el siguiente:
    ● 1–Libras a kilogramos
    ● 2–Millas a kilómetros
    ● 3–Galones alitros
    ● 4–Farenheit a centígrados
    ● 5-Salir
 */
public class Ejercicio171 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;

        do {
            menu();
            System.out.print("\nIngrese la opcion: ");
            opcion = sc.nextInt();
    
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese las libras a convertir");
                    double libras= sc.nextDouble();
                    System.out.println("\n"+libras+" libras equivalen aproximadamente a "+String.format("%.2f", conversionKG(libras))+" kilogramos");
                    pausa();
                    break;
                case 2: 
                    System.out.println("Ingrese la millas a convertir");
                    double millas = sc.nextDouble();
                    System.out.println("\n"+millas + " millas equivalen aproximadamente a "+ String.format("%.2f", conversionKM(millas))+ " Kilometros");
                    pausa();
                    break;
                case 3:
                    System.out.println("\nIngrese los Galones a convertir");
                    double galones = sc.nextDouble();
                    System.out.println("\n"+galones+" galones equivalen aproximadamente a "+ String.format("%.2f", conversionLT(galones))+ " Litros");
                    pausa();
                    break;
                case 4:
                    System.out.println("\nIngresa los grados farenheit a convetir");
                    double farenheit = sc.nextDouble();
                    System.out.println("\n"+farenheit+" grados Farenheit equivalen aproximadamente a "+ String.format("%.2f", conversionGC(farenheit))+ " grados centigrados");
                    pausa();
                    break;
                case 5: 
                    System.out.println("Haz salido del programa, esperamos tenerte de nuevo!!");
                    break;
                default:
                    System.out.println("La opcion es invalidad intentelo de nuevo");
                    pausa();
                    break;
            }
        } while (opcion != 5);
        
        
    }

    public static void menu(){
        System.out.println("\nMenu de conversion");
        System.out.println("1-Libras a kilogramos");
        System.out.println("2-Millas a kilómetros");
        System.out.println("3-Galones alitros");
        System.out.println("4-Farenheit a centígrados");
        System.out.println("5-Salir");
    }

    public static double conversionKG(double lib){
        return  lib * 0.453592;
    }

    public static double conversionKM(double millas){
        return millas * 1.60934;
    }

    public static double conversionLT(double galones){
        return galones * 3.78541;
    }

    public static double conversionGC(double farenheit){
        return (farenheit - 32) * 5 / 9;
    }

    public static void pausa(){
        sc.nextLine();
        System.out.println("\t\nPrecione enter para regresar al menu principal...");
        sc.nextLine();
    }
}
