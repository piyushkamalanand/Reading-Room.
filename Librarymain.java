package lib.BookRecords;

import lib.student.Student;
import lib.books.Book;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Librarymain extends Book {
	public static void main(String args[]) throws InterruptedException {
		Scanner s = new Scanner(System.in);
		for(int g=0;g<205;g++){
			System.out.print("*");
			Thread.sleep(5);}
		
		System.out.println("\n\n\n\n\n\t\t\t\t\t\t\t\tW E L C O M E     T O     L I B R A R Y     M A N A G E M E N T     S Y S T E M \n\n\n\n\n");
		Thread.sleep(100);
		for(int g=0;g<205;g++){
			System.out.print("*");
			Thread.sleep(5);}
		int go = 0, goo = 0;
		do {
			do {
				System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t  .....[[[ M A I N   M E N U ]]].....\n\t\t\t\t\t\t\t");
				System.out.println("\n\t\t\t\t\t\t\t\t\t Enter 's' for Student's Record or 'b' for Book's Record  ");
				Thread.sleep(100);
				System.out.println("\t\t\t\t\t\t\t\t\t---------------------------------------------------------");
				String c = s.next();
				switch (c) {
				case "s": {
					int st=0;
					System.out.println("\nEnter the number of Students you want to ADD ");
					 boolean success = false;
				        while (!success) {
				            try {	
				                 st = s.nextInt();
				                success = true;
				            } catch (InputMismatchException e) {
				                s.next();
				                System.out.println("You have entered invalid data. Please Re Enter the number of Students you want to ADD ");
				            }
				        }
				        if (st == 0) {
							System.out.println("Sorry you need to Enter a valid Number\nPlease re-enter the number of Students you want to ADD ");
							st = s.nextInt();
						}
					Student ob1[] = new Student[st];
					for (int j = 0; j < st; j++) {
						ob1[j] = new Student();
						ob1[j].add_student();
						ob1[j].modify_student_record();
						ob1[j].display_student_record();

					}
					System.out.println("\n\t\t****Enter UID to be searched**** ");
					s.nextLine();
					String sear = s.nextLine();
					System.out.print("Loading Please wait");
					for(int y=0;y<11;y++){
						System.out.print(".");
						Thread.sleep(50);
					}
					int flag = 0;
					int index= 0;
					for (int i = 0; i < st; i++) {
						
						flag = ob1[i].search(sear);
						if(flag == 1)
						{
							index = i;
							break;
						}

					}					
					if(flag == 1)
					{
					ob1[index].search_student();
				}
					else
					{
						System.out.println("\n\nUID Not Found ");
					}
					
				}
					break;
				case "b": {
					Book ob = new Book();
					ob.av_book();
					ob.Issue_book();
					ob.modify_book_record();
					ob.display();
					int stt=0;
					System.out.println("\nEnter the number of Books you want to ADD ");
					 boolean success = false;
				        while (!success) {
				            try {	
				                 stt = s.nextInt();
				                success = true;
				            } catch (InputMismatchException e) {
				                s.next();
				                System.out.println("You have entered invalid data. Please Re Enter the number of Students you want to ADD ");
				            }
				        }
					if (stt == 0) {
						System.out.println("Sorry you need to Enter a valid Number\nPlease re-enter the number of Books you want to ADD ");
						stt = s.nextInt();
					}
					Book ob2[] = new Book[stt];
					int z = 0;
					do {
						ob2[z] = new Book();
						ob2[z].add_book();
						ob2[z].display_book_record();
						z++;
					} while (z < stt);
					System.out.println("\n\t\t****Enter Book's ID to be searched**** ");
					s.nextLine();
					String s3 = s.nextLine();
					System.out.print("Loading Please wait");
					for(int y=0;y<11;y++){
						System.out.print(".");
						Thread.sleep(50);
					}
					int index = 0;
					int flag = 0;
					for (int i = 0; i < stt; i++) {
						flag = ob2[i].search(s3);
						
						if(flag == 1)
						{
							index = i;
							break;
						}
					}
					if(flag == 1)
					{
					ob2[index].search_book();
				}
					else
					{
						System.out.println("\n\nID Not Found ");
					}
				}
					break;
				default: {
					System.out.println("\n\tWRONG CHOICE ");
					System.out.println("\n\t*** Enter 1 to go to the Main Menu *** ");
					 boolean success = false;
				        while (!success) {
				            try {		            	
				                 go = s.nextInt();
				                success = true;
				            } catch (InputMismatchException e) {
				                s.next();
				                System.out.println("You have entered invalid data. Please Re Enter Your Choice ");
				            }
				        }				
				}}
			} while (go == 1);
			System.out.println("\n\t\t\t\t\t\t\t\t\t[ Enter 1 to go to the Main Menu else Press 2 to EXIT !!! ]");
			 boolean success = false;
		        while (!success) {
		            try {		            	
		                 goo = s.nextInt();
		                success = true;
		            } catch (InputMismatchException e) {
		                s.next();
		                System.out.println("You have entered invalid data. Please Re Enter Your Choice ");
		            }
		        }			 
		} while (goo == 1);
		System.out.println("\n\t\t\t\t\t\t\t\t\t\t*******  T  H  A  N  K  S   !  *******");

		s.close();
	}

}
