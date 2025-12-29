#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    vector<int>arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    sort(arr.begin(),arr.end());
    vector<vector<int>>res;
    for(int i=0;i<n;i++){
        if(i>0 && arr[i]==arr[i-1]) continue;
        int target=-arr[i];
        int left=i+1;
        int right=n-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum<target){
                left++;
            }
            else if(sum>target){
                right--;
            }
            else{
                res.push_back({arr[i],arr[left],arr[right]});
                while(left<right && arr[left]==arr[left+1]) left++;
                while(left<right && arr[right]==arr[right-1]) right--;
                left++;
                right--;
            }
        }
    }
    
    for(auto v:res){    
        for(int i=0;i<v.size();i++){
            cout<<v[i];

        }
        
    }
}