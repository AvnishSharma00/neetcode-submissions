class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> ans=new HashSet<>();
        for(int num:nums){
            ans.add(num);
        }
        int longest=0;
        for(int a:ans){
            if(!ans.contains(a-1)){
                int currnum=a;
                int count=1;
                while(ans.contains(currnum+1)){
                    count++;
                    currnum++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
        
    }
}
