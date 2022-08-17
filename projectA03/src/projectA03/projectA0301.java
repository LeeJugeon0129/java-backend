package projectA03;

public class projectA0301 {
	public static void main(String[] args) {
		boolean b1 = false;
		
		byte bt1 = 10;
		int i1 = 20;
		
		bt1 = (byte)i1; // byte(1) != int(4) 크기 때문에 안됨.
		i1 = bt1;
		
		int var1 = 10;//10진수
		int var2 = 010;//8진수
		int var3 = 0x10;//16진수
		int var4 = 0b1010;//2진수
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(Integer.toBinaryString(var4));//10진수 -> 2진수로 표현
		
		int result = 0;
		result = var1 + var2 + var3 + var4;
		System.out.println(result);
	}
}
