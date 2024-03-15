import java.util.Scanner;
public class Ejercicio86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double voltaje1, voltaje2, voltaje3, voltaje4, voltaje5, promedioVoltaje;

        System.out.println("Ingresa los 5 voltajes");
        System.out.print("- ");
        voltaje1 = sc.nextDouble();
        System.out.print("- ");
        voltaje2 = sc.nextDouble();
        System.out.print("- ");
        voltaje3 = sc.nextDouble();
        System.out.print("- ");
        voltaje4 = sc.nextDouble();
        System.out.print("- ");
        voltaje5 = sc.nextDouble();

        promedioVoltaje = calcularPromedio(voltaje1, voltaje2, voltaje3, voltaje4,voltaje5);

        if (promedioVoltaje > 220){
            System.out.println("Voltaje promedio: "+ promedioVoltaje);
            System.out.println("ALTO VOLTAJE");
        } else {
            System.out.println("Voltaje promedio: "+ promedioVoltaje);
            System.out.println("VOLTAJE CORRECTO");
        }
    }

    public static double calcularPromedio(Double volt1, Double volt2, Double volt3, Double volt4, Double volt5){
        double promedio;
        promedio = (volt1 + volt2 + volt3 + volt4 + volt5)/5;
        return  promedio;
    }
}
