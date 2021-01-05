package ExerciseOnObjectAutomobile;

public abstract class Automobile {
	private int maxSpeed;

	public Automobile(int maxSpeed) {
		super();
		this.maxSpeed = maxSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public abstract void move();

}
