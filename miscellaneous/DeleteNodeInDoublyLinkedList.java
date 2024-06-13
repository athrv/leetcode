//User function Template for Java

/* Structure of linkedlist node
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int d)
	{
		data = d;
		next = prev = null;
	}
}
*/
class Solution
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
	// Your code here
	Node mover=head;
	for(int i=1; i<x; i++) {
	    mover=mover.next;
	}
	Node back=mover.prev;
	Node front=mover.next;
	if(back==null) {
	    mover.next=null;
	    front.prev=null;
	    head=front;
	} else if(mover.next==null) {
	    back.next=null;
	    mover.prev=null;
	} else {
	    back.next=front;
	    front.prev=back;
	}
	return head;
    }
}
