//Merge Two sorted Arrays without Extra space
import java.util.*;
public class Main
{
    public static void sort(int[] A,int[] B,int n)
    {
        for(int i=n-1;i>=0;i--)
        {
            int j,last = A[n-1];
            for(j=n-2;j>=0 && A[j]>B[i];j--)
            {
                A[j+1] = A[j];
            }
            if(j!=n-2 ||last>B[i])
            {
                A[j+1] = B[i];
                B[i] = last;
            }
        }
    }
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] A = new int[n];
    	int[] B = new int[n];
    	for(int i=0;i<n;i++)
    	{
    	    A[i] = sc.nextInt();
    	}
    	for(int i=0;i<n;i++)
    	{
    	    B[i] = sc.nextInt();
    	}
    	sort(A,B,n);
    	for(int i=0;i<n;i++)
    	{
    	    System.out.print(A[i]+" ");
    	}
    	for(int i=0;i<n;i++)
    	{
    	    System.out.print(B[i]+" ");
    	}
	    
	}
}
