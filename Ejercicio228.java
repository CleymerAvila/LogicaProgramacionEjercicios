import java.util.Scanner;

/**
 * 228. Crea un programa que pida al usuario un código de usuario y una contraseña.
 *  Deberá repetirse hasta que el código sea "1" y la contraseña sería "1234".
 */

public class Ejercicio228
{
    public static void main(String[] args)
    {
        final String CONTRASENIA_CORRECTA = "1234";
        Scanner sc = new Scanner(System.in);
        int codigo;
        String contrasenia;

        do {
            System.out.println("Ingresa el codigo de usuario: ");
            codigo = sc.nextInt();

            System.out.println("Ingresa la contraseña: ");
            contrasenia = sc.next();

            if (contrasenia.equals(CONTRASENIA_CORRECTA)){
                System.out.println("Contraseña correcta programa finalizado!!");
            }
        } while (codigo!=1 && !contrasenia.equals(CONTRASENIA_CORRECTA));



    }
}
