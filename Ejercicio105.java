import java.util.Scanner;

public class Ejercicio105 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, promedio;

        do {
            System.out.println("Ingresa las 4 notas para verificar su estado academico");
            System.out.print("Nota 1: ");
            nota1 = sc.nextDouble();
            System.out.print("Nota 2: ");
            nota2 = sc.nextDouble();
            System.out.print("Nota 3: ");
            nota3 = sc.nextDouble();
            System.out.print("Nota 4: ");
            nota4 = sc.nextDouble();
        } while (nota1 < 0 || nota1 >20 || nota2 < 0 || nota2 >20 || nota3 < 0 || nota3 >20|| nota4 < 0 || nota4 > 20);

        nota1 = nota1 / 2;
        nota2 = nota2 /2;
        nota3 = nota3 / 2;
        nota4 = nota4 / 2;

        promedio = nota1 + nota2 + nota3 + nota4 / 4;

        if (promedio > 14.5){
            System.out.println("\nAPROBADO!");
        } else if (promedio <= 14.5 && promedio > 10){
            System.out.println("\nSUPLETORIO");
        } else {
            System.out.println("\nPERDISTE EL AÑO!!!!!!");
        }
    }
}
