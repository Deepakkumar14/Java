package vaildParenthesis;
import java.util.*;
public class Main {
     public static void main( String args[] ) {
    Scanner sc=new Scanner(System.in);
    String input_str= sc.nextLine();
    valid_paren(input_str);
  }
  public static void valid_paren(String input_str) {
    Stack<Character> s = new Stack<Character>();
    for (char st : input_str.toCharArray()) {
      if (st == '(' || st == '{' || st == '[') {
            
        s.push(st);
        System.out.println("Elements in Stack: " + s);
         
      }
      else if(s.empty()) {
            System.out.println(input_str +   " contains invalid parentheses.");
          }
          else {
          char top = (Character) s.peek();
          if(st == ')' && top == '(' || st == '}' && top == '{' || st == ']' && top == '['){
            s.pop();
           System.out.println("Elements in Stack: " + s);  
          }
          else{
            System.out.println(input_str +  " contains invalid parentheses.");
          }
        }
      }
  
    if(s.empty()) {
      System.out.println(input_str +  " contains valid parentheses.");
    }
    else{
      System.out.println(input_str + " contains invalid parentheses.");
    }
  }
}
 