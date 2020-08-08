package day3;
import java.util.*;
abstract class account{
	account(){
		System.out.println("Hello");
	}
	static int balance=1000;
	double Srate=10;
	double Crate=20;
	abstract void name(String Hname);
	
	abstract void deposit(int deposit);
	abstract void withdraw(int withdraw);
	abstract void availableFunds();
	abstract void calculate();
}
class saving extends account{
	saving(int id){
		System.out.println("Account Id: "+id);
	}
	void name(String Hname) {
		System.out.println("Account Holder Name: "+Hname);
	}
	void availableFunds() {
		System.out.println("Available Balance:"+balance);
	}
	void calculate() {
		double ci=(balance*Srate)/100;
		System.out.println("Interest Calculate at Balance: "+ci);
	}
	void deposit(int deposit) {
		balance+=deposit;
		System.out.println("After Deposit: "+balance);
	}
	
	void withdraw(int withdraw) {
		balance-=withdraw;
		System.out.println("After Withdrwa: "+ balance);
	}
}

public class Accounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       saving sc=new saving(1234565);
       sc.name("Shivranjan");
       sc.availableFunds();
       sc.calculate();
       Scanner sc1=new Scanner(System.in);
       int input=sc1.nextInt();
       switch(input) {
       case 1:
    	   System.out.println("Enter Amount for deposit");
    	   int deposit=sc1.nextInt(); 
    	   sc.deposit(deposit);
    	   break;
       case 2:
    	   System.out.println("Enter Amount for withdraw");
           int withdraw=sc1.nextInt();
           sc.withdraw(withdraw);
           break;
           
       }
	}

}
