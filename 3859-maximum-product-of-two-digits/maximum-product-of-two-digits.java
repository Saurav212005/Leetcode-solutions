import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        while (n > 0) {
            list.add(n % 10);
            n /= 10;
        }

        Collections.sort(list);

        int size = list.size();
        return list.get(size - 1) * list.get(size - 2);
    }
}