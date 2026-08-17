class Solution {
    int direction[][]={
        {1,0},
        {0,1},
        {-1,0},
        {0,-1}
    };
    public void dfs(char[][] board,int i,int j,boolean[][]  visited){
           if(i<0 || i>=board.length || j<0 || j>=board[0].length || visited[i][j] ||board[i][j]=='.')
           {
             return;
           }
           visited[i][j]=true;
           for(int dir[]:direction){
              dfs(board,i+dir[0],j+dir[1],visited);
           }
    }
    public int countBattleships(char[][] board) {
           int count=0;
           boolean visited[][]=new boolean[board.length][board[0].length];
           for(int i=0;i<board.length;i++){
              for(int j=0;j<board[0].length;j++){
                  if(!visited[i][j] && board[i][j]=='X'){
                     count++;
                     dfs(board,i,j,visited);
                  }
              }
           }
           return count;
    }
}