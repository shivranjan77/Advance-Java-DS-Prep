package day1;

import java.util.*;

class Bank{
	 int Account_Id=11701600;
     float Account_Interest_Rate,Account_Balance=0;
     String Account_Holder_Name="Shivranjan kumar";
     void deposit(int deposit){
    	 Account_Balance += deposit;
     }
     void withdraw() {
     float x=200;
    	System.out.println("Withdrwa"+ " "+ x); 
     }
     void availableFunds() {
    	 System.out.println("Available FUNds = "+ Account_Balance);
     }
     float calculateInterest() {
    	 return Account_Interest_Rate = (Account_Balance*10)/100;
    	 
     }
     
}

public class Accounts {
	public static void main(String[] args) {
       Bank obj1=new Bank();
      System.out.println("Account Number :"+" "+obj1.Account_Id);
      System.out.println("Account Balance :"+" "+obj1.Account_Balance);
	   obj1.deposit(500);
	  System.out.println("Deposited :"+" "+obj1.Account_Balance);
	   obj1.withdraw();
	  obj1.availableFunds();
	  
	  float x=obj1.calculateInterest();
	  System.out.println("Interest :"+" "+x);

	}

}
