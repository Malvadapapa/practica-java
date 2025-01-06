public class IndicesCadena {
    public static void main(String[] args) {
        System.out.println("*** Indices de cadenas ***");

        var cadena = "Hola Mundo";
        System.out.println("cadena = " + cadena);

        System.out.println("Longitud de la cadena = " + cadena.length());

        System.out.println("Primer caracter = " + cadena.charAt(0));
        System.out.println("Ultimo caracter = " + cadena.charAt(cadena.length() - 1));

        System.out.println("Subcadena(1, 4) = " + cadena.substring(1, 4));
        System.out.println("Subcadena(5) = " + cadena.substring(5));

        System.out.println("Indice de 'M' = " + cadena.indexOf('M'));
        System.out.println("Indice de 'o' = " + cadena.indexOf('o'));
        System.out.println("Indice de 'o' a partir de la posicion 5 = " + cadena.indexOf('o', 5));
        System.out.println("Indice de 'x' = " + cadena.indexOf('x'));

        System.out.println("Indice de \"Mundo\" = " + cadena.indexOf("Mundo"));
        System.out.println("Indice de \"Mundo\" a partir de la posicion 5 = " + cadena.indexOf("Mundo", 5));
        System.out.println("Indice de \"Mundox\" = " + cadena.indexOf("Mundox"));

        System.out.println("Ultimo indice de 'o' = " + cadena.lastIndexOf('o'));
        System.out.println("Ultimo indice de 'o' a partir de la posicion 5 = " + cadena.lastIndexOf('o', 5));
        System.out.println("Ultimo indice de 'x' = " + cadena.lastIndexOf('x'));

        System.out.println("Ultimo indice de \"Mundo\" = " + cadena.lastIndexOf("Mundo"));
        System.out.println("Ultimo indice de \"Mundo\" a partir de la posicion 5 = " + cadena.lastIndexOf("Mundo", 5));
        System.out.println("Ultimo indice de \"Mundox\" = " + cadena.lastIndexOf("Mundox"));
    }
}
