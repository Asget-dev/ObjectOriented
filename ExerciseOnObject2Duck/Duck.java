package ExerciseOnObject2Duck;

import java.io.Serializable;

public abstract class Duck implements Serializable {
	protected String location;

	public Duck(String location) {
		super();
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public abstract void quack();

	@Override
	public String toString() {
		return "Duck [location=" + location + "]";
	}

}
