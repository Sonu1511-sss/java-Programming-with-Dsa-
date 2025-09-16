import java.util.Queue;

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
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    // Count nodes
    public static int Count(Node root) {
        if (root == null)
            return 0;
        return Count(root.left) + Count(root.right) + 1;
    }

    // Sum of nodes
    public static int SumNodes(Node root) {
        if (root == null)
            return 0;
        return SumNodes(root.left) + SumNodes(root.right) + root.data;
    }

    // Diameter (O(n^2) approach)
    public static int Diameter(Node root) {
        if (root == null)
            return 0;

        int leftDia = Diameter(root.left);
        int rightDia = Diameter(root.right);

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int selfDia = leftHeight + rightHeight + 1;

        return Math.max(selfDia, Math.max(leftDia, rightDia));
    }

    // Optimized Diameter (O(n) approach)
    static class Info {
        int diam, ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root) {
        if (root == null)
            return new Info(0, 0);

        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int selfDia = leftInfo.ht + rightInfo.ht + 1;
        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), selfDia);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }


   
    public static void main(String[] args) {
        /*
         *         1
         *       /   \
         *      2     3
         *     / \   / \
         *    4   5 6   7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Height: " + height(root));
        System.out.println("Count: " + Count(root));
        System.out.println("Sum of Nodes: " + SumNodes(root));
        System.out.println("Diameter (O(n^2)): " + Diameter(root));
        System.out.println("Diameter (O(n)): " + diameter(root).diam);
    }
}
