package com.tcs.ilp;
import java.util.*;
import java.io.*;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			for(j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		//int m = i - 2;
		
	  /*for(i=0;i<n-1;i++)
		{
			for(j=0;j<=i+1;j++)
			{
				System.out.print(" ");
			}
			for(k=n;k>2*i-1;k--)
			{
				System.out.print("*");
				//k--;
			} 
			System.out.println();
		} */
		int m = 0;
		
		for(i=n-1;i>0;i--)
		{
			for(j=0;j<=m+1;j++)
			{
				System.out.print(" ");
			}
			for(k=i;k>0;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
			m++;
		} 
		

	}

}
