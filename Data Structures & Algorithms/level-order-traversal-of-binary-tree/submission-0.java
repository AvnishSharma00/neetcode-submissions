
class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> que = new LinkedList<>();

        que.offer(root);

        while (!que.isEmpty()) {

            int size = que.size();

            List<Integer> ans = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode temp = que.poll();

                ans.add(temp.val);

                if (temp.left != null) {
                    que.offer(temp.left);
                }

                if (temp.right != null) {
                    que.offer(temp.right);
                }
            }

            result.add(ans);
        }

        return result;
    }
}