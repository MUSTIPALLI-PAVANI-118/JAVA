# Full Binary Tree in Java

A **full binary tree** is a tree in which every node has either **zero children** or **exactly two children**. To preserve this property, the program inserts two children together and deletes two leaf siblings together.

## Code blocks used

1. Imports
2. Node structures and root
3. Root insertion
4. Child-pair insertion
5. Search
6. Structure-preserving deletion
7. Minimum and maximum
8. Full-tree validation
9. All traversals
10. Helper methods
11. Main method

## Complete Java program

```java
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FullBinaryTree {

    // ============================================================
    // BLOCK 1: NODE STRUCTURE
    // A node in a full tree must finally have either 0 or 2 children.
    // ============================================================
    private static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Stores a node together with its parent for deletion.
    private static class NodeWithParent {
        Node node;
        Node parent;

        NodeWithParent(Node node, Node parent) {
            this.node = node;
            this.parent = parent;
        }
    }

    private Node root;

    // ============================================================
    // BLOCK 2: INSERT ROOT
    // The first value creates the single-node full binary tree.
    // ============================================================
    public boolean insertRoot(int value) {
        // A root already exists, so another root cannot be inserted.
        if (root != null) {
            return false;
        }

        root = new Node(value);
        return true;
    }

    // ============================================================
    // BLOCK 3: INSERT TWO CHILDREN
    // Both children are added together to preserve fullness.
    // ============================================================
    public boolean insert(int parentValue, int leftValue, int rightValue) {
        Node parent = findNode(parentValue);

        // The parent must exist and must currently be a leaf.
        if (parent == null || parent.left != null || parent.right != null) {
            return false;
        }

        parent.left = new Node(leftValue);
        parent.right = new Node(rightValue);
        return true;
    }

    // ============================================================
    // BLOCK 4: SEARCH
    // Uses level-order search because this tree has no value ordering.
    // ============================================================
    public boolean search(int value) {
        return findNode(value) != null;
    }

    private Node findNode(int value) {
        if (root == null) {
            return null;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.data == value) {
                return current;
            }

            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }

        return null;
    }

    // ============================================================
    // BLOCK 5: DELETE A LEAF PAIR
    // Deleting only one child would violate the full-tree property.
    // Therefore, the target leaf and its leaf sibling are both removed.
    // ============================================================
    public boolean delete(int value) {
        if (root == null) {
            return false;
        }

        // A single root is already a valid full tree.
        if (isLeaf(root)) {
            if (root.data == value) {
                root = null;
                return true;
            }
            return false;
        }

        NodeWithParent target = findNodeWithParent(value);

        // Only a non-root leaf can be removed using this operation.
        if (target == null || target.parent == null || !isLeaf(target.node)) {
            return false;
        }

        // Locate the target node's sibling.
        Node sibling = target.parent.left == target.node
                ? target.parent.right
                : target.parent.left;

        // Both children must be leaves before removing the pair.
        if (sibling == null || !isLeaf(sibling)) {
            return false;
        }

        target.parent.left = null;
        target.parent.right = null;
        return true;
    }

    private NodeWithParent findNodeWithParent(int value) {
        Queue<NodeWithParent> queue = new LinkedList<>();
        queue.offer(new NodeWithParent(root, null));

        while (!queue.isEmpty()) {
            NodeWithParent current = queue.poll();

            if (current.node.data == value) {
                return current;
            }

            if (current.node.left != null) {
                queue.offer(new NodeWithParent(current.node.left, current.node));
            }
            if (current.node.right != null) {
                queue.offer(new NodeWithParent(current.node.right, current.node));
            }
        }

        return null;
    }

    // ============================================================
    // BLOCK 6: FIND MINIMUM
    // The values are unordered, so every node must be checked.
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
    // BLOCK 7: FIND MAXIMUM
    // The values are unordered, so every node must be checked.
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
    // BLOCK 8: CHECK WHETHER THE TREE IS FULL
    // Every node must have either no children or both children.
    // ============================================================
    public boolean isFull() {
        return isFull(root);
    }

    private boolean isFull(Node node) {
        // An empty tree or a leaf satisfies the full-tree rule.
        if (node == null || isLeaf(node)) {
            return true;
        }

        // Exactly one child means the tree is not full.
        if (node.left == null || node.right == null) {
            return false;
        }

        // Both subtrees must also be full.
        return isFull(node.left) && isFull(node.right);
    }

    // ============================================================
    // BLOCK 9: PREORDER TRAVERSAL
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
    // BLOCK 10: INORDER TRAVERSAL
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

        inorder(node.left, result);
        result.add(node.data);
        inorder(node.right, result);
    }

    // ============================================================
    // BLOCK 11: POSTORDER TRAVERSAL
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
    // BLOCK 12: LEVEL-ORDER TRAVERSAL
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
    // BLOCK 13: HELPER METHODS
    // ============================================================
    private boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }

    private void ensureNotEmpty() {
        if (root == null) {
            throw new IllegalStateException("The tree is empty.");
        }
    }

    // ============================================================
    // BLOCK 14: MAIN METHOD
    // Demonstrates insertion, search, min/max, traversals and deletion.
    // ============================================================
    public static void main(String[] args) {
        FullBinaryTree tree = new FullBinaryTree();

        // Build a full binary tree.
        tree.insertRoot(10);
        tree.insert(10, 20, 30);
        tree.insert(20, 40, 50);
        tree.insert(30, 60, 70);

        // Display traversals and other operations.
        System.out.println("Level order: " + tree.levelOrderTraversal());
        System.out.println("Preorder: " + tree.preorderTraversal());
        System.out.println("Inorder: " + tree.inorderTraversal());
        System.out.println("Postorder: " + tree.postorderTraversal());
        System.out.println("Search 60: " + tree.search(60));
        System.out.println("Minimum: " + tree.findMinimum());
        System.out.println("Maximum: " + tree.findMaximum());
        System.out.println("Is full: " + tree.isFull());

        // Deleting 40 also deletes its leaf sibling 50.
        tree.delete(40);
        System.out.println("After deleting the leaf pair: "
                + tree.levelOrderTraversal());
        System.out.println("Is full: " + tree.isFull());
    }
}
```

## Important deletion rule

`delete(value)` succeeds only when the selected value is a leaf whose sibling is also a leaf. Both siblings are removed so their parent returns to having zero children.

## Compile and run

Save the code as `FullBinaryTree.java`:

```bash
javac FullBinaryTree.java
java FullBinaryTree
```
