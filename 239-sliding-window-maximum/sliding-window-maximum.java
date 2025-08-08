class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n= nums.length;
        int[] result = new int[n - k + 1]; 
        Deque<Integer> deque = new ArrayDeque<>(); 
      
        for (int i = 0, j = 0; i < n; ++i) {
            if (!deque.isEmpty() && i - k + 1 > deque.peekFirst()) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }
            deque.offer(i);
            if (i >= k - 1) {
                result[j++] = nums[deque.peekFirst()];
            }
        }
        return result; 
    }
}