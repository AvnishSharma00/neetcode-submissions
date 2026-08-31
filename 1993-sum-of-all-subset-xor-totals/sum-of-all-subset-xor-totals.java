class Solution {
    public void generate(List<Integer> current,List<List<Integer>> list,int index,int num[]){
           if(index==num.length){
            list.add(new ArrayList(current));
             return;
           }
           
           current.add(num[index]);
           generate(current,list,index+1,num);
           current.remove(current.size()-1);
           generate(current,list,index+1,num);
    }
    public int subsetXORSum(int[] nums) {
           List<List<Integer>> list=new ArrayList<>();
           generate(new ArrayList<>(),list,0,nums);
           int ans=0;
           for(List<Integer> arr:list){
              int ans1=0;
              for(Integer a:arr){
                 ans1^=a;
              }
              ans+=ans1;
           }
           System.out.println(list);
           return ans;
    }
}