package nttdata.javat2.business;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Administracion de usuarios
 * @author Victor Carrasco
 *
 */
public class ManagmentServicel {
	private Map<Integer, Employee> employeeData = new TreeMap<>();
	
	public void addEmployee(String name, String category) {
		if(employeeData.isEmpty()) {
			int id = 0;
			Employee employee = new Employee(id, name, category);
			employeeData.put(id, employee);
		}else {
			TreeSet<Integer> employeeId = (TreeSet<Integer>) employeeData.keySet();
			int nextId = employeeId.last() + 1;
			Employee employee = new Employee(nextId, name, category);
			employeeData.put(nextId, employee); 
		}
	}
	public void showEmployee() {
		System.out.println(employeeData.toString());
	}
	public void showNumEmployee() {
		System.out.println(employeeData.size());
	}
}
