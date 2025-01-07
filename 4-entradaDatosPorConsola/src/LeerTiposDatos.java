import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("ingresa tu edad a continuacion:");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);

        //limpiar el buffer
        consola.nextLine();

        //leer un tipo double
        System.out.println("Ingresa tu altura:");

        var altura = consola.nextDouble();

        System.out.println("altura = " + altura);

        //limpiar el buffer
        consola.nextLine();
        
        // ingresar el nombre es importante limpiar el buffer o no me va a tomar los datos y va a finalizar la ejecucion
        System.out.println("Por ultimo ingresa tu nombre:");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

        //conversion de datos

        System.out.println("Proporciona un valor entero:");
        var enteroAString = consola.nextLine();
        var entero = Integer.parseInt(enteroAString);
        System.out.println("entero = " + entero);

        System.out.println("Proporciona un valor de tipo flotante:");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);

        //Double.parseDouble()
        //Boolean.parseBoolean();

    }


}
