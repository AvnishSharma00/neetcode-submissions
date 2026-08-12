/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {


    public String serialize(TreeNode root) {
           if(root==null){
              return "";
           }
           StringBuilder sb=new StringBuilder();
           dfs(root,sb);
           return sb.toString();
    }
    public void dfs(TreeNode root,StringBuilder sb){
            if(root==null){
                 return;
            }
            sb.append(root.val).append(",");
            dfs(root.left,sb);
            dfs(root.right,sb);
    }

    
      public TreeNode deserialize(String data) {

        if (data == null || data.isEmpty()) {
            return null;
        }

        String[] values = data.split(",");
        int[] index = {0};

        return build(values, index, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode build(String[] values, int[] index, int min, int max) {

        if (index[0] >= values.length) {
            return null;
        }

        int value = Integer.parseInt(values[index[0]]);

      
        if (value < min || value > max) {
            return null;
        }

        index[0]++;

        TreeNode root = new TreeNode(value);

        root.left = build(values, index, min, value);
        root.right = build(values, index, value, max);

        return root;
    }
}

