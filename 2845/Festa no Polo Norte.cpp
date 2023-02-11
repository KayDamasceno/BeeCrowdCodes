using namespace std;
#include <iostream>
#include <vector>
#include<bits/stdc++.h>
#include <algorithm>


int main(){

    int t, k, maior = 0;
    cin >> t;
    
    for(int i = 0; i < t; i++){
         cin >> k;
         if (k > maior)
            maior = k;
     }
    cout << maior+1 << endl;
    
}
