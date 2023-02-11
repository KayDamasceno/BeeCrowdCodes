#include <bits/stdc++.h>
using namespace std;


int main(){
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n; cin >> n;
    vector<vector<int>> balls;
    vector<int> first;
    vector<int> rows;
    
    for (int i = 0; i < n; i++){
        
        int value; cin >> value;
        first.push_back(value);
    }

    balls.push_back(first);
    for (int j = 1; j <= n; j++){
        for (int i = 1; i <= n - j; i++){
            //cout << j << " " << i << endl;
            if (balls[j-1][i-1] == 1 && balls[j-1][i] == 1){
                //cout << "Entre1\n";
                rows.push_back(1);
            }
            else if (balls[j-1][i-1] == -1 && balls[j-1][i] == -1){
                rows.push_back(1);
                //cout << "Entrei2\n";
            }
            else
                rows.push_back(-1);
            
        }
        balls.push_back(rows);
        rows.clear();
    }
    
    if (balls[n-1][0] == -1)
        cout << "branca\n";
    else
        cout << "preta\n";
}
