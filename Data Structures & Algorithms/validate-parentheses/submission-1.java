class Solution {
    public boolean isValid(String s) {
           Stack<Character> st=new Stack<>();
           for(char ch:s.toCharArray()){
               if(ch=='('|| ch=='{'|| ch=='['){
                  st.push(ch);
               }else{
                    if(st.isEmpty()==true){
                        return false;
                    }else{
                      char curr=st.pop();
                      if((ch==')' && curr!='(')|| (ch=='}' && curr!='{')||(ch==']'&& curr!='[')){
                         return false;
                      }
                    }
               }
           }
           return st.isEmpty();
    }
}
