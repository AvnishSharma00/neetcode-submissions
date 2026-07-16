class Solution {
    public int[] productExceptSelf(int[] nums) {
            int result[]=new int[nums.length];
            int suffix=1;
            result[0]=suffix;
            for(int i=1;i<nums.length;i++){
                result[i]=nums[i-1]*suffix;
                suffix=result[i];
            }
            System.out.println(Arrays.toString(result));
            int last=1;
            for(int i=nums.length-1;i>=0;i--){
                 result[i]*=last;
                 last*=nums[i];
            }
            return result;
    }
}