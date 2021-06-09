package Atm;
import java.util.*;
public class Main {
      static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
                  
                greetings();
                pinNumber();
    }
       
       private static void pinNumber(){
           String userName = "Deepak";
           String password = "1234";
           System.out.println("Please Enter Your PIN Number ");
           String enteredPassword = sc.nextLine();
                if (enteredPassword.equals(password)) {
                  System.out.println("Account Name Holder : " + userName); 
                  options();
                }
                 else{
                        System.out.println("Invalid pin");
                        pinNumber();
                    } 
            
       }
       
        
       private static void greetings(){
            System.out.println("Welcome to Zoho Bank ");
        }
    
             
    private static void options(){
       
       
        double userBalance = 50000;
       
        while(true){
            System.out.println("Please choose the following options ");
            System.out.println("1 - Show Balance");
	        System.out.println("2 - Deposit Amount");
            System.out.println("3 - Withdraw Amount ");
	        System.out.println("4 - Exit");
        
            if (userChoice == 1) {
                System.out.println("Your Current Balance is " + userBalance);
                continue;
            } 
            else if (userChoice == 2) {
                System.out.println("Please Enter The Amount To Deposit ");
                double depositAmount = sc.nextDouble();
                
                userBalance += depositAmount;
                System.out.println("You have successfully deposited " + depositAmount); 
                System.out.println("Now your balance is " + userBalance);
                continue;
                
            } 
            else if (userChoice == 3) {
                
                System.out.println("Please Enter the Amount to Withdraw");
                double withdrawAmount = sc.nextDouble();
                
                if (withdrawAmount > userBalance) {
                    System.out.println("Insufficient Balance. Please Try Again");
                } 
                else {
                    userBalance -= withdrawAmount;
                    System.out.println("You have successfully withdraw " + withdrawAmount);
                     System.out.println("Now your balance is " + userBalance);
                     continue;
                }
                
                
            }
             else if (userChoice == 4) {
                
                System.out.println("Thank you for banking");
                System.exit(0);
             }
             else{
                  System.out.println("Invalid option");
                  continue;
             }
        
          
        }
    }
}