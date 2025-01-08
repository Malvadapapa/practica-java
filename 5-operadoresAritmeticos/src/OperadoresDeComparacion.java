public class OperadoresDeComparacion {
    public static void main(String[] args) {
        System.out.println("Operadores de comparacion");
        int a = 3, b = 2;
        //igualdad ==
        var resultado = a == b;
        System.out.println("resultado = " + resultado);
        
        // para saber si dos valores son distintos
        resultado = a != b;
        System.out.println("resultado = " + resultado);

        //para saber si son mayor o menor que
        resultado = a > b;
        System.out.println("resultado = " + resultado);

        resultado = a >= b;
        System.out.println("resultado = " + resultado);

        resultado = a < b;
        System.out.println("resultado = " + resultado);

        resultado = a <= b;
        System.out.println("resultado = " + resultado);
    }
}
