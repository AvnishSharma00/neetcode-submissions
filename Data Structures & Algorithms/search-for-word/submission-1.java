class Solution {
    public boolean dfs(char[][] board,boolean ch[][],int i,int j,int index,String word,int[][] directions){
         
          if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=word.charAt(index) ||ch[i][j] ){
             return false;
          }
           if(index==word.length()-1){
            return true;
          }
          ch[i][j]=true;
          for(int dir[]:directions){
              
              if(dfs(board,ch,i+dir[0],j+dir[1],index+1,word,directions)){
                 return true;
              }
          }
          ch[i][j]=false;
          return false;
    }
    public boolean exist(char[][] board, String word) {
           int dir[][] = {
    {1,0},
    {-1,0},
    {0,1},
    {0,-1}
};
           for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[0].length; j++) {
            if (dfs(board, new boolean[board.length][board[0].length], i, j, 0, word, dir)) {
                return true;
            }
        }
    }
    return false;
    }
}
