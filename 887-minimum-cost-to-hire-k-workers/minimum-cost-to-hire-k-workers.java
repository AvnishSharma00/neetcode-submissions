class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
            int n=quality.length;
           double worker[][]=new double[n][2];
           for(int i=0;i<n;i++){
               worker[i][0]=(double)wage[i]/quality[i];
               worker[i][1]=quality[i];
           }
           Arrays.sort(worker,(a,b)->Double.compare(a[0],b[0]));
           PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
           int totalQuality=0;
           double answer=Double.MAX_VALUE;
           for(double work[]:worker){
               double ratio=work[0];
               int q=(int)work[1];
               totalQuality+=q;
               pq.offer(q);
               if(pq.size()>k){
                 totalQuality-=pq.poll();
               }
               if(pq.size()==k){
                  answer=Math.min(answer,totalQuality*ratio);
               }

           }
           return answer;
    }
}