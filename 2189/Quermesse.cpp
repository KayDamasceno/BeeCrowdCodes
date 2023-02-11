#include <bits/stdc++.h>
using namespace std;



void solve(int n){
    vector<int> participantes;
    int number, winner;
    for (int i = 0; i < n; i++){
        cin >> number;
        

        participantes.push_back(number);

        if (number == participantes.size()){
            winner = number;
        }
    }

    cout << winner << endl;
    cout << endl;

}

int main (){
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int n; cin >> n;
    int i = 1;
    while (n!= 0){
        cout << "Teste " << i << "\n";
        solve(n);
        cin >> n;
        i++;
    }
}
