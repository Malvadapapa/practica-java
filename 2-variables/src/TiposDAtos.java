public class TiposDAtos {
    public static void main(String[] args) {
        //Tipos de datos en java
        
        //Enteros, su valor por defecto es cero 0 
        
        byte tipoByte = (byte)128; // el valor maximo es 127 entonces con 128 no va a querer comipar
        //para que lo haga lo convertimos abregando entre parentesis el tipo byte y despues el valor
        //tiene como desventaja que pierde precision a la hora de reconvertir los datos
        byte nuevoTipoByte = 127;
        System.out.println("nuevoTipoByte = " + nuevoTipoByte); //se usa soutv
        short tipoShort = 32000; //hasta 16bits
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647; //hasta 32 bits
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321;// hasta 64 bits se puede agregar l si es mas grande 
        System.out.println("tipoLong = " + tipoLong);
        
        
        //tipos flotantes su valor por defecto es 0.00
        float tipoFloat = 3.14F;// por defecto en java si no tiene la f son double
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1416; //se puede usar d para forzar el tipo, soporta hasta 64 bits


        //character valor por defecto: \u0000
        char tipoChar = 'A'; //soporta cualquier caracter de unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;//equivalente en unicode a la letra A
        System.out.println("tipoChar = " + tipoChar);
        
        //booleano valor por defecto false
        boolean tipoBooleano = false;
        System.out.println("tipoBooleano = " + tipoBooleano);
        
        
        //tipo string valor por defecto es null
        String nombre = null;
        System.out.println("nombre = " + nombre);
        
        


    }
}
