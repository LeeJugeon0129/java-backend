package projectA07;

public class projectA0706 {

	public static void main(String[] args) {
		int i=0;
		int sum=0;
		
		for(;;) {
			sum=sum+i;
			i++;
			if(i>=1_000_000) {
				break;
			}
		}
		System.out.println("0~1,000,000까지의 합은: "+sum);
		
		i=0;
		sum=0;
		while(true) {
			sum=sum+i;
			i++;
			if(i>=1_000_000) {
				break;
			}
		}
		System.out.println("0~1,000,000까지의 합은: "+sum);
		
		i=0;
		sum=0;
		do {
			sum=sum+i;
			i++;
			if(i>=1_000_000) {
				break;
			}
		}while(true);
		System.out.println("0~1,000,000까지의 합은: "+sum);
	}

}
