/* Structure of Doubly Linked List
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
	    this.data = data;
	    next = prev = null;
	}
}*/

class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head_ref, int pos, int data)
	{
		// Your code here
		Node mover=head_ref;
		Node newNode=new Node(data);
		for(int i=0; i<pos; i++) mover=mover.next;
		if(mover.next!=null) {
		    Node front=mover.next;
		    mover.next=newNode;
		    newNode.prev=mover;
		    newNode.next=front;
		    front.prev=newNode;
		} else {
		    mover.next=newNode;
		    newNode.prev=mover;
		    newNode.next=null;
		}
	}
}
