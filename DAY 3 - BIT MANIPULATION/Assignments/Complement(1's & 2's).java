import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("1's Complement : "+(~n)+"\n2's Complement : "+((~n)+1));
	}
}
