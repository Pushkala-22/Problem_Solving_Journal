class Solution {
    public boolean find132pattern(int[] nums) {
          int m = Integer.MIN_VALUE;
        Deque<Integer> stack = new ArrayDeque<>(); 
        for (int i = nums.length - 1; i >= 0; --i) {
            if (nums[i] < m) {
                return true;
            }
            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                m = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
}