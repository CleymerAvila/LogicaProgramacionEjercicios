import java.util.Scanner;

public class Ejercicio165 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la cantidad en horas, minutos y segundos ");
        System.out.print("-Horas: "); double horas = sc.nextDouble();
        System.out.print("-Minutos: "); double minutos = sc.nextDouble();
        System.out.print("-Segundos: "); double segundos = sc.nextDouble();
        sc.close();


        double segundosDeHoras = horas * 3600;
        double segundosDeMinutos = minutos * 60;


        double segundosTotales = segundosDeHoras + segundosDeMinutos + segundos;
        System.out.println(segundosTotales);
    }
}