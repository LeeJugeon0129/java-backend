package projectA16;

public class projectA1609 {

	public static void main(String[] args) {
		int i=0;
		do { //Runnable
			System.out.println("Read");
			i++;
		}while(i<1000);
		
		i=0;
		do {//Thread
			System.out.println("Write");
			i++;
		}while(i<1000);
		
		i=0;
		do {//Runnable
			System.out.println("Send");
			i++;
		}while(i<1000);
		
	}

}
