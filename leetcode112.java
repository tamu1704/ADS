import java.util.LinkedList;
import java.util.Queue;

class Node { 
    int val;
    Node left, right;
    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
    Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class leetcode112 {
    public boolean result(Node root, int k) {
        if (root == null) return false;

        Queue<Node> a = new LinkedList<>();
        Queue<Integer> b = new LinkedList<>();
        a.offer(root);
        b.offer(k - root.val);

        while (!a.isEmpty()) {
            Node node = a.poll();
            int currSum = b.poll();
            if (node.left == null && node.right == null && currSum == 0) {
                return true;
            }

            if (node.left != null) {
                a.offer(node.left);
                b.offer(currSum - node.left.val);
            }

            if (node.right != null) {
                a.offer(node.right);
                b.offer(currSum - node.right.val);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        leetcode112 obj = new leetcode112();

        Node root2 = new Node(1, new Node(2), new Node(3));
        System.out.println(obj.result(root2, 5));

        Node root3 = null;
        System.out.println(obj.result(root3, 0));

        Node root1 = new Node(5,
            new Node(4, new Node(11, new Node(7), new Node(2)), null),
            new Node(8, new Node(13), new Node(4, null, new Node(1)))
        );
        System.out.println(obj.result(root1, 22)); 
    }
}
