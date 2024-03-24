import java.util.Scanner;

public class Ejercicio119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorIntentos=3;
        final String CONTRASENIA="passwd";
        String entrada;

        do {
            System.out.print("\nUsuario ingrese su contraseña: ");
            entrada = sc.next();
    
            if (entrada.equals(CONTRASENIA)) {
                System.out.println("\nContraseña Aceptada!");
            } else {
                contadorIntentos--;
                System.out.println("\nContraseña incorrecta!");
                System.out.println("\nTe queda "+contadorIntentos + " intentos");
            }
        } while (!entrada.equals(CONTRASENIA) && contadorIntentos != 0);sc.close();

    }
}
