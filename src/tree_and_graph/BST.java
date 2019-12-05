package tree_and_graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
Given a sorted (increasing order) array, write an algorithm to create a binary tree with
minimal height.
 */
public class BST {
    class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
        }

    }

    Node createBST(int[] numbers, Node root, int low, int high) {
        int mid = low + (high - low / 2);
        root.data = numbers[mid];
        if (low < high) {
            root.left = createBST(numbers, root, low, mid - 1);
            root.right = createBST(numbers, root, mid + 1, high);
        }
        return root;
    }

    /*
    Given a binary search tree, design an algorithm which creates a linked list of all the
nodes at each depth (eg, if you have a tree with depth D, you’ll have D linked lists)
     */

    ArrayList<LinkedList<Node>> TreeToLinkedList(Node root){
        Queue<Node> list=new LinkedList<>();
        ArrayList<LinkedList<Node>> out=new ArrayList<>();
        LinkedList<Node> currentDepth=new LinkedList<>();
        list.add(root);
        int level=0;
        currentDepth.add(level,root);
        out.add(currentDepth);
        while(out.get(level).size()>0){
            currentDepth=new LinkedList<>();
            for(int i=0;i<out.get(level).size();i++){
                if(out.get(level).get(i).left!=null) currentDepth.add(out.get(level).get(i).left);
                if(out.get(level).get(i).right!=null) currentDepth.add(out.get(level).get(i).right);
            }
            out.add(++level,currentDepth);


        }
        return out;

    }
    


}
