package exercies_on_crack_the_code;

class Node{
    int data;
    Node next;
    Node prev;
    Node begin;
    public Node(int d){
        data=d;
    }

    public void appendToTail(int d){
        Node node=new Node(d);
        Node n=this;
        while(n.next!=null){
            n=n.next;
        }
        n.next=node;
    }
    public void delete(int d){
        Node n=begin;
        while(n.next!=null){
            if(n.data==d){
                n.prev.next=n.next;
                n.next.prev=n.prev;
            }
        }
    }

    public void remove_duplicated(){
        Node n=begin;
        while(n.next!=null){
            Node i=n;
            while(i.next!=null){
                if(n.data==i.data){
                    i.prev.next=i.next;
                   i.next.prev=i.prev;
                }
            }
        }
    }
}
