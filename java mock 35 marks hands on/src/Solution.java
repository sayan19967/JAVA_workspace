import java.io.*;
import java.util.*;

public class Solution {
	
	static int count = 0;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Book obj[] = new Book[4];
		int i, id;
		String title, author, find;
		double price;
		for(i=0;i<obj.length;i++)
		{
		/*	input using scanner
		 *  id = sc.nextInt();sc.nextLine();
			title = sc.nextLine();
			author = sc.nextLine();
			price = sc.nextDouble();  */
			
			id = Integer.parseInt(bf.readLine());
			title = bf.readLine();
			author = bf.readLine();
			price = Double.parseDouble(bf.readLine());
			
			obj[i] = new Book(id, title, author, price);
		}
		// sc.nextLine();
		find = bf.readLine();
		Book arr[] = searchTitle(find, obj);
		
		for(i=0;i<count;i++)
		{
			System.out.println(arr[i].getId());
		}

	}
	
	public static Book[] searchTitle(String find, Book books[])
	{
		int i, j;
		Book arr[] = new Book[4];
		String temp;
		Book temp1;
		for(i=0;i<books.length;i++)
		{
			temp = books[i].getTitle().toLowerCase();
			if(temp.contains(find.toLowerCase()))
			{
				arr[count++] = books[i];
			}
		}
		for(i=0;i<count;i++)
		{
			for(j=i+1;j<count;j++)
			{
				if(arr[i].getId()>arr[j].getId())
				{
					temp1 = arr[i];
					arr[i] = arr[j];
					arr[j] = temp1;
				}
			}
		}
		
		return arr;
	}

}

class Book
{
	private int id;
	private String title;
	private String author;
	private double price;
	
	Book(int id, String title, String author, double price)
	{
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public int getId()
	{
		return id;
	}
	public String getTitle()
	{
		return title;
	}
	public String getAuthor()
	{
		return author;
	}
	public double getPrice()
	{
		return price;
	}
}