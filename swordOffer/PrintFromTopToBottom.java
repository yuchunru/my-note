

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/

public class PrintFromTopToBottom {

	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if (root == null) {
			return new ArrayList<Integer>();
		}
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        ArrayList<Integer> aList = new ArrayList<Integer>();
        while (!q.isEmpty()) {
			TreeNode tNode = q.poll();
			aList.add(tNode.val);
			if (tNode.left != null) {
				q.add(tNode.left);
			}
			if (tNode.right != null) {
				q.add(tNode.right);
			}
		}
        return aList;
        
    }

    public static void main(String[] args) {
        System.err.println("");
    }
}
