class Solution {
    public void gameOfLife(int[][] board) {
               int m=board.length;
               int n=board[0].length;
                int[][] dir = {
                 {-1, -1}, {-1, 0}, {-1, 1},
                 {0, -1},           {0, 1},
                 {1, -1},  {1, 0},  {1, 1}
                 };
                 for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                         int lives=0;
                         for(int d[]:dir){
                             int nr=i+d[0];
                             int nc=j+d[1];
                             if(nr>=0 && nr<m && nc>=0 && nc<n){
                                if(board[nr][nc]==1 ||board[nr][nc]==2)
                                  lives++;
                             }
                         }
                         if(board[i][j]==1){
                            if(lives<2 ||lives>3){
                                board[i][j]=2;
                            }
                         }else{
                            if(lives==3){
                                board[i][j]=3;
                            }
                         }
                    }
                 }
                 for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        if(board[i][j]==2){
                           board[i][j]=0;
                        }else if(board[i][j]==3){
                             board[i][j]=1;
                        }
                    }
                 }
    }
}