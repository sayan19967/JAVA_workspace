package JAVATutorialPart2;

import java.util.*;

public class A {
	
	//  classes have two things - 1. methods  2. attributes
	
	int a = 0;   //  attributes

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("enter input");
		
	//	int num = sc.nextInt();
	//	float fees = sc.nextFloat();
		
		
		
		A obj = new A();
		
		A obj2 = new A();
		
	//	obj.square(num);
		
		
		
		obj.a = 13;
		
		obj2.a = 20; 
		
		obj.square_without_return();
		
		obj2.square_without_return();
		
	/*	switch(num) {
			case 1: 
				System.out.println("case 1");
				
			case 2:
				System.out.println("case 2");
			default:
				System.out.println("default case");
		}*/
		
		String str = "8 out of 10.00 points";
        str = str.replaceAll("[^\\d]", " ");
        str = str.replaceAll("( +)"," ");
        System.out.println(str);
     //   String string = "aabbccdefatafaz";

     /*   char[] chars = str.toCharArray();
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : chars) {
        	charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
        	sb.append(character);
        }
        System.out.println(sb.toString());*/
		
		
		
		
		
	//	System.out.println("Result = " + result);
	
		
	}
	
	//  access_spec return_type func_name( data_type a ){	return 	}
	
	public int square(int number) {
		int sq;
		sq = number * number;
		return sq;
	}
	
	public void square_without_return() {
		int sq;
		sq = this.a * this.a;
		System.out.println("Result without returning = " + sq);
		
	}

}
