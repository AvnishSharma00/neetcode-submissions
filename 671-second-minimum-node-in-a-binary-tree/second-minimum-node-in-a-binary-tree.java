class Solution {
    long first = Long.MAX_VALUE;
    long second = Long.MAX_VALUE;

    public void secondSmall(TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.val < first) {
            second = first;
            first = root.val;
        } 
        else if (root.val > first && root.val < second) {
            second = root.val;
        }

        secondSmall(root.left);
        secondSmall(root.right);
    }

    public int findSecondMinimumValue(TreeNode root) {
        secondSmall(root);

        return second == Long.MAX_VALUE ? -1 : (int) second;
    }
}