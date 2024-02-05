#include<bits/stdc++.h>

using namespace std;

void fastio() {
    cin.tie(0)->sync_with_stdio(0);
}

void solve() {
    int n;

    cin >> n;

    vector<int> v(n);
    for (int i = 0; i < n; i++) {
        cin >> v[i];
    }

    sort(v.begin(), v.end());

    int sum = 0;
    for (int i = n - 1; i >= n / 2; i--) {
        sum += v[i] << 1;
    }

    if (n % 2 != 0) {
        sum -= v[n / 2];
    }

    cout << sum;

}
int main() {
    fastio();
    solve();
}
