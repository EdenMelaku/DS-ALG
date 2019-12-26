package tree_and_graph;

import java.util.*;

/*
Given a sorted (increasing order) array, write an algorithm to create a binary tree with
minimal height.
 */
public class BST {
    class Node {
        Node left;
        Node right;
        int data;
       public Node(){
            ;}
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

    /*
    Design an algorithm and write code to find the first common ancestor of two nodes
in a binary tree. Avoid storing additional nodes in a data structure. NOTE: This is not
necessarily a binary search tree.
     */

    public Node commonAncestor(Node root, Node p, Node q) {
        if (covers(root.left, p) && covers(root.left, q))
            return commonAncestor(root.left, p, q);
        if (covers(root.right, p) && covers(root.right, q))
            return commonAncestor(root.right, p, q);
        return root;
         }
  private boolean covers(Node root, Node p) { /* is p a child of root? */
         if (root == null) return false;
         if (root == p) return true;
         return covers(root.left, p) || covers(root.right, p);
         }

       /*
       You are given a binary tree in which each node contains a value. Design an algorithm
to print all paths which sum up to that value. Note that it can be any path in the tree
- it does not have to start at the root.
        */
       void findSum(Node head, int sum) {

       }


       Node leastCommonAncestor(tree_and_graph.Node root, tree_and_graph.Node node1, tree_and_graph.Node node2) {
           Queue<tree_and_graph.Node> queue=new LinkedList<>();
           Set<tree_and_graph.Node> visited=new LinkedHashSet<>();
           queue.add(root);
           while(!queue.isEmpty()) {
               tree_and_graph.Node n=queue.poll();
               if(!visited.contains(n)&&){

               }
           }
       }
    class  CommonAncestor extends Node {
        int depth;
    }
    CommonAncestor covers(Node root, Node node1, Node node2, int foo,CommonAncestor LCA,int depth){
        if(root!=null) {
            depth++;
            if (root == node1 || root == node2) {
                foo++;
                if (foo == 2) {
                    if (depth > LCA.depth) {
                        LCA = (CommonAncestor) root;
                        LCA.depth = depth;
                    }

                }
            }
            CommonAncestor left=covers(root.left, node1, node2, foo, LCA, depth);
            CommonAncestor right= covers(root.right, node1, node2, foo, LCA, depth);

            return  left.depth >right.depth?left:right;
        }
       return LCA;
       }


       

    }



