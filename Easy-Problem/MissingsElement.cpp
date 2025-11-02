#include<bits/stdc++.h>
using namespace std;
int missingElement(vector<int>& nums, int n) {
    int total = n * (n + 1) / 2;
    int sum_of_array = accumulate(nums.begin(), nums.end(), 0);
    return total - sum_of_array;
}
int main() {
    vector<int> nums = {0, 1, 3};
    int n = 3;
    int missing = missingElement(nums, n);
    cout << "The missing element is: " << missing << endl;
    return 0;
}