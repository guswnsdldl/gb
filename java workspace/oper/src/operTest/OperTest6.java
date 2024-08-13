package operTest;

public class OperTest6 {
	public static void main(String[] args) {
//		1 ~ 10까지 중 4까지만 출력한다.
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i + 1);
//
//			if(i == 3) {
//				break;
//			}
//		}
//		1 ~ 10까지 중 4를 제외하고 출력한다.
		for (int i = 0; i < 10; i++) {	//i가 0이면서 10미만까지 i+1반복
			if(i == 3) {				//만약 i면 그냥 지나가고
				continue;				//i가 3이 아니면 나머지 i값엔+1
			}
			System.out.println(i + 1);
		}
	}
}





















