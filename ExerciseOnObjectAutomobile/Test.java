package ExerciseOnObjectAutomobile;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Bus> bus = new ArrayList<>();
		// Bus a = new Bus(10,40);

		bus.add(new Bus(20, 40));
		bus.add(new Bus(15, 25));

		bus.sort(new PassengerAmount_comparator());
		System.out.println(bus);

	}

}
