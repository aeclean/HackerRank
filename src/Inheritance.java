package src;

import java.io.*;
import java.util.*;

public class Inheritance
{
	public abstract class Book
	{
		String title;
	    String author;
	    Book(String t,String a) {
	        title=t;
	        author=a;
	    }
	    abstract void display();
	}

	class MyBook extends Book
	{
	    private int price;
	    private Book instance;
	    
	    MyBook(String title, String author, int price)
	    {
	    	super(title, author);
	    	this.price = price;
	    }
	    
	    public void display()
	    {
	        System.out.println("Title: " + instance.title);
	        System.out.println("Author: " + instance.author);
	        System.out.println("Price: " + price);
	    }
	}

	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		String author = sc.nextLine();
		int price = sc.nextInt();

		Book new_novel = new MyBook(title,author,price);
		new_novel.display();
	}
}