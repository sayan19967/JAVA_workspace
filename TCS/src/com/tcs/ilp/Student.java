package com.tcs.ilp;

public class Student {
	
/*	String name,city;
	  int age;
	  Student(String name,int age,String city)
	  {
	    this.name = name;
	    this.age = age;
	    this.city = city;
	  } */
	
	 private int id;
	    private String name;
	    private String city;
	    private double marks;

	    Student(int id,String name,String city,double marks)
	    {
	        this.id = id;
	        this.name = name;
	        this.city = city;
	        this.marks = marks;
	    }

	    int getid()
	    {
	        return this.id;
	    }
	    String getname()
	    {
	        return this.name;
	    }
	    String getcity()
	    {
	        return this.city;
	    }
	    double getmarks()
	    {
	        return this.marks;
	    }

}
