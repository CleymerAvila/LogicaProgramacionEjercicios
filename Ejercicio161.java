import java.util.Scanner;

public class Ejercicio161 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa dos variables numericas: ");
        System.out.print("Variable A: "); int var1 = leer.nextInt();
        System.out.print("Variable B:"); int var2 = leer.nextInt();
        leer.close();
        //Intercambiamos la variable creando otra variable mas

        int varTemp;
        varTemp = var1;
        var1 = var2;
        var2 = varTemp;

        System.out.println("\nLas variables intercambiadas son: ");
        System.out.println("Variable A: "+var1);
        System.out.println("Variable B: "+var2);
    }
}
