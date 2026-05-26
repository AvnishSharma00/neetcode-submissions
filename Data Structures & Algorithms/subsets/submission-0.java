class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        generate(0,nums,new ArrayList<>(),result);
        return result;
    }
    public void generate(int index,int nums[],List<Integer> list1,List<List<Integer>> result){
        if(index==nums.length){
            result.add(new ArrayList<>(list1));
            return;
        }
        list1.add(nums[index]);
        generate(index+1,nums,list1,result);
        list1.remove(list1.size()-1);
        generate(index+1,nums,list1,result);
    }
}
