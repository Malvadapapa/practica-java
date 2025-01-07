public class ComparacionCadenas {
    public static void main(String[] args) {

        System.out.println("*** Comparacion de cadenas ***");
        var cadena1 = "Hola";
        var cadena2 = "Hola";
        var cadena3 = new String("Hola");

        // Comparaciones de cadenas
        System.out.println("cadena1 == cadena2: " + (cadena1 == cadena2));
        System.out.println("cadena1.equals(cadena2): " + cadena1.equals(cadena2));
        System.out.println("cadena1.compareTo(cadena2): " + cadena1.compareTo(cadena2));
        System.out.println("cadena1 == cadena3: " + (cadena1 == cadena3));
        System.out.println("cadena1.equals(cadena3): " + cadena1.equals(cadena3));



    }
}
