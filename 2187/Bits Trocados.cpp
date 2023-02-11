#include <bits/stdc++.h>

using namespace std;

void solve(int n){
    int value = n;
    int aux = value;

    
    int cinq = 0, dez = 0, cinc = 0, um = 0;
    
    while (aux/50 != 0){
        cinq++;
        aux = aux - 50;
    }
    while (aux/10 != 0){
        dez++;
        aux = aux - 10;
    }
    while (aux/5 != 0){
        cinc++;
        aux = aux - 5;
    }
    while (aux/1 != 0){
        um++;
        aux = aux - 1;
    }

    cout << cinq <<" " << dez << " " << cinc << " " << um << "\n";
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
