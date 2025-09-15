import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeB {

    static class Node {
        Node left;
        int data;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTrees {
        static int idx = -1;

        // Build tree using preorder input with -1 for nulls
        public static Node buildTree(int nodes[]) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        // Preorder Traversal (Root → Left → Right)
        public static void PreOrder(Node root) {
            if (root == null) return;
            System.out.print(root.data + " ");
            PreOrder(root.left);
            PreOrder(root.right);
        }

        // Inorder Traversal (Left → Root → Right)
        public static void InOrder(Node root) {
            if (root == null) return;
            InOrder(root.left);
            System.out.print(root.data + " ");
            InOrder(root.right);
        }

        // Postorder Traversal (Left → Right → Root)
        public static void PostOrder(Node root) {
            if (root == null) return;
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data + " ");
        }

        // Level Order Traversal (BFS)
        public static void levelOrder(Node root) {
            if (root == null) return;

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null); // Marker for end of level

            while (!q.isEmpty()) {
                Node currNode = q.remove();

                if (currNode == null) {
                    System.out.println(); // new line after each level
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) q.add(currNode.left);
                    if (currNode.right != null) q.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Preorder input with -1 for null children
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        Node root = BinaryTrees.buildTree(nodes);

        System.out.println("Preorder Traversal:");
        BinaryTrees.PreOrder(root);
        System.out.println("\n\nInorder Traversal:");
        BinaryTrees.InOrder(root);
        System.out.println("\n\nPostorder Traversal:");
        BinaryTrees.PostOrder(root);
        System.out.println("\n\nLevel Order Traversal:");
        BinaryTrees.levelOrder(root);
    }
}
