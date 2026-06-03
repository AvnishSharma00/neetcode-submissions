class Solution {
    public int evalRPN(String[] tokens) {
           Stack<Integer> st=new Stack<>();
           for(String str:tokens){
               switch(str){
                     case "+":
                      st.push(st.pop()+st.pop());
                      break;
                      case "-":
                      int b=st.pop();
                      int a=st.pop();
                      st.push(a-b);
                      break;
                      case "*":
                      st.push(st.pop()*st.pop());
                      break;
                      case "/":
                      b=st.pop();
                      a=st.pop();
                      st.push(a/b);
                      break;

                      default:
                      st.push(Integer.parseInt(str));
               }
                    
           }
           return st.peek();
    }
}
