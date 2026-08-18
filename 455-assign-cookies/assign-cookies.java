class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int gl=g.length;
        int sl=s.length;
      Arrays.sort(g);
      Arrays.sort(s);
      int c=0;
      for(int i=0;i<gl;i++){
        for(int j=0;j<sl;j++){
            if(g[i]<=s[j]){
                c++;
                s[j]=-1;
                break;
            }
        }
      }
      return c;
    }
}