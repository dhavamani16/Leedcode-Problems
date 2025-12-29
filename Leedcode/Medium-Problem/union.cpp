#include<bits/stdc++.h>
using namespace std;
vector<int> unionOfArrays(vector<int>& arr1, vector<int>& arr2) {
    set<int> s;
    for(int num : arr1) {
        s.insert(num);
    }
    for(int num : arr2) {
        s.insert(num);
    }
    vector<int> result(s.begin(), s.end());
    return result;
}
int main() {
    int n, m;
    cin >> n;
    vector<int> arr1(n);
    for(int i = 0; i < n; i++) {
        cin >> arr1[i];
    }
    cin >> m;
    vector<int> arr2(m);
    for(int i = 0; i < m; i++) {
        cin >> arr2[i];
    }
    vector<int> result = unionOfArrays(arr1, arr2);
    for(int num : result) {
        cout << num << " ";
    }
    return 0;
}   