//Program to find duplicate words and its count in a string

package duplicateWords;
import java.util.*;
public class Main {    
    public static void main(String[] args) {    
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        int count;    
        str1= str1.toLowerCase();    
        String words[]= str1.split(" ");
        int n=words.length;
        System.out.println("Duplicate words in the string : ");     
        for(int i = 0; i <n; i++) {    
            count = 1;    
            for(int j = i+1; j <n; j++) {    
                if(words[i].equals(words[j])) {   
                    count++;    
                    words[j] = "0";    
                }    
            }    
            if(count > 1 && words[i] != "0")    
                System.out.println(words[i]+"-"+count);    
        }    
    }    
}    