class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
    
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int current=i;
            int start=i+1;
            int end=nums.length-1;

            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            while(start<end){
                 
                 int sum=nums[current]+nums[start]+nums[end];

                if(sum==0){
                 List<Integer> ans=new ArrayList<>();
                    ans.add(nums[current]);
                     ans.add(nums[start]);
                      ans.add(nums[end]);
                      result.add(ans);
                      while(start < end && nums[start] == nums[start+1]) start++;
                      while(start < end && nums[end] == nums[end-1]) end--;
                      start++;
                      end--;

                }else if(sum>0){
                    end--;
                }else{
                    start++;
                }
                 
            }
            
        
        }
        return result;
    }
}
