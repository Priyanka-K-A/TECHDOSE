import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i] = sc.nextInt();
		}
		int min1=arr[0];
		int min2=arr[1];
		for(int i=0;i<n;i++)
		{
		    if(arr[i]<min1 && min1<min2)
		    {
		        min1 = arr[i];
		        min2 = min1;
		    }
		}
        System.out.println(min2);
	}
}
