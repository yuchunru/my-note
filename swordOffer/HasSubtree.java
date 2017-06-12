package test;

public class HasSubtree {

	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		boolean r = false;
		if (root2 != null && root1 != null) {
			if (root1.val == root2.val) {
				r = isSame(root1, root2);
			}
			if (!r) {
				r = HasSubtree(root1.left, root2);
			}
			if (!r) {
				r = HasSubtree(root1.right, root2);
			}
		}
		return r;
		
	}
	
	
	public boolean isSame(TreeNode root1, TreeNode root2){
		
		if (root2 == null) {
			return true;
		}else if (root1 == null && root2 != null) {
			return false;
		
		}else if (root1.val != root2.val) {
			return false;
		}else {
			return isSame(root1.left,root2.left) && isSame(root1.right, root2.right);
		}
		
	}
}
