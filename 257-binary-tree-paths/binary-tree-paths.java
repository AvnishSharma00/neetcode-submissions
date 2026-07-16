class Solution {

    public void dfs(TreeNode root, String path, List<String> result) {
        if (root == null) {
            return;
        }

        if (path.length() == 0) {
            path += root.val;
        } else {
            path += "->" + root.val;
        }

        if (root.left == null && root.right == null) {
            result.add(path);
            return;
        }

        dfs(root.left, path, result);
        dfs(root.right, path, result);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        dfs(root, "", result);
        return result;
    }
}