package operTest;

import java.util.Scanner;

public class OperTest2 {
	public static void main(String[] args) {
//		두 정수 입력받기
		Scanner sc = new Scanner(System.in);		//출력메소드
		int number1 = 0, number2 = 0;				//number1 , number2 변수 선언
//		int result = 0;
		String result = null;						//result 변수 선언
		String message = "두 정수를 입력하세요.\n예)1 4";	//입력을 받기위한 출력문 메시지
		
		System.out.println(message); 				//메시지 출력
		number1 = sc.nextInt();						//number1에 첫 번째 정수 입력
		number2 = sc.nextInt();						//number2에 두 번째 정수 입력
		
//		두 정수 비교
		
//		참과 거짓 자리에 들어갈 값은 자료형이 서로 달라도 된다.
		result = number1 > number2 ? "큰 값 : " +number1+"입니다." 
				: "큰 값 : " +number2+"입니다.";
		
		System.out.println(result);
	}
}















