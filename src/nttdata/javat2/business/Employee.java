package nttdata.javat2.business;

import java.util.Objects;

/**
 * Se guardan los datos de los empleados
 * @author Victor Carrasco
 *
 */
public class Employee {
	private Integer id;
	private String name;
	private String category;
	private static String businessName = "NTTData";
	
	public Employee(int id, String name, String category) {
		this.id = id;
		this.name = name;
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public static String getBusinessName() {
		return businessName;
	}
	public static void setBusinessName(String businessName) {
		Employee.businessName = businessName;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", category=" + category + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(id, other.id);
	}
	
}
