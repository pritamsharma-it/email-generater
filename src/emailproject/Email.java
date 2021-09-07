package emailproject;

import java.util.Scanner;

public class Email {
	private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String username;
    private int mailCapacity;
    private int dOB;
    private int passLength=11;
    private String alternateEmail;
    private String company_end="abc.in";

    //constructor to recieve firstname and lastname
    public Email(){
    	
    	Scanner sc = new Scanner(System.in);
		System.out.print("Enter first name: ");
		this.firstName = sc.nextLine();
		
		System.out.print("Enter last name: ");
		this.lastName = sc.nextLine();
    	
		System.out.print("Enter date of birth(ddmmyyyy): ");
		this.dOB = sc.nextInt();
		
        
        //call a method asking for department then return the department
        this.department=setDepartment();
        
      //combine elements to create username
        username=firstName.toLowerCase() + "." + lastName.toLowerCase() + "." + dOB + "@" + department + company_end;
        
        //call a method that returns a random password
        this.password = randomPassword(passLength);
        System.out.println("\nYour Password is :"+this.password);
    
        
    }
    //get department
    private String setDepartment() {
    	System.out.print("\nDepartment:\n1 for sales\n2 for developer\n3 for accounting\n4 for none\nSelect department:");
    	Scanner in = new Scanner(System.in);
    	int deptChoice = in.nextInt();
    	if(deptChoice == 1) {return "Sales";}
    	else if(deptChoice == 2) {return "Dev";}
    	else if(deptChoice == 3) {return "Acc";}
    	else{return "";}
    }
    //generate a random password
    private String randomPassword(int length) {
    	String passwordSet="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
    	char[] password=new char[length];
    	for (int i=0;i<length;i++) {
    		int rand = (int) (Math.random() * passwordSet.length());
    		password[i]=passwordSet.charAt(rand);
    	}
    	return new String(password);
    }
   
    //all details
    public String showInfo() {
    	return "FULL NAME: " + firstName + " " + lastName +
    			"\nCOMPANY EMAIL: " +username;
    }
}
