class Solution {
    public int jump(int[] nums) {
        int far=0;
        int count=0;
        int end=0;
        for(int i=0;i<nums.length-1;i++){
            far=Math.max(far,nums[i]+i);
            if(i==end){
                count++;
                end=far;
            }
        }
        return count;
    }
}
