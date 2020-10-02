 package com.tcs.ilp;

/*  import java.lang.reflect.Array;
import java.util.*;

public class Solution {
	
	public static Student[] getStudentsWithCityAndMarks(Student[] students,String city,double marks)
    {
        int len = students.length,count = 0; 
        int i = 0,j = 0;
      //  Student[] obj = new Student[len];
        for(i=0;i<len;i++)
        {
            if(students[i].getcity().equals(city) && students[i].getmarks() == marks)
            {
                // obj[j++] = students[i];
            	count++;
            }
        }
        
        Student[] obj = new Student[count];
        
        for(i=0;i<len;i++)
        {
            if(students[i].getcity().equals(city) && students[i].getmarks() == marks)
            {
                obj[j++] = students[i];
            	
            }
        }
        
        return obj;
    }

	/* int studentCountWithSameCityAndAge(Student e1,Student e2,Student e3)
	  {
	    if((e1.age == e2.age && e1.city.equals(e2.city)) && (e1.age == e3.age && e1.city.equals(e3.city)))
	    {
	      return 3;
	    }
	    else if((e1.age == e2.age && e1.city.equals(e2.city)) || (e1.age == e3.age && e1.city.equals(e3.city)) || (e2.age == e3.age && e2.city.equals(e3.city)))
	    {
	      return 2;
	    }
	    else
	    {
	      return 0;
	    }
	  } 
	  public static void main(String args[])
	  {
	  /*  Scanner sc = new Scanner(System.in);
	    String name = sc.nextLine(); 
	    String city = sc.nextLine();
	    int age = sc.nextInt();sc.nextLine();
	   
	    
	    Student e1 = new Student(name,age,city);
	    
	    System.out.println(e1.name+" "+e1.age+" "+e1.city);
	    
	    name = sc.nextLine();
	    city = sc.nextLine();
	    age = sc.nextInt(); sc.nextLine();
	    
	    
	    Student e2 = new Student(name,age,city);
	    
	    name = sc.nextLine();
	    city = sc.nextLine();
	    age = sc.nextInt();
	    
	    
	    Student e3 = new Student(name,age,city);
	    Solution obj = new Solution();
	    int count = obj.studentCountWithSameCityAndAge(e1,e2,e3);
	    System.out.println(count); 
		 
	  /*  int var1 = 0;
		    int[] a = new int[5];
		    
		    System.out.println("hello "+(var1+10)); 
		  
		  int i = 0;
	        Scanner sc = new Scanner(System.in);
	        int count = sc.nextInt();
	        if(count > 0)
	        {
	        Student[] obj = new Student[count];
	        int id;
	        String name,city;
	        double marks;
	        for(i=0;i<count;i++)
	        {
	            id = sc.nextInt();sc.nextLine();
	            name = sc.nextLine();
	            city = sc.nextLine();
	            marks = sc.nextDouble();
	            obj[i] = new Student(id,name,city,marks);
	        }
	        sc.nextLine();
	        city = sc.nextLine();
	        marks = sc.nextDouble();

	        Student[] s1 = getStudentsWithCityAndMarks(obj,city,marks);
	       // s1 = getStudentsWithCityAndMarks(obj,city,marks);
	        
	       // for(i=0;s1[i]!=null;i++);
	       // i = Array.getLength(s1);
	        int len = s1.length;
	        System.out.println(len);
	        int a;
	        double b;
	        for(i=0;i<len;i++)
	        {
	        	b = s1[i].getmarks();
	        	if(b == (int)b)
	        	{
	        		a = (int)b;
	        		System.out.println(s1[i].getid() + " " + s1[i].getname() + " " + s1[i].getcity() + " " + a);
	        	}
	        	else
	            System.out.println(s1[i].getid() + " " + s1[i].getname() + " " + s1[i].getcity() + " " + s1[i].getmarks());
	        }
	        }
	        else
	        	System.exit(0);
	    }

	private static int parseInt(double b) {
		// TODO Auto-generated method stub
		return 0;
	}
		  
	  }  */
		  
		  import java.io.*;
		  import java.util.*;
		  import java.text.*;
		  import java.math.*;
		  import java.util.regex.*;

		  public class Solution {
		      static int count = 0;

		      public static void main(String args[]) throws Exception {
		          /* Enter your code here. Read input from STDIN. Print output to STDOUT */

		          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		          int num = Integer.parseInt(br.readLine());
		          int a;
		          String b;
		          String c;
		          double d;
		          Student[] array = new Student[num];
		          for (int i = 0; i < num; i++) {
		              a = Integer.parseInt(br.readLine());
		              b = br.readLine();
		              c = br.readLine();
		              d = Double.parseDouble(br.readLine());
		              array[i] = new Student(a, b, c, d);

		          }
		          String city = br.readLine();
		          double marks = Double.parseDouble(br.readLine());
		          Student ref[];
		          ref = getStudentsWithCityAndMarks(array, city, marks);
		          for (int i = 0; i < count; i++) {
		              System.out.println(ref[i].id + " " + ref[i].name + " " + ref[i].city + " " + ref[i].marks);
		          }

		      }

		      public static Student[] getStudentsWithCityAndMarks(Student[] array, String city, 
		                                                          double marks)
		      {
		          
		          Student[] arr=new Student[100];
		          int inc=0;
		          for(int i=0;i<array.length;i++)
		          {
		              if(array[i].getCity().equals(city)&array[i].getMarks()==marks)
		              {
		                count++;
		               
		              }
		          }
		          System.out.println(count);
		          for(int i=0;i<array.length;i++)
		          {
		              if(array[i].getCity().equals(city)&array[i].getMarks()==marks)
		              {
		               //System.out.println(array[i].id+" "+array[i].name+" "+array[i].city+" "+array[i].marks);
		               arr[inc]=new Student(array[i].id,array[i].name,array[i].city,array[i].marks);
		               inc++;
		              }
		          }
		          Student temp;
		          for(int i=0;i<count-1;i++)
		          {
		             
		              for(int j=i+1;j<count;j++)
		              {
		                  if(arr[i].id>arr[j].id)
		                  {
		                      temp=arr[i];
		                      arr[i]=arr[j];
		                      arr[j]=temp;
		                  }
		              }
		          }
		        

		          return arr;
		          
		      }
		  }

		  class Student {
		      String name;
		      int id;
		      String city;
		      double marks;

		      public Student(int id, String name, String city, double marks) {
		          this.name = name;
		          this.marks = marks;
		          this.city = city;
		          this.id = id;
		      }

		      public String getName() {
		          return name;
		      }

		      public double getMarks() {
		          return marks;
		      }

		      public String getCity() {
		          return city;
		      }

		      public int getId() {
		          return id;
		      }

		      public void setName(String name) {
		          this.name = name;
		      }

		      public void setMarks(double marks) {
		          this.marks = marks;
		      }

		      public void setCity(String city) {
		          this.city = city;
		      }

		      public void setId(int id) {
		          this.id = id;
		      }
		  }


