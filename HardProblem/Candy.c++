#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int candy(vector<int>& r) {
        int n = r.size(), c = n, i = 1;
        while (i < n) {
            if (r[i] == r[i - 1]) {
                i++;
                continue;
            }
            int up = 0;
            while (i < n && r[i] > r[i - 1]) c += ++up, i++;
            int down = 0;
            while (i < n && r[i] < r[i - 1]) c += ++down, i++;
            c -= min(up, down);
        }
        return c;
    }
};

int main() {
    Solution s;
    vector<int> a = {1, 0, 2};
    cout << s.candy(a);
}
