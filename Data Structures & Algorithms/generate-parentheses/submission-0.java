class Solution {
    public void generate(int open,int close,int n,StringBuilder current,List<String> result){
               if(current.length()==n*2){
                  result.add(current.toString());
                  return;
               }
               if(open<n){
                current.append('(');
                generate(open+1,close,n,current,result);
                current.deleteCharAt(current.length()-1);
               }
               if(close<open){
                current.append(')');
                generate(open,close+1,n,current,result);
                current.deleteCharAt(current.length()-1);
               }
    }
    public List<String> generateParenthesis(int n) {
           List<String> ans=new ArrayList<>();
           generate(0,0,n,new StringBuilder(),ans);
           return ans;
    }
}