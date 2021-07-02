package stringReverseEachWords;
import java.util.Scanner;
public class StringReverse{
    public static void main (String []args){
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the string");
        String inputString=input.nextLine();
        char chararray[]=inputString.toCharArray();
        int length=chararray.length;
        int count=0;
        System.out.println("The reversed string is");
        for(int i=0;i<length;i++){
            if(chararray[i]!=' '){
            count++;
            }
            else if(chararray[i]==' '){
             for(int j=i-1;j>=i-count;j--){  //j should start from i-1 th elemnt in d and should go upto i-count 
                 System.out.print(chararray[j]);
             }
             count=0;
             System.out.print(" ");
            }
            
            if(i==length-1){
             for(int j=length-1;j>=i-count;j--)
             System.out.print(chararray[j]);
            }
        }
    }
}