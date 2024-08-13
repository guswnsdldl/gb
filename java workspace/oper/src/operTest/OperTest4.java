package operTest;

import java.util.Scanner;

public class OperTest4 {
	public static void main(String[] args) {
//		심리 테스트
//		
//		Q. 당신이 좋아하는 색을 선택하세요.
//		1. 빨간색
//		2. 노란색
//		3. 검은색
//		4. 흰색
//		
//		빨간색 : 불같고 열정적이고 적극적이다.
//		노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
//		검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
//		흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.

		Scanner sc = new Scanner(System.in);
		String title = "Q. 당신이 좋아하는 색을 선택하세요.";
		String menu = "1.빨간색\n2.노란색\n3.검은색\n4.흰색\n5.종료";
		int choice = 0;
		String redMessage = "불같고 열정적이고 적극적이다.";
		String yellowMessage = "발랄하고 밝고 귀엽고 개성있고 착하다.";
		String blackMessage = "묵묵하고 든든하고 냉철하고 멋지다.";
		String whiteMessage = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
		String errorMessage = "잘못 입력하셨습니다.";
		String resultMessage = null;

		System.out.println(title);
		System.out.println(menu);

		choice = sc.nextInt();

		resultMessage = choice == 1 ? redMessage	//입력받은 정수가 1인가요? 응 rM출력
				: choice == 2 ? yellowMessage : 	//아니라면 2인가요? 응 yM출력
					choice == 3 ? blackMessage : 	//아니라면 3인가요? 응 bM출력
						choice == 4 ? whiteMessage : //아니라면 4인가요? 응 wM출력
							errorMessage;			//1,2,3,4 전부아니라면 eM출력

		System.out.println(resultMessage);

	}
}
