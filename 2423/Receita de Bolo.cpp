#include <bits/stdc++.h>
using namespace std;

int main(){
    int a, b, c;
    cin >> a >> b >> c;

    int bolos = 0;

    while (a>=2 && b>=3 && c>=5){
        a = a - 2;
        b = b - 3;
        c = c - 5;

        bolos++;
    }
    cout << bolos << endl;
}
