package week2;
/*Given a binary tree, find its maximum depth.
The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class OneHundredandFour {
	public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
            else{
                int hl = maxDepth(root.left);
                int hr = maxDepth(root.right);
                return hl >= hr?hl + 1:hr + 1;
            }
            /*else if(root.left == null && root.right == null)
                return 1;
                else
                    return maxDepth(root.left)+maxDepth(root.right);*/
    }
}
