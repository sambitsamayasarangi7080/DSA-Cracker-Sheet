
public class LinkedList {
    static Node head;
    static class Node{
    
        int data;
        Node next;
    Node(int data){
        this.data=data;
        next=null;
    }

  } 

  static void printlist(Node head){
      if(head==null){
          return ;
      }
      while(head!=null){
          System.out.print(head.data+ "->");
          head=head.next;
      }
  }
  static Node reverse(Node head){
      Node dum=null;
      Node curr=head, next;
      while(head!=null){
          curr=head.next;
          head.next=dum;
          dum=head;
          head=curr;
      }
      head=dum;
      return head;

  }
  static void rearrange(Node head){
      Node slow=head,fast=slow.next;
      while(fast!=null && fast.next!=null){
          slow=slow.next;
          fast=fast.next.next;
      }

      Node node1=head;
      Node node2=slow.next;
      slow.next=null;

      node1=reverse(node1);
      head=new Node(0);
      Node curr=head;
      while(node1!=null || node2!=null){
            if(node1!=null){
                curr.next=node1;
                curr=curr.next;
                node1=node1.next;
            }

            if(node2!=null){
                curr.next=node2;
                curr=curr.next;
                node2=node2.next;
            }
      }
      head=head.next;
  }

public static void main(String[] args) {
        LinkedList llist=new LinkedList();
        llist.head=new Node(1);
        llist.head.next=new Node(2);
        llist.head.next.next=new Node(3);
        llist.head.next.next.next=new Node(4);
        //llist.head=new Node(1);

        //llist.printlist(head);
        llist.rearrange(head);
        //System.out.println("\n");
        llist.printlist(head);


        
    }
    
}
