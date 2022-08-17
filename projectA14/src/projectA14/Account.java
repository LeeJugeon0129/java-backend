package projectA14;

public class Account {
	private long balance;
	
	public Account() {
		
	}
	public long getBalence() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws BalenceInsufficientException {
		if(balance < money) {
			throw new BalenceInsufficientException("잔고 부족: "+(money-balance)+"모자람.");
			
		}
		balance -= money;
	}
}
