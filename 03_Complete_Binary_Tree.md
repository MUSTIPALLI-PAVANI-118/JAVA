# Complete Binary Tree in Java

A **complete binary tree** has every level completely filled except possibly the last level, which is filled from left to right. An array-based representation naturally preserves this shape.

For a node at index `i`:

- Left child index: `2 * i + 1`
- Right child index: `2 * i + 2`
- Parent index: `(i - 1) / 2`

## Code blocks used

1. Storage
2. Insertion
3. Search
4. Deletion
5. Minimum and maximum
6. Preorder traversal
7. Inorder traversal
8. Postorder traversal
9. Level-order traversal
10. Validation and helpers
11. Main method

## Complete Java program

```java
import java.util.ArrayList;
import java.util.List;

public class CompleteBinaryTree {

    // ============================================================
    // BLOCK 1: ARRAY-BASED STORAGE
    // Array positions automatically represent a complete tree.
    // ============================================================
    private final List<Integer> nodes = new ArrayList<>();

    // ============================================================
    // BLOCK 2: INSERTION
    // Adding at the end fills the last level from left to right.
    // ============================================================
    public void insert(int value) {
        nodes.add(value);
    }

    // ============================================================
    // BLOCK 3: SEARCH
    // The tree has no value-ordering rule, so search is linear.
    // ============================================================
    public boolean search(int value) {
        return nodes.contains(value);
    }

    // ============================================================
    // BLOCK 4: DELETION
    // Replace the target with the last value, then remove the last slot.
    // This keeps all array positions continuous and the tree complete.
    // ============================================================
    public boolean delete(int value) {
        // Find the first occurrence of the requested value.
        int targetIndex = nodes.indexOf(value);

        if (targetIndex == -1) {
            return false;
        }

        int lastIndex = nodes.size() - 1;

        // Move the deepest/rightmost value into the target position.
        nodes.set(targetIndex, nodes.get(lastIndex));

        // Remove the old deepest/rightmost position.
        nodes.remove(lastIndex);
        return true;
    }

    // ============================================================
    // BLOCK 5: FIND MINIMUM
    // All stored values must be checked because they are unordered.
    // ============================================================
    public int findMinimum() {
        ensureNotEmpty();
        int minimum = nodes.get(0);

        for (int value : nodes) {
            minimum = Math.min(minimum, value);
        }

        return minimum;
    }

    // ============================================================
    // BLOCK 6: FIND MAXIMUM
    // All stored values must be checked because they are unordered.
    // ============================================================
    public int findMaximum() {
        ensureNotEmpty();
        int maximum = nodes.get(0);

        for (int value : nodes) {
            maximum = Math.max(maximum, value);
        }

        return maximum;
    }

    // ============================================================
    // BLOCK 7: PREORDER TRAVERSAL
    // Order: Root -> Left -> Right
    // ============================================================
    public List<Integer> preorderTraversal() {
        List<Integer> result = new ArrayList<>();
        preorder(0, result); // Root is stored at index 0.
        return result;
    }

    private void preorder(int index, List<Integer> result) {
        // Stop when the calculated index is outside the array.
        if (index >= nodes.size()) {
            return;
        }

        result.add(nodes.get(index));             // Visit root.
        preorder(2 * index + 1, result);         // Visit left child.
        preorder(2 * index + 2, result);         // Visit right child.
    }

    // ============================================================
    // BLOCK 8: INORDER TRAVERSAL
    // Order: Left -> Root -> Right
    // ============================================================
    public List<Integer> inorderTraversal() {
        List<Integer> result = new ArrayList<>();
        inorder(0, result);
        return result;
    }

    private void inorder(int index, List<Integer> result) {
        if (index >= nodes.size()) {
            return;
        }

        inorder(2 * index + 1, result);          // Visit left child.
        result.add(nodes.get(index));             // Visit root.
        inorder(2 * index + 2, result);          // Visit right child.
    }

    // ============================================================
    // BLOCK 9: POSTORDER TRAVERSAL
    // Order: Left -> Right -> Root
    // ============================================================
    public List<Integer> postorderTraversal() {
        List<Integer> result = new ArrayList<>();
        postorder(0, result);
        return result;
    }

    private void postorder(int index, List<Integer> result) {
        if (index >= nodes.size()) {
            return;
        }

        postorder(2 * index + 1, result);        // Visit left child.
        postorder(2 * index + 2, result);        // Visit right child.
        result.add(nodes.get(index));             // Visit root.
    }

    // ============================================================
    // BLOCK 10: LEVEL-ORDER TRAVERSAL
    // The array itself is already stored in level order.
    // ============================================================
    public List<Integer> levelOrderTraversal() {
        // Return a copy so outside code cannot change the original list.
        return new ArrayList<>(nodes);
    }

    // ============================================================
    // BLOCK 11: VALIDATION AND HELPER METHODS
    // ============================================================
    public boolean isComplete() {
        // Every operation in this class preserves array continuity.
        return true;
    }

    public int size() {
        return nodes.size();
    }

    private void ensureNotEmpty() {
        if (nodes.isEmpty()) {
            throw new IllegalStateException("The tree is empty.");
        }
    }

    // ============================================================
    // BLOCK 12: MAIN METHOD
    // Demonstrates every operation.
    // ============================================================
    public static void main(String[] args) {
        CompleteBinaryTree tree = new CompleteBinaryTree();
        int[] values = {10, 20, 30, 40, 50, 60, 70, 80};

        // Insert values from left to right.
        for (int value : values) {
            tree.insert(value);
        }

        // Display traversals and other operations.
        System.out.println("Level order: " + tree.levelOrderTraversal());
        System.out.println("Preorder: " + tree.preorderTraversal());
        System.out.println("Inorder: " + tree.inorderTraversal());
        System.out.println("Postorder: " + tree.postorderTraversal());
        System.out.println("Search 60: " + tree.search(60));
        System.out.println("Minimum: " + tree.findMinimum());
        System.out.println("Maximum: " + tree.findMaximum());
        System.out.println("Size: " + tree.size());
        System.out.println("Is complete: " + tree.isComplete());

        // Delete 20 while preserving completeness.
        tree.delete(20);
        System.out.println("After deleting 20: "
                + tree.levelOrderTraversal());
    }
}
```

## Compile and run

Save the code as `CompleteBinaryTree.java`:

```bash
javac CompleteBinaryTree.java
java CompleteBinaryTree
```
