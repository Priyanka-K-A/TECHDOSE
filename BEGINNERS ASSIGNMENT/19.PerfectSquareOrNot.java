import java.util.*;
public class Main
{
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag=0;
		for(int i=1;i<n/2;i++)
		{
		    if(i*i==n)
		    {
		        System.out.println("Perfect Square");
		        flag=1;
		        break;
		    }
		}
		if(flag==0)
		    System.out.println("Not Perfect square");
    
    }
}

//Another Method
// import java.util.Scanner;
// public class Main
// {
//      public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		int n = sc.nextInt();
// 		int k = (int)Math.sqrt(n);
// 		System.out.print(((k*k)==n)?"Perfect Square":"Not Perfect Square");
// 	}
// }
