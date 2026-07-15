# Binary Search Tree in Java

A **binary search tree (BST)** follows this ordering rule:

- Every value in the left subtree is smaller than the node.
- Every value in the right subtree is larger than the node.

This implementation ignores duplicate insertions.

## Code blocks used

1. Imports
2. Node structure and root
3. Insertion
4. Search
5. Deletion and its three cases
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

public class BinarySearchTree {

    // ============================================================
    // BLOCK 1: NODE STRUCTURE
    // Left values are smaller and right values are larger.
    // ============================================================
    private static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    // ============================================================
    // BLOCK 2: INSERTION
    // Recursively finds the correct ordered position for the value.
    // ============================================================
    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        // An empty position is the correct insertion point.
        if (node == null) {
            return new Node(value);
        }

        if (value < node.data) {
            // Smaller values move into the left subtree.
            node.left = insert(node.left, value);
        } else if (value > node.data) {
            // Larger values move into the right subtree.
            node.right = insert(node.right, value);
        }
        // Equal values are duplicates and are ignored.

        return node;
    }

    // ============================================================
    // BLOCK 3: SEARCH
    // Uses BST ordering, so only one path is followed.
    // ============================================================
    public boolean search(int value) {
        Node current = root;

        while (current != null) {
            if (value == current.data) {
                return true;
            }

            // Choose the only subtree that can contain the value.
            if (value < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return false;
    }

    // ============================================================
    // BLOCK 4: DELETE PUBLIC METHOD
    // Returns false when the requested value is absent.
    // ============================================================
    public boolean delete(int value) {
        if (!search(value)) {
            return false;
        }

        root = delete(root, value);
        return true;
    }

    // ============================================================
    // BLOCK 5: DELETE RECURSIVE METHOD
    // Handles leaf, one-child and two-child deletion cases.
    // ============================================================
    private Node delete(Node node, int value) {
        if (node == null) {
            return null;
        }

        if (value < node.data) {
            // The target can only exist in the left subtree.
            node.left = delete(node.left, value);
        } else if (value > node.data) {
            // The target can only exist in the right subtree.
            node.right = delete(node.right, value);
        } else {
            // The target node has been found.

            // CASE 1: No left child.
            // This includes a leaf and a node with only a right child.
            if (node.left == null) {
                return node.right;
            }

            // CASE 2: No right child.
            // The node has only a left child.
            if (node.right == null) {
                return node.left;
            }

            // CASE 3: Two children.
            // Use the smallest value in the right subtree.
            Node successor = minimumNode(node.right);

            // Copy the inorder successor's value into this node.
            node.data = successor.data;

            // Remove the duplicate successor from the right subtree.
            node.right = delete(node.right, successor.data);
        }

        return node;
    }

    // ============================================================
    // BLOCK 6: FIND MINIMUM
    // The minimum BST value is the leftmost node.
    // ============================================================
    public int findMinimum() {
        ensureNotEmpty();
        return minimumNode(root).data;
    }

    private Node minimumNode(Node node) {
        Node current = node;

        while (current.left != null) {
            current = current.left;
        }

        return current;
    }

    // ============================================================
    // BLOCK 7: FIND MAXIMUM
    // The maximum BST value is the rightmost node.
    // ============================================================
    public int findMaximum() {
        ensureNotEmpty();
        Node current = root;

        while (current.right != null) {
            current = current.right;
        }

        return current.data;
    }

    // ============================================================
    // BLOCK 8: PREORDER TRAVERSAL
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

        result.add(node.data);
        preorder(node.left, result);
        preorder(node.right, result);
    }

    // ============================================================
    // BLOCK 9: INORDER TRAVERSAL
    // Order: Left -> Root -> Right
    // For a BST, this produces values in ascending order.
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

        inorder(node.left, result);
        result.add(node.data);
        inorder(node.right, result);
    }

    // ============================================================
    // BLOCK 10: POSTORDER TRAVERSAL
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

        postorder(node.left, result);
        postorder(node.right, result);
        result.add(node.data);
    }

    // ============================================================
    // BLOCK 11: LEVEL-ORDER TRAVERSAL
    // Uses a queue to visit the tree one level at a time.
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
    // BLOCK 12: HELPER METHOD
    // ============================================================
    private void ensureNotEmpty() {
        if (root == null) {
            throw new IllegalStateException("The tree is empty.");
        }
    }

    // ============================================================
    // BLOCK 13: MAIN METHOD
    // Demonstrates all operations and all deletion cases.
    // ============================================================
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int[] values = {50, 30, 70, 20, 40, 60, 80};

        // Build the BST.
        for (int value : values) {
            tree.insert(value);
        }

        // Display traversals and basic operations.
        System.out.println("Level order: " + tree.levelOrderTraversal());
        System.out.println("Preorder: " + tree.preorderTraversal());
        System.out.println("Inorder: " + tree.inorderTraversal());
        System.out.println("Postorder: " + tree.postorderTraversal());
        System.out.println("Search 60: " + tree.search(60));
        System.out.println("Minimum: " + tree.findMinimum());
        System.out.println("Maximum: " + tree.findMaximum());

        // Demonstrate the three deletion situations.
        tree.delete(20); // Delete a leaf node.
        tree.delete(30); // Delete a node with one child after removing 20.
        tree.delete(50); // Delete a node with two children.

        System.out.println("After deletions: "
                + tree.levelOrderTraversal());
        System.out.println("Sorted inorder: "
                + tree.inorderTraversal());
    }
}
```

## Compile and run

Save the code as `BinarySearchTree.java`:

```bash
javac BinarySearchTree.java
java BinarySearchTree
```
