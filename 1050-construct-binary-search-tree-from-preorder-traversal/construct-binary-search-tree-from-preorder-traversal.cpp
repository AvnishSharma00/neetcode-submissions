/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    TreeNode* build(vector<int>& preorder , int& index , long long mini , long long maxi){
        if(index == preorder.size())return NULL;
        int value = preorder[index];
        if(value < mini || value > maxi)return NULL;
        TreeNode* root = new TreeNode(value);
        index++;
        root -> left = build(preorder , index, mini , value);
        root -> right = build(preorder , index, value , maxi);
        return root;
    }
    TreeNode* bstFromPreorder(vector<int>& preorder) {
        /*index = 0
        build(min, max):
        if index == preorder.size():
            return NULL
        value = preorder[index]
        if value < min OR value > max:
            return NULL
        root = new Node(value)
        index++
        root.left = build(min, value)
        root.right = build(value, max)
        return root*/
        int index = 0;
        TreeNode* root = build(preorder , index , LONG_MIN , LONG_MAX);
        return root;
    }
};