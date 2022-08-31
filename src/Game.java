

	import java.util.Arrays;
	import java.util.Random;
	import java.util.Scanner;

	public class Game {
		public static void main(String[] args) {
			//Random random = new Random();
			//Scanner scanner = new Scanner(System.in);
			
			//int[] arr = new int[1];
			
			//int[] arr = new int[1];		
			
			
			//System.out.println("숫자입력");
			//int i= Integer.parseInt(scanner.nextLine());
			//arr[0] = random.nextInt(i)+1;			
			//System.out.println("답맞춰");
			//int ans = Integer.parseInt(scanner.nextLine());
			
		
			Random random = new Random();
			Scanner scanner = new Scanner(System.in);

			int[] arr = new int[1];

			// int[] arr = new int[1];

			System.out.println("숫자입력");
			int i = Integer.parseInt(scanner.nextLine());
			arr[0] = random.nextInt(i) + 1;
			int j = 0;	//횟수 초기화
			while (true) {
				
				System.out.println("답맞춰");
				int ans = Integer.parseInt(scanner.nextLine());
				j++;//한번 돌 때 마다 +1

				if (arr[0] == ans) {
					System.out.println("정답");
					break;
				} else {
					System.out.println("ㄴ일치 다시");
					continue;
				}//if				
			}//while
			System.out.println("시도횟수=" +j+"번째");//시도 횟수 : 밖으로 int 빼주고 ++
						
		}//main
	}//class

