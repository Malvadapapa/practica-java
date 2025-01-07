import java.util.Scanner;

public class PracticaReceta {
    public static void main(String[] args) {
        System.out.println("*** Recetas de cocina ***");
        var consola = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la receta:");
        var nombreReceta = consola.nextLine();

        System.out.println("A continuacion ingrese los ingredientes:");
        var stringIngredientes = consola.nextLine();

        System.out.println("Ingrese tiempo de preparacion");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        System.out.println("Ingrese la dificultad(F,M,A):");
        var dificultadPreparacion = consola.nextLine();

        System.out.println("---Receta Ingresada---");
        System.out.println("\tReceta para preparar: " + nombreReceta);
        System.out.println("\tIngredientes: " + stringIngredientes);
        System.out.println("\ttiempo de preparacion: " + tiempoPreparacion);
        System.out.println("\tDificultad: " + dificultadPreparacion);
    }
}
