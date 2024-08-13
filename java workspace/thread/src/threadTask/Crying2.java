package threadTask;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Crying2 implements Runnable{
	
	private int Count;
	
	public void run() {
	    // 스트림을 사용하여 10번 반복
	    IntStream.rangeClosed(1, 10).forEach(i -> {
	        System.out.println(Thread.currentThread().getName());
	        try {
	            Thread.sleep(500);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    });

	    
	    
	
//	@Override
//	public void run() {
//		ArrayList<Integer> Count = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach(Count::add);
//		for (int i = 0; i <10 ; i++) {
////		IntStream.rangeClosed(1,10).forEach((run) -> {System.out.println(Count);});
////	         접근한 쓰레드를 알아낼 수 있다.
//	         System.out.println(Thread.currentThread().getName());	//왜 getName인가..
//	         try {
//	            Thread.sleep(500);
//	         } catch (InterruptedException e) {;}
//	      
//	   }
	}
}


