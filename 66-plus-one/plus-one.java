import java.util.ArrayList;

class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> arr = new ArrayList<>();
        int carry = 1; 
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
             arr.add(sum % 10);
              carry = sum / 10;
        }
    if (carry > 0) {
            arr.add(carry);
        }
          int[] result = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
              result[i] = arr.get(arr.size() - 1 - i);
        }
          return result;
    }
}