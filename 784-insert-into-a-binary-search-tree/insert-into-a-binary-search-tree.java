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
    public TreeNode bfs(TreeNode root,int val){
           if(root==null){
              return new TreeNode(val);
           }
           if(root.val>val){
             root.left=bfs(root.left,val);
           }
           if(root.val<val){
             root.right=bfs(root.right,val);
           }
           return root;
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
           if(root==null){
              return new TreeNode(val);
           }
           return bfs(root,val);
    }
}