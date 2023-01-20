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
		int target = sc.nextInt();
		int ans=-1;
		int low=0,high=n-1;
		while(low<=high)
		{
		    int mid = low+(high-low)/2;
		    if(target == arr[mid])
		    {
		        ans = mid;
		        break;
		    }
		    else if(arr[low]<=arr[mid])
		    {
			if(target>=arr[low] && target<=arr[mid])
			{
			    high = mid-1;
			}
			else
			{
			    low = mid+1;
			}
		    }
		    else
		    {
			if(target>=arr[mid] && target<=arr[high])
			{
			    low = mid+1;
			}
			else
			{
			    high = mid-1;
			}  
		    }
		}
		System.out.println(ans);
	}
}
