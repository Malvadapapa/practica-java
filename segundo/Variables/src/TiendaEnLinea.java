public class TiendaEnLinea {
    public static void main(String[] args) {
        String nombreProducto;
        float precio;
        int cantidad;
        boolean disponible;

        nombreProducto = "cocacola";
        System.out.println("nombreProducto = " + nombreProducto);
        precio = 2500.5f;
        System.out.println("precio = " + precio);
        cantidad = 243;
        System.out.println("cantidad = " + cantidad);
        disponible = true;
        System.out.println("disponible = " + disponible);

        System.out.println("\n");

        nombreProducto = "Pepsi";
        System.out.println("nombreProducto = " + nombreProducto);
        precio = 2000.0f;
        System.out.println("precio = " + precio);
        cantidad = 200;
        System.out.println("cantidad = " + cantidad);
        disponible = false;
        System.out.println("disponible = " + disponible);


    }
}
