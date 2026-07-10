import java.util.*;

class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        int g = gcdArray(numsDivide);

        // Min-heap to always get smallest element
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.offer(num);
        }

        int deletions = 0;
        while (!pq.isEmpty()) {
            int smallest = pq.peek();
            if (g % smallest == 0) {
                return deletions; // found valid divisor
            }
            // remove this element
            while (!pq.isEmpty() && pq.peek() == smallest) {
                pq.poll();
                deletions++;
            }
        }
        return -1; // no valid divisor found
    }

    private int gcdArray(int[] arr) {
        int g = arr[0];
        for (int i = 1; i < arr.length; i++) {
            g = gcd(g, arr[i]);
        }
        return g;
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
