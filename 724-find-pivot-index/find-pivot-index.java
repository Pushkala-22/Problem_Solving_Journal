class Solution {
    public int pivotIndex(int[] nums) {
        int l=0;
        int r=0;
        int s=0;
        for(int i=0;i<nums.length;i++){
             s+=nums[i];
        }
        r=s;
        for(int i=0;i<nums.length;i++){
         
          r=s-l-nums[i];
          if(r==l){
            return i;
          }
          l+=nums[i];
        }
        return -1;
    }
}