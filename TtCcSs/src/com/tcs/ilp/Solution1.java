package com.tcs.ilp;
import java.util.*;

class A
{
    int x=1,y=2;
    void get(int a,int b)
    {
    	x=a*5;
    	y=b*7;
    }
}
 class Solution1 {
	 
	 
	 
		/* private int y;
		 Solution1(int a)
		 {
			 y = a;
		 } */
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int i = 0,rem,num,rev,j = 0,k = 0,temp;
		boolean flag1, flag2;
		int[] arr = new int[n];
		int[] arrPrime = new int[n];
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			num = arr[i];
			rev = 0;
			flag1 = true;
			flag2 = true;
			while(num != 0)             // reversing number
			{
				rem = num % 10;
				rev = rev * 10 + rem;
				num = num / 10;
				
			}
			for(j=2;j<arr[i]/2;j++)   //original number prime checking
			{
				if(arr[i] % j == 0)
				{
					flag1 = false;
					break;
				}
			}
			for(j=2;j<rev/2;j++)    //reversed number prime checking
			{
				if(rev % j == 0)
				{
					flag2 = false;
					break;
				}
			}
			if(flag1 == true && flag2 == true && arr[i] != 1 && arr[i] != 0) // checking if both number and it's reverse prime or not
			{
				arrPrime[k++] = arr[i];
			}
		}
		for(i=0;i<k;i++)            //sorting in ascending order
		{
			for(j=i+1;j<k;j++)
			{
				if(arrPrime[i] > arrPrime[j])
				{
					temp = arrPrime[i];
					arrPrime[i] = arrPrime[j];
					arrPrime[j] = temp;
				}
			}
		}
		for(i=0;i<k;i++)
		{
			System.out.println(arrPrime[i]);
		} 
		/*int a=100;
		int b = 200;
		if(a==100)
		{
			a=45;
		}
		System.out.println(a);*/
	/*	int sum = 0;
		for(int i=0,j=0;i<5 & j<5;++i,j=i+1)
		{
			sum += i;
		}
		System.out.println(sum);  */
	/*	int a = 1, b = 2, c, d;
		c = ++b;
		d = a++;
		c++;
		b++;
		++a; */
	//	System.out.println(a+" "+b+" "+c);
	/*	int x = 100;
		double y = 100.1;
		boolean e=(x=y);*/
		
	/*	int x = 10, y = 1;
		
		if(x!=10&&x/0==0)
		{
			System.out.println(y);
		}
		else
		{
			System.out.println(++y);
		}  */
		
	/*	int a =10;
		if(a==10)
		{
			a = 45;
		}
		System.out.println(a);  */
		
	/*	Solution1 p = new Solution1();
		p.start();*/
		//int  var1-var2;
	/*	int[] arr = new int[] {0,1,2,3,4,5,6,7,8,9};
		int n = 8;
		n = arr[arr[n/2]+1];
		System.out.println(n); */
		
	/*	int a,b = 0;
		try
		{
			a = 5/b;
			System.out.println("A");
		}
		catch(ArithmeticException e)
		{
			System.out.println("B");
		}
		finally
		{
			System.out.println("C");
		} */
		
	/*	int i,j=5;
		for(i=0;i<j;i++)
		{
			if(i<=j--)
			{
				System.out.println((i*j)+" ");
			}
		} */
		
	/*	Student a = new Student(6,"aa","mm",25.5);
		System.out.println(a.id); */
		
		//int Check;
		/*A a = new A();
		a.get(2,4);
		System.out.println(a.x); */
	/*	int arr[2];
		arr[0]=1;
		System.out.println(arr[0]);
		System.out.println(arr[1]); */
		       
	    /*comm*/
	//	int a=40;
	//	if(a==10) {a=45;} System.out.println(a);
	//	int b = a >> 2;
	/*	System.out.println(b);
		String str = "\"Hello World\"";
		System.out.println(str);
		int arr[10];;
		arr[0] = 1;
		System.out.println(arr[0]);  */
		
		int a=10;
		if(a==10) {a=45;}System.out.println(a);
		
	}
	
	void start()
	{
		boolean b1 = false;
		boolean b2 = fix(b1);
		System.out.println(b1+" "+b2);
	}
	boolean fix(boolean b1)
	{
		b1 = true;
		return b1; 
	}

}
