class Solution {
     private int dp[][];
     private int dir[][]={
         {1,0},
         {0,1},
         {-1,0},
         {0,-1}
     };
    
    public int longestIncreasingPath(int[][] matrix) {
           dp=new int[matrix.length][matrix[0].length];
           int answer=0;
           for(int i=0;i<matrix.length;i++){
              for(int j=0;j<matrix[0].length;j++){
                  answer=Math.max(answer,dfs(matrix,i,j));
              }
           }
           return answer;
    }
    public int dfs(int matrix[][],int row,int col){
           if(dp[row][col]!=0){
              return dp[row][col];
           }
           int maxlen=1;
           int m=matrix.length;
           int n=matrix[0].length;
           for(int d[]:dir){
             int newrow=row+d[0];
             int newcol=col+d[1];
               if(newrow>=0 && newrow<m &&
                  newcol>=0 && newcol<n &&
                  matrix[newrow][newcol]>matrix[row][col]){
                     maxlen=Math.max(maxlen,1+dfs(matrix,newrow,newcol));
                  }
           }
           dp[row][col]=maxlen;
           return maxlen;
    }
}
