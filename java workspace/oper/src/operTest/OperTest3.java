package operTest;

import java.math.BigDecimal;
import java.util.Scanner;

public class OperTest3 {
	public static void main(String[] args) {
//		사용자에게 키를 입력받고 
//		정수라면 정수로 출력
//		실수라면 실수로 출력
//		예)	183 -> 183 출력
//		   	183.5 -> 183.5 출력
//			183.0 -> 183 출력
		
		Scanner sc = new Scanner(System.in);			//출력메소드
		double height = 0.0;					//height으로 답을 받고 리턴타입이 double이다
		String message = "키: ", format = null;	//출력문 메세지, 소수점 자리수를 구할 변수
		boolean isInteger = false;	//논리형 isInteger의 기본값 false
		int length = 0;		//정수형 length
		BigDecimal originalHeight = null;	//Big~타입 ori~
		BigDecimal exp = null;			//Big~타입 exp
		
		System.out.print(message);
		height = sc.nextDouble();
//		더블타입 183.5 입력받음
		originalHeight = new BigDecimal(String.valueOf(height));
		//Big~타입 183.5
		exp = new BigDecimal(String.valueOf((int)height));
		//Big~타입 183.5
		isInteger =(height - (int)height) == 0;
//		0.5			"183.5"-183
		length = originalHeight.subtract(exp).toString().length() - 2;
//		0.5 183.5	Big~  -연산자 183    계산하고 남은 소수점자리 길이 -2(길이)
//		0.5에 왼쮹부터 2자리 뻄    0  .  5
//							  1  2  3  = 3 -2 = 1소수점 <1자리>					
//		length = (height - (int)height + "").length() - 2;
		format = isInteger ? "%.0f" : "%." + length + "f";
//	문자열 format이 0.5야?  틀리면 소수점없애 맞다면 소수점 1번째 자리 까지 출력해
		System.out.printf(format,height);
//							191.1	ex)height = 191.1
		System.out.println("한동석");
		
		
		
	}
}













