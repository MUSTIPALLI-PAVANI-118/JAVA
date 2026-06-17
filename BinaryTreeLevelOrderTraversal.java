import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) return;
        String[] values = new String[n];
        for (int i = 0; i < n; i++) values[i] = sc.next();
        if (values[0].equals("N")) return;

        // Build the tree from level-order tokens.
        Node root = new Node(Integer.parseInt(values[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int index = 1;
        while (!queue.isEmpty() && index < n) {
            Node current = queue.poll();
            if (index < n && !values[index].equals("N")) {
                current.left = new Node(Integer.parseInt(values[index]));
                queue.add(current.left);
            }
            index++;
            if (index < n && !values[index].equals("N")) {
                current.right = new Node(Integer.parseInt(values[index]));
                queue.add(current.right);
            }
            index++;
        }

        // Traverse level by level.
        ArrayList<Integer> result = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            result.add(current.data);
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }

        // Print traversal.
        for (int i = 0; i < result.size(); i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(result.get(i));
        }
    }
}

