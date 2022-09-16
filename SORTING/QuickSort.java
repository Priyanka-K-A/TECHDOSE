import java.util.*;
public class Main{
    public static void swap(int arr[],int low,int high)
    {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
    public static void quicksort(int arr[],int low,int high)
    {
            if(low<high)
            {
                int partitionIndex = partition(arr,low,high);
                quicksort(arr, low, partitionIndex-1);
                quicksort(arr, partitionIndex+1, high);
            }
    }
    public static int partition(int arr[],int low,int high)
    {
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int low=0,high = n-1;
        quicksort(arr,low,high);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
