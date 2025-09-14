#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    vector<int>arr(n);
    for(int i=0;i<arr.size();i++){
        cin>>arr[i];
    }
    int tot=n*(n+1)/2;
    int sm=0;
    for(int i=0;i<n-1;i++){
        sm+=arr[i];
    }
    int ans=tot-sm;
    cout<<ans<<"\n";
}