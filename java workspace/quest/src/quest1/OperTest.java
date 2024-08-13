package quest1;

import java.util.Scanner;

public class OperTest {
	public static void main(String[] args) {
		//논리 연산자
//		AND연산자 && 둘다 참이여야 참
//		true	true  	true
//		true	false 	false
//		false	true	false
//		false	false	false
//		OR연산자 ||	둘중 하나만 참이면 참
//		true	true	true
//		true	false	true
//		false	true	true
//		false	flase	false
		
		
//		System.out.println((10 > 2) && (8 > 9));	//true
//		System.out.println((6 < 1) || (4 > 2));  	//true
//		System.out.println((30<14)||(18<7));		//false
		
//		단항 연산자 NOT 나오는 값에 반대가 된다↓
//		System.out.println(!true);	//false
//		System.out.println(!false);	//true
		
//		삼항 연산자	 ex) a=x b=y a가 b보다 큰것이 참일시 true(a) 값 출력 거짓일시(b)
//		int num1 = 12;
//		int num2 = 89;
//		int result = 0;
//		result = num1 > num2 ? num1  : num2 ;
//		System.out.println(result);
//		class Rabbit {}
//		Rabbit rabbit = new Rabbit();
//		System.out.println(rabbit instanceof Rabbit);
		
		
//		사용자에게 키를 입력받고 
//		정수라면 정수로 출력
//		실수라면 실수로 출력
//		1 ~ 10까지 중 4까지만 출력한다.	
//		int[] arData = new int[4];
//			for(int i = 0; i<5; i++) {
//					arData[i] = i+1;
//				System.out.println(arData[i]);
//			}
//		1 ~ 10까지 중 4를 제외하고 출력한다.
		int[] arData = new int[10];
		for(int i = 0; i < 10; i++) {
			arData[i] = i+1;
			if(3 - i != 0) {
				System.out.println(arData[i]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}