import java.util.*;
class Node 
{
    int data;
    Node next;
}
class LinkedList
{
    Node head = null;
    Node createNode(int data)
    {
        Node nn = new Node();
        nn.data = data;
        nn.next = null;
        return nn;
    }
    void append(int data)
    {
        Node nn = createNode(data);
        Node temp = head;
        if(head==null)
        {
            head=nn;
            nn.next = head;
            return;
        }
        while(temp.next!=head)
        {
            temp = temp.next;
        }
        nn.next = head;
        temp.next = nn;
    }
    void josephusCircle(int n)
    {
        Node temp = head;
        Node prev = null;
        while(temp.next!=temp)
        {
            int count=1;
            while(count<n)
            {
                prev = temp;
                temp = temp.next;
                count++;
            }
            prev.next = temp.next;
            temp = temp.next;
        }
        System.out.println(temp.data+" ");
    }
    void display()
    {
        Node temp = head;
        while(temp.next!=head)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print(temp.data+" ");
        System.out.println();
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList ll = new LinkedList();
		int n = sc.nextInt();
		int data;
		for(int i=0;i<n;i++)
		{
		    data = sc.nextInt();
		    ll.append(data);
		}
		ll.display();
		int pos = sc.nextInt();
		ll.josephusCircle(pos);
	}
	
}
