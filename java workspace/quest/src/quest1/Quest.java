package quest1;

import java.util.Scanner;

public class Quest {
	public static void main(String[] args) {
		String space = "\n";
// 	첫번째 실습 5문제 - 지금까지의 지식으로만 공부x
//	1) 1부터 100사이의 모든 정수를 한 줄에 10개씩 출력하는 프로그램 만들기
//		int[] arData = new int[100];
//		for(int i = 0; i<arData.length; i++) {
//			arData[i] = i+1;
//			System.out.print(arData[i] + " ");	
//			if(arData[i]== 10) {
//				System.out.println(space);
//			}if(arData[i] == 20) {
//				System.out.println(space);
//			}if(arData[i] == 30) {
//				System.out.println(space);
//			}if(arData[i] == 40) {
//				System.out.println(space);
//			}if(arData[i] == 50) {
//				System.out.println(space);
//			}if(arData[i] == 60) {
//				System.out.println(space);	
//			}if(arData[i] == 70) {
//				System.out.println(space);	
//			}if(arData[i] == 80) {
//				System.out.println(space);
//			}if(arData[i] == 90) {
//				System.out.println(space);
//			}		//무식한 방법말고는 잘 모르겠습니다..ㅠ
//		}
	
//	2) 전체 구구단을 다음과 같은 모습으로 출력하는 프로그램 만들기
	int[] test = new int[10];
	for(int i = 1; i < 9; i++) {
		test[i] = i+1;
		int num1 = test[i];
//		System.out.println(num1);	//i값 확인
		for (int j = 1; j < 9; j++){
			test[j] = j+1;
			int num2 = test[j];
//			System.out.println(test[j]); //j값 확인
			int number = num1 * num2;
//			System.out.println(number);	//i반복문이 들어간 num1과 j반복문이 들어간 num2의 곱셈 확인
			System.out.println(num1 +"x"+ num2 +"=" + number);		// 넘기는게 잘 기억나지않습니다.
		}
	}
//	3) 별 찍기(이중 for문) 
//	int[] arData = new int[5];
//		for(int i = 0; i < arData.length; i++) {
//			arData[i] += i+1 ;
//			for( "*" = 0;   )
//			System.out.println(arData.length + "*");	//솔직히 잘 모르겠어요ㅠ
//		}
	
	

//	4) 정수를 입력받아 입력 받은 정수가 1~10사이의 정수라면 입력받은 정수 출력 
//	   아니라면 다시 입력받는 프로그램.
//		Scanner sc = new Scanner(System.in);
//		String message1 = "정수 입력 : ";
//		String message2 = "다시 입력하세요 : ";
//		System.out.print(message1);
//		int num =sc.nextInt();
//			if(num <= 10) {
//			System.out.println("입력하신 정수는 " + num + " 입니다.");
//			} if(num > 10)	{
//				System.out.print(message2);			//다시 받는 출력문 까진 되었는데 반복하는데에 어떤문을 써야하는지 모르겠습니다
//			num = sc.nextInt();						//얼마나 무한히 반복될지 모르니 do ~ while, while을 써야하는가, 아니면 
//			}										//삼항연산자를 사용해서 int num = num > 11 ? message1: message2 조건식을 
													//사용해야하는지
			
			
		
		

//	5) 사용자로부터 숫자를 입력 받고 1부터 입력 받은 값까지의 합을 구하고 
//	10번까지 다시 입력 받도록 하기 단, 0을 입력 받으면 프로그램 종료
//		Scanner sc = new Scanner(System.in);
//		String message = "숫자를 입력"		// 문제 이해를 못했습니다!


		}
	}
