class Solution {
    public int lengthOfLongestSubstring(String s) {
           int left=0;
           HashSet<Character> set=new HashSet<>();
           int maxLen=0;
           int len=0;
           for(int i=0;i<s.length();i++){
               while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(left));
                    left++;
               }
               set.add(s.charAt(i));
               len=i-left+1;
               maxLen=Math.max(maxLen,len);
           }
           return maxLen;
    }
}
