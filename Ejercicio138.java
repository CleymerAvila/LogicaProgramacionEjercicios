import java.util.Scanner;

public class Ejercicio138 {
    private static Scanner sc = new Scanner(System.in);
    private static String figuraSeleccionada;
    private static double lado;
    private static double base;
    private static double altura;
    private static double radio;
    private static boolean programaFinalizado=false;
    public static void main(String []args){
        int op;
        double areaFigura;

        do {
            do {
                menu();
                System.out.print("\nOpcion: ");
                op = sc.nextInt();
            } while (op>3 || op<0);
    
            areaFigura = calcularAreaFigura(op);

            if (programaFinalizado&&areaFigura==0) {
                break;
            }
    
            System.out.println("\nEl area de la figura "+ figuraSeleccionada + " es de "+areaFigura);
        } while (!programaFinalizado); sc.close();


    }

    public static void menu(){
        System.out.println("ELIGA UNA OPCION PARA CALCULAR EL AREA.");
        System.out.println("Figura: ");
        System.out.println("1. Cuadrado");
        System.out.println("2. Triangulo");
        System.out.println("3. Circulo");
        System.out.println("\nSi Presiona 0 durante la ejecucion del programa finalizará el mismo.");
    }

    public static double calcularAreaFigura(int opcion){
        double area=0;
        switch (opcion) {
            case 1:
                figuraSeleccionada = "Cuadrado";
                System.out.println("Ingrese el lado del Cuadrado: ");
                System.out.print("- "); lado = sc.nextDouble();

                if (lado==0) {
                    programaFinalizado=true;
                    System.out.println("\nFinalizo el programa pues su entrada fue 0");
                    break;
                }
                area = lado * lado;
                programaFinalizado=true;
                break;
        
            case 2: 
                figuraSeleccionada = "Triangulo";
                System.out.println("Ingrse la base y la altura del Triangulo");
                System.out.print("Base: ");  base = sc.nextDouble();
                System.out.print("Altura: ");  altura = sc.nextDouble();

                if (base==0 || altura==0) {
                    programaFinalizado=true;
                    System.out.println("\nFinalizo el programa pues su entrada fue 0");
                    break;
                }

                area = (base * altura) / 2;
                programaFinalizado = true;
                break;
            case 3: 
                figuraSeleccionada = "Circulo";
                System.out.println("Ingresa el radio del circulo");
                System.out.print("radio: ");  radio = sc.nextDouble();

                if (radio==0) {
                    programaFinalizado=true;
                    System.out.println("\nFinalizo el programa pues su entrada fue 0");
                    break;
                }

                area = Math.PI * (radio*radio);
                programaFinalizado=true;
                break;
        }

        return area;
    }
}
