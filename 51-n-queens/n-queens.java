class Solution {
    List<List<String>> ans=new ArrayList<>();
    public void answer(boolean ch[][]){
           List<String> result=new ArrayList<>();
           for(int i=0;i<ch.length;i++){
              StringBuilder sb=new StringBuilder();
              for(int j=0;j<ch[0].length;j++){
                  if(ch[i][j]){
                     sb.append('Q');
                  }else{
                    sb.append('.');
                  }
              }
              result.add(sb.toString());
           }
           ans.add(result);
    }
    public boolean isSafe(boolean ch[][],int r,int c){
           for(int i=0;i<r;i++){
               if(ch[i][c])
                 return false;
           }
           int leftMax=Math.min(r,c);
           for(int i=1;i<=leftMax;i++){
              if(ch[r-i][c-i]){
                 return false;
              }
           }
           int rightMax=Math.min(r,ch.length-c-1);
           for(int i=1;i<=rightMax;i++)
            {
                if(ch[r-i][c+i]){
                     return false;
                }
            }
            return true;
    }
    public void bfs(boolean ch[][],int r){
           if(r==ch.length){
              answer(ch);
              return;
           }
           for(int c=0;c<ch.length;c++){
             if(isSafe(ch,r,c)){
              ch[r][c]=true;
              bfs(ch,r+1);
              ch[r][c]=false;
             }
           }
    }
    public List<List<String>> solveNQueens(int n) {
           bfs(new boolean[n][n],0);
           return ans;
    }
}