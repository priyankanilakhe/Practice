package Interview_questions;


class Main {
  public static void main(String[] args) {
   LinkedList ll= new LinkedList();
   ll.createLL(6);
   ll.insertNode(2);
   ll.insertNode(4);
   ll.insertNode(5);
   ll.insertNode(9);
   ll.insertNode(8);
   ll.insertNode(89);
   ll.insertNode(10);
   ll.traversalLL();
   Questions q= new Questions();
  Node n= q.nthToLast(ll,3);
  System.out.println(n.value);
  // ll.traversalLL();
   
  }
}
