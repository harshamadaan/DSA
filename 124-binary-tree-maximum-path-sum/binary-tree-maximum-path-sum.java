/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int res=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        solve(root);
        return res;
        
    }
    private int solve(TreeNode root){
        //bc
        if(root==null) return 0;
        //hypothesis
        int l=solve(root.left);
        int r=solve(root.right);

        //max path through parent node
        int temp=Math.max(Math.max(l,r)+root.val,root.val);
        // max using this as root node
        int ans=Math.max(temp,l+r+root.val);
        //update
        res=Math.max(res,ans);
        return temp;
    }
}