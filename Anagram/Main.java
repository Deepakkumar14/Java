package Anagram;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first String: ");
    String str1 = input.nextLine();
    System.out.print("Enter second String: ");
    String str2 = input.nextLine();
    String s1 = str1.toLowerCase().replaceAll("\\s","");  //coverts to lower case and remove whitespaces
    String s2 = str2.toLowerCase().replaceAll("\\s","");
    if(s1.length() == s2.length()) {
      char[] charArray1 = s1.toCharArray(); // converts string into character array
      char[] charArray2 = s2.toCharArray();
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);
      boolean result = Arrays.equals(charArray1, charArray2);
      if(result==true) {
        System.out.println(str1 + " and " + str2 + " are anagram.");
      }
      else {
        System.out.println(str1 + " and " + str2 + " are not anagram.");
      }
    }
    else {
      System.out.println(str1 + " and " + str2 + " are not anagram.");
    }
  }
}