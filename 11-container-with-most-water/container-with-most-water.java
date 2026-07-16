class Solution {
    public int maxArea(int[] nums) {
           int left=0;
           int right=nums.length-1;
           int area=0;
           while(left<right){
                 int width=right-left;
                  area=Math.max(area,Math.min(nums[left],nums[right])*width);
                 if(nums[left]<nums[right]){
                     left++;
                 }else{
                    right--;
                 }
           }
           return area;
    }
}