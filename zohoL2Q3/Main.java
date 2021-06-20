//Find the kth element without merging

package zohoL2Q3;
import java.util.Scanner;

class Main{

	public static void main(String[] abc)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Array Sizes:");

		int m=s.nextInt();

		int n=s.nextInt (); 
		
		int [] A =new int[m];

		int [] B= new int[n];
		System.out.println("Enter Array Values::");

		for (int i=0;i<m;i++)
			A[i]= s.nextInt ();

		for (int i=0;i<n;i++) 
			B[i]=s.nextInt();
		System.out.println("Enter Index::");

		int k= s.nextInt();

		int count=0;

		int i=0,j=0;

		while(true){
			System.out.println("i="+i+"&&"+"j="+j);

			if (i<=m-1 && j<=n-1 && (A[i]<=B[j])){

				count++;

				if (count== k) {

					if(i==m)
						System.out.println(A[i-1]);
					else
						System.out.println(A[i]);
					break;
				}
				i++;
			}
			else {

				count++;
				if (count==k) {

					System.out.println(i);	
					System.out.println("j"+j);
					if(j==n)
						System.out.println(B[j-1]);
					else
						System.out.println(B[j]);

					break;
				}
				j++;
			}
		}
	}
} 
