import java.util.Scanner;

/**
 * 174. Programa que de acuerdo a el nombre real del usuario y el área o
    departamento de un empleado, genere un nombre de usuario para inicio de sesión,
    tomando como base el siguiente ejemplo : Administración , Juan Lopez Perez =
    adlzjuanpz
 */

public class Ejercicio174 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreCompleto;
        String areaEmpleado;
        String nombreUsuario;

        System.out.println("Creemos el nombre de usuario");
        System.out.println("\nIngrese su nombre completo");
        nombreCompleto = sc.nextLine();
        System.out.println("Ingresa el area o departamento");
        areaEmpleado = sc.nextLine();
        sc.close();


        String nombre[] = nombreCompleto.toLowerCase().split(" ");

        nombreUsuario = "@"+areaEmpleado.substring(0, 2)+nombre[0].substring(0,3)+nombre[1].charAt(0)+nombre[2].charAt(0);

        System.out.println("\nSu nuevo nombre de usuario es: "+nombreUsuario);
    }
}
