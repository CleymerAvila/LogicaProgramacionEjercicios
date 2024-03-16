import java.util.Scanner;
public class Ejercicio93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiempoIngEnMinutos;

        System.out.println("Digite los minutos para mostrar hora, minutos y segundos");
        tiempoIngEnMinutos = sc.nextInt();

        mostrarHrsMinSeg(tiempoIngEnMinutos);
    }

    public static void mostrarHrsMinSeg(int tiempEnMinutos){
        int seg=0, min, hrs;

        hrs = tiempEnMinutos / 60;
        min = tiempEnMinutos % 60;

        System.out.println("\nLos minutos ingresados de "+ tiempEnMinutos+
        " equivalen a "+hrs + " horas, "+ min + " minutos y "+ seg+ " segundos.");
    }
}
