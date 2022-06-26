package nttdata.javat2.business;

import java.util.Objects;

/**
 * Clase encargada del almacenamiento de los datos de un empleado
 * @author Victor Carrasco
 *
 */
public class Employee {
	/** The unique number that identificate each employee */
	private Integer id;
	/** The employee name */
	private String name;
	/** It determine which type of jobs can apply each employee */
	private String category;
	/** The business name of employee */
	private static String businessName = "NTTData";
	
	
	public Employee(int id, String name, String category) {
		this.id = id;
		this.name = name;
		this.category = category;
	}
	/**
	 * Get id
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * Set id
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Get name
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * Set name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Get category
	 * @return
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * Set category
	 * @param category
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * Get business name
	 * @return
	 */
	public static String getBusinessName() {
		return businessName;
	}
	/**
	 * Set business name
	 * @param businessName
	 */
	public static void setBusinessName(String businessName) {
		Employee.businessName = businessName;
	}
	/**
	 * return info about employee on String format
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", category=" + category + "]";
	}
	/**
	 * hash code method
	 */
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	/**
	 * equals method according to id
	 */
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
