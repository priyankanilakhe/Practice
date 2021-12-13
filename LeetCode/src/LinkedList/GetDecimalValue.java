package LinkedList;

import LinkedList.PrintMiddleLinkedList.Node;

public class GetDecimalValue {
	public int getDecimalValue(Node head) {
	        int num = head.val;
	        while (head.next != null) {
	        	System.out.println(Integer.toBinaryString(num));   
	            num = (num << 1) | head.next.val;
	            System.out.println(Integer.toBinaryString(num));
	            head = head.next;    
	        }
	        return num;
	}
	 public int getDecimalValue1(Node head) {
	        int num = head.val;
	        while (head.next != null) {
	            num = num * 2 + head.next.val;
	            head = head.next;    
	        }
	        return num;
	    }
	 public int getDecimalValue2(Node head) {
	       int sum = 0;
	        
	        while (head != null){
	            sum *= 2;
	            sum += head.val;
	            head = head.next;
	        }
	        return sum;
	    }
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
	public static void main(String[] args){
	
		int arr[]={1,0,1};
		GetDecimalValue ll=new GetDecimalValue();
		
		for(int i=0;i<arr.length;i++)
		{
			ll.push(arr[i]);
		}
		ll.printList();		
		
		System.out.println(ll.getDecimalValue(ll.head));
	}
}

