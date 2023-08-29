class TreeNode {
    String key;
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(String key, int value) {
        this.key = key;
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BST {
    TreeNode root;

    public void insert(String key, int value) {
        root = insertRecursive(root, key, value);
    }

    private TreeNode insertRecursive(TreeNode current, String key, int value) {
        if (current == null) {
            return new TreeNode(key, value);
        }
        if (key.compareTo(current.key) < 0) {
            current.left = insertRecursive(current.left, key, value);
        } else if (key.compareTo(current.key) > 0) {
            current.right = insertRecursive(current.right, key, value);
        }
        return current;
    }

    public Integer search(String key) {
        return searchRecursive(root, key);
    }

    private Integer searchRecursive(TreeNode current, String key) {
        if (current == null || current.key.equals(key)) {
            return current != null ? current.value : null;
        }
        if (key.compareTo(current.key) < 0) {
            return searchRecursive(current.left, key);
        }
        return searchRecursive(current.right, key);
    }
}

public class BinarySearchTree {
    public static void main(String[] args) {
        BST symbolTable = new BST();
        symbolTable.insert("variable1", 42);
        symbolTable.insert("variable2", 78);
        symbolTable.insert("variable3", 123);

        System.out.println(symbolTable.search("variable1")); // Output: 42
        System.out.println(symbolTable.search("variable2")); // Output: 78
        System.out.println(symbolTable.search("variable3")); // Output: 123
        System.out.println(symbolTable.search("nonexistent")); // Output: null
    }
}
