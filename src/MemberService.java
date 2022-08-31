import java.util.Scanner;

public class MemberService {
	private String userId,userPw;
	private Scanner scan;
	
	public MemberService() {
		
	}
	public MemberService(Scanner scan) {
		this.scan = scan;
	}
	
	
	public boolean login(String userId, String userPw) {				
		
		boolean result = false;
		if(userId.equals("hong")&&userPw.equals("12345")) {		
			result = true;
		}else {
			result = false;
		}
		return result ;			
			
	}
	
	public boolean logout(String userId) {			
		System.out.println("로그아웃");
		boolean result = false;
		return result ;	
	}
}
