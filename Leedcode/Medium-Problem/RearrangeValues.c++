#include<bits/stdc++.h>
using namespace std;
void Rearrange(vector<int>& arr,int n){
    vector<int>ans(n,0);
    int pos=0;
    int neg=1;
    for(int i=0;i<n;i++){
        if(arr[i]>=0){
            ans[pos]=arr[i];
            pos+=2;
        }
        else{
            ans[neg]=arr[i];
            neg+=2;
        }
    }
}
int main(){
    int n;
    cin>>n;
    vector<int>arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    Rearrange(arr,n);
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
}