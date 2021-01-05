package ExerciseOnObject5;

public abstract class ChekingAccount extends Account {
	private int fee;

	public ChekingAccount(int numner, int balance, int fee) {
		super(numner, balance);
		this.fee = fee;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
