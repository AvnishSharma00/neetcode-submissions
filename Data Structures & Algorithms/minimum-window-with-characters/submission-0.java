class Solution {
    public String minWindow(String s, String t) {
          if(s.length()<t.length()){
            return "";
          }
          int freq[]=new int[128];
          for(char ch:t.toCharArray()){
              freq[ch]++;
          }
          int start=0;
          int end=0;
          int left=0;
          int count=t.length();
          int len=Integer.MAX_VALUE;
          for(int right=0;right<s.length();right++){
              char ch=s.charAt(right);
              if(freq[ch]>0){
                count--;
              }
              freq[ch]--;
              while(count==0){
                   if(right-left+1<len){
                    len=right-left+1;
                    start=left;
                   }
                   char leftchar=s.charAt(left);
                   freq[leftchar]++;
                   if(freq[leftchar]>0){
                      count++;
                   }
                   left++;
              }
          }
          return len==Integer.MAX_VALUE?"":s.substring(start,start+len);
    }
}
