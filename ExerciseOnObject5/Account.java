package ExerciseOnObject5;

public abstract class Account {
	private int numner;
	private int balance;

	public Account(int numner, int balance) {
		super();
		this.numner = numner;
		this.balance = balance;
	}

	public int getNumner() {
		return numner;
	}

	public void setNumner(int numner) {
		this.numner = numner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit() {

	}

	public void withdraw() {

	}

	public abstract void update();
}
