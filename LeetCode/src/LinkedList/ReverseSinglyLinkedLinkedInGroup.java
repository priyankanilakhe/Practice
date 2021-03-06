package LinkedList;

import LinkedList.PrintMiddleLinkedList.Node;

public class ReverseSinglyLinkedLinkedInGroup {
	Node head; // head of linked list

	/* Linked list node */
	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	private Node reverse(Node pre, Node next) {
		Node last = pre.next; // where first will be doomed "last"
		Node cur = last.next;
		while (cur != next) {
			last.next = cur.next;
			cur.next = pre.next;
			pre.next = cur;
			cur = last.next;
		}
		return last;
	}

	public Node reverseListByGroup(Node head, int k) {
		/*
		 * if (head == null || k == 1) return head; Node dummy = new Node(0);
		 * dummy.next = head; Node pre = dummy; int i = 0 ; while (head !=
		 * null){ i++ ; if (i% k == 0){ pre =reverse(pre, head.next); head =
		 * pre.next; } else { head = head.next; } } this.head=dummy.next; return
		 * dummy.next;
		 */

		int x = k;
		Node head_next = null;
		Node h = head;
		Node head_prev = null;
		while (h != null && x > 0) {
			head_next = h.next;
			h.next = head_prev;
			head_prev = h;
			h = head_next;
			x--;
		}
		if (head_next != null) {
			head.next = reverseListByGroup(head_next, k);
		}
		this.head = head_prev;
		return head_prev;

	}

	/* Inserts a new Node at front of the list. */
	public void push(int new_data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	/*
	 * This function prints contents of linked list starting from the given node
	 */
	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + "->");
			tnode = tnode.next;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {
		ReverseSinglyLinkedLinkedInGroup llist = new ReverseSinglyLinkedLinkedInGroup();
		for (int i = 8; i > 0; --i) {
			llist.push(i);
		}
		llist.printList();
		llist.reverseListByGroup(llist.head, 3);
		llist.printList();
	}
}
