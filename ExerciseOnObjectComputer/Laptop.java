package ExerciseOnObjectComputer;

public class Laptop extends Computer implements Carryable {
	private int weight;

	public Laptop(int cpu, int weight) {
		super(cpu);
		this.weight = weight;
	}

	@Override
	public void trunOn() {
		// TODO Auto-generated method stub

	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}

}
