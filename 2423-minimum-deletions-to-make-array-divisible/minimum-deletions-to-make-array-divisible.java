import java.util.*;

class Solution {
      public int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(nums); // sort nums to check smallest first
        int g = gcdArray(numsDivide); // gcd of numsDivide
        
        for (int i = 0; i < nums.length; i++) {
            if (g % nums[i] == 0) {
                return i; // deletions = index of first valid divisor
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
