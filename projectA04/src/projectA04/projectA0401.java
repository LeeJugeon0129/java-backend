package projectA04;

public class projectA0401 {
	public static void main(String[] args) {
		System.out.println(10==11? 1:0);
		
		int x1 = 10;
		int x2 = 10;
		int s0 = 0;
		if(x1 == x2) {
			s0 = 1;
		}
		else {
			s0 = 0;
		}
		System.out.println(s0);
		
		s0 = (x1==x2?1:0);
		
		System.out.println(s0);
	}
}
