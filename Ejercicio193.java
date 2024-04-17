import java.util.Scanner;

public class Ejercicio193 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int cociente=0;
        int residuo=0;
        String binarioAlreves="";

        System.out.println("Ingresa un numero para convertir a binario");
        int numero = leer.nextInt(); leer.close();


        while (cociente!=1) {
            cociente = numero / 2;
            residuo  = numero % 2;
            
            binarioAlreves+= residuo;
            numero = cociente;
            if (cociente==1) {
                binarioAlreves+=cociente;
            }
        }

        String binario = "";
        for (int i = binarioAlreves.length() - 1; i >= 0; i--) {
            binario += binarioAlreves.charAt(i);
        }

        System.out.println(binario);




    }
}
