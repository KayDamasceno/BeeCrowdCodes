#include <bits/stdc++.h>
using namespace std;


int main(){

    int A, B, C, D;
    cin >> A >> B >> C >> D;

    if (A*B == C*D || A*C == B*D || A*D == B*C) cout << "S\n";
    else cout <<"N\n";
}
