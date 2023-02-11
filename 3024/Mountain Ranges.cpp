using namespace std;
#include <iostream>
#include <vector>
#include<bits/stdc++.h>
#include <algorithm>
#include <string>


int main(){

    int n, x, k;
    int maxi = 0, count = 0;
    vector < pair<int, bool> > flags;
    cin >> n >> x;
    
    for (int i = 0; i < n; i ++){
        cin >> k;
        flags.push_back(make_pair(k,false));
    }
    
    for (int i = 0; i < n-1; i++){
        int value = flags[i+1].first - flags[i].first;
        //out << value << endl;
        if (value <= x){
            if (flags[i+1].second == false){
                count++;
                flags[i+1].second = true;
            }
            if (flags[i].second == false){
                count++;
                flags[i].second = true;
            }
        }else{
            if(count>=maxi){
                maxi = count;
            }
            count = 0;
        }
    }
    
    if (count >= maxi){
        maxi = count;
    }
    
    if (n == 1)
        cout << 1 << endl;
    else
        cout << maxi << endl;
    
    
}
