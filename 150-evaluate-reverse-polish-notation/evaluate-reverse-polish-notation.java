class Solution {
    public int evalRPN(String[] tokens) {
 Stack<Integer> st=new Stack<>();
        for(String s:tokens){
            if(s.equals("+")&& !st.isEmpty()){
                int a=st.pop();
                int b=st.pop();
                st.push(a+b);
            }
             else if(s.equals("-")&& !st.isEmpty()){
                int b=st.pop();
                int a=st.pop();
                
            st.push(a-b);
                
            }
            else if(s.equals("*")&& !st.isEmpty()){
                int a=st.pop();
                int b=st.pop();
                st.push(a*b);
            }
             else if(s.equals("/")&& !st.isEmpty()){
                int a=st.pop();
                int b=st.pop();
                st.push(b/a);
            }
            else{
                st.push(Integer.valueOf(s));
            }
            
    }
    return st.peek();
}
}