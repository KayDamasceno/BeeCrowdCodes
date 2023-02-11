#include <bits/stdc++.h>
using namespace std;

int main (){
    int M, A, B;
    cin >> M >> A >> B;
    int C = (M - (A+B));

    if (A > B && A > C) cout << A << endl;
    if (B > A && B > C) cout << B << endl;
    if (C > A && C > B) cout << C << endl;

}
