package projectA14;

class NotFindID extends Exception{
	//.... 예외를 정의할 수 있음.
	
}

public class projectA1409 {
	public void findId() throws NotFindID {
		//........
		//try - catch로 처리해줘야됨.
		throw new NotFindID();
		
	}
	

	public static void main(String[] args) throws Exception {
		
		throw new Exception("예외상황입니다.");
		
		
		
	}

}
