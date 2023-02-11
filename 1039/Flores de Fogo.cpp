#include <iostream>
#include <cmath>
using namespace std;


bool circle(int x1, int y1, int x2, int y2, int r1, int r2){
    double distSq = pow(((x1 - x2)* (x1 - x2))+ ((y1 - y2)* (y1 - y2)),(.5));
    
    if (distSq + r2  == r1)
        return true;
    else if (distSq+r2 < r1)
        return true;
    
    else
        return false;
}


int main (){
    int r1, x1, y1, r2, x2, y2;
    
    while (cin >> r1 >> x1 >> y1 >> r2 >> x2 >> y2){
        if (circle(x1,y1,x2,y2,r1,r2))
            cout << "RICO" << '\n';
        else
            cout << "MORTO" << '\n';
        
    }
    
    
}

