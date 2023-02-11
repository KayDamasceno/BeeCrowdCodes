using namespace std;
#include <iostream>
#include <vector>
#include<bits/stdc++.h>
#include <algorithm>


int main(){

    int t, n, k;
    
    cin >> t; cin.ignore();
    
    while (t--){
        cin >> n >> k;
        
        if(n < k)
            cout << n << endl;
        else
            cout << (int)(n/k)+n%k << endl;
    }
    
    
}
