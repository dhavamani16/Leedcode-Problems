#include<bits/stdc++.h>
using namespace std;
int salesandbuy(vector<int>& prices){
    int n=prices.size();
    int minprice=prices[0];
    int maxprofit=INT_MIN;
    int sm=0;
    for(int i=1;i<n;i++){
        sm=prices[i]-minprice;
        maxprofit=max(maxprofit,sm);
        minprice=min(minprice,prices[i]);   

    }
    return maxprofit;
    
}
int main(){
    int n;
    cin>>n;
    vector<int>arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    cout<<salesandbuy(arr);
}