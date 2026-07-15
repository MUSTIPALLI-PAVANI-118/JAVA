# Binary Tree in Java

A **binary tree** allows each node to have at most two children. This example uses **level-order insertion**, meaning each new node is placed in the first available position from left to right.

## Code blocks used

1. Imports
2. Node structure and root
3. Insertion
4. Search
5. Deletion
6. Minimum and maximum
7. Preorder traversal
8. Inorder traversal
9. Postorder traversal
10. Level-order traversal
11. Helper method
12. Main method

## Complete Java program

```java
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {

    // ============================================================
    // BLOCK 1: NODE STRUCTURE
    // Every node stores data and references to at most two children.
    // ============================================================
    private static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Used during deletion so that we know a node's parent.
    private static class NodeWithParent {
        Node node;
        Node parent;

        NodeWithParent(Node node, Node parent) {
            this.node = node;
            this.parent = parent;
        }
    }

    // The root is the first node of the tree.
    private Node root;

    // ============================================================
    // BLOCK 2: INSERTION
    // Inserts the value at the first empty position in level order.
    // ============================================================
    public void insert(int value) {
        Node newNode = new Node(value);

        // If the tree is empty, the new node becomes the root.
        if (root == null) {
            root = newNode;
            return;
        }

        // A queue performs breadth-first or level-order processing.
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            // Fill the left position before the right position.
            if (current.left == null) {
                current.left = newNode;
                return;
            }
            queue.offer(current.left);

            // Use the right position if the left position is occupied.
            if (current.right == null) {
                current.right = newNode;
                return;
            }
            queue.offer(current.right);
        }
    }

    // ============================================================
    // BLOCK 3: SEARCH
    // Searches every node using breadth-first search.
    // ============================================================
    public boolean search(int value) {
        if (root == null) {
            return false;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            // The required value has been found.
            if (current.data == value) {
                return true;
            }

            // Add existing children to the queue for later checking.
            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }

        return false;
    }

    // ============================================================
    // BLOCK 4: DELETION
    // Replaces the target with the deepest node and removes that node.
    // ============================================================
    public boolean delete(int value) {
        // Nothing can be deleted from an empty tree.
        if (root == null) {
            return false;
        }

        // Special case: the tree contains only the root.
        if (root.left == null && root.right == null) {
            if (root.data == value) {
                root = null;
                return true;
            }
            return false;
        }

        Queue<NodeWithParent> queue = new LinkedList<>();
        queue.offer(new NodeWithParent(root, null));

        Node target = null;
        Node deepest = null;
        Node deepestParent = null;

        // Level-order traversal finds both the target and deepest node.
        while (!queue.isEmpty()) {
            NodeWithParent item = queue.poll();
            Node current = item.node;

            // Delete the first occurrence when duplicate values exist.
            if (target == null && current.data == value) {
                target = current;
            }

            // The final processed node becomes the deepest node.
            deepest = current;
            deepestParent = item.parent;

            if (current.left != null) {
                queue.offer(new NodeWithParent(current.left, current));
            }
            if (current.right != null) {
                queue.offer(new NodeWithParent(current.right, current));
            }
        }

        // The requested value does not exist.
        if (target == null) {
            return false;
        }

        // Copy the deepest value into the target node.
        target.data = deepest.data;

        // Disconnect the deepest node from its parent.
        if (deepestParent.left == deepest) {
            deepestParent.left = null;
        } else {
            deepestParent.right = null;
        }

        return true;
    }

    // ============================================================
    // BLOCK 5: FIND MINIMUM
    // A normal binary tree is unordered, so every node is checked.
    // ============================================================
    public int findMinimum() {
        ensureNotEmpty();
        int minimum = Integer.MAX_VALUE;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            minimum = Math.min(minimum, current.data);

            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }

        return minimum;
    }

    // ============================================================
    // BLOCK 6: FIND MAXIMUM
    // A normal binary tree is unordered, so every node is checked.
    // ============================================================
    public int findMaximum() {
        ensureNotEmpty();
        int maximum = Integer.MIN_VALUE;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            maximum = Math.max(maximum, current.data);

            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }

        return maximum;
    }

    // ============================================================
    // BLOCK 7: PREORDER TRAVERSAL
    // Order: Root -> Left -> Right
    // ============================================================
    public List<Integer> preorderTraversal() {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    private void preorder(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }

        result.add(node.data);          // Visit root.
        preorder(node.left, result);   // Visit left subtree.
        preorder(node.right, result);  // Visit right subtree.
    }

    // ============================================================
    // BLOCK 8: INORDER TRAVERSAL
    // Order: Left -> Root -> Right
    // ============================================================
    public List<Integer> inorderTraversal() {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }

        inorder(node.left, result);    // Visit left subtree.
        result.add(node.data);          // Visit root.
        inorder(node.right, result);   // Visit right subtree.
    }

    // ============================================================
    // BLOCK 9: POSTORDER TRAVERSAL
    // Order: Left -> Right -> Root
    // ============================================================
    public List<Integer> postorderTraversal() {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    private void postorder(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }

        postorder(node.left, result);   // Visit left subtree.
        postorder(node.right, result);  // Visit right subtree.
        result.add(node.data);           // Visit root.
    }

    // ============================================================
    // BLOCK 10: LEVEL-ORDER TRAVERSAL
    // Visits nodes level by level from left to right.
    // ============================================================
    public List<Integer> levelOrderTraversal() {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            result.add(current.data);

            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }

        return result;
    }

    // ============================================================
    // BLOCK 11: HELPER METHOD
    // Prevents minimum or maximum operations on an empty tree.
    // ============================================================
    private void ensureNotEmpty() {
        if (root == null) {
            throw new IllegalStateException("The tree is empty.");
        }
    }

    // ============================================================
    // BLOCK 12: MAIN METHOD
    // Demonstrates every operation.
    // ============================================================
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] values = {10, 20, 30, 40, 50, 60, 70};

        // Insert all sample values.
        for (int value : values) {
            tree.insert(value);
        }

        // Display all traversals.
        System.out.println("Level order: " + tree.levelOrderTraversal());
        System.out.println("Preorder: " + tree.preorderTraversal());
        System.out.println("Inorder: " + tree.inorderTraversal());
        System.out.println("Postorder: " + tree.postorderTraversal());

        // Test search, minimum and maximum.
        System.out.println("Search 50: " + tree.search(50));
        System.out.println("Minimum: " + tree.findMinimum());
        System.out.println("Maximum: " + tree.findMaximum());

        // Delete a value and display the updated tree.
        tree.delete(20);
        System.out.println("After deleting 20: " + tree.levelOrderTraversal());
    }
}
```

## Compile and run

Save the code as `BinaryTree.java`:

```bash
javac BinaryTree.java
java BinaryTree
```
