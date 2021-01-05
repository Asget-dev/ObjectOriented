package equalsAndComparator;

public class Employee extends Person implements Comparable<Employee> {
	private String EID;
	private Double salary;

	public Employee(String name, String dob, String eID, Double salary) {
		super(name, dob);
		EID = eID;
		this.salary = salary;
	}

	public String getEID() {
		return EID;
	}

	public void setEID(String eID) {
		EID = eID;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [EID=" + EID + ", salary=" + salary + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.getSalary().compareTo(o.getSalary());
	}

}
