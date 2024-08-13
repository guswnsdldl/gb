package arraypractice;

import java.util.Scanner;

public class ArrayPracticeTask {
	public static void main(String[] args) {

//	브론즈
//	1 ~ 10까지 배열에 담고 출력
//	10번 반복하는 for문 만들기
//		int[] intAr1 = new int[10];
//		for(int i = 0; i<intAr1.length; i++) {
//			intAr1[i] = i+1;
//			System.out.println(intAr1[i]);
//		}
//	10 ~ 1까지 중 짝수만 배열에 담고 출력
//		int[] intAr2 = new int[10];
//		for(int i = 0; i<intAr2.length; i++) {
//			intAr2[i] = 10-i;
//			System.out.println(intAr2[i]);
//		}
//	1 ~ 100까지 배열에 담은 후 홀수만 출력
//		int[] intAr3 = new int[100];
//		for(int i = 0; i<intAr3.length; i++) {
//			intAr3[i] = i+1; 
////			System.out.println(intAr3[i]);	//1부터 100까지 잘 담겼는지 확인
//			if(intAr3[i] % 2==1) {
//			System.out.println(intAr3[i]);
//			}
//		}

//	실버
//	1 ~ 100까지 배열에 담은 후 짝수의 합 출력
//		int[] intAr4 = new int[100];
//		int result = 0;
//		for(int i = 0; i <intAr4.length; i++) {
//			intAr4[i]=i+1;
////			System.out.println(intAr4[i]);	//1부터 100까지 잘 담겼는지 확인
//			if(intAr4[i] % 2 ==0) {
//				System.out.println(intAr4[i]);
//			}
//		}

//														65 66 67 68 69 70	               
//	A ~ F까지 배열에 담고 출력					0 1 2 3 4 5/ A  B  C  D  E  F
//		int[] arAlpavet = new int[6];
//		for(int i = 0; i<arAlpavet.length; i++) {
//			arAlpavet[i] = i+65;
//			System.out.print((char)(arAlpavet[i]));
//		}
//	A ~ F까지 중 C를 제외하고 배열에 담은 후 출력
//		int[] deleteC = new int[5];
//		for(int i = 0; i<deleteC.length; i++) {
//			deleteC[i] = (char)(i>1 ? i+66 : i+65);
//			System.out.println((char)
//					deleteC[i]);
//		}
//	

//	골드
//	5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//	비교하기 위해서는 항이 2개가 필요하다.
		Scanner sc = new Scanner(System.in);
//		String message = "5개의 정수를 입력하세요 : \n예) 1 3 5 7 9";
//		int max = 0;
//		int min = 0;
//		int[] arData1 = new int[5];
//		System.out.println(message);
//
//		for (int i = 0; i < arData1.length; i++) {
//			arData1[i] = sc.nextInt();
//
//			max = arData1[0];
//			min = arData1[0];
//		}
//		for (int i = 0; i < arData1.length; i++) {
//
//			if (max < arData1[i]) {
//				max = arData1[i];
//			}
//			if (min > arData1[i]) {
//				min = arData1[i];
//			}
//		}
//
//		System.out.println("최대값 : " + max);
//		System.out.println("최소값 : " + min);

//	다이아
//	사용자가 칸 수를 입력하고, 그 칸 수만큼 정수를 다시 입력받는다.
//	입력한 정수들의 평균값을 구한다.
		String message1 = "몇개의 정수를 입력하시겠습니까? : ";
		String message2 = "번 정수";
		int total = 0;
		int size = 0;
		int[] arData2 = null;

		System.out.println(message1);
		size = sc.nextInt();
		
		arData2 = new int[size];
		for (int i = 0; i < arData2.length; i++) {
			arData2[i] = sc.nextInt();
			System.out.println(i + 1 + message2);

		}
		for (int i = 0; i < arData2.length; i++) {
			total += arData2[i];
		}
		System.out.println((double) total / arData2.length);

	}

}
