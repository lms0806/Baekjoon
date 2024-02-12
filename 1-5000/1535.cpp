#include<bits/stdc++.h>

using namespace std;

int people[21];
int happy[21];
int dp[21][101];

void fastio() {
    cin.tie(0)->sync_with_stdio(0);
}

void solve() {
    int n;

    cin >> n;

    for (int i = 1; i <= n; i++) {
        cin >> people[i];
    }
    for (int i = 1; i <= n; i++) {
        cin >> happy[i];
    }

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j < 101; j++) {
            if (people[i] <= j) {
                dp[i][j] = max(dp[i - 1][j], dp[i - 1][j - people[i]] + happy[i]);
            }
            else {
                dp[i][j] = dp[i - 1][j];
            }
        }
    }

    cout << dp[n][99];
}
int main() {
    fastio();
    solve();
}
