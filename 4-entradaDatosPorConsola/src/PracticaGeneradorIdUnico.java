import java.util.Random;
import java.util.Scanner;

public class PracticaGeneradorIdUnico {
    public static void main(String[] args) {
        System.out.println("*** Bienvenido al generador de id unico ***");
        var console = new Scanner(System.in);
        var random = new Random();

        System.out.println("Ingrese su nombre: ");
        var nombre = console.nextLine().substring(0,2).toUpperCase();

        System.out.println("Ahora su apellido: ");
        var apellido = console.nextLine().substring(0,2).toUpperCase();

        System.out.println("Ahora su año de nacimiento: ");
        var anioNacimiento = String.valueOf(Integer.parseInt(console.nextLine())).substring(2,4);

        var randomNumber = random.nextInt(9999);

        System.out.printf("""
                ---
                Su id aliatorio es:%s%s%s%04d
                """,nombre,apellido,anioNacimiento,randomNumber);
    }
}
