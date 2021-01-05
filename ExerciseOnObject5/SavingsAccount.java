package ExerciseOnObject5;

public class SavingsAccount extends Account {
	private int interestRate;

	public SavingsAccount(int numner, int balance, int interestRate) {
		super(numner, balance);
		this.interestRate = interestRate;
	}

	public int getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
