package PEED4;

public class Main {

	public static void main(String[] args) {
	

		 Emonedero mimonedero;

	        double dinero;

	        double saldo_disponible = global_monedero(1000);

	        System.out.println("El efectivo del monedero es  "+ saldo_disponible );

	    }

	public static double global_monedero(double dinero) {
		Emonedero mimonedero;
		mimonedero = new Emonedero("Nombre y apellidos del Alumno",500, "dni del alumno");

		try 

		{

		    mimonedero.pagar(200);

		} catch (Exception e)

		{

		    System.out.print("No se puede pagar  ");

		}

		try {
            System.out.println(" Modificación 1");
            mimonedero.recargar(200);
     } catch (Exception e) {
             System.out.print("Ha fallado la recarga");
    }

		double saldo_disponible = mimonedero.efectivo();
		return saldo_disponible;
	}

}
