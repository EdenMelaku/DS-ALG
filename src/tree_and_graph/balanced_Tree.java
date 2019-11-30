package tree_and_graph;
/*
Implement a function to check if a tree is balanced. For the purposes of this question,
a balanced tree is defined to be a tree such that no two leaf nodes differ in distance
from the root by more than one.
 */
import java.util.ArrayList;

public class balanced_Tree extends Node {
    Node node;
    public balanced_Tree(ArrayList<Node> children) {
        super(children);
    }
    int min_depth=0;
    int max_depth=0;
    public void find_depth(int depth, Node node){
        if(node.children!=null){
            depth++;
            for(Node n:node.children){
                find_depth(depth,n);
            }
        }
        if(depth<min_depth) min_depth=depth;
        if(depth>max_depth) max_depth=depth;
    }
    public boolean is_balanced(){
     find_depth(0,node);
     return (max_depth-min_depth)<=1;
    }

}
