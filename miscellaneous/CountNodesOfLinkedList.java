/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        //Code here
        if(head==null) {
            return 0;
        } else {
            int cnt=1;
            Node temp=head;
            while(temp.next!=null) {
                temp=temp.next;
                cnt++;
            }
            return cnt;
        }
    }
}
