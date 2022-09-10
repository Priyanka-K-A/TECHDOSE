import java.util.*;
public class Main
{
    public static void divide(int arr[],int low,int high)
    {
        if(low==high) 
            return ;
        int mid = low+(high-low)/2;
        divide(arr,low,mid);
        divide(arr,mid+1,high);
        mergesort(arr,low,mid,high);
        
    }
    public static void mergesort(int arr[],int low,int mid,int high)
    {
        int i=low,j=mid+1;
        int[] newArr = new int[high+1];
        int k = low;
        while(i<=mid && j<=high)
        {
            if(arr[i]>arr[j])
            {
                newArr[k] = arr[j];
                j++;k++;
            }
            else
            {
                newArr[k] = arr[i];
                i++;k++;
            }
        }
        while(i<=mid)
        {
            newArr[k] = arr[i];
            i++;
            k++;
        }
        while(j<=high)
        {
            newArr[k] = arr[j];
            j++;
            k++;
        }
        for(i=low;i<=high;i++)
        {
            arr[i] = newArr[i];
        }
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i] = sc.nextInt();
		}
		int low=0,high=n-1;
		divide(arr,low,high);
		for(int i=0;i<n;i++)
		{
		    System.out.println(arr[i]+" ");
		}
		
	}
}
