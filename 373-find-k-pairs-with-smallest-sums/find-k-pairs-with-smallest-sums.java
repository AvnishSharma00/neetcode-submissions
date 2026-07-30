class Solution {
     class Pair{
           int num1;
           int num2;
           int sum;
           Pair(int num1,int num2,int sum){
                this.num1=num1;
                this.num2=num2;
                this.sum=sum;
           }
     }

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
           PriorityQueue<Pair> pq = new PriorityQueue<>(
                                                        (a, b) -> Integer.compare(b.sum, a.sum)
                                                       );
            for(int i=0;i<nums1.length;i++){
                for(int j=0;j<nums2.length;j++){
                    Pair p=new Pair(nums1[i],nums2[j],nums1[i]+nums2[j]);
                    if(pq.size()<k){
                        pq.add(p);
                    }else if(p.sum<pq.peek().sum){
                        pq.poll();
                        pq.offer(p);
                    }else{
                        break;
                    }
                    // }
                }
            }                    
            List<List<Integer>> result=new ArrayList<>();
            while(!pq.isEmpty()){
                  Pair p=pq.poll();
                  result.add(Arrays.asList(p.num1,p.num2));
            }  
            Collections.reverse(result);
            return result;                     
    }
}