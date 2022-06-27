package nttdata.javat2;

import nttdata.javat2.business.ManagmentServicel;

/**
 * Clase main
 * @author Victor Carrasco
 *
 */
public class T2MainVCA {

	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		ManagmentServicel ms = new ManagmentServicel();
		//Cuando se registra un nuevo empleado NO se pone manualmente el id, solo los datos
		ms.addEmployee("Juan", "Contabilidad");
		ms.addEmployee("Miguel", "Consultoria");
		ms.addEmployee("Luis", "Consultoria");
		ms.showEmployee();
		System.out.println("Numero de empleados: " + ms.showNumEmployee());
	}

}
