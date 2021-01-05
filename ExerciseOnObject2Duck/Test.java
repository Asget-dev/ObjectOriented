package ExerciseOnObject2Duck;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Test implements Serializable {

	public static void main(String[] args) {
		List<Duck> duck = new ArrayList<>();
		MallardDuck md1 = new MallardDuck("River");
		MallardDuck md2 = new MallardDuck("Pond");

		DecoyDuck dc1 = new DecoyDuck("Backyard");
		DecoyDuck dc2 = new DecoyDuck("Bayon");

		duck.add(md1);
		duck.add(md2);
		duck.add(dc1);
		duck.add(dc2);

		duck.remove(0);

		for (Duck d : duck) {
			d.quack();
		}

	}

}
