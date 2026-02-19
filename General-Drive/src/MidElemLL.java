package src;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
public class MidElemLL{
    public static int getLength(node h){
        int length = 0;
        while(h.next!=null){
            length++;
            h = h.next;
        }
        return length;
    }
    public static int getMiddleElement(node h){
        int length = getLength(h);
        int mid = length/2;
        while(mid>0){
            h=h.next;
            mid--;
        }
        return h.data;
    }
    public static void main(String [] args){
        node head = new node(10);
        head.next = new node(25);
        head.next.next = new node(1);
        head.next.next.next = new node(22);
        head.next.next.next.next = new node(14);
        head.next.next.next.next.next = new node(5);
        head.next.next.next.next.next.next = new node(11);
        System.out.println("Middle element of linked list is: "+getMiddleElement(head));
    }
}