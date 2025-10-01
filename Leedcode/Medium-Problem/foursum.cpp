#include<bits/stdc++.h>
using namespace std;
int fourSum(vector<int>& nums, int target) {
    int n=nums.size();
    set<vector<int>>s;
    sort(nums.begin(),nums.end());
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            int left=j+1;
            int right=n-1;
            while(left<right){
                long long sum=(long long)nums[i]+(long long)nums[j]+(long long)nums[left]+(long long)nums[right];
                if(sum==target){
                    s.insert({nums[i],nums[j],nums[left],nums[right]});
                    left++;
                    right--;
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
    }
    vector<vector<int>>ans(s.begin(),s.end());
    return ans.size();
}
int main(){
    int n,target;
    cin>>n;
    vector<int>arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    cin>>target;
    cout<<fourSum(arr,target);
    return 0;}