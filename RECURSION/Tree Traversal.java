import java.util.*;
class Node 
{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class treeTraversal
{
    static Node head = null;
    public static void insert(int data)
    {
        Node nn = new Node(data);
        if(head==null)
        {
            head = nn;
        }
        else
        {
            add(head,data);
        }
    }
    public static void add(Node root,int data)
    {
        Node nn = new Node(data);
        if(root.data>data)
            {
                if(root.left==null)
                {
                    root.left = nn;
                    return;
                }
                add(root.left,data);
            }
            else
            {
                if(root.right==null)
                {
                    root.right = nn;
                    return;
                }
                add(root.right,data);
            }
    }
    public static void inorder()
    {
        inorder_traversal(head);
    }
    public static void inorder_traversal(Node root)
    {
        if(root==null)
            return;
        inorder_traversal(root.left);
        System.out.print(root.data+" ");
        inorder_traversal(root.right);
    }
    public static void postorder()
    {
        postorder_traversal(head);
    }
    public static void postorder_traversal(Node root)
    {
        if(root==null)
            return;
        postorder_traversal(root.left);
        postorder_traversal(root.right);
        System.out.print(root.data+" ");
    }
    public static void preorder()
    {
        preorder_traversal(head);
    }
    public static void preorder_traversal(Node root)
    {
        if(root==null)
            return;
        System.out.print(root.data+" ");    
        preorder_traversal(root.left);
        preorder_traversal(root.right);
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		treeTraversal tt = new treeTraversal();
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    int data = sc.nextInt();
		    tt.insert(data);
		}
		System.out.print("Inorder : ");
		tt.inorder();
		System.out.println();
		System.out.print("Postorder : ");
		tt.postorder();
		System.out.println();
		System.out.print("Preorder : ");
		tt.preorder();
	}
}
