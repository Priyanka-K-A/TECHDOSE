import java.util.*;
public class Main
{
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag=0;
		for(int i=1;i<n;i++)
		{
		    if(n/i==i)
		    {
                flag=1;
		    }
		}
		System.out.println((flag==1)?"Perfect Square" : "Not Perfect Square");
    
    }
}
