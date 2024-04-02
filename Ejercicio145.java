import java.util.Scanner;

public class Ejercicio145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado_a, lado_b, lado_c;

        try {
            do {
                System.out.println("Ingresar los lados del triangulo para comprobar el tipo de triangulo");
                System.out.print("Lado a: "); lado_a = sc.nextInt();
                System.out.print("Lado b: "); lado_b = sc.nextInt();
                System.out.print("Lado c: "); lado_c = sc.nextInt();

                if (lado_a<2 || lado_b < 2 || lado_c < 2) {
                    System.out.println("Los numeros ingresados son incorrectos ingrese de nuevo");
                }
    
            } while (lado_a<2 || lado_b < 2 || lado_c < 2); sc.close();
    
            if (lado_a==lado_b && lado_a == lado_c && lado_b == lado_c) {
                System.out.println("El triangulo es de tipo Equilatero");
            } else if (lado_a != lado_b && lado_a != lado_c && lado_b != lado_c) {
                System.out.println("El tiangulo es de tipo Escaleno");
            } else {
                System.out.println("El triangulo es de tipo isoseles");
            }
        } catch (Exception e) {
            System.out.println("Los lados ingresados son incorrectos, ingrese de nuevo");
        }


    }
}
