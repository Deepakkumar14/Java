package palindrome;
import java.util.*;   
 public class Main  
{  
   public static void main(String args[])  
   {  
      String str1,Org, strRev = "";  
      Scanner sc = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      Org = sc.nextLine();   
      int length = Org.length();
      str1=Org.toLowerCase();
      for ( int i = length - 1; i >= 0; i-- )  
         strRev += str1.charAt(i);  
      if (str1.equals(strRev))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number is not a palindrome.");   
   }  
}  