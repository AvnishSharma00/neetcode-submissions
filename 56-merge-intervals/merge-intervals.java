class Solution {
    public int[][] merge(int[][] intervals) {
           List<int[]> ans=new ArrayList<>();
           Arrays.sort(intervals,(a,b)->a[0]-b[0]);
           for(int a[]:intervals){
               if(ans.isEmpty()){
                 ans.add(a);
               }else{
                    int last[]=ans.get(ans.size()-1);
                    if(last[1]>=a[0]){
                       last[1]=Math.max(last[1],a[1]);
                    }else{
                        ans.add(a);
                    }
               }
           }
           return ans.toArray(new int[ans.size()][]);
    }
}