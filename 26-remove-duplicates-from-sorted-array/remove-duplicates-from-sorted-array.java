class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> a= new HashSet<>();
        int inx=0; 
        for (int i = 0; i < nums.length; i++) {
            if (!a.contains(nums[i])) { 
                a.add(nums[i]);  
                nums[inx++] = nums[i];  
            }
        }
        return inx;
        
    }
}