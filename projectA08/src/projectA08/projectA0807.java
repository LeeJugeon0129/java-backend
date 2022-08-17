package projectA08;

public class projectA0807 {

	public static void main(String[] args) {
		String[][] strArray = new String[2][5];
		
		strArray[0][0] = "Java";
		strArray[0][1] = "Java";
		strArray[0][2] = "Go";
		strArray[0][3] = "Python";
		strArray[0][4] = "javascript";
		
		strArray[1][0] = "Programming";
		strArray[1][1] = "Language";
		strArray[1][2] = "Application";
		strArray[1][3] = "Applet";
		strArray[1][4] = "servlet";
		
		for(int i=0;i<strArray.length;i++) {
			for(int j=0;j<strArray[i].length;j++) {
				System.out.print(strArray[i][j]+" ");
			}
			System.out.println();
		}
		if(strArray[0][0].equals(strArray[0][1])) {//문자열 비교 : .equals()
			System.out.println("Java 입니다.");
		}
	}

}
