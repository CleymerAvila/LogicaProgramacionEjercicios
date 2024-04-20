import java.util.Scanner;

public class Ejercicio221 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numIntentos = 0;
        final String CLAVE_CORRECTA = "eureka";
        boolean contraseCorrecta = false;

        do {
            System.out.println("Ingresa una clave, tienes "+(3-numIntentos)+ " intentos");
            String claveIngresada = sc.next();
            numIntentos++;
            if (claveIngresada.equals(CLAVE_CORRECTA)){
                contraseCorrecta=true;
            } else {
                System.out.println("Contraseña incorrecta, te queda "+(3-numIntentos)+ " intentos");
            }
        } while (!contraseCorrecta && numIntentos <3);

        if (contraseCorrecta){
            System.out.println("la clave ingresada es correcta");
        } else {
            System.out.println("Numero de intentos excedidos!!");
        }
    }
}
