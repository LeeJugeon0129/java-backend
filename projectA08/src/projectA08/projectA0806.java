package projectA08;

public class projectA0806 {

	public static void main(String[] args) {
		int[][] intArray = {
				{10,11,12,13,14,15},
				{21,22},
				{31,32,33},
				{41,42,43,44}
				};
		
		for(int i=0;i<intArray[0].length;i++) {
			System.out.print(intArray[0][i]+" ");
		}
		System.out.println();
		for(int i=0;i<intArray[1].length;i++) {
			System.out.print(intArray[1][i]+" ");
		}
		System.out.println();
		for(int i=0;i<intArray[2].length;i++) {
			System.out.print(intArray[2][i]+" ");
		}
		System.out.println();
		for(int i=0;i<intArray[3].length;i++) {
			System.out.print(intArray[3][i]+" ");
		}
		System.out.println();
		
		//한번에 출력
		for(int i=0;i<intArray.length;i++) {
			for(int j=0;j<intArray[i].length;j++) {
				System.out.print(intArray[i][j]+" ");
			}
			System.out.println();
		}
	}

}
