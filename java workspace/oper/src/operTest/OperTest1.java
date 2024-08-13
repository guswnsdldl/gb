package operTest;

public class OperTest1 {
	public static void main(String[] args) {
		
		boolean isTrue = 10 == 11;					//10 과 11이같나? false
		boolean result = isTrue && 10 <= 20;		//false AND false = false
		
		System.out.println(10 == 11);		//false
		System.out.println(10 > 3);			//true
		System.out.println(isTrue);			//false
		
		System.out.println("=====================");
		
		System.out.println(result);		//false
		
//		isTrue && 10 <= 20 의 결과를 true가 나오게 변경하기
		System.out.println(isTrue || 10 <= 20);			//false || true true
		System.out.println(!isTrue && 10 <= 20);		//true	|| true	true
	}
}













