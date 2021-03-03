public class Linkedlist_reverse {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    void printlist(Node head){
        if(head==null)
            return ;
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }    
    }

    static Node reverse_iterative(Node head){
        Node dum=null;
        Node curr=head,next=null;
        while(head!=null){
            curr=head.next;
            head.next=dum;
            dum=head;
            head=curr;

        }
        head=dum;
        return head;
    }

    public static void main(String[] args) {
        Linkedlist_reverse llist=new Linkedlist_reverse();
        llist.head=new Node(1);
        llist.head.next=new Node(2);
        llist.head.next.next=new Node(3);
        llist.head.next.next.next=new Node(4);
        //llist.head.next.next.next.next=new Node(5);

        llist.printlist(head);
        head=llist.reverse_iterative(head);
        System.out.println("\n");
        System.out.println("After Reverse:");
        llist.printlist(head);
    }
    
}
