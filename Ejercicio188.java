import java.util.Scanner;

public class Ejercicio188 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una direccion de correo electronico");
        String email = sc.next();

        int arroba=0;
        int punto=0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i)=='@') {
                arroba++;
            } 

            if (email.charAt(i)=='.') {
                punto++;
            }
        }

        if (arroba != 1 || punto != 1) {
            System.out.println("\nEl correo ingresado es incorrecto");
        } else {
            System.out.println("\nEl correo ingresado es Correcto");
        }


    }
}
