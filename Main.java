
//Ball QUESTION 1
import java.util.*;
public class Main
{
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        int i,j,n,count;
        char a[][];
        System.out.print("Enter the size of NxN matrix : "); //Create a matrix of size NxN
        n=sc.nextInt();
        a=new char[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==0||i==(n-1)||j==0||j==(n-1)) //To create wall bricks
                a[i][j]='W';
                else 
                a[i][j]=' '; //To add spaces
                if((i==6 && j==1)||(i==6 && j==2)||(i==6 && j==4)||(i==6 && j==5)) //To create a ground for ball to bounce
                a[i][j]='G';
                if(i==6&&j==3) //To create a ball
                a[i][j]='O';
                
            }
              
        }
        while(true)
                {
                    System.out.print("Enter the brick's position and the brick type : "); //To add additional bricks at required postion
                    int p,q;
                    char x,flag;
                    p=sc.nextInt();
                    q=sc.nextInt();
                    x=sc.next().charAt(0);
                    a[p][q]=x;
                    System.out.print("Do you want to continue(Y or N)?");
                    flag=sc.next().charAt(0);
                    if(flag=='N' || flag=='n')
                    break;   
                }
        
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
      System.out.print("Enter ball count "); //How many chances required for bouncing the ball
      count=sc.nextInt();
      System.out.print("Ball count is "+count);
    }
}
