package projectA14;

public class projectA1412 {

	public static void main(String[] args) {
		Account account = new Account();
		
		//예금하기
		account.deposit(10000);
		System.out.println("예금액: "+account.getBalence());
		
		//출금하기
		try {
			account.withdraw(30000);
		} catch (BalenceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			e.printStackTrace();
		}
		
	}

}
