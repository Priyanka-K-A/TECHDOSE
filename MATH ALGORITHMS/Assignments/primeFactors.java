import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	for(int i=2;i<=n/2;i++)//for(int i=2;i*i<=n;i++)
    	{
    	    if(n%i==0)
    	    {
    	        System.out.println(i+" ");
    	        n/=i;
    	    }
    	}
    	if(n>2)
    	{
    	    System.out.println(n);
    	}
	}
}
