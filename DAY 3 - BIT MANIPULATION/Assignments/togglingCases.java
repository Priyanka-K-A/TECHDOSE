//method 1
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch>='a' && ch<='z')
		{
            //Lower to Upper
		    ch = (char) (ch & '_');
		}
		else 
		{
		    //upper to lower
		    ch = (char) (ch | ' ');
		}
		System.out.println(ch);
	}
}

//method 2
// import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		char ch = sc.next().charAt(0);
// 		System.out.println((char)(ch ^ ' '));
// 	}
// }
