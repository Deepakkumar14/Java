package crossPattern;
import java.util.*;
public class CrossPattern
{
public static void main (String[] args)
{
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the Input");
    String str=input.nextLine();
    int length = str.length();
    for (int i = 0; i < length; i++)
    {
        int j = length - 1 - i;
        for (int k = 0; k < length; k++)
        {
            if (k == i || k == j)
                System.out.print(str.charAt(k));
            else
                System.out.print(" ");
        }
        System.out.println("");
    }
}

}