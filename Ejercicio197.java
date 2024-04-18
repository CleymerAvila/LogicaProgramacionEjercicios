/**
 * 197. Programa que realice la impresión de un estado de cuenta cuyos datos
 *  (nombre, número de cuenta, movimientos, tipos de movimientos y saldo) están
 *  almacenados en un archivo de texto.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Ejercicio197 {
    public static void main(String[] args){
        String nombreCuenta;
        String numeroDeCuenta;
        String movimientos;
        String tiposdeMovimiento ;

        double saldo =0.0;

        try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/CLEYMER/OneDrive/Documentos/estadodecuenta.txt"))){

            nombreCuenta = br.readLine();
            numeroDeCuenta = br.readLine();
            movimientos = br.readLine();
            tiposdeMovimiento = br.readLine();
            saldo = Double.parseDouble(br.readLine());


            // Mostrar en pantalla el estado de cuenta
            System.out.println("ESTADO DE LA CUENTA: ");
            System.out.println("Nombre cuenta: "+ nombreCuenta);
            System.out.println("Numero: "+numeroDeCuenta);
            System.out.println("Movimiento: "+ movimientos);
            System.out.println("Tipo de movimiento: "+ tiposdeMovimiento);
            System.out.println("Saldo: "+ saldo);
        } catch (IOException e) {
            System.out.println("Error no se puede encontrar el archivo. "+ e.getMessage());
        }

    }

}

