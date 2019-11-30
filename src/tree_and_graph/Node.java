package tree_and_graph;

import java.util.ArrayList;

public class Node {
    private ArrayList<Node> children;

    public Node(ArrayList<Node> children) {
        this.children = children;
    }

    public void add_chilld(Node child){
        children.add(child);
    }
}
