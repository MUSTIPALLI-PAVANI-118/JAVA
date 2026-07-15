# Perfect Binary Tree in Java

A **perfect binary tree** has every internal node with exactly two children and all leaves at the same level. A perfect tree with height `h` contains `2^(h + 1) - 1` nodes.

A single arbitrary insertion or deletion would usually break perfection. Therefore:

- The first root is inserted alone.
- Every later insertion adds an entire level.
- Deletion removes the entire deepest level.

## Code blocks used

1. Storage
2. Root insertion
3. Whole-level insertion
4. Search
5. Structure-preserving deletion
6. Minimum and maximum
7. All traversals
8. Perfect-tree validation
9. Height and helpers
10. Main method

## Complete Java program

```java
import java.util.ArrayList;
import java.util.List;

public class PerfectBinaryTree {

    // ============================================================
    // BLOCK 1: ARRAY-BASED STORAGE
    // A perfect tree is also complete, so array storage works well.
    // ============================================================
    private final List<Integer> nodes = new ArrayList<>();

    // ============================================================
    // BLOCK 2: INSERT ROOT
    // A one-value insertion is allowed only when the tree is empty.
    // ============================================================
    public void insert(int value) {
        if (!nodes.isEmpty()) {
            throw new IllegalStateException(
                    "A perfect tree must grow by a complete level. "
                            + "Use insertLevel(...)."
            );
        }

        nodes.add(value);
    }

    // ============================================================
    // BLOCK 3: INSERT AN ENTIRE NEW LEVEL
    // If the tree has n nodes, its next level requires n + 1 values.
    // Examples: 1 existing node -> add 2; 3 -> add 4; 7 -> add 8.
    // ============================================================
    public void insertLevel(int... values) {
        int requiredValues = nodes.size() + 1;

        if (values.length != requiredValues) {
            throw new IllegalArgumentException(
                    "Expected " + requiredValues
                            + " values for the next level, but received "
                            + values.length + "."
            );
        }

        // Appending every value completes the entire new level.
        for (int value : values) {
            nodes.add(value);
        }
    }

    // ============================================================
    // BLOCK 4: SEARCH
    // Values are not ordered, so the array is searched linearly.
    // ============================================================
    public boolean search(int value) {
        return nodes.contains(value);
    }

    // ============================================================
    // BLOCK 5: DELETE BY VALUE
    // Arbitrary deletion is valid only for a one-node perfect tree.
    // ============================================================
    public boolean delete(int value) {
        if (nodes.isEmpty()) {
            return false;
        }

        if (nodes.size() == 1) {
            if (nodes.get(0) == value) {
                nodes.clear();
                return true;
            }
            return false;
        }

        throw new UnsupportedOperationException(
                "Deleting one arbitrary node breaks perfection. "
                        + "Use deleteLastLevel()."
        );
    }

    // ============================================================
    // BLOCK 6: DELETE THE ENTIRE LAST LEVEL
    // Removing all deepest leaves preserves the perfect-tree property.
    // ============================================================
    public boolean deleteLastLevel() {
        if (nodes.isEmpty()) {
            return false;
        }

        // In a perfect tree, half of (node count + 1) are leaves.
        int leafCount = (nodes.size() + 1) / 2;
        int newSize = nodes.size() - leafCount;

        // Remove deepest-level values from right to left.
        while (nodes.size() > newSize) {
            nodes.remove(nodes.size() - 1);
        }

        return true;
    }

    // ============================================================
    // BLOCK 7: FIND MINIMUM
    // Every value must be checked because values are unordered.
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
    // BLOCK 8: FIND MAXIMUM
    // Every value must be checked because values are unordered.
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
    // BLOCK 9: PREORDER TRAVERSAL
    // Order: Root -> Left -> Right
    // ============================================================
    public List<Integer> preorderTraversal() {
        List<Integer> result = new ArrayList<>();
        preorder(0, result);
        return result;
    }

    private void preorder(int index, List<Integer> result) {
        if (index >= nodes.size()) {
            return;
        }

        result.add(nodes.get(index));
        preorder(2 * index + 1, result);
        preorder(2 * index + 2, result);
    }

    // ============================================================
    // BLOCK 10: INORDER TRAVERSAL
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

        inorder(2 * index + 1, result);
        result.add(nodes.get(index));
        inorder(2 * index + 2, result);
    }

    // ============================================================
    // BLOCK 11: POSTORDER TRAVERSAL
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

        postorder(2 * index + 1, result);
        postorder(2 * index + 2, result);
        result.add(nodes.get(index));
    }

    // ============================================================
    // BLOCK 12: LEVEL-ORDER TRAVERSAL
    // The array is already arranged in level order.
    // ============================================================
    public List<Integer> levelOrderTraversal() {
        return new ArrayList<>(nodes);
    }

    // ============================================================
    // BLOCK 13: CHECK WHETHER THE TREE IS PERFECT
    // A perfect tree has 2^k - 1 nodes, so nodeCount + 1 is a power of 2.
    // ============================================================
    public boolean isPerfect() {
        int nodeCountPlusOne = nodes.size() + 1;

        // A positive power of two has only one set bit.
        return (nodeCountPlusOne & (nodeCountPlusOne - 1)) == 0;
    }

    // ============================================================
    // BLOCK 14: HEIGHT
    // Empty tree height = -1; root-only tree height = 0.
    // ============================================================
    public int height() {
        if (nodes.isEmpty()) {
            return -1;
        }

        int height = -1;
        int nodeCountPlusOne = nodes.size() + 1;

        // Repeated division by 2 calculates log2(nodeCount + 1) - 1.
        while (nodeCountPlusOne > 1) {
            nodeCountPlusOne /= 2;
            height++;
        }

        return height;
    }

    // ============================================================
    // BLOCK 15: HELPER METHOD
    // ============================================================
    private void ensureNotEmpty() {
        if (nodes.isEmpty()) {
            throw new IllegalStateException("The tree is empty.");
        }
    }

    // ============================================================
    // BLOCK 16: MAIN METHOD
    // Demonstrates every supported operation.
    // ============================================================
    public static void main(String[] args) {
        PerfectBinaryTree tree = new PerfectBinaryTree();

        // Build three complete levels.
        tree.insert(10);                    // Level 0: 1 value
        tree.insertLevel(20, 30);           // Level 1: 2 values
        tree.insertLevel(40, 50, 60, 70);   // Level 2: 4 values

        // Display traversals and other operations.
        System.out.println("Level order: " + tree.levelOrderTraversal());
        System.out.println("Preorder: " + tree.preorderTraversal());
        System.out.println("Inorder: " + tree.inorderTraversal());
        System.out.println("Postorder: " + tree.postorderTraversal());
        System.out.println("Search 60: " + tree.search(60));
        System.out.println("Minimum: " + tree.findMinimum());
        System.out.println("Maximum: " + tree.findMaximum());
        System.out.println("Height: " + tree.height());
        System.out.println("Is perfect: " + tree.isPerfect());

        // Remove all nodes from the deepest level.
        tree.deleteLastLevel();
        System.out.println("After deleting the last level: "
                + tree.levelOrderTraversal());
        System.out.println("Is perfect: " + tree.isPerfect());
    }
}
```

## Important insertion and deletion rules

A perfect tree cannot normally accept one arbitrary new node or lose one arbitrary node. Use `insertLevel(...)` to add a complete level and `deleteLastLevel()` to remove a complete level.

## Compile and run

Save the code as `PerfectBinaryTree.java`:

```bash
javac PerfectBinaryTree.java
java PerfectBinaryTree
```
