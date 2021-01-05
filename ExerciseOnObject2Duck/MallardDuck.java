package ExerciseOnObject2Duck;

import java.io.Serializable;

public class MallardDuck extends Duck implements Serializable, flyable {

	public MallardDuck(String location) {
		super(location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void quack() {
		System.out.println("MallardDuck is quaking " + super.location);

	}

	@Override
	public void fly() {
		System.out.println("MallarDuck is flying " + super.location);

	}
}
