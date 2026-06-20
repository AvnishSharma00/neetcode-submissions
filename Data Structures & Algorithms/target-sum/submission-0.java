class Solution {
    public int findTargetSumWays(int[] nums, int target) {
           return dfs(nums,0,target);
    }
    public int dfs(int nums[],int index,int target){
           if(index==nums.length){
              return target==0?1:0;
           }
           int plus=dfs(nums,index+1,target+nums[index]);
           int minus=dfs(nums,index+1,target-nums[index]);
           return plus+minus;
    }
}
