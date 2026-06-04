class Solution {
    public int hammingWeight(int n) {
           int count=0;
           while(n!=0){
               int flag=n&1;
               if(flag==1){
                count++;
               }
               n=n>>1;
           }
           return count;
    }
}