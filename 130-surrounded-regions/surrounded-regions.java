class Solution {
     int direct[][]={
            {1,0},
            {0,1},
            {-1,0},
            {0,-1}
           };
    public void dfs(boolean visited[][],int i,int j,char[][] board){
          if(i<0 || i>=board.length || j<0 || j>=board[0].length || visited[i][j] || board[i][j]=='X'){
             return;
          }
          visited[i][j]=true;
          for(int dir[]:direct){
              dfs(visited,i+dir[0],j+dir[1],board);
          }

    }
    public void solve(char[][] board) {
           boolean visited[][]=new boolean[board.length][board[0].length];
          
           for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(i==0 || i==board.length-1 || j==0 || j==board[0].length-1){
                    if(board[i][j]=='O')
                    dfs(visited,i,j,board);
                }
            }
           }
           for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(visited[i][j]==false && board[i][j]=='O'){
                     board[i][j]='X';
                }
            }
           }
           
    }
}