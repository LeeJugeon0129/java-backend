package projectA02;

public class projectA0207 {

	public static void main(String[] args) {
		var price=200; //변수 자동 할당, 불안정해서 추천x
		var name="kitae";
		var PI=3.14;
		var inta=2147483648L;
		
		System.out.println(price);
		System.out.println(name);
		System.out.println(PI);
		System.out.println(inta);
		
		var intb = 2147483648L+10L;
		System.out.println(intb);
		
		var str = price+price+name;
		System.out.println(str);
		
		var str1 = name+price+price;
		System.out.println(str1);
	}

}
