class Solution {
    public int thirdMax(int[] nums) {
        long f=Long.MIN_VALUE;
        long s=Long.MIN_VALUE;
        long t=Long.MIN_VALUE;
        for(int i:nums){
            if(i>f){
                t=s;
                s=f;
                f=i;
            }
            else if(i<f && i>s){
                t=s;
                s=i;
            }
            if(i<f && i<s && i>t){
                t=i;
            }

        }
        if(t==Long.MIN_VALUE){
            return (int)f;
        }
        
        
       return (int)t;
    }
}