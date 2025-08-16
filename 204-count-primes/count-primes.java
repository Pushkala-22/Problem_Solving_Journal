class Solution {
    public int countPrimes(int n) {
         boolean[] isPrime = new boolean[n];
        // Assume all numbers are prime initially (except index 0 and 1).
        Arrays.fill(isPrime, true);
      
        // Counter for the number of primes found.
        int primeCount = 0;
      
        // Iterate through the array to find prime numbers.
        for (int i = 2; i < n; i++) {
            // Check if the number at current index is marked as prime.
            if (isPrime[i]) {
                // Increment the count as we found a prime.
                primeCount++;
              
                // Mark the multiples of the current number as non-prime.
                for (int j = i * 2; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
      
        // Return the total count of prime numbers found.
        return primeCount;
    }
}