using namespace std;
#include <iostream>
#include <vector>
#include<bits/stdc++.h>
#include <algorithm>
#include <string>


int main(){

    unsigned long long x, t;
    int numbers[] = {1, 7, 9,3};
    cin.tie(NULL);
    cout.sync_with_stdio(false);
    cin>>x;
    
    while (x--){
        
       cin >> t;
       
       cout << numbers[t%4] << '\n';
    }
    
}
