class Solution {
    public int findContentChildren(int[] g, int[] s) {
           Arrays.sort(g);
        Arrays.sort(s);

        int numberOfChildren = g.length;   // Total number of children
        int numberOfCookies = s.length;     // Total number of cookies available

        // Initialize the count for content children
        int contentChildrenCount = 0;

        // Initialize pointers for greedFactors and cookieSizes arrays
        int greedFactorIndex = 0;
        int cookieSizeIndex = 0;

        // Loop through each child's greed factor
        while (greedFactorIndex < numberOfChildren) {
          
            // Find the first cookie that satisfies the current child's greed factor
            while (cookieSizeIndex < numberOfCookies && s[cookieSizeIndex] < g[greedFactorIndex]) {
                cookieSizeIndex++;  // Increment cookie index until a big enough cookie is found
            }
          
            // If a cookie that satisfies the current child's greed factor is found, consider the child content
            if (cookieSizeIndex < numberOfCookies) {
                contentChildrenCount++;       // Increment the count of content children
                cookieSizeIndex++;            // Move to the next cookie
            } else {
                // If no more cookies are available to satisfy any more children, break out of the loop
                break;
            }

            // Move to the next child
            greedFactorIndex++;
        }

        // Return the final count of content children
        return contentChildrenCount;
    }
}