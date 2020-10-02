package NewPackage;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World~~!!");
		int a = -100;
		float b = 100.023f;
		double c = 100.366545;
		boolean p = true;
		
		/*
		 * String str = "Hello world"; String first_name = "TCS"; String last_name =
		 * " is the biggest IT services company in India";
		 * 
		 * System.out.println(first_name + last_name);
		 * 
		 * int sum = 10 + a; int sub = 10 - a; int mult = 10 * a; int div = 10 / 5;
		 * 
		 * System.out.println("sum = " + sum); System.out.println("sub = " + sub);
		 * System.out.println("mult = " + mult); System.out.println("div = " + div);
		 */

	//	class_name obj = new class_name();
		
		
		
		//***if else block
		int marks_eng = 80, marks_his = 75, marks_math = 99;
		
		
		if(marks_eng >= 75 && marks_his >= 75 && marks_math < 75) {  					//  == , >, <, <=, >=, && , ||
			System.out.println("grade A");											//  true && true  => true
		} else if(marks_his == 75) {												//  true || false => true
			System.out.println("grade B");
		} else if(marks_math == 99) {
			System.out.println("grade C");
		} else {
			System.out.println("fail");
		}
		
		System.out.println("outside of if else");
		
		
		// for loop   // while loop // do while loop
		
		int i;
	//	i = i + 1  //i--  =>   i = i - 1
		
	/*	for(i = 1; i < 10; i++) {
			System.out.println(i);
		}
		
		for(i = 10; i >= 1; i--) {
			System.out.println(i + " ");
		}
		
	//	System.out.println();
		System.out.println("outside for loop");  */
		
		// while loops						
		i = 0;
		while( i <= 10) {
			System.out.println(i);
			i++;
		}
		
		int m = 100, n = 30;	
		int temp;// + - * / =   ==  !=  >= <= < > && ||  10 % 3 == 1 
		
		while( m % n != 0) {
			n = m;
			m = m % n;
			 
			System.out.println("inside while => m =" + m + " n = " + n);
			
		}
		
		System.out.println("gcd =" + n);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	


}
