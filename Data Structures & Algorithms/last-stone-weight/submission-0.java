class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }
        while(pq.size()>1){
            int num1=pq.poll();
            int num2=pq.poll();
            pq.add(num1-num2);
        }
        return pq.poll();
    }
}
