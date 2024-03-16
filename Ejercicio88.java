import java.util.Scanner;
public class Ejercicio88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double voltaje1, voltaje2, voltaje3, promedioVoltaje;

        System.out.println("Ingresa 3 voltajes para verficar su riesgo:");
        System.out.print("Voltaje 1: ");
        voltaje1 = sc.nextDouble();
        System.out.print("Voltaje 2: ");
        voltaje2 = sc.nextDouble();
        System.out.print("Voltaje 3: ");
        voltaje3 = sc.nextDouble();

        promedioVoltaje = (voltaje1 + voltaje2 + voltaje3) / 3;

        if (promedioVoltaje < 115){
            System.out.println("\nVOLTAJE CORRECTO!");
        } else if (promedioVoltaje > 115 && promedioVoltaje < 220){
            System.out.println("\nALTO VOLTAJE!");
        } else {
            System.out.println("\nPELIGRO");
        }
    }
}
