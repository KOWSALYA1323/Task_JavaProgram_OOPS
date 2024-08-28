package javaprogram;

import java.util.Scanner;

public class Account {
	
	 String accno;  
     String name;
     double Balance;
     
     Scanner sc = new Scanner(System.in);
      
    public void Account() {  
    	
    	
        System.out.print("Enter Account No: ");  
        accno = sc.next();  
        System.out.print("Enter Name: ");  
        name = sc.next();  
        System.out.print("Enter Balance: ");  
        Balance = sc.nextDouble();
    }  
    
    public void showAccount() {  
    	System.out.println("Account no.: " + accno);
    	System.out.println("Name of account holder: " + name); 
    	System.out.println("Balance: " + Balance);
         
    }
    
    public void deposit() {  
        double amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextDouble(); 
        Balance = Balance + amt;  
    }  
    
    public void withdrawal() {  
        long amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();  
        if (Balance >= amt) {  
        	Balance = Balance - amt;  
            System.out.println("Balance after withdrawal: " + Balance);  
        } else {  
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
        }  
    }  

	public static void main(String[] args) {
		Account Acc = new Account();
		Acc.Account();
		Acc.showAccount();
		Acc.deposit();
		Acc.withdrawal();

	}

}
