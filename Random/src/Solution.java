import java.util.*;

public class Solution {
	static int count = 0;
	
	public static Student[] getStudentsWithCityAndMarks(Student[] students, String city, double marks)
	{
		int len = students.length;
		int i, j;
		String city1;
		Student[] b = new Student[1000];
		for(i=0;i<len;i++)
		{
			
			if(students[i].getCity().equals(city) && students[i].getMarks() == marks)
			{
				b[count++] = students[i];
			}
		}
		Student temp;
		for(i=0;i<count;i++)
		{
			for(j=i+1;j<count;j++)
			{
				if(b[i].getId()>b[j].getId())
				{
					temp = b[j];
					b[j] = b[i];
					b[i] = temp;
				}
			}
		}
		
		return b;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Student a[] = new Student[n];
		int i, id;
		String name, city;
		double marks;
		
		for(i=0;i<n;i++)
		{
			id = sc.nextInt();sc.nextLine();
			name = sc.nextLine();
			city = sc.nextLine();
			marks = sc.nextDouble(); 
			
	        a[i] = new Student(id, name, city, marks);
		}
		sc.nextLine();
		city = sc.nextLine();
		marks = sc.nextDouble();
		
		Student[] s1 = getStudentsWithCityAndMarks(a, city,marks);
		
		System.out.println(count);
		for(i=0;i<count;i++)
		{
			System.out.println(s1[i].getId() + " " + s1[i].getName() + " " + s1[i].getCity() + " " + s1[i].getMarks());
		}

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
