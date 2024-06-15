/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/

public static Node reverseDLL(Node  head)
{
    //Your code here
    Node current=head;
    while(current!=null) {
        Node temp=current.next;
        current.next=current.prev;
        current.prev=temp;
        head=current;
        current=current.prev;
    }
    return head;
}
