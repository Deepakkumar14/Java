// To find Duplicate character and its count in a string 

package duplicateCharacter;
import java.util.*;
public class Main {    
     public static void main(String[] args) { 
         Scanner sc=new Scanner(System.in);
        String string1 = sc.nextLine();;    
        int count;
        char string[] = string1.toLowerCase().toCharArray();
        int n=string.length;
        System.out.println("Duplicate characters in the string: ");    
        for(int i = 0; i <n; i++) {    
            count = 1;    
            for(int j = i+1; j <n; j++) {    
                if(string[i] == string[j] && string[i] != ' ') {    
                    count++;    
                    string[j] = '0';    
                }    
            }    
            if(count > 1 && string[i] != '0')    
                System.out.println(string[i]+"-"+count);    
        }    
    }    
}     