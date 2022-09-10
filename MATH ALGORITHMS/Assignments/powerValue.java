import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int base = sc.nextInt();
    	int power = sc.nextInt();
    	long result = 1;
    	while(power>0)
    	{
    	    if(power%2==1)
    	    {
    	        result*=base;
    	    }
    	    base*=base;
    	    power/=2;
    	}
    	System.out.println(result);
	}
}
