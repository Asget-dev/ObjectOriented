package ExerciseOnObject4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Greet> greets = new ArrayList<Greet>();
		for (int i = 0; i < 3; i++) {
			greets.add(new Greet());
		}
		System.out.println(Greet.getCount());
		System.out.println(greets.get(2).getCount());
	}

}
