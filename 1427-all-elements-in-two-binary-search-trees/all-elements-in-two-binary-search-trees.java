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
    public void dfs(TreeNode root,List<Integer> arr){
           if(root==null){
            return;
           }
           dfs(root.left,arr);
           arr.add(root.val);
           dfs(root.right,arr);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
           List<Integer> result=new ArrayList<>();
           dfs(root1,result);
           dfs(root2,result);
           Collections.sort(result);
           return result;
    }
}