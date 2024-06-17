/*

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

//Function should return the length of the loop in LL.

class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        Node fast=head, slow=head;
        while(fast!=null && fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow) {
                return helper(fast);
            }
        }
        return 0;
    }
    
    static int helper(Node node) {
        Node temp=node;
        int dist=1;
        while(temp.next!=node) {
            temp=temp.next;
            dist+=1;
        }
        return dist;
    }
}
