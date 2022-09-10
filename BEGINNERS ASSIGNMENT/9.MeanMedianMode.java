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
        //Mean
        int mean=0;
        for(int i=0;i<n;i++)
        {
            mean+=arr[i];
        }
        //Median
        Arrays.sort(arr);
        int median;
        if(n%2==0)
            median = (arr[n/2]+arr[n/2-1])/2;
        else
            median = arr[n/2]/2;
        //Mode
        int count=0,maxCount=0,val=0;
        for(int i=0;i<n;i++)
        {
            count=0;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>maxCount)
            {
                maxCount = count;
                val = arr[i];
            }
        }
        System.out.println("Mean : "+mean/n+"\n"+"Median : "+median+"\n"+"Mode : "+val);
    }
}
//Output
// 6
// 1 2 3 4 5 1
// Mean : 2
// Median : 2
// Mode : 1
