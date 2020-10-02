package com.tcs.ilp;
import java.util.*;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char temp = str.charAt(0);
		int i;
		for(i=0;i<str.length();i++)
		{
			if(temp<str.charAt(i))
			{
				temp = str.charAt(i);
			}
		}
		System.out.println(temp);

	}

}

