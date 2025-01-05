public class TipoVar {
    public static void main(String[] args) {
        System.out.println("*** Uso de var en Java ***\n");
        String nombre1 = "Juan";
        System.out.println("nombre1 = " + nombre1);
        
        //con el uso de var (se agrego desde la version de jdk 10)
        var nombre2 = "carlos";
        System.out.println("nombre2 = " + nombre2);

        var edad = 30;
        System.out.println("edad = " + edad);
        
        var sueldo = 5000.0F;
        System.out.println("sueldo = " + sueldo);
    }
}
