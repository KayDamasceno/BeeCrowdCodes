using namespace std;
#include <iostream>
#include <vector>
#include<bits/stdc++.h>
#include <algorithm>
#include <string>
#include <map>
#include <sstream>
int main()
{
    int n, m;
    vector <int> V, D;
    cin >> n >> m;
    
    for (int i = 0; i < n; i++){
        for (int j = 0; j < m; j++){
            string k;
            cin >> k;
            
            int b = (int)k[0] -48;
            
            if (k[1]=='V')
                V.push_back(b);
            else
                D.push_back(b);
            
        }
    }
    
    sort(V.begin(), V.end(), greater<int>());
    sort(D.begin(), D.end(), greater<int>());
    
    if (V.size()>0){
        for (int i = 0; i < V.size(); i++){
            cout << V[i] << "V" << endl;
        }
    }
    
    if (D.size()>0){
        for (int i = 0; i < D.size(); i++){
            cout << D[i] << "D" << endl;
        }
    }
    
}

