class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int gl=g.length;
      Arrays.sort(g);
      Arrays.sort(s);
      int c=0;
      for(int i:s){
       if(c<gl && i>=g[c]){
          c++;
       }
      }
      return c;
    }
}