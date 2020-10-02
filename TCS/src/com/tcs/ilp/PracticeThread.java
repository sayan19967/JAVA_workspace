package com.tcs.ilp;
import java.util.*;

class PracticeThreading extends Thread {

	
	public void run() {
	/*	for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread() + " value " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} */
		 if(this.isDaemon()){//checking for daemon thread  
			   System.out.println("daemon thread work");  
			  }  
			  else{  
			  System.out.println("user thread work");  
			 }  
	}
	
	
	
}


public class PracticeThread {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		PracticeThreading pt = new PracticeThreading();
		pt.setDaemon(true);
		pt.start();
		//pt.join(1500);
		PracticeThreading pt1 = new PracticeThreading();
		pt1.start(); 
		PracticeThreading pt2 = new PracticeThreading();
		pt2.start(); 
		
	/*	Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println(str1);
		Thread.sleep(10000);
		System.out.println(str2); */
		
		
	}

}

