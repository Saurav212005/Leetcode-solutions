import java.util.*;
class Solution {
    public int myAtoi(String s) {
        Stack<Character> st = new Stack<>();
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
        int i = 0;
        int sign = 1;
        if (s.charAt(i) == '-') {
            sign = -1;
            st.push('-');
            i++;
        } 
        else if (s.charAt(i) == '+') {
            st.push('+');
            i++;
        }
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            st.push(s.charAt(i));
            i++;
        }
        long num = 0;
        for (char ch : st) {

            if (ch == '-' || ch == '+') {
                continue;
            }
            num = num * 10 + (ch - '0');
            if (sign == 1 && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        return (int)(sign * num);
    }
}