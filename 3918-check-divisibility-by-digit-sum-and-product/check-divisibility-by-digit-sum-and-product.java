class Solution {
    public boolean checkDivisibility(int n) {
        int original = n;
        int s = 0;
        int p = 1;

        while (n != 0) {
            int digit = n % 10;

            s = s + digit;
            p = p * digit;

            n = n / 10;
        }

        if (original % (s + p) == 0) {
            return true;
        }

        return false;
    }
}