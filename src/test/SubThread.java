package test;

public class SubThread extends Thread {
	
	public void run(){
		sleep(100);
		System.out.println(Thread.currentThread().getName() + "!");
	}
}
