import java.util.Scanner;

public class MemberServiceExample {

	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MemberService memberService = new MemberService();
		System.out.println("아이디 입력");
		String userId = scan.nextLine();
		System.out.println("비번입력");
		String userPw = scan.nextLine();
		
	
		if(memberService.login(userId, userPw)) {
			System.out.println("로그인");
			memberService.logout(userId);
			
		}else {
			System.out.println("id 또는 비번 틀림");
		}
	}

	
}
