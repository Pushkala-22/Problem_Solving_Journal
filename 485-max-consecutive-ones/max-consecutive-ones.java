class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int r=0;
        for(int i :nums){
           if(i==0){
            c=0;
           }else{
            c++;
           }
           r=Math.max(r,c);


        }
        return r;

        
    }
}