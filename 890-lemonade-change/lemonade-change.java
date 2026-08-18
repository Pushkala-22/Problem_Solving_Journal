class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n=bills.length;
        int cf=0;
        int ct=0;
        if(bills[0]!=5){
            return false;
        }
        for(int i:bills){
            int r=0,q=0;
            if(i==5){
                cf++;
            }else if(i==10){
                if(cf>0){
                cf--;
                ct++;
                }else{
                    return false;
                }

            }else{
                if((cf>0)&&(ct>0)){
                cf--;
                ct--;
                }
                else if(cf>=3){
                    cf=cf-3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
        
    }
}