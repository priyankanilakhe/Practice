package LinkedList;

import LinkedList.PrintMiddleLinkedList.Node;

public class DeleteMiddleNode {
	
	 public void push(int new_data)
	    {
	        /* 1 & 2: Allocate the Node &
	                  Put in the data*/
	        Node new_node = new Node(new_data);
	 
	        /* 3. Make next of new Node as head */
	        new_node.next = head;
	 
	        /* 4. Move the head to point to new Node */
	        head = new_node;
	    }
	   Node head; // head of linked list
	   
	    /* Linked list node */
	    class Node
	    {
	        int val;
	        Node next;
	        Node(int d)
	        {
	            val = d;
	            next = null;
	        }
	    }
	    public void printList()
	    {
	        Node tnode = head;
	        while (tnode != null)
	        {
	            System.out.print(tnode.val+"->");
	            tnode = tnode.next;
	        }
	        System.out.println("NULL");
	    }
	    
	    public static Node deleteNodeMiddle(Node head){
	    	Node slow_node=head;
	    	Node fast_node=head;
	    	while(fast_node!=null && fast_node.next != null)
	    	{
	    		fast_node=fast_node.next.next;	    		
	    		slow_node=slow_node.next;
	    	}
			return slow_node;
	    	
	    	
	    }
	public static void main(String[] args){
	
		int arr[]={1,2,3,4,5};
		DeleteMiddleNode ll=new DeleteMiddleNode();
		
		for(int i=0;i<arr.length;i++)
		{
			ll.push(arr[i]);
		}
		ll.printList();	
		System.out.print(deleteNodeMiddle(ll.head).val);
		
	}
}

