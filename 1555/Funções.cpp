#include <iostream>
#include <cstdio>
#include <cmath>

using namespace std;

int main(int argc, char * * argv) {

    int N;
    long long int R, B, C;
    cin >> N;
    long long int x, y;
    while(N-- > 0) {
        cin >> x >> y;
        R = pow(3*x, 2) + y*y;
        B = 2*pow(x,2) + pow(5*y,2);
        C = -100 * x + y * y * y;
        //cout << R << " " << B << " " << C << endl;
        if(R > B && R > C)
            cout << "Rafael ganhou" << endl;
        else if(B > R && B > C)
            cout << "Beto ganhou" << endl;
        else if(C > B && C > R)
            cout << "Carlos ganhou" << endl;
    }
    return 0;
}

