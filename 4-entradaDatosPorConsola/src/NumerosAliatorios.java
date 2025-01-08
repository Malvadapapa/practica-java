import java.util.Random;

public class NumerosAliatorios {
    public static void main(String[] args) {
        System.out.println("*** Numeros Aleatorios ***");
        var random = new Random();
        //no se incluye el numero, osea para generar del uno al 10 debo poner +1
        var numeroAleatorio = random.nextInt(10)+1;

        System.out.println("numeroAleatorio = " + numeroAleatorio);
        
        var flotanteAleatorio = random.nextFloat(0.0f,1.0f);
        System.out.println("flotanteAleatorio = " + flotanteAleatorio);

        var dado = random.nextInt(6)+1;
        System.out.println("dado = " + dado);
    }
}
