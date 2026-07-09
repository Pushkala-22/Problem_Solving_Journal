class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int r=0;
        int s=0;
        for(int i=0;i<n;i++){
            s+=gain[i];
            if(s>r){
                r=s;
            }
        }
        return r;
    
    }
}