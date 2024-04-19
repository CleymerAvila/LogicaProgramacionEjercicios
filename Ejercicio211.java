import java.util.Scanner;

public class Ejercicio211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final float PRECIO_BOCADILLO_JAMON = 15;
        final float PRECIO_BOCADILLO_QUESO = 10;
        final float PRECIO_PATATAS_FRITAS = 5;
        final float PRECIO_REFRESCOS = 3;
        final float PRECIO_CERVEZA = 4;

        System.out.println("Ingresas el numero cantidades de Bocadillos consumidas");
        System.out.print("Bocadillo de jamon: "); float cantBocadilloJamon = sc.nextFloat();
        System.out.print("Bocadillo de queso: "); float cantBocadilloQueso = sc.nextFloat();
        System.out.print("Patatas fritas: "); float cantPatatasFritas = sc.nextFloat();
        System.out.print("Refrescos: "); float cantRefrescos = sc.nextFloat();
        System.out.print("Cervezas: "); float cantCervezas = sc.nextFloat();

        float totalBocadilloJamon = cantBocadilloJamon * PRECIO_BOCADILLO_JAMON;
        float totalBocadilloQueso = cantBocadilloQueso * PRECIO_BOCADILLO_QUESO;
        float totalPatatasFritas = cantPatatasFritas * PRECIO_PATATAS_FRITAS;
        float totalRefrescos = cantRefrescos * PRECIO_REFRESCOS;
        float totalCervezas = cantCervezas * PRECIO_CERVEZA;

        float cuentaTotal = totalBocadilloJamon + totalBocadilloQueso + totalPatatasFritas
                + totalRefrescos + totalCervezas;

        System.out.println("El total de Bocadillo de jamon es: "+ totalBocadilloJamon);
        System.out.println("El total de Bocadillo de queso es: "+ totalBocadilloQueso);
        System.out.println("El total de Patatas fritas es "+ totalPatatasFritas);
        System.out.println("El total de refrescos es: "+ totalRefrescos);
        System.out.println("El total de Cervezas es: "+ totalCervezas);
        System.out.println("\nEl total de la cuenta es: "+ cuentaTotal);


    }
}
