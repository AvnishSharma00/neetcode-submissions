class Solution {
    public void dfs(int node,List<List<Integer>> rooms,boolean visited[]){
                for(int num:rooms.get(node)){
                     if(!visited[num]){
                        visited[num]=true;
                        dfs(num,rooms,visited);
                      }
                }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
           boolean visited[]=new boolean[rooms.size()];
           dfs(0,rooms,visited);
           visited[0] = true;
           for(int i=0;i<visited.length;i++){
               if(visited[i]==false){
                return false;
               }
           }
           return true;
    }
}