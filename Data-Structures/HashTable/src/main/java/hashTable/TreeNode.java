package hashTable;

public class TreeNode<T> {
    TreeNode left;
    TreeNode right;
    T data;

    public TreeNode(T data) {
        this.data = data;
        this.left = null;
        this. right = null;
    }

    public int compare(TreeNode toCheck) {
        return this.toString().compareTo(toCheck.toString());
    }

    public String toString() {
        return this.data.toString();
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return this.left;
    }

    public TreeNode getRight() {
        return this.right;
    }
}
