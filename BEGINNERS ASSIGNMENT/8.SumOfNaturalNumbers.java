import java.util.*;
public class Main
{
    public static int sum(int n)
    {
        if(n==0)
            return n;
        else
            return n+sum(n-1);
    }
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt();
      System.out.println(sum(n));
    
    }
}
//Another Method - Directly using Mathematical Formula
// System.out.println((n*(n+1))/2);
