class Solution {

    public void dfs(char[][] board,boolean visited[][],int i,int j){
           int row=board.length;
           int col=board[0].length;
           if(i<0 || i>=row || j<0 || j>=col ||visited[i][j]||board[i][j]=='X'){
             return;
           }
           visited[i][j]=true;
           int direction[][]={
               {1,0},
               {0,1},
               {-1,0},
               {0,-1}
           };
           for(int dir[]:direction){
               dfs(board,visited,i+dir[0],j+dir[1]);
           }

           
    }
    public void solve(char[][] board) {
           boolean visited[][]=new boolean[board.length][board[0].length];
           for(int i=0;i<board.length;i++){
               for(int j=0;j<board[0].length;j++){
                   if(i==board.length-1 || i==0 || j==0 || j==board[0].length-1){
                   if(board[i][j]=='O' && !visited[i][j]){
                      dfs(board,visited,i,j);
                   }
                   }
               }
           }
           for(int i=0;i<board.length;i++){
              for(int j=0;j<board[0].length;j++){
                  if(board[i][j]=='O' && visited[i][j]==false){
                     board[i][j]='X';
                  }
              }
           }
    }
}
