class Solution {
    public boolean isSubsequence(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        if(n1>n2)return false;
        int a=0;
        int b=0;
        while(a!=n1&&b!=n2){
            if(s.charAt(a)==t.charAt(b)){
                a++;
                b++;
            }else{
                b++;
            }
        }
        return (a==n1)?true:false;
    }
}