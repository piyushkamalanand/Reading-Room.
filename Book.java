package lib.books;

import java.util.Scanner;
import lib.student.Student;

public class Book extends Student {
	Scanner sca = new Scanner(System.in);
	String book_id, book_id1, book_title, publisher, date, date1,year;
	int t=0;
	public void av_book()
	{
		System.out.println("\n---------Available Books---------- ");
		System.out.println("\nBook's ID \t Book's Title ");
		System.out.println("    1       \t Harry Potter ");
		System.out.println("    2       \t The Laziest Man ");
	}
	public void Issue_book()
	{
		System.out.println("\n---------Issuing book Details---------- ");
		System.out.println("\nEnter book's ID which you want to ISSUE ");
		book_id1 = sca.nextLine();
		if(book_id1.equals("1")||book_id1.equals("2"))
		{
		System.out.println("Enter book's Issuing Date ");
		date = sca.nextLine();
		System.out.println("Enter book's returning Date ");
		date1 = sca.nextLine();
		t=1;
		}
		else
		{
			System.out.println("\nSorry ! Book is not Available ");
		}
	}

	public void add_book()
	{
		System.out.println("\n---------BOOK DETAILS----------");
		System.out.println("\nEnter book's ID ");
		book_id = sca.nextLine();
		System.out.println("Enter book's Title ");
		book_title = sca.nextLine();
		System.out.println("Enter book's Publisher ");
		publisher = sca.nextLine();
		System.out.println("Enter book's publishing year ");
		year = sca.nextLine();
	}
	public void display()
	{
		if(t==1)
		{
		System.out.println("Book's Issued ID :- " + book_id1 + "\nBook's Issuing Date :- " + date
				+ "\nBook's Returning Date :- " + date1);
	}}

	public void modify_book_record()
	{
		if(t==1)
		{
		System.out.println("--------Modify Section----------");
		System.out.println("\nEnter Book's Returning Date IF you want Modify ELSE Enter the 'Same Date' --- ");
		date1 = sca.nextLine();
	}}

	public void display_book_record()
	{
		System.out.println("\nBook's ID :- " + book_id + "\nBook's Title :- " + book_title + "\nBook's Publisher :- "
				+ publisher + "\nBook's Publishing Year :- " + year);
	}

	public int search(String s)
	{
		if (book_id.equals(s))
		{
			return 1;
		}

		else {
			return 0;
		}
	}

	public void search_book()
	{

		System.out.println("\n\nSearched Book Details:-- \nBook's ID:- " + book_id + "\nBook's Name:- " + book_title
				+ "\nBook's Publisher:- " + publisher + "\nBook's Publishing Year:- " + year);

	}
}
