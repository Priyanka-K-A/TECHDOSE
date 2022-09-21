import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int size = sc.nextInt();
    	int[][] mat = new int[size+1][size+1];
    	for(int i=0;i<=size;i++)
    	{
    	    for(int j=0;j<=i;j++)
    	    {
    	        if(j==0 || i==j)
    	        {
    	            mat[i][j]=1;
    	        }
    	        else 
    	        {
    	            mat[i][j] = mat[i-1][j-1]+mat[i-1][j];
    	        }
    	    }
    	}
    // 	for(int i=0;i<=size;i++)
    // 	{
    // 	    for(int j=0;j<=i;j++)
    // 	    {
    // 	        System.out.print(mat[i][j]+" ");
    // 	    }
    // 	    System.out.println();
    // 	}
    	int n = sc.nextInt();
    	int r = sc.nextInt();
    	System.out.println(mat[n-1][r-1]);
	}
}
