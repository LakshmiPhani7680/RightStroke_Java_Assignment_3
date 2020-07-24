package com.rightstroke.java;
import java.util.*;
class Publication
{
   private String title;
   private int price;
   Publication(String title)
   {
	   this(title,90);
   }
   Publication(String title,int price)
   {
	 this.title = title;
	 this.price = price;
   }
   void display()
   {
	   System.out.println("Title: "+title);
	   System.out.println("Price: "+price);
   }
}
class Book extends Publication
{
    private int pages;
    Book(String title,int pages)
    {
    	super(title);
    	this.pages=pages;
    }
    void display()
    {
    	super.display();
    	System.out.println("Pages: "+pages);
    }
}

class CD extends Publication
{
    private int size;
    CD(String title,int size)
    {
    	super(title);
    	this.size=size;
    }
    void display()
    {
    	super.display();
    	System.out.println("Size: "+size);
    }
}
public class SpecialMethod {
	public static void main(String a[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter title for Book : ");
		String B = scan.next();
		System.out.println("Enter no.of Pages for Book : ");
		int Pages = scan.nextInt();
		Publication P = new Book(B,Pages);
		System.out.println("-------------------------------");
		System.out.println("Enter title for CD : ");
		String Cd = scan.next(); 
		System.out.println("Enter size of the CD : ");
		int S = scan.nextInt();
		Publication P1 = new CD(Cd,S);
		System.out.println("-------------------------------");
		P.display();
		System.out.println("-------------------------------");
		P1.display();
		scan.close();
		
	}

}
