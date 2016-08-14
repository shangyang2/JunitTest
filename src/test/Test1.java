package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {

	@Test //ArrayIndexOutOfBoundsException 异常测试
	public void test() {
		try{
	         int a[] = new int[2];
	         System.out.println("Access element three :" + a[3]);
	      }catch(ArrayIndexOutOfBoundsException e){
	         System.out.println("Exception thrown  :" + e);
	      }
	      System.out.println("Out of the block");
	}
	
	
	
	@Test //多线程 InterruptedException 测试
	public void test2(){
	SubThread s1 = new SubThread();
	SubThread s2 = new SubThread();
	SubThread s3 = new SubThread();
	
	s1.start();
	s2.start();
	s3.start();
	}
	
	public class SubThread extends Thread {
		
		public void run(){
			try {
				sleep(100); //使当前正在进行的线程睡眠，但如果同时有多个线程在进行，就会出现异常
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "!");
		}
	}
	
	
}



