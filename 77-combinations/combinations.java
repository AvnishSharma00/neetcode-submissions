class Solution {
    public void generate(int n,int k, int start,List<Integer> current,List<List<Integer>> result){
               if(current.size()==k){
                  result.add(new ArrayList<>(current));
               }
               for(int i=start;i<=n;i++){
                  current.add(i);
                  generate(n,k,i+1,current,result);
                  current.remove(current.size()-1);
               }
    }
    public List<List<Integer>> combine(int n, int k) {
           List<List<Integer>> ans=new ArrayList<>();
           generate(n,k,1,new ArrayList<>(),ans);
           return ans;
    }
}