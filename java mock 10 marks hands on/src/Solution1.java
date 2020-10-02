import java.util.*;
public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	/*	1st program
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int big = 0, small = 10, rem;
		while(num != 0)
		{
			rem = num % 10;
			if(rem > big)
			{
				big = rem;
			}
			else if(rem < small)
			{
				small = rem;
			}
			num = num / 10;
		}
		System.out.println(big);
		System.out.println(small);
		*/
		
	/*  2nd program	
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int i;
		char temp = str.charAt(0);
		char big = temp, small = temp;
		for(i = 0;i < str.length(); i++)
		{
			temp = str.charAt(i);
			if(temp > big)
			{
				big = temp;
			}
			else if(temp < small)
			{
				small = temp;
			}
		}
		System.out.println(big + "" + small);
		*/
		
	/*  3rd program	
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char temp;
		int upper = 0, lower = 0;
		for(int i = 0;i<str.length();i++)
		{
			temp = str.charAt(i);
			if(temp >= 65 && temp <= 90)
			{
				upper++;
			}
			else if(temp >= 97 && temp <= 122)
			{
				lower++;
			}
		}
		System.out.println(upper);
		System.out.println(lower);
		*/
		
	/*  4th program	
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char temp;
		int n, sum = 0;
		for(int i = 0;i<str.length();i++)
		{
			temp = str.charAt(i);
			if(temp >= 48 && temp <=57)
			{
				n = Integer.parseInt(String.valueOf(temp));
				sum = sum + n;
			}
		}
		System.out.println(sum);
		*/
		
	/*  5th program	
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char temp, small = str.charAt(0);
		for(int i = 0;i<str.length();i++)
		{
			temp = str.charAt(i);
			if(temp < small)
			{
				small = temp;
			}
		}
		System.out.println(small);
		*/
		
	/*  6th program	
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char temp;
		int count = 0;
		for(int i=0;i<str.length();i++)
		{
			temp = str.charAt(i);
			if(temp == 'a' || temp == 'A' || temp == 'e' || temp == 'E' || temp == 'i' || temp == 'I' || temp == 'o' || temp == 'O' || temp == 'u' || temp == 'U')
			{
				count++;
			}
		}
		System.out.println(count);
		*/
		
		//int w = (int)888.8;
		//byte x = (byte)100L;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(str.contains("world"))
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");
		}

	}

}
