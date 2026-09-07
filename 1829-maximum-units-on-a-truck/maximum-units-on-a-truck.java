class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
           Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
           int ans=0;
           for(int box[]:boxTypes){
               int take=box[0];
               int size=box[1];
               take=Math.min(box[0],truckSize);
               ans+=take*size;
               truckSize-=take;
               if(truckSize==0){
                 break;
               }

               }
           
           return ans;
    }
}