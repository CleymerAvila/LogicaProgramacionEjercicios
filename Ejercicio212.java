/**
 *  212. El coste de un automóvil nuevo para un comprador es la suma total del coste del
 *  vehículo, del porcentaje de la ganancia del vendedor y de los impuestos locales o
 *  estatales aplicables (sobre el precio de venta). Suponer una ganancia del vendedor
 *  del 12% en todas las unidades y un impuesto del 6% y diseñar un algoritmo para
 *  leer el coste total del automóvil e imprimir el coste para el consumidor.
 */

import java.util.Scanner;

public class Ejercicio212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PORCENTAJE_GANANCIA_VENDEDOR = 0.12;
        final double PORCENTAJE_IMPUESTOS = 0.06;

        System.out.println("Ingresa el coste del vehiculo para calcular el total a pagar:");
        double costeVehiculo = sc.nextDouble();

        double gananciaVendedor = costeVehiculo * PORCENTAJE_GANANCIA_VENDEDOR;
        double impuesto = costeVehiculo * PORCENTAJE_IMPUESTOS;

        double costeTotalVehiculo = costeVehiculo + gananciaVendedor + impuesto;

        System.out.println("Coste del vehiculo: "+ costeVehiculo);
        System.out.println("Ganancia del vendedor: "+ gananciaVendedor);
        System.out.println("Impuestos: "+ impuesto);
        System.out.println("El coste total a pagar por el vehiculo es: "+ costeTotalVehiculo);


    }
}
