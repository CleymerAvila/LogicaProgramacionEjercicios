import java.util.Scanner;

public class Ejercicio166 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("El IMC se utiliza para clasificar el peso de una persona en las siguientes categorías:");
        System.out.println("- Menos de 18.5: Bajo peso");
        System.out.println("- De 18.5 a 24.9: Peso normal");
        System.out.println("- De 25 a 29.9: Sobrepeso");
        System.out.println("- De 30 a 34.9: Obesidad moderada");
        System.out.println("- De 35 a 39.9: Obesidad severa");
        System.out.println("- Más de 40: Obesidad mórbida");
        System.out.println("\nPara calcular el IMC ingrese el peso en kg y la estatura en metros:");        
        System.out.print("Peso (kg): "); double peso = sc.nextDouble();
        System.out.print("Estatura (m): "); double estatura = sc.nextDouble();
        sc.close();


        double valorIMC = peso / (estatura * estatura);

        if (valorIMC < 18.5 ) {
            System.out.println("Bajo de peso");
        } else if (valorIMC >= 18.5 && valorIMC <= 24.9) {
            System.out.println("Peso Normal");
        } else if (valorIMC >= 25 && valorIMC <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (valorIMC >= 30 && valorIMC <= 34.9) {
            System.out.println("Obesidad moderada");
        } else if ( valorIMC >= 35 && valorIMC <= 39.9) {
            System.out.println("Obesidad severa");
        } else if (valorIMC >= 40) {
            System.out.println("obesidad mórbida");
        }
    }
}
