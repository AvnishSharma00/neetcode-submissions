class Solution {
    public int largestRectangleArea(int[] heights) {
           Stack<Integer> st=new Stack<>();
           int best=0;
           int n=heights.length;
           for(int i=0;i<=n;i++){
              int curr= i==n?0:heights[i];
              while(!st.isEmpty() && heights[st.peek()]>curr){
                    int h=heights[st.pop()];
                    int w=st.isEmpty()?i:i-st.peek()-1;
                    best=Math.max(best,w*h);

              }
              st.push(i);
           }
           return best;
    }
}