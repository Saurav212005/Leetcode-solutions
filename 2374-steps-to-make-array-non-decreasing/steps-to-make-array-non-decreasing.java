class Solution {
    public int totalSteps(int[] nums) {

        int n = nums.length;
        int[] stack = new int[n];
        int[] steps = new int[n];

        int top = -1;
        int answer = 0;

        for (int i = 0; i < n; i++) {

            int currentSteps = 0;

            while (top >= 0 && nums[stack[top]] <= nums[i]) {
                currentSteps = Math.max(currentSteps, steps[stack[top]]);
                top--;
            }

            if (top >= 0) {
                steps[i] = currentSteps + 1;
                answer = Math.max(answer, steps[i]);
            }

            stack[++top] = i;
        }

        return answer;
    }
}