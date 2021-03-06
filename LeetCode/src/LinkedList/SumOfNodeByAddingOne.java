package LinkedList;

import LinkedList.PrintMiddleLinkedList.Node;

public class SumOfNodeByAddingOne {
	static Node newNode(int data)
	{
	   Node new_node=new Node(data);
	    new_node.val = data;
	    new_node.next = null;
	    return new_node;
	}
	
	 public  void push(int new_data)
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
	 static class Node
	    {
	        int val;
	        Node next;
	        
	        Node(int d)
	        {
	            val = d;
	            next = null;
	        }
	    }
	    public static void printList(Node head)
	    {
	        Node tnode = head;
	        while (tnode != null)
	        {
	            System.out.print(tnode.val+"->");
	            tnode = tnode.next;
	        }
	        System.out.println("NULL");
	    }
	    
	    public static Node sumOfNodeByAddingOne(Node head){
	    	Node result=head;
	    	Node temp=null;
	    	int carry=1;int sum=0;
	    	while(head != null)
	    	{
	    		sum=carry + head.val;
	    		carry= sum>=10 ? 1:0;
	    		sum=sum%10;//if sum less than sum return sum as it is else return the remainder
	    		head.val=sum;
	    		temp=head;
	    		head=head.next;
	    	}
	    		if(carry>0) temp.next=newNode(carry);
	    		return result;
	    	}
	    /* Function to reverse the linked list */
	    static Node reverse(Node head)
	    {
	        Node prev = null;
	        Node current = head;
	        Node next = null;
	        while (current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        return prev;
	    }
	  	
	    
	    static Node addOne(Node head)
	    {
	        // Reverse linked list
	        head = reverse(head);
	  
	        // Add one from left to right of reversed
	        // list
	        head = sumOfNodeByAddingOne(head);
	  
	        // Reverse the modified list
	        return reverse(head);
	    }
	public static void main(String[] args){
	
	int arr[]={9,9,9,1};
		SumOfNodeByAddingOne ll=new SumOfNodeByAddingOne();
		
		for(int i=0;i<arr.length;i++)
		{
			ll.push(arr[i]);
	//		ll.printList(ll.head);
		}
		
		ll.printList(ll.head);
		  
       ll.head = addOne(ll.head);
       ll.printList(ll.head);

		//System.out.print(deleteNodeMiddle(ll.head).val);
		 
	/*	Node head = newNode(1);
        head.next = newNode(9);
        head.next.next = newNode(9);
        head.next.next.next = newNode(9);
  
        System.out.print("List is ");
        printList(head);
  
        head = addOne(head);
        System.out.println();
        System.out.print("Resultant list is ");
        printList(head);*/
	}
}

