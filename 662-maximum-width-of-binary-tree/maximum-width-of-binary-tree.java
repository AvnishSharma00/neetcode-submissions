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

class Pair {
    TreeNode node;
    int index;

    Pair(TreeNode node, int index) {
        this.node = node;
        this.index = index;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int maximumWidth = 0;
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int minimumIndex = queue.peek().index;

            int firstIndex = 0;
            int lastIndex = 0;

            for (int i = 0; i < levelSize; i++) {
                Pair current = queue.poll();

                int currentIndex = current.index - minimumIndex;

                if (i == 0) {
                    firstIndex = currentIndex;
                }

                if (i == levelSize - 1) {
                    lastIndex = currentIndex;
                }

                if (current.node.left != null) {
                    queue.offer(new Pair(current.node.left, currentIndex * 2 + 1));
                }

                if (current.node.right != null) {
                    queue.offer(new Pair(current.node.right, currentIndex * 2 + 2));
                }
            }

            maximumWidth = Math.max(maximumWidth, lastIndex - firstIndex + 1);
        }

        return maximumWidth;
    }
}