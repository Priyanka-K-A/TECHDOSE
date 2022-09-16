import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class Main{
    public static void countingsort(Integer arr[],int n,int exp)
    {
        int[] freq = new int[10];
        for(int i=0;i<n;i++)
        {
            freq[(arr[i]/exp)%10]++;
        }
        int[] cumFreq = new int[10];
        for(int i=0;i<10;i++)
        {
            if(i==0)
                cumFreq[i] = freq[0];
            if(i!=0)
                cumFreq[i] = cumFreq[i-1]+freq[i];
        }
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--)
        {
            ans[cumFreq[(arr[i]/exp)%10]-1] = arr[i];
            cumFreq[(arr[i]/exp)%10]--;
        }
        for(int i=0;i<n;i++)
        {
            arr[i] = ans[i];
        }
    }
    public static void radixsort(Integer arr[],int n)
    {
        int max = Collections.max(Arrays.asList(arr));
        for(int exp = 1;max/exp>0;exp*=10)
        {
            countingsort(arr,n,exp);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        radixsort(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
