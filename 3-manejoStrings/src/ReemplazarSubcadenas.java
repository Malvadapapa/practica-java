public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        System.out.println("*** Reemplazar subcadenas ***");

        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        var cadena2 = cadena1.replace("Mundo", "Java");
        System.out.println("cadena2 = " + cadena2);
    }
}
