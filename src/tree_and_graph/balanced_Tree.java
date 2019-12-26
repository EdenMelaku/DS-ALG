package tree_and_graph;
/*
Implement a function to check if a tree is balanced. For the purposes of this question,
a balanced tree is defined to be a tree such that no two leaf nodes differ in distance
from the root by more than one.
 */
import java.util.ArrayList;

public class balanced_Tree extends Node {
    Node node;
    public balanced_Tree(ArrayList<Node> children, int data) {
        super(data,children);
    }
    static int min_depth= Integer.MAX_VALUE;
    static int max_depth=0;
    public static void find_depth(int depth, Node node){
        if(node.children!=null){
            depth++;
            for(Node n:node.children){
                find_depth(depth,n);
            }
        }
        if(node.children.size()==0&&depth<min_depth) min_depth=depth;
        if(depth>max_depth) max_depth=depth;
    }
    public static   boolean is_balanced(Node node){
     find_depth(0,node);
     return (max_depth-min_depth)<=1;
    }

    public static void main(String ... args) {

        Node n2=new Node(10,new ArrayList<>());
        Node n3=new Node(2,new ArrayList<>());
        Node n4=new Node(1,new ArrayList<>());
        Node n5=new Node(3,new ArrayList<>());
        Node n6=new Node(7,new ArrayList<>());
        Node n=new Node(5,new ArrayList<>());
        Node n7=new Node(12,new ArrayList<>());

      //  n2.add_chilld(n4);
        //n2.add_chilld(n5);
        n3.add_chilld(n6);
        n.add_chilld(n7);
        n3.add_chilld(n);

        Node n1=new Node(6,new ArrayList<>());
        n1.add_chilld(n2);
        n1.add_chilld(n3);

        System.out.println(is_balanced(n1));

        System.out.println(max_depth);

        System.out.println(min_depth);

    }

}
