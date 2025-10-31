#include<bits/stdc++.h>
using namespace std;
vector<int> twosum(vector<int>& nums,int target){
    int s=0;
    int e=nums.size()-1;
    vector<int>ans;
    while(s<e){
        int sum=nums[s]+nums[e];
        if(sum==target){
            ans.push_back(s);
            ans.push_back(e);
            return ans;
        }
        else if(sum<target){
            s++;
        }
        else{
            e--;
        }
    }
    int main(){
    int n,target;
    cin>>n;
    vector<int>arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i];

    }
    cin>>target;
    vector<int>result=twosum(arr,target);
    for(int i=0;i<result.size();i++){
        cout<<result[i]<<" ";
    }
}