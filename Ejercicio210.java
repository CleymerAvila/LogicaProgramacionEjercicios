/**
 * 210. En un hospital existen tres áreas: Ginecología, Pediatría, Traumatología. El
 *  presupuesto anual del hospital se reparte conforme a la siguiente tabla:
 *  Área                Porcentaje del presupuesto
 *  Ginecología         40%
 *  Traumatología       30%
 *  Pediatría           30%
 *
 *  Obtener la cantidad de dinero que recibirá cada área, para cualquier monto
 *  presupuestal.
 */

import java.util.Scanner;

public class Ejercicio210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el presupuesto anual del hospital: ");
        double montoPresupuestoAnual = sc.nextDouble();

        double montoAreaGinecologia = montoPresupuestoAnual * 0.4;

        double montoAreaTraumatologia = montoPresupuestoAnual * 0.3;

        double montoAreaPediatria = montoPresupuestoAnual * 0.3;

        System.out.println("\nPresupuesto anual del hospital: "+  montoPresupuestoAnual);
        System.out.println("Cantidad que recibira el area de ginecologia: "+ montoAreaGinecologia);
        System.out.println("Cantidad que recibira el area de traumatologia: "+ montoAreaTraumatologia);
        System.out.println("Cantidad que recibira el area de Pediatria: "+ montoAreaPediatria);


    }
}
