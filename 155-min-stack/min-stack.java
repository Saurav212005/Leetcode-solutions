import java.util.*;



class MinStack {

    static Stack<Integer> main;
    static Stack<Integer> min;

    public MinStack() {
        main = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        main.push(val);

        if (min.isEmpty() || val <= min.peek()) {
            min.push(val);
        }
    }

    public void pop() {
        if (main.isEmpty()) {
            return;
        }

        int ele = main.pop();

        if (!min.isEmpty() && ele == min.peek()) {
            min.pop();
        }
    }

    public int top() {
        if (!main.isEmpty()) {
            return main.peek();
        }
        return -1;
    }

    public int getMin() {
        if (!min.isEmpty()) {
            return min.peek();
        }
        return -1;
    }
}