package ExerciseOnObject2Duck;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap implements Serializable {
//	If time allows: write a Test program that has a Map<String, List<Duck>>. Which maps location (strings) to a collection of ducks.
//
//	At location "River" your map should have 3 Mallard Ducks in the list.
//
//	At location "Backyard" your map should have 1 Decoy Duck in the list.
	public static void main(String[] args) {
		Map<String, List<Duck>> ducklocation = new HashMap<>();

		List<Duck> river = new ArrayList<>();
		river.add(new MallardDuck("River"));
		river.add(new MallardDuck("River"));
		river.add(new MallardDuck("River"));

		List<Duck> backyard = new ArrayList<Duck>();
		backyard.add(new DecoyDuck("Backyard"));

		ducklocation.put("River", river);
		ducklocation.put("Backyard", backyard);

		System.out.println(ducklocation);
	}

}
