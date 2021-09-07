package emailproject;

import java.util.Scanner;

import newstudent.Student;

public class EmailProject {

	public static void main(String[] args) {
		
		System.out.print("Enter no. of new recruits: ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		Email[] em= new Email[n];
		
		
		//create n no. of new recruitsq
		for(int i=0;i<n;i++) {
			em[i] = new Email();
			System.out.println(em[i].showInfo());
		}
	}
}