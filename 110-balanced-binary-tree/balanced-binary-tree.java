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
 // balanced bt hota h jiska diff 1 ho 
class Solution {
    public int height(TreeNode root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int l=height(root.left);
        if(root.left!=null) l++;
        int r=height(root.right);
        if(root.right!=null) r++;
        int d=l-r; //d=diff
        if(d<0) d= -d;
        if(d>1) return false;

        return (isBalanced(root.left )&& isBalanced(root.right)); 
        
    }
}