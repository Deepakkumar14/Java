Package fibonacciArray;
import java.util.*;
 public class Main{
	static boolean perfectSquare(int num)
	{
		int n = (int)(Math.sqrt(num));
		return (n * n == num);
	}
	static void fibOrNot(int array[], int n)
	{
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (perfectSquare(5 * array[i] * array[i] + 4) || perfectSquare(5 * array[i] * array[i] - 4)) {
				System.out.print(array[i] + " ");
				count++;
			}
		}
		if (count == 0)
			System.out.println("Not Present");
	}
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int n1 =sc.nextInt() ; 
	    int array[] =new int[n1];  
        for(int i=0; i<n1; i++)  
       {  
          array[i]=sc.nextInt();  
          } 
        int n = array.length;
		fibOrNot(array, n);
	}
}


