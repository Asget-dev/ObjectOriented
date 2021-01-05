package ExerciseOnObject4;

public class Greet {
	private static int count = 0;

	public Greet() {
		count++;
		System.out.println("Hello " + count);
	}

	public static int getCount() {
		return count;
	}
}
