class Solution {
    public int subarraySum(int[] nums, int k) {
           HashMap<Integer,Integer> map=new HashMap<>();
           int prefixSum=0;
           map.put(0,1);
           int subArayy=0;
           for(int i=0;i<nums.length;i++){
              prefixSum+=nums[i];
              int remove=prefixSum-k;
              if(map.containsKey(remove)){
                 subArayy+=map.get(remove);
              }
              map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
           }
           return subArayy;
    }
}