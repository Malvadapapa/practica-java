public class ReservaHoteles {
    public static void main(String[] args) {
        var nombreCliente = "Juan Perez";
        System.out.println("nombreCliente = " + nombreCliente);
        var diasEstancia = 34;
        System.out.println("diasEstancia = " + diasEstancia);
        var tarifaDiaria = 45000.0F;
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        var tieneVistaAlMar = false;
        System.out.println("tieneVistaAlMar = " + tieneVistaAlMar);
        System.out.println();
        System.out.println("valores modificados: \n");
        nombreCliente = "Juancito Perez";
        System.out.println("nombreCliente = " + nombreCliente);
        diasEstancia = 33;
        System.out.println("diasEstancia = " + diasEstancia);
        tarifaDiaria = 45000.50F;
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        tieneVistaAlMar = true;
        System.out.println("tieneVistaAlMar = " + tieneVistaAlMar);
    }
}
