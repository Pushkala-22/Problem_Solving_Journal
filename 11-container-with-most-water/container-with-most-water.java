class Solution {
    public int maxArea(int[] height) {
        int m=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
           int cur=Math.min(height[l],height[r])*(r-l);
            m=Math.max(m,cur);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return m;
    }
}