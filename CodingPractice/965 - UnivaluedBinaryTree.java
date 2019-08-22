
/*A binary tree is univalued if every node in the tree has the same value.

Return true if and only if the given tree is univalued.

Input: [1,1,1,1,1,null,1]
Output: true
Example 2:


Input: [2,2,2,5,2]
Output: false

*/

class Solution {
    public boolean isUnivalTree(TreeNode root) {
        
        return root == null || inorder(root, root.val);       
    }
    
    public boolean inorder(TreeNode n, int value)
    {
        return n == null ||
                n.val == value &&
                inorder(n.left, value) &&
                inorder(n.right, value);
                
    }
}
