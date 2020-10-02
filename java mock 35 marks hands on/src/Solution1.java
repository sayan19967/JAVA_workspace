import java.util.*;
import java.io.*;

public class Solution1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Document[] docs = new Document[4];
		Scanner sc = new Scanner(System.in);
		int i, id, pages;
		String title, folderName;
		for(i=0;i<docs.length;i++)
		{
			id = sc.nextInt();sc.nextLine();
			title = sc.nextLine();
			folderName = sc.nextLine();
			pages = sc.nextInt();
			
			docs[i] = new Document(id, title, folderName, pages);
		}
		
		Document arr = combineDocs(docs);
		
		System.out.println(arr.getId());
		System.out.println(arr.getTitle());
		System.out.println(arr.getfolderName());
		System.out.println(arr.getPages());
		

	}
	
	public static Document combineDocs(Document[] docs)
	{
		Document obj = new Document(0,"dummy","dummy",0);;
		int i, id = docs[0].getId(), pages = 0;
		String str = "";
		
		for(i=0;i<docs.length;i++)
		{
			if(id < docs[i].getId())
			{
				id = docs[i].getId();
			}
		}
		obj.setId(++id);
		
		for(i=0;i<docs.length-1;i++)
		{
			str = str + docs[i].getTitle() + "#";
		}
		str = str + docs[i].getTitle();
		obj.setTitle(str);
		
		str = "";
		for(i=0;i<docs.length-1;i++)
		{
			str = str + docs[i].getfolderName() + "@";
		}
		str = str + docs[i].getTitle();
		obj.setfolderName(str);
		
		for(i=0;i<docs.length;i++)
		{
			pages = pages + docs[i].getPages();
		}
		obj.setPages(pages);
		
		return obj;
		
	}

}

class Document
{
	private int id;
	private String title;
	private String folderName;
	private int pages;
	
	Document(int id, String title, String folderName, int pages)
	{
		this.id = id;
		this.title = title;
		this.folderName = folderName;
		this.pages = pages;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public void setfolderName(String folderName)
	{
		this.folderName = folderName;
	}
	public void setPages(int pages)
	{
		this.pages = pages;
	}
	public int getId()
	{
		return id;
	}
	public String getTitle()
	{
		return title;
	}
	public String getfolderName()
	{
		return folderName;
	}
	public int getPages()
	{
		return pages;
	}
}