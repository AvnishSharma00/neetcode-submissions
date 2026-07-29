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
    public int arr[]={0};
    public TreeNode buildTree(int[] preorder, int[] inorder) {
           HashMap<Integer,Integer> map=new HashMap<>();
           for(int i=0;i<inorder.length;i++){
               map.put(inorder[i],i);
           }
           return helper(preorder,0,inorder.length-1,map,arr);
    }
    public TreeNode helper(int[] preOrder,int start,int end,HashMap<Integer,Integer> map,int arr[]){
           if(start>end){
              return null;
           }
           
           int current=preOrder[arr[0]];
           arr[0]++;
           TreeNode node=new TreeNode(current);
           if(start==end){
             return node;
           }
           int inOrderIndex=map.get(current);
           node.left=helper(preOrder,start,inOrderIndex-1,map,arr);
           node.right=helper(preOrder,inOrderIndex+1,end,map,arr);
           return node;
    }
}