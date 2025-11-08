#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int minMoves(vector<int>& a) {
        int m = *max_element(a.begin(), a.end()), s = 0;
        for (int x : a) s += m - x;
        return s;
    }
};

int main() {
    Solution s;
    vector<int> a = {1, 2, 3};
    cout << s.minMoves(a);
}
