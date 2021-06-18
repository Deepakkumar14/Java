//half the corner elements and double other elements

package cornerby2;
import java.util.Scanner;
public class Main  
{  
    public static void main(String[] args)
    {  
        int row=0,col=0,i=0,j=0;  
        int a[][];
        int b[][];
        
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROW OF MATRIX");
        row=sc.nextInt();
        System.out.println("ENTER THE NUMBER OF COLUMN OF MATRIX");
        col=sc.nextInt();
        
        a=new int[row][col];
        b=new int[row][col];
        System.out.println("ENTER THE ELEMENTS IN MATRIX");
        for(i=0;i< row;i++)
        {
            for(j=0;j< col;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
            
        

        for(i=0;i< row;i++)
        {
            for(j=0;j< col;j++)
            {
                
                if((i==0 && (j==0||j==(col-1)))|| (i==(row-1)&&(j==0||j==(col-1))))
                {
                    b[i][j]=a[i][j]/2;
                    
                }
                else {
                    b[i][j]=a[i][j]*2;
                }
                
                    
            }
               
        } 
        for(i=0;i< row;i++)
        {
            for(j=0;j< col;j++)
            {
        System.out.print(b[i][j]+" ");  
            }
             System.out.println();
        }
    }  
}