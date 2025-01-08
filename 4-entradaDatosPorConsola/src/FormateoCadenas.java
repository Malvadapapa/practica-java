public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("*** Formateo de cadenas ***");
        var nombre = "Matias";
        var edad = 26;
        var salario = 21000.20;
        
        //string.format
        
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: %.2f",nombre,edad,salario);
        System.out.println("mensaje = " + mensaje);

        // con printf
        System.out.println("Asi se imprime con prinf:");
        System.out.printf("Nombre: %s, Edad: %d, Salario: %.2f",nombre,edad,salario);

        //formate de text en block
        System.out.println("\nTexto en bloque:");
        var messaje = """
                -------------
                Detalle persona:
                -------------
                \tNombre: %s
                \tEdad: %d
                \tSalario: $ %.2f
                """.formatted(nombre,edad,salario);
        System.out.println(messaje);
    }
}
