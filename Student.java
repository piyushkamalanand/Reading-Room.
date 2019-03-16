package lib.student;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);
	String student_uid, name, address;
	int year, age;

	public void add_student() {
		System.out.println("\n--------Student Details--------");
		System.out.println("\nEnter students UID ");
		student_uid = sc.nextLine();
		System.out.println("Enter students Name ");
		name = sc.nextLine();
		System.out.println("Enter students address ");
		address = sc.nextLine();
		System.out.println("Enter students age ");

		boolean age_b = false;

		while (!age_b) {
			try {
				age = sc.nextInt();
				age_b = true;
				if (age < 0) {
					throw new ArithmeticException("OOPS ! Your Age can't be Negative. Please Re Enter the age");
				}

			} catch (ArithmeticException e) {
				System.out.println("OOPS ! Your Age can't be Negative. Please Re Enter the age ");
				age = sc.nextInt();
			} catch (Exception e) {
				sc.next();
				System.out.println("You have entered invalid data. Please Re Enter the AGE ");

			}
		}

		System.out.println("Enter students joining year ");
		boolean success = false;
		while (!success) {
			try {
				year = sc.nextInt();
				success = true;
			} catch (InputMismatchException e1) {
				sc.next();
				System.out.println("You have entered invalid data. Please Re Enter the YEAR ");
			}
		}

	}

	public void modify_student_record() {
		System.out.println("\n--------Modify Section----------");
		System.out.println("\nEnter Student's New Address IF you want to Modify ELSE Enter the 'Same Address' --- ");
		sc.nextLine();
		address = sc.nextLine();

	}

	public void display_student_record() {
		System.out.println("\n Student's UID :- " + student_uid);
		System.out.println(" Student's NAME :- " + name);
		System.out.println(" Student's ADDRESS :- " + address);
		System.out.println(" Student's AGE :- " + age);
		System.out.println(" Student's Joining YEAR :- " + year);
	}

	public int search(String s) {

		if (student_uid.equals(s)) {
			return 1;
		}

		else {
			return 0;
		}

	}

	public void search_student() {

		System.out.println("\n\nSearched Student Details:-- \nStudent's UID:- " + student_uid + "\nStudent's Name:- "
				+ name + "\nStudent's Address:- " + address + "\nStudent's Age:- " + age + "\nStudent's Joining Year:- "
				+ year);

	}
}
