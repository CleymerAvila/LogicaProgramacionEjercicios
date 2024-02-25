import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int cantidadMujeres=0, cantidadHombre=0, cantPerSalarioMas700=0;
        double sumaSalarios=0, promediosalarios, porcentajeMujeres, porcentajeHombre;

        System.out.println("Ingrese el número de empleados que desea registrar");
        n = sc.nextInt();
        Empleado Empleados[] = new Empleado[n];

        for (int j = 0; j < Empleados.length; j++) {
            Empleados[j] = new Empleado(); // Crear una instancia de Empleado en cada posición del array
            System.out.println("Ingrese el sexo (Hombre/Mujer) del empleado [" + (j + 1) + "]");
            Empleados[j].sexo = sc.next();
            System.out.println("Ingrese el salario del empleado [" + (j + 1) + "]");
            Empleados[j].salario = sc.nextInt();

            if (Empleados[j].sexo.equalsIgnoreCase("Hombre")) {
                cantidadHombre++;
            } else if (Empleados[j].sexo.equalsIgnoreCase("Mujer")) {
                cantidadMujeres++;
            } else {
                //ns
            }

            if (Empleados[j].salario > 700) {
                cantPerSalarioMas700++;
            }

            sumaSalarios = (double) sumaSalarios + Empleados[j].salario;
        }

        System.out.println("la cantidad de empleados que tienen un sueldo de mas de 700 es "
        + cantPerSalarioMas700);

        promediosalarios = (double) sumaSalarios / n;
        System.out.println("El promedio de los salario es "+ promediosalarios);


        porcentajeHombre = calcularPorcentaje(cantidadHombre, n);
        porcentajeMujeres = calcularPorcentaje(cantidadMujeres, n);

        System.out.println("El porcentaje de mujeres que trabajan en la empresa es "+ porcentajeMujeres + " %");
        System.out.println("El porcentaje de hombres que trabajan en la empresa es "+ porcentajeHombre + " %");        sc.close();
    }

    public static double calcularPorcentaje(double cantidad, double n){

        double porcentaje = (cantidad / n)*100;

        return porcentaje;
    }

    public static class Empleado {
        String sexo;
        int salario;
    }
}

