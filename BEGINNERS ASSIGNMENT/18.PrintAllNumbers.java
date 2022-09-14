import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] count = new int[10];
		if(n<0)
		{
		    n*=(-1);
		}
		while(n>0)
		{
		    int rem = n%10;
		    count[rem]++;
		    n/=10;
		}
		for(int i=0;i<10;i++)
		{
		    if(count[i]>0)
		    {
		        System.out.print(i+" ");
		    }
		}
	}
}
