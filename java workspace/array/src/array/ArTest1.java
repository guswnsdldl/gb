package array;

public class ArTest1 {
	public static void main(String[] args) {
//		int[] arData = {2, 4, 5, 6, 8};
		
//		System.out.println(arData);
//		System.out.println(arData[0]);
//		System.out.println(arData.length);
//		
//		System.out.println("==========================");
		
//		첫 번째 값부터 순서대로 출력
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
//		선언 시, 어떤 값이 들어갈 지는 모르지만 5칸이 필요하다.
//		5, 4, 3, 2, 1을 각 방에 넣고 출력
		int[] arNumber = new int[5];
		
		for (int i = 0; i < arNumber.length; i++) {
			arNumber[i] = 5 - i;
			System.out.println(arNumber[i]);
		}
	}
}















