package src;

import java.io.*;
import java.util.*;

class Node
{
	int data;
	Node next;
	Node(int d) 
	{
		data = d;
		next = null;
	}
}

class LinkedList
{
	static Node first;
    static Node last;
    
    public static  Node insert(Node head,int data)
	{
        Node node = new Node(data);
        
        if(head == null)
            first = node;
        
        if(last != null)
            last.next = node;
        
        last = node;
        
        return first;
	}

	public static void display(Node head)
    {
        Node start=head;
        while(start!=null)
        {
        	System.out.print(start.data+" ");
            start=start.next;
        }
    }
    
    public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		Node head = null;
		int T = sc.nextInt();

		while(T-- > 0)
		{
			int data = sc.nextInt();
			head = insert(head,data);
		}
		display(head);
   }
}