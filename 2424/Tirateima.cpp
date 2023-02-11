using namespace std;
#include <iostream>
#include <vector>
#include<bits/stdc++.h>
#include <algorithm>
#include <string>


int main(){

    int x, y;
    
    cin >> x >> y;
    
    if (0 <= x && x <= 432 && 0 <= y && y<=468)
        cout << "dentro" << '\n';
    else
       cout << "fora" << '\n';
}
