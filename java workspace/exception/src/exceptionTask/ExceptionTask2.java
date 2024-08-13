package exceptionTask;

import java.util.Scanner;

public class ExceptionTask2 {
//  캐릭터 이름을 입력받고, 
//  "멋쟁이", "쿨가이", "지존"이 포함된 이름은 
//  예외를 발생시켜 사용자에게 경고 메세지를 출력해준다.
//  ※ 강제 종료하지 않는다.
	public void goodName(String message) { // goodName 클래스에 문자열타입 message 값 담기
		if (message.contains("멋쟁이")) {
			try {
				throw new GoodNameException();
			} catch (GoodNameException G) { //
				message ="멋진이름 입니다.";

			}
			if (message.contains("쿨가이")) {
				try {
					throw new GoodNameException();
				} catch (GoodNameException G) {
					message = "시원한 남자입니다~";
				}
			}
			if (message.contains("지존")) {
				try {
					throw new GoodNameException();
				} catch (GoodNameException G) {
					message = "최강지존입니다~";
				}
				
			}System.out.println(message);
		} 
			
	}		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ExceptionTask2 goodName = new ExceptionTask2();
		String message ="캐릭터 이름 정하기 : ";
		String data = null;
		
		while(true) {
		System.out.println(message);
		data=sc.nextLine();
		 goodName.goodName(data);
		
		}
	}

}
