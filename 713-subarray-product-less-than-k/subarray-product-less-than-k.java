class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)return 0;
        int c=0;
        int l=0;
        int p=1;
        for(int i=0;i<nums.length;i++){
           p*=nums[i];
           while(p>=k && l<=i){
            p/=nums[l];
            l++;
           }
           c+=(i-l+1);
        }
        return c;
    }
}