class Solution {
    public void dfs(int[][] image,int i,int j,int color,int setColor,boolean nums[][],int directions[][]){
           if(i<0 || i>=image.length || j<0 || j>=image[0].length || image[i][j]!=setColor ||nums[i][j]){
              return;
           }
           nums[i][j]=true;
           image[i][j]=color;
           for(int dir[]:directions){
               dfs(image,i+dir[0],j+dir[1],color,setColor,nums,directions);
           }
           nums[i][j]=false;

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
            int directions[][]={
                {1,0},
                {0,1},
                {-1,0},
                {0,-1}
            };
            dfs(image,sr,sc,color,image[sr][sc],new boolean[image.length][image[0].length],directions);
            return image;
    }
}