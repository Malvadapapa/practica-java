public class DetalleLibro {
    public static void main(String[] args) {
        //Detalle de un libro (ej para probar distintos tipos de memoria en java)
        String tituloLibro = "El señor de los anillos";
        int anioPublicacion = 1954;
        boolean libroDisponible = true;
        double precio = 500.50;

        System.out.println(tituloLibro);
        System.out.println(anioPublicacion);
        System.out.println(libroDisponible);
        System.out.println(precio);

        //Modificamos el titulo del libro
        tituloLibro = "el señor de los Anillos";
        System.out.println(tituloLibro);



    }
}
