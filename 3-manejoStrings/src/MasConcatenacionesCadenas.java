public class MasConcatenacionesCadenas {
    public static void main(String[] args) {
        System.out.println("*** Mas concatenaciones de cadenas ***");

        var cadena = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena + " " + cadena2;
        System.out.println("cadena3 = " + cadena3);

        System.out.println("*** metodo concat ***");

        var cadena4 = cadena.concat(" ").concat(cadena2);
        System.out.println("cadena4 = " + cadena4);

        System.out.println("*** string builder ***");

        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);
        var resultado = constructorCadenas.toString();
        System.out.println("resultado = " + resultado);

    }
}
