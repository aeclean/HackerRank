package src;

import java.io.*;
import java.util.*;

class BreadthFirstSearch
{
	public static void main(String[] args) {
		Node root = new Node(1);

		root.children = new ArrayList<Node>();
		Node root1 = new Node(2);
		Node root2 = new Node(3);

		root.children.add(root1);
		root.children.add(root2);

		root1.children = new ArrayList<Node>();
		Node root11 = new Node(21);
		Node root12 = new Node(22);

		root1.children.add(root11);
		root1.children.add(root12);

		root11.children = new ArrayList<Node>();
		Node root111 = new Node(43);
		Node root112 = new Node(44);

		root11.children.add(root111);
		root11.children.add(root112);

		printInBFS(root);
	}

	public static void printInBFS(Node root) {
		List<Node> items = new ArrayList<Node>();

		items.add(root);

		while(!items.isEmpty()) {
			Node item = items.remove(0);
			System.out.print(item.val+" ");

			if(item != null && item.children != null) {
				for(Node inner:item.children) {
        			items.add(inner);
      			}
			}
		}
		System.out.println();
	}
}

class Node {
	int val;
	List<Node> children;

	public Node(int v) {
		val = v;
	}
}