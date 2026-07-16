class Solution {
    public void dfs(int nums[],int index,List<Integer> ans,List<List<Integer>> result){
           if(index==nums.length){
              result.add(new ArrayList<>(ans));
              return;
           }
           ans.add(nums[index]);
           dfs(nums,index+1,ans,result);
           ans.remove(ans.size()-1);
           dfs(nums,index+1,ans,result);
    }
    public List<List<Integer>> subsets(int[] nums) {
           List<List<Integer>> result=new ArrayList<>();
           dfs(nums,0,new ArrayList<>(),result);
           return result;
    }
}