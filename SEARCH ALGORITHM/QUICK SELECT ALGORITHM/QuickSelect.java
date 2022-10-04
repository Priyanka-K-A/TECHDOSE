import java.util.*;
public class Main{
    public static void swap(int arr[],int low,int high)
    {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
    public static void quickselect(int arr[],int low,int high,int k)
    {
            if(low<high)
            {
                int partitionIndex = partition(arr,low,high);
                if(partitionIndex+1==k)
                {
                  return ;
                }
                else if(k<=partitionIndex)
                {
                    quickselect(arr, low, partitionIndex-1,k);
                }
                else 
                {
                    quickselect(arr,partitionIndex+1, high ,k);
                }
            }
    }
    public static int partition(int arr[],int low,int high)
    {
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++)
        {
            if(arr[j]>pivot)
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
        int k = sc.nextInt();
        int low=0,high = n-1;
        quickselect(arr,low,high,k);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.println("\n"+arr[k-1]);
    }
}
