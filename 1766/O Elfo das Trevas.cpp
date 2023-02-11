using namespace std;
#include <iostream>
#include <vector>
#include<bits/stdc++.h>
#include <algorithm>
#include <string>
#include <map>
#include <sstream>

struct rena{
    string name;
    int peso;
    int idade;
    float altura;
};
bool compare(const rena &a, const rena &b){
    if (a.peso == b.peso){
        if (a.idade == b.idade){
            if (a.altura == b.altura){
                return a.name < b.name;
            }
            return a.altura < b.altura;
        }
        return a.idade < b.idade;
        
    }
    return a.peso > b.peso;
}
int main()
{
    
    long long t;
    cin >> t;
    int n, m;
    vector <rena> renas;
    int count = 1;
    while(t--){
        cin >> n >> m;
        
        for (int j = 0; j < n; j++){
            rena r;

            cin >> r.name >> r.peso >> r.idade >> r.altura;
            
            
            
            renas.push_back(r);
        }
        
        sort(renas.begin(), renas.end(), compare);
        cout << "CENARIO {"<<count<<"}"<< endl;
        for (int i = 0; i < m; i++){
            
            cout << i+1<<" - "<<renas[i].name << endl;
        }
        count++;
        renas.clear();
        
        
        
    }   
}

