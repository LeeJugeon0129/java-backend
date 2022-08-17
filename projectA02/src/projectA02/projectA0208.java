package projectA02;

public class projectA0208 {

	public static void main(String[] args) {
		int inta = 2_147_483_647;
		
		int inta1 = inta+1;
		int inta2 = inta+2;
		System.out.println(inta1);
		System.out.println(inta2);
		
		var vinta = 2_147_483_647;
		var vinta1 = vinta+1L;
		var vinta2 = vinta+2L;
		System.out.println(vinta1);
		System.out.println(vinta2);
		
		var lta = 9_223_372_036_854_775_807L;
		var lta1 = lta+1;
		System.out.println(lta);
		System.out.println(lta1);
		
	}

}
