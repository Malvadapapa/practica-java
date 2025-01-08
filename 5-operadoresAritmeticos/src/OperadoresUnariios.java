public class OperadoresUnariios {
    public static void main(String[] args) {
        int a = 3, b = -5, resultado;
        var c = true;
        //operador unario
        resultado =+a;
        System.out.println("resultado = " + resultado);
        resultado = -a;
        System.out.println("resultado = " + resultado);
        //De la siguiente forma primero se incrementa el valor de la variable y luego se muesta

        resultado = ++a;
        System.out.println("resultado = " + resultado);

        //De la siguiente forma primero se muestra el valor luego se incrementa
        a= 3;
        resultado = a++;
        System.out.println("resultado = " + resultado);

        //con respecto a los decrementos funciona igual pero en lugar de sumar
        //resta a la variable




    }
}
