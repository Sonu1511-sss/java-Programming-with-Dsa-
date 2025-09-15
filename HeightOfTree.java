
public class HeightOfTree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    // Height
    public static int height(Node root) {
        if (root == null)
            return 0; // base case
        int lh = height(root.left); // height of left subtree
        int rh = height(root.right); // height of right subtree
        return Math.max(lh, rh) + 1; // take max of both sides + 1 (for root)
    }

    // Count
    public static int Count(Node root) {
        if (root == null)
            return 0;
        int leftCount = Count(root.left);
        int rightCount = Count(root.right);
        return leftCount + rightCount + 1; // +1 for current node
    }
   // Sum of Nodes
    public static int SumNodes(Node root){
           if (root == null)
            return 0;
            int leftSum = SumNodes(root.left);
            int rightSum = SumNodes(root.right);
            return leftSum + rightSum + root.data;

    }
    public static void main(String[] args) {
        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         * 
         * 
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(height(root));
        System.out.println(Count(root));
        System.out.println(SumNodes(root));

    }
}
