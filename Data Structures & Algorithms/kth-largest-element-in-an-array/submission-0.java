class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> ans=new PriorityQueue<>();
        for(int a:nums){
             ans.add(a);
             if(ans.size()>k){
                ans.poll();
             }
        }
        return ans.poll();
    }
}
