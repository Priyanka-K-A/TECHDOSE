//method 1
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		    if(n%i==0)
		    {
		        System.out.print(i+" ");
		    }
		}
	}
}

//method 2
// import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		int n = sc.nextInt();
// 		for(int i=1;i*i<=n;i++)//for(int i=1;i<=n/2;i++)
// 		{
// 		    if(n%i==0)
// 		    {
// 		        System.out.print(i+" ");
// 		        if(i*i !=n)
// 		        {
// 		            System.out.print(n/i+" ");
// 		        }
// 		    }
// 		}
// 	}
// }
