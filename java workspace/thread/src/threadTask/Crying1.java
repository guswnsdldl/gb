package threadTask;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Crying1 extends Thread {

	private int Count;
	
	public Crying1 () {;}

	public int getCount() {
		return Count;
	}

	public void setCount(int count) {
		Count = count;
	}

	public Crying1(int count, String name) {
		super(name);
		Count = count;
	}

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
	}
}