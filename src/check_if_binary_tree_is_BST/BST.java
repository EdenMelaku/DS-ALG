package check_if_binary_tree_is_BST;

import java.util.ArrayList;

/*
a BST(binary search tree is a node based binary tree datastructure which has the following properties
1- the left subtree of the node containes only nodes with keys less than the node's key
2- the right subtree of the node containes only nodes with keys greater than the noes's key
3- both the left and the right subtrees must also be binary search trees
 */
public class BST {

    private int key;
    private BST Left;
    private BST Right;

    public BST(int key){
        this.key=key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public BST getLeft() {
        return Left;
    }

    public void setLeft(BST left) {
        Left = left;
    }

    public BST getRight() {
        return Right;
    }

    public void setRight(BST right) {
        Right = right;
    }
}




class client {
    BST left;
    BST right;
    public boolean is_BST(BST tree,int min, int max) {
        //if null;
        if(tree==null){
            return true;}
        if(tree.getKey()<min || tree.getKey()>max){return false;}
        return is_BST(tree.getRight(),tree.getKey()+1,max)&& is_BST(tree.getLeft(),min,tree.getKey()-1);

    }

    static ArrayList<BST> leafnodes=new ArrayList<BST>();

    public static void returnLeafNodes(BST tree){

        if(tree.getLeft()!=null){
            returnLeafNodes(tree.getLeft());

        }
                if(tree.getRight()!=null){
            returnLeafNodes(tree.getRight());

        }
        else {
            leafnodes.add(tree);

        }
    }



    public static void main(String... args) {
        BST tree=new BST(4);
        BST left_subtree=new BST(3);
        BST right_subtree=new BST(8);
        BST right_subtreeR=new BST(10);
        right_subtreeR.setLeft(new BST(9));
        right_subtreeR.setRight(new BST(19));
        right_subtree.setRight(right_subtreeR);
        BST left_subtreeL=new BST(1);
        left_subtree.setLeft(left_subtreeL);
        //left_subtree.setRight(new BST(2));
        tree.setLeft(left_subtree);
        tree.setRight(right_subtree);



        BST false_tree=new BST(4);
        false_tree.setLeft(right_subtree);
        false_tree.setRight(left_subtree);
        client c=new client();
        BST t=new BST(7);
        BST ta=new BST(9);
        ta.setLeft(new BST(2));
        t.setRight(ta);
        System.out.println("real BST "+c.is_BST(tree, Integer.MIN_VALUE,Integer.MAX_VALUE));
        System.out.println("not  BST "+c.is_BST(false_tree,Integer.MIN_VALUE,Integer.MAX_VALUE));
        System.out.println("new   BST "+c.is_BST(t,Integer.MIN_VALUE,Integer.MAX_VALUE));

        //find leaf nodes

        returnLeafNodes(tree);
        for(int i=0;i<leafnodes.size();i++){
           // System.out.println(leafnodes.get(i).getKey());
        }


    }
}