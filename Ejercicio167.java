import java.util.Scanner;

public class Ejercicio167 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num;
        double c=0;
        double sumaNum = 0;
        double promedio=0;
        
        do {
            c++;
            System.out.println("Ingresa el numero "+c);
            num = entrada.nextDouble();

            if (num!=0) {
                sumaNum+=num;
            }
            
        } while (num != 0); entrada.close();



        promedio = sumaNum / (c-1);

        System.out.println("\nPromedio: "+promedio);
    }
}
