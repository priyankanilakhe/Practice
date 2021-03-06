package LinkedList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import LinkedList.PrintMiddleLinkedList.Node;

public class RemoveDuplicatesFromSortedLinkedList {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public static Node push(Node head, int data) {
		/*
		 * Node newNode=new Node(data); //newNode.data=data; newNode.next=head;
		 * head=newNode; return head;
		 */
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
		return head;
	}

	public static Node PrintList(Node head) {
		Node temnode = head;
		while (temnode != null) {
			System.out.print(temnode.data + "->");
			temnode = temnode.next;
		}
		System.out.println("NULL");
		// return temnode;
		return null;
	}

	public static void removeDuplicates(Node head) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		Node temp = head;
		while (temp != null) {
			// System.out.println(!map.containsKey(temp.data));
			if (!map.containsKey(temp.data)) {
				System.out.println(!map.containsKey(temp.data));
				System.out.print(temp.data + "->");
			}
			map.put(temp.data, true);
			temp = temp.next;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {
		Node head = null;

		/*
		 * Created linked list will be 11->11->11->13->13->20
		 */
		head = push(head, 20);
		head = push(head, 13);
		head = push(head, 13);
		head = push(head, 11);
		head = push(head, 11);
		head = push(head, 11);
		System.out.print("Linked list before duplicate removal ");
		PrintList(head);
		System.out.print("\nLinked list after duplicate removal  ");
		removeDuplicatesSol2(head);
	}

	public static void removeDuplicatesSol2(Node head)
	{ 
		Set<Integer> track= new HashSet<Integer>();
		Node temp=head; 
		while(temp != null) {
			  if(!track.contains(temp.data))
				  {
				  System.out.print(temp.data+"->");
				  }
			  track.add(temp.data);
			  temp=temp.next;
		} 
		System.out.println("NULL");
		
	}

}
