class Solution {

    public int findMax(int[] nums, int start, int end) {

        int index = start;

        for (int i = start; i <= end; i++) {
            if (nums[i] > nums[index]) {
                index = i;
            }
        }

        return index;
    }

    public TreeNode constructTree(int[] nums, int start, int end) {

        if (start > end) {
            return null;
        }

        int maxIndex = findMax(nums, start, end);

        TreeNode root = new TreeNode(nums[maxIndex]);

        root.left = constructTree(nums, start, maxIndex - 1);

        root.right = constructTree(nums, maxIndex + 1, end);

        return root;
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return constructTree(nums, 0, nums.length - 1);

    }
}