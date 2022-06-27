package nttdata.javat2.business;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

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
		//Se comprueba si hay algun empleado almacenado, si no el primer empleado tendra 0 como id
		if (employeeData.isEmpty()) {
			int id = 0;
			Employee employee = new Employee(id, name, category);
			employeeData.put(id, employee);
		} else {
			//Se extrae todas los id
			Set<Integer> employeeIdSet = employeeData.keySet();
			//Se convierte de Set a Array
			Integer[] employeeIdArray = new Integer[employeeIdSet.size()];
			employeeIdArray = employeeIdSet.toArray(employeeIdArray);
			//Se extrae el ultimo id y se le suma 1
			int nextId = employeeIdArray[employeeIdArray.length-1] + 1;
			//Se crea y añade un nuevo empleado con los datos pasados por parametro y el nuevo id
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
	public Integer showNumEmployee() {
		return employeeData.size();
	}
}
