class Solution {
    public int minimumEffortPath(int[][] heights) {
           int m=heights.length;
           int n=heights[0].length;
           int[][] dist=new int[m][n];
           for(int row[]:dist){
              Arrays.fill(row,Integer.MAX_VALUE);
           }
           PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
           dist[0][0]=0;
           pq.offer(new int[]{0,0,0});
           int[][] direction={
              {1,0},
              {-1,0},
              {0,-1},
              {0,1}
           };
           while(!pq.isEmpty()){
                 int current[]=pq.poll();
                 int effort=current[0];
                 int r=current[1];
                 int c=current[2];
                 if(r==m-1 && c==n-1){
                    return effort;
                 }
                 if(effort> dist[r][c]){
                    continue;
                 }
                 for(int dir[]:direction){
                     int nr=r+dir[0];
                     int nc=c+dir[1];
                     if(nr<0 || nr>=m || nc<0 || nc>=n){
                        continue;
                     }
                     int edgeWeight=Math.abs(heights[r][c]-heights[nr][nc]);
                     int newEffort=Math.max(edgeWeight,effort);
                     if(newEffort<dist[nr][nc]){
                        dist[nr][nc]=newEffort;
                        pq.offer(new int[]{newEffort,nr,nc});
                     }

                 }
           }
           return 0;

    }
}