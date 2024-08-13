package threadTask;


public class Animal {
	public static void main(String[] args) {		
		
//	[실습]
//			동석이네 동물원에는 3마리의 동물이 있다.
//			각 동물은 울음 소리가 다르고 2마리의 동물은 동시에 운다.
//			나머지 1마리 동물은 2마리 동물이 모두 울고 나면 마지막에 운다.
//
//			패키지명: threadTask
//
//			※ 클래스는 2개만 선언한다.
//			※ 반드시 join()을 사용한다.
//			※ 각 동물은 10번씩만 운다.
//			※ 람다식을 사용한다.
//			자원 1개 선언
		Crying2 crying = new Crying2();
		 
//		 쓰레드 3개 선언
//		 한개의 자원을 여러 쓰레드가 공유
		Thread tiger = new Thread(crying, "어흥");
		Thread bear = new Thread(crying, "크오오오");
		Thread monkey = new Thread(crying, "우끼끼");
		
		
		tiger.start();
		bear.start();
		
		try {
			tiger.join();
			bear.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		monkey.start();
	      
		 
	}
}