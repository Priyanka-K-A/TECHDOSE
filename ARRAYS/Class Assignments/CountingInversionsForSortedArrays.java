//Counting Inversions for Sorted Array
import java.util.*;
public class Main
{
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
    	int j=0,sum=0;
	    for(int i=0;i<n;i++)
	    {
	        while(j<n && i<n && B[i]>=A[j])
	        {
	            j++;
	        }
	        sum+=j;
	    }
	    System.out.println(sum);
	}
}
