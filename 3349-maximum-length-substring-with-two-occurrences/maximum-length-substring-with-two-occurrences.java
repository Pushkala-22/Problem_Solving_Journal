class Solution {
    public int maximumLengthSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
        int[] f=new int[26];

            for(int j=i;j<s.length();j++){
                char c=s.charAt(j);
                f[c-'a']++;
                if(f[c-'a']>2){
                 break;
                }
                max=Math.max(max,j-i+1);
            }
        }
        return max;
    }
}