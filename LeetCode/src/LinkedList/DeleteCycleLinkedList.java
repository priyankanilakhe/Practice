package LinkedList;

import java.util.HashSet;

public class DeleteCycleLinkedList {
 
    static Node head; // head of list
 
    /* Linked list Node*/
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    /* Inserts a new Node at front of the list. */
    static public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                Put in the data*/
        Node new_node = new Node(new_data);
 
        /* 3. Make next of new Node as head */
        new_node.next = head;
 
        /* 4. Move the head to point to new Node */
        head = new_node;
    }
 
    // Function to print the linked list
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    void detectAndRemoveLoop(Node node)
    {
 
        // If list is empty or has only one node
        // without loop
        if (node == null || node.next == null)
            return;
 
        Node slow = node, fast = node;
 
        // Move slow and fast 1 and 2 steps
        // ahead respectively.
        slow = slow.next;
        fast = fast.next.next;
 
        // Search for loop using slow and fast pointers
        while (fast != null && fast.next != null) {
            if (slow == fast)
                break;
 
            slow = slow.next;
            fast = fast.next.next;
        }
 
         /* If loop exists */
        if (slow == fast) {
            slow = node;
            if (slow != fast) {
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
                /* since fast->next is the looping point */
                fast.next = null; /* remove loop */
            }
              /* This case is added if fast and slow pointer meet at first position. */
            else {
                while(fast.next != slow) {
                    fast = fast.next;
                }
                fast.next = null;
            }
        }
    }
 
    // Returns true if the loop is removed from the linked
    // list else returns false.
    static boolean removeLoop(Node h)
    {
        HashSet<Node> s = new HashSet<Node>();
        Node prev = null;
        while (h != null) {
            // If we have already has this node
            // in hashmap it means their is a cycle and we
            // need to remove this cycle so set the next of
            // the previous pointer with null.
 
            if (s.contains(h)) {
                prev.next = null;
                return true;
            }
 
            // If we are seeing the node for
            // the first time, insert it in hash
            else {
                s.add(h);
                prev = h;
                h = h.next;
            }
        }
 
        return false;
    }
 
    /* Driver program to test above function */
    public static void main(String[] args)
    {
        DeleteCycleLinkedList llist = new DeleteCycleLinkedList();
 
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);
 
        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;
 
        if (removeLoop(head)) {
            System.out.println("Linked List after removing loop");
            llist.printList(head);
        }
        else
            System.out.println("No Loop found");
    }
}
 