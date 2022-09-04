
public class p1 {

	public static void main(String[] args) {
		int rs = 5000000;
		
		for(int i=10;i>=-10;i--) {
			if(i==0) {
				continue;
			}
			rs = rs/i;
			System.out.println(rs);
		}
		
		
	}

}
