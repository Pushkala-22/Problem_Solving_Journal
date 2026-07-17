class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // frequency of pattern
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int k = p.length();
        // first window
        for (int i = 0; i < k; i++) {
            sCount[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(pCount, sCount)) result.add(0);

        // slide window
        for (int i = k; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;              // add new char
            sCount[s.charAt(i - k) - 'a']--;          // remove old char
            if (Arrays.equals(pCount, sCount)) {
                result.add(i - k + 1);
            }
        }
        return result;
    }
}
