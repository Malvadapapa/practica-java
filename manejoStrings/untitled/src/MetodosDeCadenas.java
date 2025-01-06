public class MetodosDeCadenas {
    public static void main(String[] args) {
        System.out.println("*** Metodos de cadenas ***");
        var cadena = "Hola Mundo";

        //para obterner la longitud de la cadena
        var longitud = cadena.length();
        System.out.println("Longitud de la cadena = " + longitud);

        //para reemplazar caracteres
        var nuevaCadena = cadena.replace('o', 'x');
        System.out.println("nuevaCadena = " + nuevaCadena);
        
        //para convertir a mayusculas
        
        var mayusculas = cadena.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        var minusculas = cadena.toLowerCase();
        System.out.println("minusculas = " + minusculas);

        //para eliminar espacios en blanco al inicio y al final
        var cadenaConEspacios = "  Hola Mundo  ";
        var cadenaSinEspacios = cadenaConEspacios.trim();
        System.out.println("cadenaSinEspacios = " + cadenaSinEspacios);
    }
}
