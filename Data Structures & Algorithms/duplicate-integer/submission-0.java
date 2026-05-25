class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> ans=new HashSet<>();
        for(int a:nums){
            if(ans.contains(a)){
                return true;
            }
            ans.add(a);
        }
        return false;
    }
}