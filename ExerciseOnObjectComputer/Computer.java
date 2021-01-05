package ExerciseOnObjectComputer;

public abstract class Computer {
	protected int cpu;

	public Computer(int cpu) {
		super();
		this.cpu = cpu;
	}

	public Computer() {
		// TODO Auto-generated constructor stub
	}

	public int getCpu() {
		return cpu;
	}

	public void setCpu(int cpu) {
		this.cpu = cpu;
	}

	public abstract void trunOn();
}
