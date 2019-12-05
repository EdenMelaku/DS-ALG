package tree_and_graph;
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


}
