import java.util.*;
public class Main
{
    public static int gcd(int n1,int n2)
    {
        return (n1==0)?n2:gcd(n2%n1,n1);
    }
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println((n1*n2)/gcd(n1,n2));
        
    }
}
