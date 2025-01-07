public class GeneradorEmail {
    public static void main(String[] args) {
        var nombre = "Cristian Vargas";
        var empresa = "php";
        var dominio = "com.mx";
        
        var resultado = String.join("",nombre,"@",empresa,".",dominio).replaceAll(" ", "").toLowerCase();
        System.out.println("resultado = " + resultado);
    }
}
