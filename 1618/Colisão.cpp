#include <iostream>
#include <cmath>
using namespace std;


int main(int argc, char * * argv) {

    int N;
    cin >> N;
    int Ax, Ay, Bx, By, Cx, Cy, Dx, Dy, Rx, Ry;

    while(N-- > 0) {
        cin >> Ax >> Ay >> Bx >> By >> Cx >> Cy >> Dx >> Dy >> Rx >> Ry;

        if(Rx >= Ax && Rx <= Bx && Rx >= Dx && Rx <= Cx) {
            
            if(Ry >= Ay && Ry <= Dy && Ry >= By && Ry << Cy) {
                cout << 1 << endl;
            }else{
                cout << 0 << endl;
            }
        } else {
            cout << 0 << endl;
        }
    }
    return 0;
}

