import java.util.Scanner;

public class Ejercicio160 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tiempo en segundos: ");
        int segundos = entrada.nextInt(); entrada.close();

        // Conversión a días
        int dias = segundos / (60 * 60 * 24);
        int horasRestantes = segundos % (60 * 60 * 24);

        // Conversión a horas
        int horas = horasRestantes / (60 * 60);
        int minutosRestantes = horasRestantes % (60 * 60);

        // Conversión a minutos
        int minutos = minutosRestantes / 60;

        // Mostrar resultado
        System.out.println(segundos+" Segundos ingresados Equivalente en días, horas y minutos:");
        System.out.println(dias + " días");
        System.out.println(horas + " horas");
        System.out.println(minutos + " minutos");
    }
}
