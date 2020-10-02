import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	1st program
	 * Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rem, big = 0, small = 10;
		while(n != 0)
		{
			rem = n % 10;
			if(big < rem)
			{
				big = rem;
			}
			if(small > rem)
			{
				small = rem;
			}
			n = n / 10;
		}
		System.out.println(big);
		System.out.println(small); 
		 */
	/*
		// 2nd progrma
	  
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int i;
		char big = str.charAt(0), small = str.charAt(0);
		
		for(i=0;i<str.length();i++)
		{
			if(big<str.charAt(i))
			{
				big = str.charAt(i+1);
			}
			if(small>str.charAt(i))
			{
				small = str.charAt(i+1);
			}
		}
		System.out.println(big + "" + small);  */
	/*
		3rd program
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int i,len = str.length(), upper = 0, lower = 0;
		for(i=0;i<len;i++)
		{
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90)
			{
				upper++;
			}
			if(str.charAt(i) >= 97 && str.charAt(i) <= 122)
			{
				lower++;
			}
		}
		System.out.println(upper);
		System.out.println(lower); */
	
		/*  4th program
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int len = str.length(), i, sum = 0;
		for(i=0;i<len;i++)
		{
			if(str.charAt(i) >= 48 && str.charAt(i) <= 57)
			{
				sum = sum + Integer.parseInt(String.valueOf(str.charAt(i)));
			}
		}
		System.out.println(sum); */
		
		/* 5th program
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int i;
		char small = str.charAt(0);
		
		for(i=0;i<str.length();i++)
		{
			
			if(small>str.charAt(i))
			{
				small = str.charAt(i+1);
			}
		}
		System.out.println(small); */
	
		/* 6th program
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int i, count = 0;
		char temp;
		for(i=0;i<str.length();i++)
		{
			temp = str.charAt(i);
			if(temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u')
			{
				count++;
				
			}
		}
		System.out.println(count); */
		
		//  java mock mcq final assessment
		
	/*	no. 1
	 * int a = 10, b;
		b = a++ + ++a;
		System.out.print(b + " ");
		System.out.print(a++ + " ");
		System.out.print(a + " ");
		System.out.print(++a);  */
		
	/*	 no. 2
	 * int array_variable[] = new int[10];
		for(int i=0;i<10;++i)
		{
			array_variable[i] = i / 2;
			array_variable[i]++;
			System.out.print(array_variable[i] + " ");
			i++;
		}  */
		
	/*  no. 3 
	 * 
	  	int a[] = {1,2,3,4,5};
		int d[] = a;
		int sum = 0;
		for(int j=0;j<3;++j)
		{
			sum += ( a[j] * d[j+1] ) + ( a[j+1] * d[j] );
		}
		System.out.println(sum); */
		
	/*	 no. 4
	 * int i = 0;
		do {
			i++;
			System.out.println("in while loop");
		}
		while(i<1);  */
		
	/*	no. 5
	 * int w = (int)888.8;
		byte x = (byte)100L;
		byte z = (byte)100L;
		long y = (byte)100;  */
		
	/*	no. 6
	 * System.out.println(16 >> 2); */
		
		System.out.println(16>>2);
		

		
	}

}
