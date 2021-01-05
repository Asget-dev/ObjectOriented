package ExerciseOnObjectAutomobile;

import java.util.ArrayList;
import java.util.List;

public class Bus extends Automobile implements PublicTransport {
	public int maxMassengers;
	List<Passenger> passanger = new ArrayList<>();

	public Bus(int maxSpeed, int maxMassengers) {
		super(maxSpeed);
		this.maxMassengers = maxMassengers;
	}

	public int getMaxMassengers() {
		return maxMassengers;
	}

	public void setMaxMassengers(int maxMassengers) {
		this.maxMassengers = maxMassengers;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void passengerBoards() {

	}

	@Override
	public void passengerLeaves() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Bus [getMaxSpeed()=" + getMaxSpeed() + ", maxMassengers=" + maxMassengers + ", passanger=" + passanger
				+ "]";
	}

}
