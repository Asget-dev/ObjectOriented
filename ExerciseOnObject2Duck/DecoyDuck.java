package ExerciseOnObject2Duck;

import java.io.Serializable;

public class DecoyDuck extends Duck implements Serializable {

	public DecoyDuck(String location) {
		super(location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void quack() {
		System.out.println("DecouDuck is quaking");

	}

}
