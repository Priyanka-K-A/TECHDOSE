import java.util.*;
class Node 
{
    int data;
    Node next;
}
public class Main
{
    Node top = null;
    public void push(int n)
    {
        Node nn = new Node();
        nn.data = n;
        nn.next = null;
        if(top==null)
            top = nn;
        else
        {
            nn.next = top;
            top = nn;
        }
    }
    public void pop()
    {
        top = top.next;
    }
    public void display()
    {
        Node temp = top;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public void reverse()
    {
        Node curr = top,prev = null,temp=null;
        while(curr!=null)
        {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        top = prev;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Main stack = new Main();
		for(int i=0;i<n;i++)
		    stack.push(sc.nextInt());
		    
		stack.display();
		System.out.println();
		stack.pop();
		stack.display();
		System.out.println();
		stack.reverse();
		stack.display();
	}
}
