import java.util.*;
public class Solution_32 {  
   public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        a.right = new TreeNode(3);
        a.right.left = new TreeNode(2);
		a.right.right = new TreeNode(4);
		a.right.right.right = new TreeNode(5);
		a.right.right.right.right = new TreeNode(6);
		System.out.println("Length of the longest consecutive sequence path: "+longest_Consecutive(a));
    }
  public static int longest_Consecutive(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int result = diffn(root, 1) + diffn(root, -1);
        return Math.max(result, Math.max(longest_Consecutive(root.left), longest_Consecutive(root.right)));
    }
    private static int diffn(TreeNode tnode, int diff) {
        if (tnode == null) {
            return 0;
        }
        int left_depth = 0, right_depth = 0;
        // check node
        if (tnode.left != null && tnode.val - tnode.left.val == diff) {
            left_depth = diffn(tnode.left, diff) + 1;
        }
        if (tnode.right != null && tnode.val - tnode.right.val == diff) {
            right_depth = diffn(tnode.right, diff) + 1;
        }
        return Math.max(left_depth, right_depth);
    }
}

