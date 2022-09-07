//method 1
import java.util.Scanner;
public class Main
{
    static int gcd(int a,int b)
    {
        return a==0?b:gcd(b%a,a);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(gcd(a,b));
	}
}
