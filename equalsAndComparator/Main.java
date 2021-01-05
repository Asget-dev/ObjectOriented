package equalsAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// List<Person> person = new ArrayList<>();
		Employee emp1 = new Employee("g", "b", "c", 2.2);
		Employee emp2 = new Employee("g", "b", "c", 2.1);
		Employee emp3 = new Employee("a", "b", "c", 2.2);

//		person.add(emp1);
//		person.add(emp2);
//		person.add(emp3);
		List<Employee> employee = new ArrayList<>();
		employee.add(emp1);
		employee.add(emp2);
		employee.add(emp3);

		Collections.sort(employee);
		// person.sort(new ComparatorByNameLength());

		for (Person p : employee) {
			// System.out.println(p.getName());
			System.out.println(p);
		}

		// comparing using equals
		// use toString and equals hashCode
		// System.out.println(person.get(0).equals(person.get(1)));

	}

}
