class Solution {
    public int missingNumber(int[] nums) {
        int k=0;
        int l=0;
        int n=nums.length;
        for(int i=0;i<=n;i++){
            k^=i;
        }
        for(int i:nums){
            l^=i;

        }
       
        return k^l;
    }
}