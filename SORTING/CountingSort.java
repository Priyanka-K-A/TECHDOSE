import java.util.*;
public class Main{
    public static void countingsort(int arr[],int n)
    {
        int[] freq = new int[10];
        for(int i=0;i<n;i++)
        {
            freq[arr[i]]++;
        }
        int[] cumFreq = new int[10];
        for(int i=0;i<10;i++)
        {
            if(i==0)
                cumFreq[i] = 0;
            if(i!=0)
                cumFreq[i] = cumFreq[i-1]+freq[i];
        }
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--)
        {
            cumFreq[arr[i]]--;
            ans[cumFreq[arr[i]]] = arr[i];
        }
        for(int i=0;i<n;i++)
        {
            arr[i] = ans[i];
        }
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
        countingsort(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
