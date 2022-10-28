import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		for(int i=0;i<n1;i++)
		{
		    arr1[i] = sc.nextInt();
		}
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		for(int i=0;i<n2;i++)
		{
		    arr2[i] = sc.nextInt();
		}
		Stack<Integer> s = new Stack<>();
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=n2-1;i>=0;i--)
		{
		    while(!s.empty() && arr2[i]<s.peek())
		    {
		        map.put(s.pop(),arr2[i]);
		    }
		    s.push(arr2[i]);
		}
		int[] res = new int[n1];
		int j=0;
		for(int i=0;i<n1;i++)
		{
		    res[j++] = map.getOrDefault(arr1[i],-1);
		}
		for(int num:res)
		{
		    System.out.print(num+" ");
		}
	}
}
