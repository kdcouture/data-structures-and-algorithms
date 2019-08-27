package tree.utilities;

import tree.BinaryTree;
import tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class FizBuzTree {
    public static BinaryTree FizBuz(BinaryTree<Object> tree) {
        Queue<TreeNode> levelQueue = new LinkedList<>();
        TreeNode cur;
        levelQueue.add(tree.getRoot());
        while(!levelQueue.isEmpty()) {
            // Remove front of levelQueue
            cur = levelQueue.remove();
            // Add children to queue, ensuring we hit every element.
            if(cur.getLeft() != null) {
                levelQueue.add(cur.getLeft());
            }
            if(cur.getRight() != null) {
                levelQueue.add(cur.getRight());
            }
            // Handle the current nodes data
            String fizBuz = "";
            if((int)cur.getData() % 3 == 0) {
                fizBuz += "Fizz";
            }
            if((int)cur.getData() % 5 == 0) {
                fizBuz += "Buzz";
            }
            if(!fizBuz.equals("")) {
                cur.setData(fizBuz);
            }
        }
        return tree;
    }
}
