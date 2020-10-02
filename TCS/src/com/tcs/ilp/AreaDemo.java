package com.tcs.ilp;

import java.util.Scanner;

public class AreaDemo {
	static double pi = 3.14;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  /*  Scanner sc = new Scanner(System.in);
		System.out.println("enter plot length: ");
		double plotLength = sc.nextDouble();
		System.out.println("enter plot width: ");
		double plotWidth = sc.nextDouble();
		System.out.println("enter construction length: ");
		double constLength = sc.nextDouble();
		System.out.println("enter construction width: ");
		double constWidth = sc.nextDouble();
		double openArea = calculateArea(plotLength,plotWidth,constLength,constWidth);
		System.out.println("the open area is: "+openArea); */
		/*
		 * int var1 = 42; int var2 = ~var1; System.out.println(var2);
		 */

		
		/*
		 * int x = 100; double y = 100.1; int b=(x=(int) y); System.out.println(b);
		 */
		/*
		 * int sum = 0; for(int i=0, j=0; i<5 && j<5; ++i, j=i+1) { sum = sum + i; }
		 * System.out.println(sum);
		 */
		/*
		 * int a = 10; if(a == 10) { a = 45; } System.out.println(a);
		 */
		
		/*
		 * AreaDemo p = new AreaDemo(); p.start();
		 */
		
		
		
	}
	public static double calculateArea(double plotLength,double plotWidth,double constLength,double constWidth) 
	{
		double openArea = 0;
		
		openArea = plotLength * plotWidth - constLength * constWidth;
		
		return openArea;
	} 
	
	void start() {
		boolean b1=false;
		boolean b2=fix(b1);
		System.out.println(b1 + " " + b2);
	}
	boolean fix(boolean b1)
	{
		b1 = true;
		return b1;
	}
	int x;
	int add(int a, int b) {
		x = a * 10;
		return x;
	}

}

class B{
	
	
	public static void main(String args[]) {
		/*
		 * AreaDemo p = new AreaDemo(); System.out.println(p.add(5,6));
		 */
		int x = 10, y = 1;
		
		if(x!=10 && x/0 == 0) {
			System.out.println(y);
		}
		else {
			System.out.println(++y);
		}
	}
		// TODO Auto-generated method stub

	}

