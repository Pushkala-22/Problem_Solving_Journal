class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int max=Integer.MIN_VALUE;
      for(int i=0;i<=nums.length-k;i++){
        int s=0;
        for(int j=i;j<i+k;j++){
            s+=nums[j];
        }
        max=Math.max(max,s);
      }  
      double r= (double)max/k;
      return r;
    }
}