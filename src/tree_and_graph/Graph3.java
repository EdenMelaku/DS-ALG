package tree_and_graph;


class Nodee{
        int data;
        Nodee left,right;
        Nodee (int d){
            data=d;
            left=right=null;
        }

    }

    class BinaryTree {
        Nodee first, middle, last, prev;

        void correctBSTUtil(Nodee root) {
            if (root != null) {
                correctBSTUtil(root.left);

                if (prev != null && root.data < prev.data) {
                    if (first == null) {
                        first = prev;
                        middle = root;
                    } else
                        last = root;
                }
                prev = root;

                correctBSTUtil(root.right);

            }

        }

        void correctBST(Nodee root) {

            first = middle = last = prev = null;
            correctBSTUtil(root);

            if (first != null && last != null) {
                int temp = first.data;
                first.data = last.data;
                last.data = temp;
            } else if (first != null && middle != null) {
                int temp = first.data;
                first.data = middle.data;
                middle.data = temp;

            }
        }

        void printInOrder(Nodee node) {
            if (node == null) return;

            printInOrder(node.left);
            System.out.print(" " + node.data);
            printInOrder(node.right);
        }


        public static void main(String... args) {
            Nodee root = new Nodee(6);
            root.left=new Nodee(10);
            root.left.left=new Nodee(1);
            root.left.right=new Nodee(3);
            root.right=new Nodee(2);
            root.right.left=new Nodee(7);
            root.right.right=new Nodee(12);

            System.out.println("inorder traversal of the original tree");
            BinaryTree tree=new BinaryTree();
            tree.printInOrder(root);
            tree.correctBST(root);


            System.out.println("\n indorder traversal of the fixed tree ");
            tree.printInOrder(root);
            System.out.println();






        }



}


























