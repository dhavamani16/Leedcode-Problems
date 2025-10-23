#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    vector<int> nums(n);
    for(int i=0;i<n;i++){ 
        cin>>nums[i];
    }
    int index=1;
        for(int i=1;i<nums.size();i++){
            if(nums[i-1]!=nums[i]){
                nums[index]=nums[i];
                index++;
            }
        }
        cout<<index<<" ";
    }
        

