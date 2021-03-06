package LinkedList;

import LinkedList.PrintMiddleLinkedList.Node;

public class DeleteNodeSumZero {
	
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
	    
	    public static Node deleteNodeSumZero(Node head){
	    	int sum=0;
	    	Node result = null;
	    	while(head != null)
	    	{	
	    		sum += head.val;
	    		
	    		//System.out.println(sum+"vad");
	    		head=head.next;
	    		if(sum!=0 && head.next== null)
	    		{
	    		result=head;
	    		//return sum;
	    		return result;
	    		}
	    	}
			return result;
	    	
	    	
	    }
	public static void main(String[] args){
	
		int arr[]={6,-6,8,4,-12,9,8,-8};
		DeleteNodeSumZero ll=new DeleteNodeSumZero();
		
		for(int i=0;i<arr.length;i++)
		{
			ll.push(arr[i]);
		}
		ll.printList();	
		System.out.print(deleteNodeSumZero(ll.head).val);
		
	}
}

