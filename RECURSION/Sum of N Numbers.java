import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println(sumOfNumbers(n));
	}
	public static int sumOfNumbers(int n)
	{
	    if(n==1)
	        return n;
	    return n+sumOfNumbers(n-1);      
	}
}