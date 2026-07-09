class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] l=new int[nums.length];
        int k=0;
        for(int i=0;i<n;i++){

            l[k]=nums[i];
            k=k+1;
            l[k]=nums[n+i];
            k=k+1;
        }
        return l;
        
    }
}