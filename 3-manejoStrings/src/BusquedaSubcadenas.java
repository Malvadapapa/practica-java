public class BusquedaSubcadenas {
    public static void main(String[] args) {
        System.out.println("*** Busqueda de subcadenas ***");
        
        //indexOf devuelve la primera ocurrencia de la subcadena
        var cadena1 = "Hola Mundo";
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);
        
        //lastIndexOf devuelve la ultima ocurrencia de la subcadena
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);
        // para la subadena no encontrada devuelve -1

        var indice3 = cadena1.indexOf("Mundox");
        System.out.println("indice3 = " + indice3);
    }
}
