class Solution {
    public boolean canJump(int[] nums) {
        int d=0;
        for(int i=0;i<nums.length;i++){
            if(i>d){
                return false;
            }
            d=Math.max(d,i+nums[i]);
        }
        return true;
    }
}