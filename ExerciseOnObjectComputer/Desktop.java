package ExerciseOnObjectComputer;

public class Desktop extends Computer {
	private int monitorSize;

	public Desktop(int monitorSize) {
		super();
		this.monitorSize = monitorSize;
	}

	public int getMonitorSize() {
		return monitorSize;
	}

	public void setMonitorSize(int monitorSize) {
		this.monitorSize = monitorSize;
	}

	@Override
	public void trunOn() {
		System.out.println("Turn on");

	}

}
