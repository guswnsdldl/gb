package array;

import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
//		브론즈
//		1 ~ 10까지 배열에 담고 출력
//		10번 반복하는 for문 만들기
//		int[] arData = new int[10];
//		
//		for (int i = 0; i < 10; i++) {
//			arData[i] = i + 1;
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		
//		10 ~ 1까지 중 짝수만 배열에 담고 출력
//		int[] arData = new int[5];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (5 - i) * 2;
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
//		1 ~ 100까지 배열에 담은 후 홀수만 출력
//		int[] arData = new int[100];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//		}
		
//		for (int i = 0; i < arData.length; i++) {
//			if(arData[i] % 2 == 1) {
//				System.out.println(arData[i]);
//			}
//		}
		
//		for (int i = 0; i < 50; i++) {
//			System.out.println(arData[i * 2]);
//		}
		
//		실버
//		1 ~ 100까지 배열에 담은 후 짝수의 합 출력
//		int[] arData = new int[100];
//		int result = 0;
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//			if (arData[i] % 2 == 0) {
//				result += arData[i];
//			}
//		}
//		
//		System.out.println(result);
		
		
//		A ~ F까지 배열에 담고 출력
//		char[] arData = new char[6];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(65 + i);
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
//		A ~ F까지 중 C를 제외하고 배열에 담은 후 출력
//		char[] arData = new char[5];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(i > 1 ? 66 + i : 65 + i);
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		
//		골드
//		5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//		비교하기 위해서는 항이 2개가 필요하다.
		
//		Scanner sc = new Scanner(System.in);
//		int[] arData = new int[5];
//		String message = "5개의 정수를 입력하세요.\n예)1 3 2 4 6";
//		int max = 0, min = 0;
//		
//		System.out.println(message);
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = sc.nextInt();
//		}
//		
//		max = arData[0];
//		min = arData[0];
//		
//		for (int i = 1; i < arData.length; i++) {
//			if(max < arData[i]) {
//				max = arData[i];
//			}
//			if(min > arData[i]) {
//				min = arData[i];
//			}
//		}
//		
//		System.out.println("최대값: " + max);
//		System.out.println("최소값: " + min);
//		
		
		
//		다이아
//		사용자가 칸 수를 입력하고, 그 칸 수만큼 정수를 다시 입력받는다.
//		입력한 정수들의 평균값을 구한다.
//		int[] arData = null;
//		Scanner sc = new Scanner(System.in);
//		String message1 = "몇 개의 정수를 입력하시나요?";
//		String message2 = "번 정수: ";
//		
//		int size = 0, total = 0;
//		
//		System.out.println(message1);
//		size = sc.nextInt();
//		
//		arData = new int[size];
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.print(i + 1 + message2);
//			arData[i] = sc.nextInt();
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			total += arData[i];
//		}
//		
//		System.out.println((double)total / arData.length);
	}
}














