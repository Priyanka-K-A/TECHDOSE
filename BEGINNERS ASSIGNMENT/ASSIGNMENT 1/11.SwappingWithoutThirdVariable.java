import java.util.*;
public class Main
{
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
// 		Method 1:
// 		a^=b;
// 		b^=a;
// 		a^=b;
//      Method 2:
        a=a+b;
        b=a-b;
        a=a-b;
		System.out.println("A:"+a+" B:"+b);
    
    }
}
