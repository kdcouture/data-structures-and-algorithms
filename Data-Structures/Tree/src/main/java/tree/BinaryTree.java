package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    // Wraps Recursive printouts.
    public ArrayList<T> preOrder(){
        ArrayList<T> build = new ArrayList<>();
        buildPreOrder(this.root, build);
        return build;
    }

    public void buildPreOrder(TreeNode node, ArrayList build) {
        if(node != null) {
            build.add(node.data);
            buildPreOrder(node.left, build);
            buildPreOrder(node.right, build);
        }
    }

    // Wraps Recursive printouts.
    public ArrayList<T> inOrder(){
        ArrayList<T> build = new ArrayList<>();
        buildInOrder(this.root, build);
        return build;
    }

    public void buildInOrder(TreeNode node, ArrayList build) {
        if(node != null) {
            buildInOrder(node.left, build);
            build.add(node.data);
            buildInOrder(node.right, build);
        }
    }

    // Wraps Recursive printouts.
    public ArrayList<T> postOrder(){
        ArrayList<T> build = new ArrayList<>();
        buildPostOrder(this.root, build);
        return build;
    }

    public void buildPostOrder(TreeNode node, ArrayList build) {
        if(node != null) {
            buildPostOrder(node.left, build);
            buildPostOrder(node.right, build);
            build.add(node.data);
        }
    }

    public void add(T data) {
        if(this.root == null) {
            this.root = new TreeNode(data);
        }
        else {
            Queue<TreeNode> levelQueue = new LinkedList<>();
            levelQueue.add(this.root);
            TreeNode newNode = new TreeNode(data);
            TreeNode cur;
            // Look for empty spot.
            while(!levelQueue.isEmpty()) {
                cur = levelQueue.poll();
                if (cur == null) {
                    break;
                }
                else {
                    if(cur.left != null) {
                        levelQueue.add(cur.left);
                    }
                    else {
                        cur.left = newNode;
                        break;
                    }
                    if(cur.right != null) {
                        levelQueue.add(cur.right);
                    }
                    else {
                        cur.right = newNode;
                        break;
                    }
                }
            }
        }
    }

    public TreeNode getRoot() {
        return this.root;
    }
}
