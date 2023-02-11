#include <bits/stdc++.h>
#include <math.h>
#include <iostream>

using namespace std;

int main (){

    int n ; 
    
    while (cin >> n){
        int h, c, l; cin >> h >> c >> l;


        double hipo = sqrt(c*c + h*h);
        double sizeTotal = n*hipo;

        printf("%.4f\n", (l*sizeTotal)/10000);
        

    }
}
