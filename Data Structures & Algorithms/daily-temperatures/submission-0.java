class Solution {
    public int[] dailyTemperatures(int[] temp) {
           Stack<Integer> st=new Stack<>();
           int ans[]=new int[temp.length];
           for(int i=0;i<temp.length;i++){
               while(!st.isEmpty() && temp[i]>temp[st.peek()]){
                    int index=st.pop();
                    ans[index]=i-index;
               }
               st.push(i);
           }
           return ans;
    }
}
