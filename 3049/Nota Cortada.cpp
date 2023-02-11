using namespace std;
#include <iostream>
#include <vector>
#include<bits/stdc++.h>
#include <algorithm>
#include <string>


int main(){
    int b, t;
    
    cin >> b;
    cin >> t;
    
    float f = ((b+t)*70)/2;
    float m = (160*70)-f;
    
    if (f > m)
        cout << 1 << endl;
    else if (f < m)
        cout << 2 << endl;
    else
        cout << 0 << endl;
    
}
