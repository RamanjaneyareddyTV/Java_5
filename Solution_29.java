import java.util.*;
public class Solution_29 {  
   public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        a.left = new TreeNode(2);
        a.right = new TreeNode(3);
        a.left.left = new TreeNode(4);
		
		TreeNode b = new TreeNode(1);
        b.left = new TreeNode(2);
        b.right = new TreeNode(3);
        b.left.right = new TreeNode(4);
				
		TreeNode c = new TreeNode(1);
        c.left = new TreeNode(2);
        c.right = new TreeNode(3);
        c.left.right = new TreeNode(4);
		
        System.out.println("\nComparing TreeNode a and TreeNode b:");
        System.out.println(is_Identical_tree_node(a, b));
		System.out.println("\nComparing TreeNode b and TreeNode c:");
		System.out.println(is_Identical_tree_node(b, c));
    }

    public static boolean is_Identical_tree_node(TreeNode a, TreeNode b) {
        // Write your code here
        if (a == null && b == null) return true;
        if (a == null || b == null) {
            return false;
        }
        if (a.val != b.val) return false;
        return is_Identical_tree_node(a.left, b.left) &&
                is_Identical_tree_node(a.right, b.right);
    }
}
class TreeNode {
    public int val;
    public TreeNode left, right;
    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

