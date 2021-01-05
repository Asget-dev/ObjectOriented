package ExerciseOnObjectComputer;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
//List
		List<Computer> computer = new ArrayList<>();
		Desktop dep1 = new Desktop(1);
		computer.add(dep1);
		// computer.remove(0);
		for (Computer c : computer) {
			c.trunOn();
		}
// Map key and value
//		Map<String, Double> computer = new HashMap<String, Double>();
//		computer.put("Cpu", 3.1);
//		computer.put("Ram", 3.1);
//		computer.put("HD", 400.0);
//
//		// using key
//		computer.remove("cpu");
//		// or using index
//		computer.remove(2);

		// computer.clear();

//Set		
//		Set<Computer> computer = new HashSet<>();
//		Laptop lap1 = new Laptop(2.1, 3.1);
//		Laptop lap2 = new Laptop(1.1, 4.1);
//
//		Desktop lap3 = new Desktop(2.2, 3.1);
//		Desktop lap4 = new Desktop(1.2, 4.1);
//
//		computer.add(lap1);
//		computer.add(lap2);
//		computer.add(lap3);
//		computer.add(lap4);
//
//		computer.remove(lap1);
//		System.out.println(Arrays.toString(computer));
////		for (Computer p : computer) {
//
//		}
//
//		for (Computer c : computer) {
//			c.turnOn();
//		}
//
//		for (Computer c : computer) {
//			if (c instanceof Laptop) {
//				c.turnOn();
//			}
//		}

	}

}
