package nttdata.javat2.business;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Almacena los empleados dentro de un mapa, siendo la key el valor del id
 * 
 * @author Victor Carrasco
 *
 */
public class ManagmentServicel {
	/**
	 * Mapa donde se almacenaran los empleados, la key coincide con el id del
	 * empleado
	 */
	private Map<Integer, Employee> employeeData = new TreeMap<>();

	/**
	 * Añade un empleado al mapa
	 * 
	 * @param name
	 * @param category
	 */
	public void addEmployee(String name, String category) {
		if (employeeData.isEmpty()) {
			int id = 0;
			Employee employee = new Employee(id, name, category);
			employeeData.put(id, employee);
		} else {
			TreeSet<Integer> employeeId = (TreeSet<Integer>) employeeData.keySet();
			int nextId = employeeId.last() + 1;
			Employee employee = new Employee(nextId, name, category);
			employeeData.put(nextId, employee);
		}
	}

	/**
	 * Muestra el mapa con la informacion de los empleados
	 */
	public void showEmployee() {
		System.out.println(employeeData.toString());
	}

	/**
	 * Muestra el numero de empleados guardados
	 */
	public void showNumEmployee() {
		System.out.println(employeeData.size());
	}
}
