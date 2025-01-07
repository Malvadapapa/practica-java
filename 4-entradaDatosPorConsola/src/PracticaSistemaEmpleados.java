import java.util.Scanner;

public class PracticaSistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("***Sistema de Empleados\n");
        var consola = new Scanner(System.in);

        System.out.println("Ingrese nombre del empleado:");
        var nombre = consola.nextLine();


        System.out.println("\nIngrese la edad:");
        var edad = Integer.parseInt(consola.nextLine());


        System.out.println("\nAhora ingrese el salario:");
        var salario = Double.parseDouble(consola.nextLine());


        System.out.println("\nEs jefe de departamento:");
        var esJefe = Boolean.parseBoolean(consola.nextLine());


        System.out.println("***Datos obtenidos***");
        System.out.println("nombre = " + nombre);
        System.out.println("edad = " + edad);
        System.out.println("salario = " + salario);
        System.out.println("esJefe = " + esJefe);





    }
}
