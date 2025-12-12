class Solution {
    public int findMin(int n) {
        // code here
        int coin=10;
        int cnt=0;
        while(n>0){
            cnt+=(n/coin);
            n=n%coin;
            coin=coin/2;
        }
        return cnt;
    }
}

