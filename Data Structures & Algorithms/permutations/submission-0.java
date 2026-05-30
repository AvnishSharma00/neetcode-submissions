class Solution {
    public void generate(int nums[],boolean used[],List<Integer> current,List<List<Integer>> result){
        if(current.size()==nums.length){
          result.add(new ArrayList<>(current));
          return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]==true){
                continue;
            }
            used[i]=true;
            current.add(nums[i]);
            generate(nums,used,current,result);
            used[i]=false;
            current.remove(current.size()-1);
        }

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        generate(nums,new boolean[nums.length],new ArrayList<>(),ans);
        return ans;
    }
}
