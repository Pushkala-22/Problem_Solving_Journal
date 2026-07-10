class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int num : candyType) {
            set.add(num);
        }
        int l=set.size();
        int n=candyType.length;
        int e=n/2;
       
        return Math.min(l,e);
    }
}