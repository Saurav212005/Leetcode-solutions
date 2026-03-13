import java.util.*;
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n=students.length;
        int m=sandwiches.length;
        Stack<Integer> st=new Stack<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            q.add(students[i]);
        }
           for(int i=n-1;i>=0;i--){
            st.push(sandwiches[i]);
        }
        int count=0;
        while(!q.isEmpty()){
            if(q.peek()==st.peek()){
                q.poll();
                st.pop();
                count=0;
            }
            else{
                int a=q.poll();
                q.add(a);
                count++;
                if(count==q.size()){
                    return count;
                }
            }
        }

 return q.size();
    }
}