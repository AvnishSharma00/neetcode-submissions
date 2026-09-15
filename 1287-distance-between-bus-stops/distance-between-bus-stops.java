class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
           int total=0;
           for(int i=0;i<distance.length;i++){
               total+=distance[i];
           }
           if(start>destination){
              int temp=start;
              start=destination;
              destination=temp;
           }
           int dis=0;
           for(int i=start;i<destination;i++){
                   dis+=distance[i];
           }
           return Math.min(dis,total-dis);
    }
}