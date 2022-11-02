import java.util.*;
public class Main
{
    static List<String> list = new ArrayList<>();
    static String s = "";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Main m = new Main();
		subset(str,0,s);
		System.out.println(list);
	}
	public static void subset(String str,int pos,String s)
	{ 
	    if(pos==str.length())
	    {
	        list.add(s);return;
	    }
	    subset(str,pos+1,s);
	    s+=str.charAt(pos);
	    subset(str,pos+1,s);
	}
}
