import java.util.Scanner;

public class Ejercicio213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el tiempo recorrido hacia la ruta los dias lunes, miercoles y viernes en minutos");
        System.out.print("tiempo recorrido el lunes (m): ");
        float minRecorridoLunes = sc.nextFloat();
        System.out.print("tiempo recorrido el miercoles (m): ");
        float minRecorridoMiercoles = sc.nextFloat();
        System.out.print("tiempo recorrido el viernes (m): ");
        float minRecorridoViernes = sc.nextFloat();

        float promedioMinRecorridoxSemana = (minRecorridoLunes+minRecorridoMiercoles+minRecorridoViernes)/3;

        System.out.printf("\n%s %.2f %s ","El tiempo recorrido promedio por semana es de ", promedioMinRecorridoxSemana, " minutos");
    }
}
