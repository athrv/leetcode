/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        // code here
        Node z=new Node(x);
        if(head==null) {
            head=z;
        } else {
            z.next=head;
        }
        return z;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        // code here
        Node z=new Node(x);
        if(head==null) {
            return z;
        } else {
            Node temp=head;
            while(temp.next!=null) {
                temp=temp.next;
            }
            temp.next=z;
        }
        return head;
    }
}
