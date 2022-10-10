import java.util.*;
public class Main
{
    public static int workingHours(int[] gardens,int worker,int n)
    {
        int max=0,sum=0;
        for(int i=0;i<n;i++)
        {
            if(gardens[i]>max)
            {
                max = gardens[i];
            }
            sum+=gardens[i];
        }
        int low = max,high=sum;
        int hours=0;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(ifPossible(gardens,n,mid,worker)==true)
            {
                hours = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return hours;
    }
    public static boolean ifPossible(int[] gardens,int n,int mid,int worker)
    {
        int newWorkers=1,sum=0;
        for(int i=0;i<n;i++)
        {
            if(sum+gardens[i]<=mid)
            {
                sum+=gardens[i];
            }
            else
            {
                sum = gardens[i];
                newWorkers++;
            }
        }
        return (newWorkers<=worker)?true:false;
        
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] gardens = new int[n];
		for(int i=0;i<n;i++)
		{
		    gardens[i] = sc.nextInt();
		}
		int worker = sc.nextInt();
		System.out.println(workingHours(gardens,worker,n));
	}
}
