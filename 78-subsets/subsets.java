class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Generate(0,nums,new ArrayList<>(),result);
        return result;
    }
    public void Generate(int index,int arr[],List<Integer> current,List<List<Integer>> result){
        if(index==arr.length){
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(arr[index]);
        Generate(index+1,arr,current,result);
        current.remove(current.size()-1);
        Generate(index+1,arr,current,result);
    }

}