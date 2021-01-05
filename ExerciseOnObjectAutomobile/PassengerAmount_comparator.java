package ExerciseOnObjectAutomobile;

import java.util.Comparator;

public class PassengerAmount_comparator implements Comparator<Bus> {

	@Override
	public int compare(Bus a, Bus b) {
		return a.getMaxSpeed() - b.getMaxSpeed();
	}

}
