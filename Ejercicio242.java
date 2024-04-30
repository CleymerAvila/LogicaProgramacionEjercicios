import java.util.Scanner;

public class Ejercicio242 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumaMultiploTres=0;

        for (int i=3; i<=60; i+=3){
            if (i < 21 || i > 30 ){
                sumaMultiploTres +=i;
            }
        }

        System.out.println("La suma de los multiplos de 3 comprendido desde \n3 hasta 60 sin incluir los multiplos comprendidos desde 21 hasta 30 es: "+ sumaMultiploTres);
    }
}
