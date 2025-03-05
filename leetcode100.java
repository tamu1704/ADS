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

public class leetcode100 {
    public boolean isSameTree(Node p, Node q) {
        Queue<Node> a = new LinkedList<>();
        a.offer(p);
        a.offer(q);

        while (!a.isEmpty()) {
            Node node1 = a.poll();
            Node node2 = a.poll();

            if (node1 == null && node2 == null) continue;
            if (node1 == null || node2 == null || node1.val != node2.val) return false;

            a.offer(node1.left);
            a.offer(node2.left);
            a.offer(node1.right);
            a.offer(node2.right);
        }

        return true;
    }

    public static void main(String[] args) {
        leetcode100 obj = new leetcode100();

        Node tree5 = new Node(1, new Node(2), new Node(1));
        Node tree6 = new Node(1, new Node(1), new Node(2));
        System.out.println(obj.isSameTree(tree5, tree6));

        Node tree1 = new Node(1, new Node(2), new Node(3));
        Node tree2 = new Node(1, new Node(2), new Node(3));
        System.out.println(obj.isSameTree(tree1, tree2));
    }
}
