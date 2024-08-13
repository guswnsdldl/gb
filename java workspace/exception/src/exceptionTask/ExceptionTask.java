package exceptionTask;

import java.util.Scanner;

public class ExceptionTask {
//   캐릭터 이름을 입력받고, 
//   "멍청이", "바보", "똥개"가 포함된 이름은 
//   예외를 발생시켜 사용자에게 경고 메세지를 출력해준다.
//   ※ 강제 종료하지 않는다.

	public void chating(String message) {
		if (message.contains("멍청이")) {
//           System.out.println(message);
			try {
				throw new BadNameException();
			} catch (BadNameException B) { // 예외처리
				message = "너는 멍청이~ 되겠냐ㅋ";
			}
		}
		if (message.contains("바보")) {
			try {
				throw new BadNameException();
			} catch (BadNameException B) { // 예외처리
				message = "ㅋㅋ자기소개하누 바보야 다시써라";
			}
		}
		if (message.contains("똥개")) {
			try {
				throw new BadNameException();
			} catch (BadNameException B) { // 예외처리
				message = "똥개겠냐고ㅋㅋㅋ~";
			}
		}
		System.out.println(message);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ExceptionTask chating = new ExceptionTask();
		String message = "캐릭터 닉네임을 지어주세요 : ";
		String data = null;

		while (true) {
			System.out.println(message);
			data = sc.nextLine();
			chating.chating(data);
		}

	}
}