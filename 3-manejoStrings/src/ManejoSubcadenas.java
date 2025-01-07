public class ManejoSubcadenas {
    public static void main(String[] args) {
        System.out.println("*** Manejo de subcadenas ***");
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        System.out.println("**subcadena**\n");
        var subacena1 = cadena1.substring(0,4);
        System.out.println("subacena1 = " + subacena1);
        var subcadena2 = cadena1.substring(5);
        System.out.println("subcadena2 = " + subcadena2);
    }
}
