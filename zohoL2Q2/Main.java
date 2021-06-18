//Reverse order of words in a string

package zohoL2Q1;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String revstr="";
        String str1[]= str.split(" ");
        for(int i=str1.length-1;i>=0;i--){
            revstr+=str1[i]+" ";
        }
        
            System.out.print(revstr);
    }
}