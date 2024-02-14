import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double diagonalMayor, diagonalMenor;
        System.out.println("Para calcular el area del rombo debe ingresar:");
        System.out.println("Diagonal Mayor: ");
        diagonalMayor = leer.nextDouble();
        System.out.println("Diagonal Menor: ");
        diagonalMenor = leer.nextDouble();
        System.out.println("EL area del rombo es: " + (diagonalMayor*diagonalMenor)/2 + " metros²");
        leer.close();


    }

}
