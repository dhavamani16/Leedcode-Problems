class Solution {
    public boolean lemonadeChange(int[] bills) {
        int cnt5=0;
        int cnt10=0;
        for(int bill:bills){
            if(bill==5)
                cnt5++;
            if(bill==10){
                cnt10++;
                if(cnt5>0){
                    cnt5--;
                }
                else {
                    return false;
                }
            }
            else{
                if(cnt5>0 && cnt10>0){
                    cnt5--;
                    cnt10--;
                }
                else if(cnt5>=3){
                    cnt5-=3;
                }
                else{
                    return false;
                }
            }

            
        }
        return true;
        
    }
}