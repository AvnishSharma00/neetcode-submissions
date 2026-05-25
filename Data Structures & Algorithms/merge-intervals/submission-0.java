class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> result=new ArrayList<>();
        for(int a[]:intervals){
            if(result.isEmpty()){
                result.add(a);
            }else{
                int last[]=result.get(result.size()-1);
                if(a[0]<=last[1]){
                    last[1]=Math.max(a[1],last[1]);
                }else{
                    result.add(a);
                }
            }
        }
        return result.toArray(new int[result.size()][]);
        
    }
}