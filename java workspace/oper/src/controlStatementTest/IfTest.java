package controlStatementTest;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//출력메소드
		int number1 = 0, number2 = 0;					//정수형 number1,2 선언
		String message = "두 정수를 입력하세요.\n예)1 4";		//출력메시지 선언
		boolean condition1 = false, condition2 = false;	//논리형 condition1,2 선언 초기값 false
		String result = null;			//문자열 reuslt 선언
		
		System.out.println(message); //출력메시지 출력
		number1 = sc.nextInt();		//첫번째 정수 number1 대입
		number2 = sc.nextInt();		//두번째 정수 number2 대입
		
		condition1 = number1 > number2;	//con~1 첫번째 정수가 두번째 정수보다
		condition2 = number2 > number1;
		
		if(condition1) {
			result = "큰 값: " + number1;
		}
		else if(condition2) {
			result = "큰 값: " + number2;
		}
		else {
			result = "두 수가 같습니다.";
		}
		
		System.out.println(result);
	}
}

















