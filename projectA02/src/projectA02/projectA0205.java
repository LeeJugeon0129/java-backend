package projectA02;

public class projectA0205 {

	public static void main(String[] args) {
		char name1='이';
		char name2='주';
		char name3='건';
		System.out.println(""+name1+name2+name3); //""문자열이라고 지정해줘야함. 지정하지 않으면 숫자로 나옴.
		System.out.print(name1);
		System.out.print(name2);
		System.out.print(name3);//문자로 표현
		System.out.println();
		
		String name="이주건";
		System.out.println(name1+name2+name3);//숫자로 처리됨
		System.out.println(name);
		System.out.println(name+name1+name2+name3);
		
		System.out.println(10+20+"안녕하세요");
		System.out.println("안녕하세요"+10+20);//문자열이 처음에 오면 나머지도 문자로 취급
		
		System.out.println(10+30+40+"HI");
		System.out.println("HI"+10+30+40);//+가 문자열부터 더해서 문자로 취급
		System.out.println("HI"+(10+30+40));
		System.out.println(10+30+"HI"+40);
		System.out.println(10+30+"HI"+40*100);
		
		System.out.println("("+10+20+")");
		System.out.println((10+20));
		char c1='가';
		char c2='나';
		System.out.println(c1+c2);
		System.out.println(""+c1+c2);
		
		String str = 10+20+"안녕하세요";
		System.out.println(str);
		String str1 = "안녕하세요"+10+20;
		System.out.println(str1);
		
		System.out.println(10);//10진수
		System.out.println(017);//8진수
		System.out.println(0x1F);//16진수
		System.out.println(0b010101010);//2진수
		
		char c='\u0041';//유니코드 41번값
		System.out.println(c);
		char cc='\u0042';
		System.out.println(cc);
		char cc2='\uae00';
		System.out.println(cc2);
		
		String string1="안녕\t안녕하세요\t나는\n\"이주건\"입니다.";
		System.out.println(string1);
		String string2="안녕\b안녕하세요\t나는\'이주건\'입니다.";
		System.out.println(string2);
		
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
		
		boolean b3 = (10>1); //true
		boolean b4 = (10==10); //true
		boolean b5 = (10<1); //false
		
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		
		String s1=null;
		String s2="";
		int a1[]=null;//== int[] a1=null;
		System.out.println(s1);
		System.out.println(a1);
		
	}

}
