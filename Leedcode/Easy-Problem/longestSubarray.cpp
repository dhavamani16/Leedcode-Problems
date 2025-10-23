#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    vector<int>arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    int maxi=0;
    int sm=0;
    for(int i=0;i<n;i++){
        sm+=arr[i];
        if(sm<0){
            sm=0;
        }
        maxi=max(maxi,sm);
    }
    cout<<maxi<<"\n";
}