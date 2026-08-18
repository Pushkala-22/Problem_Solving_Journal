class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tot=0;
        int t=0;
        int s=0;
      for(int i=0;i<gas.length;i++){
               int d=gas[i]-cost[i];
               tot+=d;
               t+=d;
               if(t<0){
                s=i+1;
                t=0;
               }
      }  
      return tot>=0?s:-1;
    }
}