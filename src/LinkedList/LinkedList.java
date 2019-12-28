package LinkedList;

public class LinkedList
{
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
        }
    }

    public Node addList(Node head1, Node head2) {
        int sum=0, carrier=0,op1=0,op2=0,i=1;
        Node su=null,last=null;

        while(head1!=null||head2!=null) {
            op1=(head1!=null)?head1.data:0;
            op2=(head2!=null)?head2.data:0;
            int s=op1+op2+carrier;
            sum=sum+i++*(s%10);
            carrier=s/10;
            head1=(head1.next!=null)?head1.next:null;
            head2=(head2.next!=null)?head2.next:null;
            if(su==null) {
                su=new Node(s%10);
                last=su;
            }
            else {
                last.next=new Node(s%10);
                last=last.next;
            }
            System.out.println("sum = "+sum);

        }
        System.out.println("sum = "+sum);
        return su;

    }

    public Node addNode(Node n, int data) {
        if(n==null) {
            n=new Node(data);
        }
        else {
            n.next=new Node(data);
            n=n.next;
        }
        return n;
    }

    void printList(Node head) {
        while(head!=null) {
            System.out.print(head.data +"->");
            head=head.next;
        }
        System.out.println();
    }

    public static void main(String ... args) {
        LinkedList ll=new LinkedList();
        Node a=ll.new Node(3);
        Node b=ll.new Node(1);
        Node c=ll.new Node(5);
        Node d=ll.new Node(5);
        Node e=ll.new Node(9);
        Node f=ll.new Node(2);
        b.next=c;
        a.next=b;
        e.next=f;
        d.next=e;
        Node n=ll.addList(a,d);
        ll.printList(a);
        ll.printList(d);
        ll.printList(n);

    }

}
