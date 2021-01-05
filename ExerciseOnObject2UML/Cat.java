package ExerciseOnObject2UML;

public class Cat extends Animal {
	private String name;

	public Cat(int age, String name) {
		super(age);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void purr() {
		System.out.println("Cat " + name + "is eating");
	}

	@Override
	public void eat() {
		System.out.println("Cat " + name + "is purring");

	}

}
