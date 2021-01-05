package ExerciseOnObjectAutomobile;

public class Passenger {
	private String name;
	private Bus bus;

	public Passenger(String name, Bus bus) {
		super();
		this.name = name;
		this.bus = bus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

}
