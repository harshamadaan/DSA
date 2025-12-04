class Solution {
    public TreeNode helper(int[] postorder, int postlo, int posthi,
                           int[] inorder, int inlo, int inhi) {

        if (postlo > posthi) return null;

        // root from postorder
        TreeNode root = new TreeNode(postorder[posthi]);

        // find root index in inorder
        int i = inlo;
        while (inorder[i] != postorder[posthi]) i++;

        int leftsize = i - inlo;

        // one-line left & right subtree calls
        root.left  = helper(postorder, postlo, postlo + leftsize - 1, inorder, inlo, i - 1);
        root.right = helper(postorder, postlo + leftsize, posthi - 1, inorder, i + 1, inhi);

        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return helper(postorder, 0, n - 1, inorder, 0, n - 1);
    }
}
