package projectA02;

public class projectA0204 {

	public static void main(String[] args) {
		/*
		 * 형변환
		 */
		//문자->정수
		char c='A';
		int int_c = (int)c;
		System.out.println(int_c);
		
		//정수->실수
		double double_int = (double)int_c;
		System.out.println(double_int);
		
		//실수->정수 : 반올림x 버림.
		double d=3.64;
		int int_d = (int)d;
		System.out.println(int_d);
		
		//정수->문자
		int c1=65;
		char char_c1 = (char)c1;
		System.out.println(char_c1);
		
		byte byte1=127;
		short short1 = (short)byte1;
		short1 = (short)(short1+1); //short + int = int -> short로 형변환		
		System.out.println(short1);
		byte byte2 = (byte)short1; //잘못된 것 (byte<short)
		System.out.println(byte2);
	}

}
