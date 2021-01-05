package ExerciseOnObject3;

public class Main {

	public static void main(String[] args) {
		Person[] arr = new Person[5];
		arr[0] = new Person("jack");
		arr[1] = new Person("Jack");
		arr[2] = arr[0];

		System.out.println(arr[0].equals(arr[1]));
		System.out.println(arr[0] == arr[1]);
		System.out.println(arr[0].equals(arr[2]));
		System.out.println(arr[0] == arr[2]);

		System.out.println(arr[4]);
		System.out.println(arr[2]);

	}

}
