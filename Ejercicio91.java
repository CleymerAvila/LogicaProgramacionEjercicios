import java.util.Scanner;
public class Ejercicio91 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String nombre, apellido, edad, numCelular;

        System.out.println("Ingrese los datos de la persona");
        System.out.print("Nombre: ");
        nombre = sc.next();
        System.out.print("Apellido: ");
        apellido = sc.next();
        System.out.print("Edad: ");
        edad = sc.next();
        System.out.print("Numero Celular: ");
        numCelular = sc.next();

        mostrarDatos(nombre, apellido, edad, numCelular);
    }

    public  static void mostrarDatos(String name,  String lastName, String age, String numberPhone){
        System.out.println("\nDATOS INGRESADOS DE LA PERSONA");
        System.out.println("Nombre: "+name);
        System.out.println("Apellido: "+lastName);
        System.out.println("Edad: "+ age);
        System.out.println("Numero Celular: "+numberPhone);
    }
}
