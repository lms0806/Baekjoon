#include<bits/stdc++.h>

using namespace std;

void fastio() {
    cin.tie(0)->sync_with_stdio(0);
}

void solve() {
    int a, b;

    cin >> a >> b;

    cout << (((a + b) * a) + a) * a;
}
int main() {
    fastio();
    solve();
}
