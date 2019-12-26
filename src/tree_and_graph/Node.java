package tree_and_graph;

import java.util.*;

public class Node {
     ArrayList<Node> children;
     int data;

    public Node(int data,ArrayList<Node> children) {
        this.children = children;
        this.data=data;
    }

    public void add_chilld(Node child){
        children.add(child);
    }


}
