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
		ms.addEmployee("Juan", "Contabilidad");
		ms.showEmployee();
		ms.showNumEmployee();
		ms.addEmployee("Miguel", "Consultoria");
		ms.showEmployee();
		ms.showNumEmployee();
	}

}
